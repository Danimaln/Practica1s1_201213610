/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.practica1s1_201213610;

import static edd.practica1s1_201213610.Pintar.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author Daniel
 */
public class EDDPractica1s1_201213610 {

    
    public static ListaPoZ personaje;
    public static ListaJ listaJ;
    public static Colita cola = new Colita();
    public static Pilita pila = new Pilita();
    public static int contz; 
    public static int contp; 
    public static String jugp;
    public static String jugz;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Inicio nuevo = new Inicio();
        nuevo.setVisible(true);                        
        
        personaje = new ListaPoZ();
        listaJ = new ListaJ();
        contz=0;
        contp=0;
    }
}
