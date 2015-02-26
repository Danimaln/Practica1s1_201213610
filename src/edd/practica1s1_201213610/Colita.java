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

////    private nodoPlanta cola;
//    private NodoPoZ cola;    
////    private static nodoZombie listaCatalogo;
//    private static NodoPoZ listaCatalogo; 
//    
//    
////    public nodoPlanta obtenerSalida() {
//    public NodoPoZ obtenerSalida(){    
////        nodoPlanta aux = cola;
//        NodoPoZ aux = cola;
//        return aux;
//    }
//
//    public int getTamaño() {
//        int contador = 0;
////        nodoPlanta aux = cola;
//        NodoPoZ aux = cola;
//
//        if (aux == null) {
//            System.out.println("auxiliar null");
//        } else {
//            contador++;
////            while (aux.sig != null) {
//            while (aux.sigp!=null){
////                System.out.println("paso una vez " + aux.Nombre + "  " + aux.sig.Nombre);
//                System.out.println("paso una vez "+aux.getNombre()+" "+aux.sigp.getNombre());
//                contador++;
//                System.out.println(contador + " CUANTO TIENE");
////                aux = aux.sig;
//                aux=aux.sigp;
//            }
//
//        }
//
//        return contador;
//
//    }
//
////    public void insert(String nombre, String ataque, int modif) {
//    public void insert(String c, String i, String t, String pa, String pd,String n, String d){
////        nodoPlanta elemento = new nodoPlanta();
//        NodoPoZ elemento = new NodoPoZ(c, i, t, pa, pd,n, d);
////        elemento.Nombre = nombre;
////        elemento.puntos = modif;
////        elemento.ataque = ataque;
//        if (cola == null) {
////            cola = new nodoPlanta();
//            cola = new NodoPoZ();
//            cola = elemento;
//            System.out.println("se agrego un elemto");
//        } else {
//            nodoPlanta aux = cola;
//            while (aux.sig != null) {
//                aux = aux.sig;
//
//            }
//            aux.sig = elemento;
//
//        }
//        //System.out.println("ELEMENTO en tamaño " + getTamaño());
//    }
//
////    public nodoPlanta getRaiz() {
//    public NodoPoZ getRaiz(){    
////        nodoPlanta aux = cola;
//        NodoPoZ aux = cola;
//        return aux;
//    }
//    
    
    
    
    
////    public NodoSimple primerNodo;
//    public NodoPoZ first;
////    public NodoSimple ultimoNodo;
//    public NodoPoZ last;
//
////    public void agregarACola(Object datos) {
//    public void offer(NodoPoZ datos) {
//        if (listaVacia()) {
//            primerNodo = ultimoNodo = new NodoSimple(datos);
//        } else {
//            ultimoNodo = ultimoNodo.siguienteNodo = new NodoSimple(datos);
//        }
//    }
//
//    public Object eliminar() {
//        if (!listaVacia()) { // lanza excepción si la Lista está vacía
//
//
//            Object elementoEliminado = primerNodo.datos; // obtiene los datos que se van aeliminar
//            // actualiza las referencias primerNodo y ultimoNodo
//            if (primerNodo == ultimoNodo) {
//                primerNodo = ultimoNodo = null;
//            } else {
//                primerNodo = primerNodo.siguienteNodo;
//            }
//            return elementoEliminado; // devuelve los datos del nodo eliminado
//        } else {
//            return null;
//        }// fin del método eliminarDelFrente
//    }
//
//    public int tamanioDeLaCola() {
//        NodoPoZ nodo = first;
//        int tamanioCola = 0;
//        while (nodo != null) {
//            tamanioCola++;
//            nodo = nodo.sigp;
////            nodo = nodo.siguienteNodo;
//        }
//        return tamanioCola;
//    }
//    
//
//    boolean listaVacia() {
//        return first == null;
//    }
//    
    
    
    
//    private NodoPoZ[] cola;
//    private int frente;
//    private int fin; 
//    
//    public Colita(int tamano){
//        cola = new NodoPoZ[tamano];
//        frente = fin = -1;         
//    }
//    
//    public boolean Vacia(){
//        return frente == fin;
//    }
//    
//    public boolean Llena(){
//        return frente == cola.length-1;
//    }
//    
//    public void Insertar(NodoPoZ elemento){
//        if(Llena()){
//            System.out.println("La cola esta llena, elimine datos");
//        }else{
//            cola[++fin]=elemento;
//        }
//    }
//    
//    public Object Eliminar(){
//        if(Vacia()){
//            System.out.println("La cola esta vacia, insertar datos");
//            return "Cola vacia";
//        }else{
//            return cola[++frente];
//        }
//    }
//    
//    public void Imprimir(){
//        if (Vacia()){
//            System.out.println("La cola esta vacia");;
//        }else if(frente ==-1){
//            for (int i=0; i<=fin; i++){
//                System.out.println(cola[i]);
//            }
//        }else{
//            for(int j=frente; j<=fin; j++){
//                System.out.println(cola[j]);
//            }
//        }
//            
//    }
    
    
    
    public Nodo primerNodo;
    public Nodo ultimoNodo;

    public void agregarACola(Object datos) {
        if (listaVacia()) {
            primerNodo = ultimoNodo = new Nodo(datos);
        } else {
            ultimoNodo = ultimoNodo.siguienteNodo = new Nodo(datos);
        }
    }

    public Object eliminar() {
        if (!listaVacia()) { // lanza excepción si la Lista está vacía


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
        }// fin del método eliminarDelFrente
    }

    public int tamanioDeLaCola() {
        Nodo nodo = primerNodo;
        int tamanioCola = 0;
        while (nodo != null) {
            tamanioCola++;
            nodo = nodo.siguienteNodo;
        }
        return tamanioCola;
    }

    boolean listaVacia() {
        return primerNodo == null;
    }
    
}
