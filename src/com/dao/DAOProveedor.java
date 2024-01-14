/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dao;

import com.clases.Proveedor;
import java.util.List;

/**
 *
 * @author Axel
 */
public interface DAOProveedor {
    //Creamos metodos CRUD
    public void registrar(Proveedor proveedor) throws Exception;
    public void modificar(Proveedor proveedor) throws Exception;
    public void eliminarIdProveedor(Proveedor proveedor) throws Exception;
    public void eliminarNombre(Proveedor proveedor) throws Exception;
    public List<Proveedor> listar() throws Exception;
    
    // Nuevo método para búsqueda por idProveedor
    Proveedor buscarPorNombre(Proveedor proveedor) throws Exception;
}
