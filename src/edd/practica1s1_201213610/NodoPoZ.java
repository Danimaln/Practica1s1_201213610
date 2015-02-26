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
public class NodoPoZ {
    
    private String clase, imagen, tipo, puntosA, puntosD, nombre, dueno;
    
    public NodoPoZ sigp;
    public NodoPoZ sigz=null;
    
    public NodoPoZ getSiguienteNodoP() {
        return sigp;
    }
    
    
//    private String nombres,apellido,edad,telefono,direccion,imagens;
    private NodoPoZ siguiente;
    private NodoPoZ anterior;

    
    public NodoPoZ getAnterior() {
        return anterior;
    }
    public void setAnterior(NodoPoZ anterior) {
        this.anterior = anterior;
    }

    
    public NodoPoZ getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(NodoPoZ siguiente) {
        this.siguiente = siguiente;
    }
            
    
    public NodoPoZ (String c, String i, String t, String pa, String pd,String n, String d){
        clase=c;
        imagen=i;
        tipo=t;
        puntosA=pa;
        puntosD=pd;
        nombre=n;
        dueno=d;
                
        siguiente =this;
        anterior = this;
        
        
    }
//    
//    public String getImagen() {
//        return imagen;
//    }
//    public void setImagen(String imagen) {
//        this.imagen = imagen;
//    }
//
//
//    
//    
//    public String getNombre() {
//        return nombre;
//    }
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
// 
//    
//    public String getApellido() {
//        return apellido;
//    }
//    public void setApellido(String apellido) {
//        this.apellido = apellido;
//    }
//
//
//    
//    public String getEdad() {
//        return edad;
//    }
//    public void setEdad(String edad) {
//        this.edad = edad;
//    }
//
//
//    
//    public String getTelefono() {
//        return telefono;
//    }
//    public void setTelefono(String telefono) {
//        this.telefono = telefono;
//    }
//
//    
//
//    public String getDireccion() {
//        return direccion;
//    }
//    public void setDireccion(String direccion) {
//        this.direccion = direccion;
//    }

    
    
    
    
    
    
//    private PoZ poz;
//    NodoPoZ anteriorNodo;//apunta a otro nodo (autoreferenciadas)
//    NodoPoZ siguienteNodo;
//
//    /**
//    *contruya con un poz adentro
//    *@param poz que se almacena dentro del nodo
//    */
//    public NodoPoZ(PoZ poz){
//            this.poz = poz;
//    }
//
//    //quien es el siguiente nodo a este 
//    public NodoPoZ getSiguienteNodo(){
//            return this.siguienteNodo;	
//    }
//
//    //quien es el anterior nodo a este 
//    public NodoPoZ getAnteriorNodo(){
//            return this.anteriorNodo;	
//    }	
//
//    //enlaza el nodo actualn, por el enlace siguiente, con el nodo especificado
//    //@param siguienteNodo el nodo con el que se va a enlazar	
//    public void EnlazarSiguiente(NodoPoZ siguienteNodo){
//            this.siguienteNodo = siguienteNodo;
//    }
//
//
//    //enlaza el nodo actual, por el enlace anterior, con el nodo especificado
//    //@param anteriorNodo el nodo con el que se va a enlazar		
//    public void EnlazarAnterior(NodoPoZ anteriorNodo){
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
//    //encapsular PoZ() solo get	
//    public PoZ getPoZ(){
//            return poz;
//    }

    /**
     * @return the clase
     */
    public String getClase() {
        return clase;
    }

    /**
     * @param clase the clase to set
     */
    public void setClase(String clase) {
        this.clase = clase;
    }

    /**
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the puntosA
     */
    public String getPuntosA() {
        return puntosA;
    }

    /**
     * @param puntosA the puntosA to set
     */
    public void setPuntosA(String puntosA) {
        this.puntosA = puntosA;
    }

    /**
     * @return the puntosD
     */
    public String getPuntosD() {
        return puntosD;
    }

    /**
     * @param puntosD the puntosD to set
     */
    public void setPuntosD(String puntosD) {
        this.puntosD = puntosD;
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
     * @return the dueno
     */
    public String getDueno() {
        return dueno;
    }

    /**
     * @param dueno the dueno to set
     */
    public void setDueno(String dueno) {
        this.dueno = dueno;
    }
}
