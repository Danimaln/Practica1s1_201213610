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
public class Nodo {
    public Nodo siguienteNodo;
    public Object datos;

    Nodo(Object datos) {
        this(datos, null);

    }

    Nodo(Object datos, Nodo siguienteNodo) {

        this.datos = datos;
        this.siguienteNodo = siguienteNodo;
    }

    public Nodo getSiguienteNodo() {
        return siguienteNodo;
    }

    public Object getDatos() {
        return datos;
    }
}
