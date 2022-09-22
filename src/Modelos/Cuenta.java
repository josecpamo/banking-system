package Modelos;

import Main.DbHandler;
import javax.swing.JOptionPane;

/* Authors:
    José Carlos Paniagua Morales
    Aisler Moreno Pérez
    Juan Carlos Morales Jiménez
*/

public class Cuenta {
    
    private int cuentaId; 
    private float saldo;
    private String moneda;
    private String estado;
    private String clienteId;
    private static DbHandler dbHandler = new DbHandler();

    public Cuenta(int cuentaId, float saldo, String moneda, String estado) {
        this.cuentaId = cuentaId;
        this.saldo = saldo;
        this.moneda = moneda;
        this.estado = estado;
        this.clienteId = clienteId;
    }

    public int getCuentaId() {
        return cuentaId;
    }

    public void setCuentaId(int cuentaId) {
        this.cuentaId = cuentaId;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public float ejecutarRetiro(float monto) {
        float resultado = 0;
        resultado = saldo - monto;
        
        if (resultado>=0)
            return resultado;
        else
            JOptionPane.showMessageDialog(null, "Error | Cantidad no puede superar al saldo actual");
        return saldo;
    }
    
    public float ejecutarDeposito(float monto) {
        float resultado = 0;
        resultado = saldo - monto;
        
        if (resultado>=0)
            return resultado;
        else
            JOptionPane.showMessageDialog(null, "Error | Cantidad no puede superar al saldo actual");
        return saldo;
    }

    public boolean validarClienteId(String clienteId) {
        if (!dbHandler.existeClienteId(clienteId))
            JOptionPane.showMessageDialog(null, "Error | No existe el id");
        else
            return true;
        return false;
    }
    
    public boolean validarSaldo(float saldo) {
        if (saldo<0)
            JOptionPane.showMessageDialog(null, "Error | Saldo no puede ser menor a 0");
        else
            return true;
        return false;
    }
}
