/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.impldao;

import com.clases.Producto;
import java.sql.Connection;
import com.conexion.ConexionBD;
import static com.conexion.ConexionBD.obtenerConexion;
import com.dao.DAOProducto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Axel
 */
public class DAOProductoImpl extends ConexionBD implements DAOProducto{
    public Producto producto; 
    @Override
    public void registrar(Producto producto) throws Exception {
              try (Connection conexion = obtenerConexion()) {
            //String consulta = "INSERT INTO producto (identificador,nombre,cantidad,idproveedor) VALUES (?,?,?,?)";
            String consulta = "INSERT INTO producto (identificador,nombre,cantidad,idproveedor,precio) VALUES (?,?,?,?,?)";
                 try (PreparedStatement statement = conexion.prepareStatement(consulta, PreparedStatement.RETURN_GENERATED_KEYS)) {
                statement.setString(1, producto.getIdentificador());
                statement.setString(2, producto.getNombre());
                statement.setInt(3, producto.getCantidad());
                statement.setInt(4, producto.getIdProveedor());
                statement.setDouble(5, producto.getPrecio());
                

                int filasAfectadas = statement.executeUpdate();

                if (filasAfectadas > 0) {
                    try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                        if (generatedKeys.next()) {
                            producto.setIdProducto(generatedKeys.getInt(1));
                            cerrarConexion(conexion);

                        } else {
                            cerrarConexion(conexion);
                            throw new SQLException("Error al obtener el ID generado para el producto");
                        }
                    }
                } else {
                    cerrarConexion(conexion);
                    throw new SQLException("Error al insertar el producto en la base de datos");
                    
                }
            }
        }
    }

    @Override
    public void modificar(Producto producto) throws Exception {
            try (Connection conexion = obtenerConexion()) {
            String consulta = "UPDATE producto SET nombre = ?, cantidad = ?, idproveedor = ?, precio = ? WHERE  identificador = ?";
            try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
                statement.setString(1, producto.getNombre());
                statement.setInt(2, producto.getCantidad());
                statement.setInt(3, producto.getIdProveedor());
                statement.setDouble(4, producto.getPrecio());
                statement.setString(5, producto.getIdentificador());
                
                statement.executeUpdate();
                cerrarConexion(conexion);
            }
        }
    }

    @Override
    public void eliminarIdentificador(Producto producto) throws Exception {
            try (Connection conexion = obtenerConexion()) {
            String consulta = "DELETE FROM producto WHERE identificador = ?";
            try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
                statement.setObject(1,producto.getIdentificador());
                    
                statement.executeUpdate();
                cerrarConexion(conexion);

            }
        }
    }

    @Override
    public List<Producto> listar() throws Exception {
        List<Producto> productos = new ArrayList<>();
        try (Connection conexion = obtenerConexion()) {
            String consulta = "SELECT * FROM producto";
            try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        Producto producto = new Producto();
                        producto.setIdentificador(resultSet.getString("identificador"));
                        producto.setNombre(resultSet.getString("nombre"));
                        producto.setCantidad(resultSet.getInt("cantidad"));
                        producto.setIdProveedor(resultSet.getInt("idproveedor"));
                        producto.setPrecio(resultSet.getDouble("precio"));                   
                        productos.add(producto);
                    }
                }
            }
        }
        return productos;
    }

    @Override
    public Producto buscarPorIdentificador(Producto producto) throws Exception {
            Producto productoEncontrado = null;
             try (Connection conexion = obtenerConexion()) {
            String consulta = "SELECT * FROM producto WHERE identificador = ?";
            try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
                System.out.println(producto.getIdentificador());
                statement.setString(1, producto.getIdentificador());
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        productoEncontrado = new Producto();
                        productoEncontrado.setIdentificador(resultSet.getString("identificador"));
                        productoEncontrado.setNombre(resultSet.getString("nombre"));
                        productoEncontrado.setCantidad(resultSet.getInt("cantidad"));
                        productoEncontrado.setIdProveedor(resultSet.getInt("idproveedor"));
                        productoEncontrado.setPrecio(resultSet.getDouble("precio"));
                    }
                }
            }
        }
        return productoEncontrado; 
    }

    @Override
    public void eliminarNombre(Producto producto) throws Exception {
             try (Connection conexion = obtenerConexion()) {
            String consulta = "DELETE FROM producto WHERE nombre = ?";
            try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
                statement.setString(1,producto.getNombre());
                    
                statement.executeUpdate();
                cerrarConexion(conexion);

            }
        }
    }
    
}
