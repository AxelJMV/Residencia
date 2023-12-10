/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Axel
 */
public class ConexionBD {
    
    //configuracion de la conexion
    private static final String URL = "jdbc:mysql://localhost:3306/inventario";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    
    public static Connection obtenerConexion(){
        try{
            //Cargar controlador JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");           
            //Establecer la conexion
            return DriverManager.getConnection(URL,USUARIO,PASSWORD);          
        }catch(ClassNotFoundException | SQLException e){
            // Manejar cualquier excepción que pueda ocurrir durante la conexión
            e.printStackTrace();
            throw new RuntimeException("Error al conectar a la base de datos.");
        }
    }
    
    // Método para cerrar la conexión
    public static void cerrarConexion(Connection conexion) {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    //Probar la conexión 
      public static void probarConexion() {
        Connection conexion = obtenerConexion();

        try {
            // Ejemplo de consulta simple
            String consulta = "SELECT 1";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                System.out.println("Conexión exitosa a la base de datos.");
            } else {
                System.out.println("No se pudo realizar la conexión correctamente.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al probar la conexión a la base de datos.");
        } finally {
            cerrarConexion(conexion);
        }
    }
      
      
      
      public static void main(String[] args){
          probarConexion();
      }
    
}
