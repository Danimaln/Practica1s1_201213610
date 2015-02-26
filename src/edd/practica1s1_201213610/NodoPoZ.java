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
