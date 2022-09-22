package Main;

import Modelos.Cliente;
import Modelos.Cuenta;
import Modelos.Movimiento;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/* Authors:
    José Carlos Paniagua Morales
    Aisler Moreno Pérez
    Juan Carlos Morales Jiménez
*/

/* DbHandler it's the class that controls every data coming into or out of the database */

public class DbHandler {
    
    public SQLConnection db = new SQLConnection();
    
    /* Verify if client id exists */
    public boolean existeClienteId(String clienteId) {
        boolean encontrado = false;
        ResultSet resultadoQuery;
        
        try {
            String query = "select * from [Cliente] where clienteId='"+clienteId+"'";
            resultadoQuery = db.connect(query);
            
            if (resultadoQuery.next())
                encontrado = true;
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err);
        }
        return encontrado;
    }
    
    /* Verify if account id exists */
    public boolean existeCuentaId(String cuentaId) {
        boolean encontrado = false;
        ResultSet resultadoQuery;
        
        try {
            String query = "select * from [Cuenta] where cuentaId='"+cuentaId+"'";
            resultadoQuery = db.connect(query);
            
            if (resultadoQuery.next())
                encontrado = true;
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err);
        }
        return encontrado;
    }
    
    /* Verify if the state of the account is either active or inactive */
    public boolean existeEstado(String cuentaId) {
        boolean encontrado = false;
        ResultSet resultadoQuery;
        
        try {
            String query = "select * from [Cuenta] where cuentaId='"+cuentaId+"' and estado='Activo'";
            resultadoQuery = db.connect(query);
            
            if (resultadoQuery.next())
                encontrado = true;
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err);
        }
        return encontrado;
    }
    
    /* Verify if tel number exists */
    public boolean existeTel(String tel) {
        boolean encontrado = false;
        ResultSet resultadoQuery;
        
        try {
            String query = "select * from [Cliente] where tel='"+tel+"'";
            resultadoQuery = db.connect(query);
            
            if (resultadoQuery.next())
                encontrado = true;
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err);
        }
        return encontrado;
    }
    
     /* Verify if the email exists */
    public boolean existeEmail(String email) {
        boolean encontrado = false;
        ResultSet resultadoQuery;
        
        try {
            String query = "select * from [Cliente] where email='"+email+"'";
            resultadoQuery = db.connect(query);
            
            if (resultadoQuery.next())
                encontrado = true;
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err);
        }
        return encontrado;
    }
    
     /* Verify if the username exists */
    public boolean existeUsuario(String usuario) {
        boolean encontrado = false;
        ResultSet resultadoQuery;
        
        try {
            String query = "select * from [Cuenta_Usuario] where usuario='"+usuario+"'";
            resultadoQuery = db.connect(query);
            
            if (resultadoQuery.next())
                encontrado = true;
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err);
        }
        return encontrado;
    }
    
     /* Verify if the password exists */
    public boolean existePassword(String password) {
        boolean encontrado = false;
        ResultSet resultadoQuery;
        
        try {
            String query = "select * from [Cuenta_Usuario] where password='"+password+"'";
            resultadoQuery = db.connect(query);
            
            if (resultadoQuery.next())
                encontrado = true;
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err);
        }
        return encontrado;
    }
    
     /* Verify if the bank account exists */
    public boolean existeCuentaBancaria(String clienteId, String moneda, String condicionExtra) {
        boolean encontrado = false;
        ResultSet resultadoQuery;
        
        try {
            String query = "select * from [Cuenta] where clienteId='"+clienteId+"' and moneda='"+moneda+"' "+condicionExtra;
            resultadoQuery = db.connect(query);
            
            if (resultadoQuery.next())
                encontrado = true;      
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err);
        }
        return encontrado;
    }
    
     /* Gets the data of a client id */
    public String getClienteId(String tabla, String columna, String dato) {
        String resultado = "";
        ResultSet resultadoQuery;
        
        try {
            String query = "select * from ["+tabla+"] where "+columna+" = '"+dato+"'";
            resultadoQuery = db.connect(query);
            resultadoQuery.next();
            resultado = resultadoQuery.getString("clienteId");
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err);
        }
        return resultado;
    }
    
    /* Gets the data of a password */
    public String getPassword(String usuario) {
        String resultado = "";
        ResultSet resultadoQuery;
        
        try {
            String query = "select * from [Cuenta_Usuario] where usuario='"+usuario+"'";
            resultadoQuery = db.connect(query);
            resultadoQuery.next();
            resultado = resultadoQuery.getString("password");
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err);
        }
        return resultado;
    }
    
    /* Gets the amount of a specific column */
    public int getCantidadId(String columna, String tabla) {
        int resultado = 0;
        ResultSet resultadoQuery;
        
        try {
            String query = "select count(distinct "+columna+")"
                    + "from "+tabla;
            resultadoQuery = db.connect(query);
            resultadoQuery.next();
            resultado = resultadoQuery.getInt(1);
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err);
        }
        return resultado;
    }
    
    /* Gets the list of clients */
    public ArrayList<ArrayList> getClientes() {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Cuenta> listaCuentas = new ArrayList<>();
        ArrayList<ArrayList> resultadoArrayList = new ArrayList<>(); 
        Cliente clientes;
        Cuenta cuentas;
        ResultSet resultadoQuery;
        
        try {
            String query = "select * from [Cliente] c "
                    + "join [Cuenta] cta "
                    + "on c.clienteId = cta.clienteId "
                    + "where c.clienteId<>'1'";
            resultadoQuery = db.connect(query);
            
            while(resultadoQuery.next()) {
                clientes = new Cliente(resultadoQuery.getString("clienteId"), resultadoQuery.getString("nombre"), 
                        resultadoQuery.getString("apellido1"), resultadoQuery.getString("apellido2"), resultadoQuery.getString("tel"), resultadoQuery.getString("email"), 
                        resultadoQuery.getString("nacimiento"));
                
                cuentas = new Cuenta(resultadoQuery.getInt("cuentaId"), resultadoQuery.getFloat("saldo"), resultadoQuery.getString("moneda"), resultadoQuery.getString("estado"));
                
                listaClientes.add(clientes);
                listaCuentas.add(cuentas);
            }         
            resultadoArrayList.add(listaClientes);
            resultadoArrayList.add(listaCuentas);
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err);
        }
        return resultadoArrayList;
    }
    
    /* Gets the list of bank accounts */
    public ArrayList<Cuenta> getCuentas(String clienteId) {
        ArrayList<Cuenta> listaCuentas = new ArrayList<>();
        Cuenta cuentas;
        ResultSet resultadoQuery;
        
        try {
            String query = "select * from [Cuenta] where clienteId='"+clienteId+"' and estado='Activo'";
            resultadoQuery = db.connect(query);
            
            while(resultadoQuery.next()) {
                cuentas = new Cuenta(resultadoQuery.getInt("cuentaId"), resultadoQuery.getFloat("saldo"), resultadoQuery.getString("moneda"), resultadoQuery.getString("estado"));
                
                listaCuentas.add(cuentas);
            }             
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err);
        }
        return listaCuentas;
    }
    
    /* Gets the list of transactions from a specific bank account */
    public ArrayList<Movimiento> getMovimientos(int cuentaId, String moneda, String fechaInicial, String fechaFinal) {
        ArrayList<Movimiento> listaMovimientos = new ArrayList<>();
        Movimiento movimientos;
        ResultSet resultadoQuery;
        
        try {
            String query = "select * from [Cuenta] c "
                    + "join Movimiento m "
                    + "on c.cuentaId = m.cuentaId "
                    + "where c.cuentaId = '"+cuentaId+"' and estado = 'Activo' and moneda = '"+moneda+"' and fecha between '"+fechaInicial+"' and '"+fechaFinal+"'";
            
            resultadoQuery = db.connect(query);
            
            while (resultadoQuery.next()) {
                movimientos = new Movimiento(resultadoQuery.getInt("movimientoId"), resultadoQuery.getString("mensaje"), resultadoQuery.getString("fecha"), 
                        resultadoQuery.getFloat("cantidad"), resultadoQuery.getFloat("saldoAnterior"), resultadoQuery.getInt("cuentaId"));
                listaMovimientos.add(movimientos);
            }
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err);
        }
        return listaMovimientos;
    }
    
    /* Gets the type of the currency from a specific bank account */
    public String getMoneda(int cuentaId) {
        String resultado = "";
        ResultSet resultadoQuery;
        
        try {
            String query = "select * from [Cuenta] where cuentaId="+cuentaId;
            resultadoQuery = db.connect(query);
            resultadoQuery.next();
            resultado = resultadoQuery.getString("moneda");
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err);
        }
        return resultado;
    }
    
    /* Gets the state of a specific bank account */
    public String getEstado(String clienteId, String moneda) {
        String resultado = "";
        ResultSet resultadoQuery;
        
        try {
            String query = "select * from [Cuenta] where clienteId='"+clienteId+"' and moneda='"+moneda+"'";
            resultadoQuery = db.connect(query);
            resultadoQuery.next();
            resultado = resultadoQuery.getString("estado");
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err);
        }
        return resultado;
    }
    
    /* Gets the data of the balance from a specific bank account */
    public float getSaldo(int cuentaId) {
        float resultado = 0;
        ResultSet resultadoQuery;
        
        try {
            String query = "select * from [Cuenta] where cuentaId='"+cuentaId+"'";
            resultadoQuery = db.connect(query);
            resultadoQuery.next();
            resultado = resultadoQuery.getFloat("saldo");
            
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err);
        }
        return resultado;
    }
    
    /* Gets a specific bank account id */
    public int getCuentaId(String clienteId, String moneda) {
        int resultado = 0;
        ResultSet resultadoQuery;
        
        try {
            String query = "select * from [Cuenta] where clienteId='"+clienteId+"' and moneda='"+moneda+"'";
            resultadoQuery = db.connect(query);
            resultadoQuery.next();
            resultado = resultadoQuery.getInt("cuentaId");
            
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err);
        }
        return resultado;
    }
    
    /* Gets the buying price from the exchange rate from 1$ USD to CRC */
    public float getCompraUsd() throws SQLException {
        float resultado = 0;
        ResultSet resultadoQuery;

        try {
            String query = "select * from [Tipo_Cambio] where id=1";
            resultadoQuery = db.connect(query);
            resultadoQuery.next();
            resultado = resultadoQuery.getFloat("compraUsd");
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err);
        }
        return resultado;
    }
    
    /* Gets the selling price from the exchange rate from 1$ USD to CRC */
    public float getVentaUsd() throws SQLException {
        float resultado = 0;
        ResultSet resultadoQuery;

        try {
            String query = "select * from [Tipo_Cambio] where id=1";
            resultadoQuery = db.connect(query);
            resultadoQuery.next();
            resultado = resultadoQuery.getFloat("ventaUsd");
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err);
        }
        return resultado;
    }
    
    /* Gets the amount of a transaction */
    public float getCantidad(float cuentaId) {
        float resultado = 0;
        ResultSet resultadoQuery;

        try {
            String query = "select "
                    + "lag(cantidad, 1) over ("
                    + " order by movimientoId) as cantidad"
                    + " from Movimiento"
                    + " where cuentaId="+cuentaId
                    + " order by movimientoId desc";
            
            resultadoQuery = db.connect(query);
            resultadoQuery.next();
            resultado = resultadoQuery.getFloat("cantidad");
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err);
        }
        return resultado;
    }
    
    /* Gets the modification date of a specific account, this data verifies if the account has just been created */
    public String getFechaModificacion(String usuario) {
        String resultado = "";
        ResultSet resultadoQuery;

        try {
            String query = "select * from [Cuenta_Usuario] where usuario = '"+usuario+"'";
            
            resultadoQuery = db.connect(query);
            resultadoQuery.next();
            resultado = resultadoQuery.getString("fechaModificacion");
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err);
        }
        return resultado;
    }
    
    /* Updates the modification date */
    public void updateFechaModificacion(String usuario, String nuevaFechaModificacion) {
        try {
            String query = "update [Cuenta_Usuario] "
                    + "set fechaModificacion = '"+nuevaFechaModificacion+"' "
                    + "where usuario = '"+usuario+"'";
            
            db.connectInsert(query);
        } 
        catch (Exception err) {
            JOptionPane.showMessageDialog(null, err);
        }
    }
    
    /* Updates the balance of a specific bank account */
    public void updateSaldo(float nuevoSaldo, int cuentaId) {
        try {
            String query = "update [Cuenta]"
                    + "set saldo = "+nuevoSaldo
                    + "where cuentaId='"+cuentaId+"'";
            db.connectInsert(query);
        } 
        catch (Exception err) {
            JOptionPane.showMessageDialog(null, err);
        }
    }
    
    /* Updates the exchange rate according to the current prices */
    public void updateTipoCambio(float compraUsd, float ventaUsd) {
        try {
            String query = "update [Tipo_Cambio]"
                    + "set compraUsd = "+compraUsd+", ventaUsd = "+ventaUsd
                    + "where id=1";
            db.connectInsert(query);
        } 
        catch (Exception err) {
            JOptionPane.showMessageDialog(null, err);
        }
    }
    
    /* Updates a bank account with different data */
    public void updateCuentaBancaria(String clienteId, float saldo, String moneda, String estado) {
        try {
            String query = "update [Cuenta]"
                    + "set saldo = "+saldo+", estado = '"+estado+"'"
                    + "where clienteId = '"+clienteId+"' and moneda = '"+moneda+"'";
            db.connectInsert(query);
        } 
        catch (Exception err) {
            JOptionPane.showMessageDialog(null, err);
        }
    }
    
    /* Updates the password of a specific account */
    public void updatePassword(String usuario, String nuevaPassword) {
        try {
            String query = "update [Cuenta_Usuario] "
                    + "set password = '"+nuevaPassword+"' "
                    + "where usuario = '"+usuario+"'";
            
            db.connectInsert(query);
        } 
        catch (Exception err) {
            JOptionPane.showMessageDialog(null, err);
        }
    }
    
    /* Inserts a transaction made by a specific bank account */
    public void insertMovimiento(String fecha, String mensaje, float cantidad, float saldoAnterior, int cuentaId) {
        try {
            String query = "insert into [Movimiento] (fecha, mensaje, cantidad, saldoAnterior, cuentaId)"
                    + "values ('"+fecha+"', '"+mensaje+"', "+cantidad+", "+saldoAnterior+", "+cuentaId+")";
            
            db.connectInsert(query);
        } 
        catch (Exception err) {
            JOptionPane.showMessageDialog(null, err);
        }
    }
    
    /* Verifies the credentials on the input and on the database and compare them */
    public int login(String usuario, String password) {
        int encontrado = 0;
        ResultSet resultadoCliente;
        ResultSet resultadoAdmin;
        
        try {
            String queryCliente = "select * from [Cuenta_Usuario] where usuario='"+usuario+"'and password='"+password+"' COLLATE SQL_Latin1_General_CP1_CS_AS and role='cliente'";   
            String queryAdmin = "select * from [Cuenta_Usuario] where usuario='"+usuario+"'and password='"+password+"' COLLATE SQL_Latin1_General_CP1_CS_AS and role='administrador'"; 
            resultadoCliente = db.connect(queryCliente); //Manda a llamar la query a SQLConnection
            resultadoAdmin = db.connect(queryAdmin);
            
            if (resultadoAdmin.next())    
                encontrado=1;
            else if (resultadoCliente.next())
                encontrado=2;

        }        
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err);
        } 
        return encontrado;
    }
    
    /* Registers a new client with the information inserted */
    public void registrarCliente(String clienteId, String nombre, String apellido1, String apellido2, String tel, String email, String nacimiento,
            String usuario, String password, String role, String fechaModificacion) {
        try {
            String queryRegistroCliente = "insert into Cliente (clienteId, nombre, apellido1, apellido2, tel, email, nacimiento) "
                    + "values ('"+clienteId+"','"+nombre+"','"+apellido1+"','"+apellido2+"','"+tel+"','"+email+"','"+nacimiento+"')";
            
            String queryRegistroCuentaUsuario = "insert into Cuenta_Usuario (usuario, password, role, fechaModificacion, clienteId) "
                    + "values ('"+usuario+"','"+password+"','"+role+"','"+fechaModificacion+"', '"+clienteId+"')";
            
            db.connectInsert(queryRegistroCliente);
            db.connectInsert(queryRegistroCuentaUsuario);
        } 
        catch (Exception err) {
            JOptionPane.showMessageDialog(null, err);
        }
    }
    
    /* Registers two bank accounts at the moment the register is made */
    public void registrarCuentasBancarias (String clienteId) {
        try {
            String queryColones = "insert into [Cuenta] (saldo, moneda, estado, clienteId)"
                + "values (0, 'CRC', 'Inactivo', '"+clienteId+"')";
            String queryDolares = "insert into [Cuenta] (saldo, moneda, estado, clienteId)"
                + "values (0, 'USD', 'Inactivo', '"+clienteId+"')";
            
            db.connectInsert(queryColones);
            db.connectInsert(queryDolares);
        } 
        catch (Exception err) {
            JOptionPane.showMessageDialog(null, err);
        }
        
    }
}
