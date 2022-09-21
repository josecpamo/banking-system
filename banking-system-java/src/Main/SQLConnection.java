package Main;

import java.sql.*; 
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/* Authors:
    José Carlos Paniagua Morales
    Aisler Moreno Pérez
    Juan Carlos Morales Jiménez
*/

/* Makes the connection with the sql server database and receives a query as a parameter in order to make different "select" database functions on the DbHandler class */
public class SQLConnection {
    
    public String dburl = "jdbc:sqlserver://localhost:1433;databaseName=First_BankDB;integratedSecurity=true;encrypt=true;trustServerCertificate=true";
    public Connection conexion = null;
    public Statement stat = null;
    
    public ResultSet connect(String query) {
        ResultSet result = null;
        try {     
            Connection conexion = DriverManager.getConnection(dburl);   
            Statement stat = conexion.createStatement();
            result = stat.executeQuery(query); //Se ejecuta y se crea el resultado cuando esta funcion sea llamada desde DbHandler
        }
        catch (SQLException err){
            JOptionPane.showMessageDialog(null, err);
        }
        return result;
    } 
    
    /* Makes the connection with the sql server database and receives a query as a parameter in order to make different "update" and "insert" database functions on the DbHandler class */
    public void connectInsert(String query) {
        try {     
            Connection conexion = DriverManager.getConnection(dburl);   
            Statement stat = conexion.createStatement();
            stat.executeUpdate(query); //Se ejecuta y se crea el resultado cuando esta funcion sea llamada desde DbHandler
            
        }
        catch (SQLException err){
            JOptionPane.showMessageDialog(null, err);
        }
    } 
    
    
        
}

