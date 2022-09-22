package Modelos;

import Main.DbHandler;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/* Authors:
    José Carlos Paniagua Morales
    Aisler Moreno Pérez
    Juan Carlos Morales Jiménez
*/

public class Cliente {
    
    private String clienteId;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String tel;
    private String email;
    private String nacimiento;
    public static DbHandler dbHandler = new DbHandler();

    public Cliente(String clienteId, String nombre, String apellido1, String apellido2, String tel, String email, String nacimiento) {
        this.clienteId = clienteId;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.tel = tel;
        this.email = email;
        this.nacimiento = nacimiento;
    }
    
    public String getId() {
        return clienteId;
    }
    
    //Los sets son ejecutados desde el Frame de Registro y desde aca se hacen las validaciones, si todo es correcto, se establece el valor

    public void setId(String id) {
        this.clienteId = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
        
    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }
    
    public boolean validarClienteId(String id) {
        Pattern patron = Pattern.compile("^[\\d]+$", Pattern.CASE_INSENSITIVE);
        Matcher buscador = patron.matcher(id);
        
        if (dbHandler.existeClienteId(id))
            JOptionPane.showMessageDialog(null, "Error | El id se encuentra registrado");
        else if (id.length()<9 || id.length()>9)
            JOptionPane.showMessageDialog(null, "Error | El id debe ser de 9 caracteres");
        else if (!buscador.find())
            JOptionPane.showMessageDialog(null, "Error | Formato de cedula invalido");
        else 
            return true;
        return false;
    }
    
    public boolean validarNombre(String nombre) {
        if (nombre.length()>50)
            JOptionPane.showMessageDialog(null, "Error | Exceso de caracteres");
        else 
            return true;
        return false;
    }
    
    public boolean validarApellido1 (String apellido1) {
        if (apellido1.length()>50)
            JOptionPane.showMessageDialog(null, "Error | Exceso de caracteres");
        else 
            return true;
        return false;
    }
    
    public boolean validarApellido2 (String apellido2) {
        if (apellido2.length()>50)
            JOptionPane.showMessageDialog(null, "Error | Exceso de caracteres");
        else   
            return true;
        return false;
    }
    
    public boolean validarTel (String tel) {
        Pattern patron = Pattern.compile("^[\\d]+$", Pattern.CASE_INSENSITIVE);
        Matcher buscador = patron.matcher(tel);
        
        if (dbHandler.existeTel(tel))
            JOptionPane.showMessageDialog(null, "Error | El telefono se encuentra registrado");
        else if (!buscador.find())
            JOptionPane.showMessageDialog(null, "Error | Formato de telefono invalido");
        else if (tel.length()>50)
            JOptionPane.showMessageDialog(null, "Error | Exceso de caracteres");
        else 
            return true;
        return false;
    }
    
    public boolean validarEmail (String email) {
        Pattern patron = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,}$", Pattern.CASE_INSENSITIVE);
        Matcher buscador = patron.matcher(email);
        
        if (dbHandler.existeEmail(email))
            JOptionPane.showMessageDialog(null, "Error | El email se encuentra registrado");
        else if (email.length()>50)
            JOptionPane.showMessageDialog(null, "Error | Exceso de caracteres");
        else if (!buscador.find())
            JOptionPane.showMessageDialog(null, "Error | Formato de email invalido");
        else 
            return true;
        return false;
    }
    
    public static boolean validarFecha (String fecha) {
        Pattern patron = Pattern.compile("^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$", Pattern.CASE_INSENSITIVE);
        Matcher buscador = patron.matcher(fecha);
       
        if (fecha.length()==0)
            JOptionPane.showMessageDialog(null, "Error | Rellene los campos");
        if (!buscador.find())
            JOptionPane.showMessageDialog(null, "Error | Formato de fecha invalido");
        else 
            try {
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                df.setLenient(false);
                df.parse(fecha);
                return true;
        } 
            catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Error | Formato de fecha invalido");
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cliente{" + "clienteId=" + clienteId + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", tel=" + tel + ", email=" + email + ", nacimiento=" + nacimiento + '}';
    }
}
