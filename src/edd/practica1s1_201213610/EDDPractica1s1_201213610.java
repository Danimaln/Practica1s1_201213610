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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Inicio nuevo = new Inicio();
        nuevo.setVisible(true);                        
        
        personaje = new ListaPoZ();
        listaJ = new ListaJ();

//        String imprimir="digraph G\n" +
//            "{\n" +
//            "    node1;\n" +
//            "    node2;\n" +
//            "\n" +
//            "    node1 -> node2 [label=\"linea1\"];\n" +
//            "    node2 -> node1 [label=\"linea2\"];\n" +
//            "}";
//        
//        String titulo="pruebaasdas2";
//        
//        
//        Pintar dibujar = new Pintar(titulo,imprimir);        
        
    }
    
    
    
//     public static void Pintars(String nomArchivo, String imprimir){
//        
////        FileWriter fichero = null;
////        PrintWriter pw = null;
////        try
////        {
////            fichero = new FileWriter("C://grafo.txt");
////            pw = new PrintWriter(fichero);
////             
////            pw.println(imprimir);
//// 
////        } catch (Exception e) {
////            e.printStackTrace();
////        } finally {
////           try {
////           // Nuevamente aprovechamos el finally para
////           // asegurarnos que se cierra el fichero.
////           if (null != fichero)
////              fichero.close();
////           } catch (Exception e2) {
////              e2.printStackTrace();
////           }
////        }
//        
//                        
//
//
////        try
////        {
////            //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
////            File archivo=new File("I://grafo1.txt");
////
////            //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
////            FileWriter escribir=new FileWriter(archivo,true);
////
////            //Escribimos en el archivo con el metodo write
////            escribir.write(imprimir);
////
////            //Cerramos la conexion
////            escribir.close();
////        }
////
////        //Si existe un problema al escribir cae aqui
////        catch(Exception e)
////        {
////            System.out.println("Error al escribir");
////        }
////        
//
//
//         try{
//            //Abro stream, crea el fichero si no existe
//            FileWriter fw=new FileWriter("I:\\tempgv.txt");
//            //Escribimos en el fichero un String y un caracter 97 (a)
//            fw.write(imprimir);
//            //fw.write(97);
//            //Cierro el stream
//            fw.close();
//            
//        }catch(IOException e){
//            System.out.println("Error E/S: "+e);
//        }
//         
//         
//         
//         
//         
//
//        System.out.println("Hola Mundo");
//        try {
//
//            System.out.println("Hola Mundo2");
//            String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
//
//            String fileInputPath = "I:\\tempgv.txt";
//            String fileOutputPath = "I:\\"+nomArchivo+".jpg";
//
//            String tParam = "-Tjpg";
//            String tOParam = "-o";
//
//            String[] cmd = new String[5];
//            cmd[0] = dotPath;
//            cmd[1] = tParam;
//            cmd[2] = fileInputPath;
//            cmd[3] = tOParam;
//            cmd[4] = fileOutputPath;
//
//            Runtime rt = Runtime.getRuntime();
//
//            rt.exec( cmd );
//            System.out.println("Hola Mundo3");
//        } catch (Exception ex) {
//                ex.printStackTrace();
//                System.out.println("Hola Mundo4");
//        } finally {
//        }
//
//  }
}
