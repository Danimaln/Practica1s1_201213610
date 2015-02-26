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
public class ListaPoZ {
    
    public String cla, ima, ti, puA, puD, nom, due;
    private int length;    
//    public String nom,ape,eda,tel,dir,ima;
    public NodoPoZ aux, nuevo,reco ,inicio,personaje;
    
    public ListaPoZ (){
        inicio=null;
        this.length=0;        
    }
    
    
    
    //String n, String a, String e, String t, String d,String i++++++++++++++++++++++
    public void incertar(String c, String i, String t, String pa, String pd,String n, String d){
    
        nuevo =new NodoPoZ(c,i,t,pa,pd,n,d);     //toma los valores y los gurada en el nodo nuevo.
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
        cla=(reco.getClase());              // manda los valores del nodo 
        ima=(reco.getImagen());
        ti=(reco.getTipo());
        puA=(reco.getPuntosA());
        puD=(reco.getPuntosD());
        nom=(reco.getNombre());
        due=(reco.getDueno());        
        
    }
    
    
    
    
    public void regresar(){
        if (reco.getAnterior()!= nuevo ){    //si el nodo anterior no es el inicio de la lista
            reco=reco.getAnterior();         //toma los valores del anterior
        }else{
            
        } 
        cla=(reco.getClase());              // manda los valores del nodo 
        ima=(reco.getImagen());
        ti=(reco.getTipo());
        puA=(reco.getPuntosA());
        puD=(reco.getPuntosD());
        nom=(reco.getNombre());
        due=(reco.getDueno());   
    }
    
    
    
     public void modificar(String c, String i, String t, String pa, String pd,String n, String d){
        if (inicio!=null){
            
            reco.setClase(c);
            reco.setImagen(i);
            reco.setTipo(t);
            reco.setPuntosA(pa);
            reco.setPuntosD(pd);
            reco.setNombre(n);
            reco.setDueno(d);         
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
    
     
    public NodoPoZ getPersonaje (int indice){
        if (inicio!=null){ 
            personaje = null;
            aux=inicio;
            int a= 0;                           //el principio de la lista
            while (aux !=null){  //viaja a travez de la lista para encontrar el nodo deceado
                if (a == indice){
                    personaje = aux;
                   break;
                }
                aux=aux.getSiguiente();
                a++;
            }
        }
        return personaje;
    }
    
    /**
    * Retorna el numero de elementos de la lista
    *@return Canditad de elementos.
    */	
    public int Length(){
        return this.length;
    }
    
    
//    private NodoPoZ primerNodo;
//    private NodoPoZ ultimoNodo;
//    
//    private NodoPoZ registroActual;
//    
//    private int length;
//
//    public ListaPoZ(){
//        this.length=0;
//    }
//
//    /**
//    *Adiciona el pozAdicionar al final de la lista
//    *@param pozAdicionar el paciente que se quiere adicionar
//    */
//    public void Add(PoZ pozAdicionar){	
//        NodoPoZ nodoAdicionar = new NodoPoZ(pozAdicionar);
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
//     * obtiene el siguiente poz de la lista
//     * @return 
//     */
//    public PoZ getNextPoZ(){
//        if (registroActual==null){
//            return null;
//        }else{            
//            if (this.registroActual!=null){
//                PoZ Temporal;
//                Temporal = this.registroActual.getPoZ();
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
//     * reubica el registro actual en el primer paciente
//     */
//    public void ResetNextPoZ(){
//        this.registroActual=this.primerNodo;
//    }
//            
//
//    /**
//    * Retorna el numero de elementos de la lista
//    *@return Canditad de elementos.
//    */	
//    public int Length(){
//        return this.length;
//    }
//
//
//	/**
//	*Remueve el ultimo poz de la lista
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
//        NodoPoZ nodoAnteriorActual;
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
//    
//    
//    
//    /**
//     * Retorna el poz de la posicion indicada
//     * @param posicion
//     * @return el poz de la posicion indicada
//     */        
//    public PoZ getPoZAt(int posicion){
//        if(this.primerNodo==null){
//            return null;
//        }else if(posicion >= length){
//            return null;
//        }else{
//            NodoPoZ nodoRequerido;
//            nodoRequerido = this.primerNodo;
//            int contador=0;
//            
//            while(contador<posicion){
//                nodoRequerido=nodoRequerido.getSiguienteNodo();   
//                contador++;
//            }
//            
//            return nodoRequerido.getPoZ();
//        }    
//        
//    }
//
//    public void Modificar(int pozModificar, PoZ mod){
//        PoZ obt = getPoZAt(pozModificar);
//        
//        obt.setClase(mod.getClase());
//        obt.setImagen(mod.getImagen());
//        obt.setNombre(mod.getNombre());
//        obt.setPuntosA(mod.getPuntosA());
//        obt.setPuntosD(mod.getPuntosD());
//        obt.setTipo(mod.getTipo());
//    }
//    
//    
    
    
}
