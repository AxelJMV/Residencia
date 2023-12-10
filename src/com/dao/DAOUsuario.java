/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dao;
import com.clases.Usuario;
import java.util.List;

/**
 *
 * @author Axel
 */
public interface DAOUsuario {
    
    //Creando métodos CRUD
    public void registrar(Usuario usuario) throws Exception;
    public void modificar(Usuario usuario) throws Exception;
    public void eliminar(Usuario usuario) throws Exception;
    public List<Usuario> listar() throws Exception;
   
}
