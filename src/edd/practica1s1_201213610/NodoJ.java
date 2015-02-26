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
    
    
    
    
    
//    private Jugador j;
//    NodoJ anteriorNodo;//apunta a otro nodo (autoreferenciadas)
//    NodoJ siguienteNodo;
//
//    /**
//    *contruya con un jugador adentro
//    *@param j que se almacena dentro del nodo
//    */
//    public NodoJ(Jugador j){
//            this.j = j;
//    }
//
//    //quien es el siguiente nodo a este 
//    public NodoJ getSiguienteNodo(){
//            return this.siguienteNodo;	
//    }
//
//    //quien es el anterior nodo a este 
//    public NodoJ getAnteriorNodo(){
//            return this.anteriorNodo;	
//    }	
//
//    //enlaza el nodo actualn, por el enlace siguiente, con el nodo especificado
//    //@param siguienteNodo el nodo con el que se va a enlazar	
//    public void EnlazarSiguiente(NodoJ siguienteNodo){
//            this.siguienteNodo = siguienteNodo;
//    }
//
//    //enlaza el nodo actual, por el enlace anterior, con el nodo especificado
//    //@param anteriorNodo el nodo con el que se va a enlazar		
//    public void EnlazarAnterior(NodoJ anteriorNodo){
//            this.anteriorNodo = anteriorNodo;
//    }
//
//    /**
//    *Establece a null el enlace siguiente del nodo
//    */
//    public void RomperEnlaceSiguiente(){
//            this.siguienteNodo=null;
//    }
//
//    /**
//    *Establece a null el enlace anterior del nodo
//    */
//    public void RomperEnlaceAnterior(){
//            this.anteriorNodo=null;
//    }
//
//    //encapsular jugador() solo get	
//    public Jugador getJ(){
//            return j;
//    }
}
