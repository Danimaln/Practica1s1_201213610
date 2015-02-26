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

    public void apilar(Object datos) {
        if (listaVacia()) {
            primerNodo = ultimoNodo = new Nodo(datos);
        } else {
            primerNodo = new Nodo(datos, primerNodo);
        }
    }

    ;
    
    public Object eliminar() {
        if (!listaVacia()) {
            Object elementoEliminado = primerNodo.datos; // obtiene los datos que se van aeliminar
            // actualiza las referencias primerNodo y ultimoNodo
            if (primerNodo == ultimoNodo) {
                primerNodo = ultimoNodo = null;
            } else {
                primerNodo = primerNodo.siguienteNodo;
            }
            return elementoEliminado; // devuelve los datos del nodo eliminado
        } else {
            return null;
        }
    }

    public int tamanioDeLaPila() {
        Nodo nodo = primerNodo;
        int tamanioPila = 0;
        while (nodo != null) {
            tamanioPila++;
            nodo = nodo.siguienteNodo;
        }
        return tamanioPila;
    }

    boolean listaVacia() {
        return primerNodo == null;
    }
}
