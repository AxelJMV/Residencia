/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.impldao;


import java.sql.Connection;
import com.clases.Usuario;
import com.dao.DAOUsuario;
import com.conexion.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Axel
 */
public class DAOUsuarioImpl extends ConexionBD implements DAOUsuario{

    @Override
    public void registrar(Usuario usuario) throws SQLException {
        try (Connection conexion = obtenerConexion()) {
            String consulta = "INSERT INTO usuario (user, password, primerasesion) VALUES (?, ?, ?)";
            try (PreparedStatement statement = conexion.prepareStatement(consulta, PreparedStatement.RETURN_GENERATED_KEYS)) {
                statement.setString(1, usuario.getUser());
                statement.setString(2, usuario.getPassword());
                statement.setInt(3, usuario.getPrimersesion());

                int filasAfectadas = statement.executeUpdate();

                if (filasAfectadas > 0) {
                    try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                        if (generatedKeys.next()) {
                            usuario.setIdUser(generatedKeys.getInt(1));
                        } else {
                            throw new SQLException("Error al obtener el ID generado para el usuario.");
                        }
                    }
                } else {
                    throw new SQLException("Error al insertar el usuario en la base de datos.");
                }
            }
        }
    }

     @Override
    public void modificar(Usuario usuario) throws SQLException {
        try (Connection conexion = obtenerConexion()) {
            String consulta = "UPDATE usuario SET user = ?, password = ?, primerasesion = ? WHERE iduser = ?";
            try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
                statement.setString(1, usuario.getUser());
                statement.setString(2, usuario.getPassword());
                statement.setInt(3, usuario.getPrimersesion());
                statement.setInt(4, usuario.getIdUser());

                statement.executeUpdate();
            }
        }
    }

     @Override
    public void eliminar(Usuario usuario) throws SQLException {
        try (Connection conexion = obtenerConexion()) {
            String consulta = "DELETE FROM usuario WHERE iduser = ?";
            try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
                statement.setInt(1, usuario.getIdUser());

                statement.executeUpdate();
            }
        }
    }

    @Override
    public List<Usuario> listar() throws SQLException {
        List<Usuario> usuarios = new ArrayList<>();
        try (Connection conexion = obtenerConexion()) {
            String consulta = "SELECT * FROM usuario";
            try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        Usuario usuario = new Usuario();
                        usuario.setIdUser(resultSet.getInt("iduser"));
                        usuario.setUser(resultSet.getString("user"));
                        usuario.setPassword(resultSet.getString("password"));
                        usuario.setPrimersesion(resultSet.getInt("primerasesion"));
                      
                        usuarios.add(usuario);
                    }
                }
            }
        }
        return usuarios;
    } 
    
    // Buscar Usuario.
    public boolean autenticarUsuario(String usuario, String contrasena) throws SQLException {
        try (Connection conexion = obtenerConexion()) {
            String consulta = "SELECT * FROM usuario WHERE user = ? AND password = ?";
            try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
                statement.setString(1, usuario);
                statement.setString(2, contrasena);

                try (ResultSet resultSet = statement.executeQuery()) {
                    return resultSet.next(); // Si hay al menos un resultado, las credenciales son válidas.
                }
            }
        }
    }
    
    
    
}
