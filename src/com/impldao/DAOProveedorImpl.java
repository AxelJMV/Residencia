/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.impldao;

import java.sql.Connection;
import com.clases.Proveedor;
import com.dao.DAOProveedor;
import com.conexion.ConexionBD;
import static com.conexion.ConexionBD.obtenerConexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;
import java.util.List;



/**
 *
 * @author Axel
 */
public class DAOProveedorImpl extends ConexionBD implements DAOProveedor{

    public Proveedor proveedor;    
      
    @Override
    public void registrar(Proveedor proveedor) throws Exception {
           try (Connection conexion = obtenerConexion()) {
            String consulta = "INSERT INTO proveedor (nombre, descripcion) VALUES (?, ?)";
                 try (PreparedStatement statement = conexion.prepareStatement(consulta, PreparedStatement.RETURN_GENERATED_KEYS)) {
                statement.setString(1, proveedor.getNombre());
                statement.setString(2, proveedor.getDescripcion());
                

                int filasAfectadas = statement.executeUpdate();

                if (filasAfectadas > 0) {
                    try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                        if (generatedKeys.next()) {
                            proveedor.setIdProveedor(generatedKeys.getInt(1));
                            cerrarConexion(conexion);

                        } else {
                            cerrarConexion(conexion);
                            throw new SQLException("Error al obtener el ID generado para el proveedor");
                        }
                    }
                } else {
                    cerrarConexion(conexion);
                    throw new SQLException("Error al insertar el proveedor en la base de datos");
                    
                }
            }
        }
            
        }

    @Override
    public void modificar(Proveedor proveedor) throws Exception {
             try (Connection conexion = obtenerConexion()) {
            String consulta = "UPDATE proveedor SET nombre = ?, descripcion = ? WHERE idproveedor = ?";
            try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
                statement.setString(1, proveedor.getNombre());
                statement.setString(2, proveedor.getDescripcion());
                statement.setInt(3, proveedor.getIdProveedor());

                statement.executeUpdate();
                cerrarConexion(conexion);

            }
        }
    }

    @Override
    public void eliminar(Proveedor proveedor) throws Exception {
           try (Connection conexion = obtenerConexion()) {
            String consulta = "DELETE FROM proveedor WHERE idproveedor = ?";
            try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
                statement.setInt(1,proveedor.getIdProveedor());
                    
                statement.executeUpdate();
                cerrarConexion(conexion);

            }
        }
    }

    @Override
    public List<Proveedor> listar() throws Exception {
        List<Proveedor> proveedores = new ArrayList<>();
        try (Connection conexion = obtenerConexion()) {
            String consulta = "SELECT * FROM proveedores";
            try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        Proveedor proveedor = new Proveedor();
                        proveedor.setIdProveedor(resultSet.getInt("idproveedor"));
                        proveedor.setNombre(resultSet.getString("nombre"));
                        proveedor.setDescripcion(resultSet.getString("descripcion"));
                        
                        proveedores.add(proveedor);
                    }
                }
            }
        }
        return proveedores;
    }
    }


    
    

