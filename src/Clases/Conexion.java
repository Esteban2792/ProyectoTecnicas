/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.*;

public class Conexion {
    
    public static Connection ConectaBaseDatos(){
        String url="jdbc:sqlserver://localhost:49963;" //Mi puerto Esteban 49963
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
    }
    
}
