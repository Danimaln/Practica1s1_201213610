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
public class Pilita {
    public Nodo primerNodo;
    public Nodo ultimoNodo;
        
    public Object pop() {
        if (!empty()) {
            Object elim = primerNodo.datos;             
            if (primerNodo == ultimoNodo) {
                primerNodo = ultimoNodo = null;
            } else {
                primerNodo = primerNodo.siguienteNodo;
            }
            return elim; 
        } else {
            return null;
        }
    }
    
    public void push(Object objeto) {
        if (empty()) {
            primerNodo = ultimoNodo = new Nodo(objeto);
        } else {
            primerNodo = new Nodo(objeto, primerNodo);
        }
    }

    public int size() {
        Nodo nodo = primerNodo;
        int tamano = 0;
        while (nodo != null) {
            tamano++;
            nodo = nodo.siguienteNodo;
        }
        return tamano;
    }

    boolean empty() {
        return primerNodo == null;
    }
}
