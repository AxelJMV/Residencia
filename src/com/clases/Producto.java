/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clases;

import java.math.BigInteger;

/**
 *
 * @author Axel
 */
public class Producto {
    
    private int idProducto;
    private String identificador;
    private String nombre;
    private int cantidad;
    private int idProveedor;
    private double precio;

    public Producto() {
    }
    
    

    public Producto(String identificador, String nombre, int cantidad, int idProveedor) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.idProveedor = idProveedor;
    }
    
    
     public Producto(int idProducto,String identificador, String nombre, int cantidad, int idProveedor, double precio) {
        this.idProducto = idProducto;
        this.identificador = identificador;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.idProveedor = idProveedor;
        this.precio = precio;
    }
    
    
     public Producto(String identificador, String nombre, int cantidad, int idProveedor, double precio) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.idProveedor = idProveedor;
        this.precio = precio;
    }
    
    

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    
    
}
