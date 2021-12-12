/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:49963;databaseName=pruebaUno;user=sa;password=1234");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con; 
        }
    
   /* public static Connection ConectaBaseDatos(){
        String url="jdbc:sqlserver://localhost:49963;" //
                +"database=pruebaUno;"
                +"user=sa;"
                +"password=1234;";
        
        try{
            
        Connection conecta = DriverManager.getConnection(url);
        return conecta;
        } catch (SQLException ex){
            System.out.println(ex.toString());
            return null;
        }
    } */

    public PreparedStatement prepareStatement(String query) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
