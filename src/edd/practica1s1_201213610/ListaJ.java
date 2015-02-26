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
public class ListaJ {
    
    public String nom, usu;
    private int length;    
//    public String nom,ape,eda,tel,dir,ima;
    public NodoJ aux, nuevo,reco ,inicio,listaj;
    
    public ListaJ (){
        inicio=null;
        this.length=0;        
    }
    
    
    
    //String n, String a, String e, String t, String d,String i++++++++++++++++++++++
    public void incertar(String n, String u){
    
        nuevo =new NodoJ(n,u);     //toma los valores y los gurada en el nodo nuevo.
        if (inicio==null){                      // cuando se ingresa el primer valor, crea el primer nodo en la lista con los valores de nuevo
            inicio=nuevo;
            nuevo.setSiguiente(null);
        }else{
            aux=inicio;                          //el principio de la lista
            while (aux.getSiguiente()!=null){  //viaja a travez de la lista para encontrar el ultimo nodo
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);             //crea un nuevo nodo en el final con los valores de "nuevo" 
            nuevo.setSiguiente(null);          //apuntador hacia el principio
            nuevo.setAnterior(aux);              //apuntador al anterior 
        }       
        this.length++;
    }

    
    public void siguiente(){
        
        if (reco.getSiguiente()!= null){   // si el siguiete es no es el inicio de la lista
            reco=reco.getSiguiente();        //se pasa al siguiente
        }else{

        }        
        nom=(reco.getNombre());              // manda los valores del nodo 
        usu=(reco.getUsuario());        
    }
    
    
    
    
    public void regresar(){
        if (reco.getAnterior()!= nuevo ){    //si el nodo anterior no es el inicio de la lista
            reco=reco.getAnterior();         //toma los valores del anterior
        }else{
            
        } 
        nom=(reco.getNombre());              // manda los valores del nodo 
        usu=(reco.getUsuario());  
    }
    
    
    
     public void modificar(String n, String u){
        if (inicio!=null){
            reco.setNombre(n);
            reco.setUsuario(u);            
        }else {
            
        }
    }
      
     public void Borrar(){
         
            aux =reco.getAnterior();
            reco=reco.getSiguiente();
            aux.setSiguiente(reco);
            reco.setAnterior(aux);
            
            this.length--;
 
    }
    
     
    public NodoJ getJugador(int indice){
        if (inicio!=null){ 
            listaj = null;
            aux=inicio;
            int a= 0;                           //el principio de la lista
            while (aux !=null){  //viaja a travez de la lista para encontrar el nodo deceado
                if (a == indice){
                    listaj = aux;
                   break;
                }
                aux=aux.getSiguiente();
                a++;
            }
        }
        return listaj;
    }
    
    /**
    * Retorna el numero de elementos de la lista
    *@return Canditad de elementos.
    */	
    public int Length(){
        return this.length;
    }
    
    
    
//    private NodoJ primerNodo;
//    private NodoJ ultimoNodo;
//    
//    private NodoJ registroActual;
//    
//    private int length;
//
//    public ListaJ(){
//        this.length=0;
//    }
//
//    /**
//    *Adiciona el jAdicionar al final de la lista
//    *@param jAdicionar el paciente que se quiere adicionar
//    */
//    public void Add(Jugador jAdicionar){	
//        NodoJ nodoAdicionar = new NodoJ(jAdicionar);
//
//        //verificar si es o no el primer nodo
//        if (this.primerNodo==null){
//            this.primerNodo=nodoAdicionar;
//            this.ultimoNodo=this.primerNodo;
//            this.registroActual=this.primerNodo;
//        }else{
//            this.ultimoNodo.EnlazarSiguiente(nodoAdicionar);
//            nodoAdicionar.EnlazarAnterior(this.ultimoNodo);
//            this.ultimoNodo=nodoAdicionar;					
//        }
//        this.length++;
//    }
//    
//    /**
//     * obtiene el siguiente j de la lista
//     * @return 
//     */
//    public Jugador getNextJ(){
//        if (registroActual==null){
//            return null;
//        }else{            
//            if (this.registroActual!=null){
//                Jugador Temporal;
//                Temporal = this.registroActual.getJ();
//                this.registroActual=this.registroActual.getSiguienteNodo();
//                return Temporal;
//            }else{
//                return null;
//            }
//        }
//        
//        
//    }
//    
//    /**
//     * reubica el registro actual en el primer jugador
//     */
//    public void ResetNextPoZ(){
//        this.registroActual=this.primerNodo;
//    }
//            
//    /**
//    * Retorna el numero de elementos de la lista
//    *@return Canditad de elementos.
//    */	
//    public int Length(){
//        return this.length;
//    }
//
//	/**
//	*Remueve el ultimo jugador de la lista
//	*/
//    public void Remove(){
//
//        if (this.primerNodo==null){
//                return;
//        }		
//
//        if (this.length==1){
//                this.primerNodo=null;
//        }else{
//
//        NodoJ nodoAnteriorActual;
//        nodoAnteriorActual=this.ultimoNodo.getAnteriorNodo();
//        
//
//        nodoAnteriorActual.RomperEnlaceSiguiente();
//        this.ultimoNodo.RomperEnlaceAnterior();
//        this.ultimoNodo=nodoAnteriorActual;        
//	
//        }
//        this.length--;
//    }
//    
//    /**
//     * Retorna el j de la posicion indicada
//     * @param posicion
//     * @return el j de la posicion indicada
//     */        
//    public Jugador getJAt(int posicion){
//        if(this.primerNodo==null){
//            return null;
//        }else if(posicion >= length){
//            return null;
//        }else{
//            NodoJ nodoRequerido;
//            nodoRequerido = this.primerNodo;
//            int contador=0;
//            
//            while(contador<posicion){
//                nodoRequerido=nodoRequerido.getSiguienteNodo();   
//                contador++;
//            }
//            
//            return nodoRequerido.getJ();
//        }    
//        
//    }
//    
}
