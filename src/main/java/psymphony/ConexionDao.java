/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psymphony;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


/**
 *
 * @author Spiri
 */
public class ConexionDao {
    // Declaración de variables para la conexion a la base de datos
    private static final String url ="jdbc:mysql://localhost:33065/dbsymphony";
    private static final String username="root";
    private static final String pass="";
    
    // conexion base de datos
    public static Connection obtenerConexion(){
        Connection conn = null;
            try {
                  Class.forName("com.mysql.cj.jdbc.Driver");
                  conn = DriverManager.getConnection(url,username,pass);
              } catch (Exception e) {
                  System.out.println("Error: " + e.getMessage());
              }

              return conn;
    }
    public static void cerrarConexion(Connection Conn){
        try{
            if(Conn !=null){
                Conn.close();
            }
        }catch(Exception e){
        System.out.println("Error al conectarnos"+e.toString());

        }
    }
    
}
