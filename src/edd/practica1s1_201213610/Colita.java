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
public class Colita {
    
    public Nodo primerNodo;
    public Nodo ultimoNodo;

    public void offer(Object objeto) {
        if (empty()) {
            primerNodo = ultimoNodo = new Nodo(objeto);
        } else {
            ultimoNodo = ultimoNodo.siguienteNodo = new Nodo(objeto);
        }
    }

    public Object poll() {
        if (!empty()) { 
            Object elementoEliminado = primerNodo.datos;             
            if (primerNodo == ultimoNodo) {
                primerNodo = ultimoNodo = null;
            } else {
                primerNodo = primerNodo.siguienteNodo;
            }
            return elementoEliminado; 
        } else {
            return null;
        }
    }

    public int size() {
        Nodo nodo = primerNodo;
        int tamanioCola = 0;
        while (nodo != null) {
            tamanioCola++;
            nodo = nodo.siguienteNodo;
        }
        return tamanioCola;
    }

    boolean empty() {
        return primerNodo == null;
    }
    
}
