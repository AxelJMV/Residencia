/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clases;

/**
 *
 * @author Axel
 */
public class Usuario {
    
    private int idUser;
    private String user;
    private String password;
    private int primersesion;
    
    
    public Usuario(){
        
    }

    public Usuario(String user, String password, int primersesion) {
        this.user = user;
        this.password = password;
        this.primersesion = primersesion;
    }
    
   
    public int getIdUser() {
        return idUser;
    }
    
    public void setIdUser(int idUser){
        this.idUser = idUser;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPrimersesion() {
        return primersesion;
    }

    public void setPrimersesion(int primersesion) {
        this.primersesion = primersesion;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "idUser=" + idUser + ", user=" + user + ", password=" + password + ", primersesion=" + primersesion + '}';
    }
     
}
