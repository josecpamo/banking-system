package Modelos;

import Main.DbHandler;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/* Authors:
    José Carlos Paniagua Morales
    Aisler Moreno Pérez
    Juan Carlos Morales Jiménez
*/

public class Cuenta_Usuario {
    
    private String usuario;
    private String password;
    private String role;
    private String fechaModificacion;
    private String clienteId;
    
    private final DbHandler dbHandler = new DbHandler();

    public Cuenta_Usuario(String usuario, String password, String role, String fechaModificacion, String clienteId) {
        this.usuario = usuario;
        this.password = password;
        this.role = role;
        this.fechaModificacion = fechaModificacion;
        this.clienteId = clienteId;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(String fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }
    
    public static String generarPassword() {
        Random rand = new Random();
        
        String[] caracteres = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","1","2","3","4","5","6","7","8","9"};
        String passGenerada = "";
        
        for (int i = 0; i < 8; i++) {
            passGenerada += caracteres[rand.nextInt(caracteres.length)];
        }
        return passGenerada;
    }
    
    public boolean validarUsuario (String usuario) {
        Pattern patron = Pattern.compile("^[A-Za-z0-9]+$");
        Matcher buscador = patron.matcher(usuario);
        
        
        if (dbHandler.existeUsuario(usuario))
            JOptionPane.showMessageDialog(null, "Error | El usuario se encuentra registrado");
        else if (usuario.length()>50)
            JOptionPane.showMessageDialog(null, "Error | Exceso de caracteres");
        else if (!buscador.find())
            JOptionPane.showMessageDialog(null, "Error | Formato de usuario invalido");
        else            
            return true;
        return false;
    }
    
    public static boolean validarPassword (String password) {
        Pattern patron = Pattern.compile("^[a-zA-Z0-9]{8,16}$");
        Matcher buscador = patron.matcher(password);
        
        if (!buscador.find())
            JOptionPane.showMessageDialog(null, "Error | Formato de contraseña invalido");
        else 
            return true;
        return false;
    }
    
    @Override
    public String toString() {
        return "Cuenta_Usuario{" + "usuario=" + usuario + ", password=" + password + ", role=" + role + ", fechaModificacion=" + fechaModificacion + ", clienteId=" + clienteId + '}';
    }
    
}
