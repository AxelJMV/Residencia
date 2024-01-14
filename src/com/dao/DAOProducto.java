/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dao;

import com.clases.Producto;
import java.util.List;

/**
 *
 * @author Axel
 */
public interface DAOProducto {
    //Creamos metodos CRUD
    public void registrar(Producto producto) throws Exception;
    public void modificar(Producto producto) throws Exception;
    public void eliminarIdentificador(Producto producto) throws Exception;
    public void eliminarNombre(Producto producto) throws Exception;
    public List<Producto> listar() throws Exception;
    
    // Nuevo método para búsqueda por idProveedor
    Producto buscarPorIdentificador(Producto producto) throws Exception;
    
}


