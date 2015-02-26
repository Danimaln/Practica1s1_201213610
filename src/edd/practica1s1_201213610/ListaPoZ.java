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
    public NodoPoZ aux, nuevo,reco ,inicio,personaje;
    
    public ListaPoZ (){
        inicio=null;
        this.length=0;        
    }
    
           
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
    
    
}
