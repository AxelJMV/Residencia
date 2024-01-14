/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clases;

/**
 *
 * @author Axel
 */
public class Proveedor {
    
    private int idProveedor;
    private String nombre;
    private String descripcion;
    
    public Proveedor() {
    }

    public Proveedor(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    public Proveedor(int idProveedor,String nombre, String descripcion) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setIdProveedor(int id) {
        this.idProveedor = id;
    }
    @Override
    public String toString() {
    return getNombre();  // O cualquier otra lógica que quieras para representar el proveedor como cadena
    }   
    
    
    
    
    
}
