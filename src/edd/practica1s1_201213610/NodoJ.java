/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.practica1s1_201213610;

/**
 *
 * @author Daniel
 */
public class NodoJ {
   
    
    private String nombre, usuario; 

    private NodoJ siguiente;
    private NodoJ anterior;

    
    public NodoJ getAnterior() {
        return anterior;
    }
    public void setAnterior(NodoJ anterior) {
        this.anterior = anterior;
    }

    
    
    public NodoJ getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(NodoJ siguiente) {
        this.siguiente = siguiente;
    }
            
    
    public NodoJ (String n, String u){
        nombre = n;
        usuario = u;      
                
        siguiente =this;
        anterior = this;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
    
    
}
