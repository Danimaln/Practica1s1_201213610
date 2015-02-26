/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.practica1s1_201213610;

import static edd.practica1s1_201213610.EDDPractica1s1_201213610.listaJ;
import java.awt.Desktop;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Pintar {
    
    public Pintar(String nomArchivo, String imprimir){
        
        
        //Escribimos un fichero
        try{
            //Abro stream, crea el fichero si no existe
            FileWriter fw=new FileWriter("I:\\tempgv.txt");
            //Escribimos en el fichero un String y un caracter 97 (a)
            fw.write(imprimir);            
            //Cierro el stream
            fw.close();
            
        }catch(IOException e){
            System.out.println("Error E/S: "+e);
        }
         
         
         
         
         

//        System.out.println("Hola Mundo");
        try {

//            System.out.println("Hola Mundo2");
            String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";

            String fileInputPath = "I:\\tempgv.txt";
            String fileOutputPath = "I:\\"+nomArchivo+".jpg";

            String tParam = "-Tjpg";
            String tOParam = "-o";

            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;

            Runtime rt = Runtime.getRuntime();

            rt.exec( cmd );
                         
//            Desktop.getDesktop().open(file.);.browse("I:\\"+nomArchivo+".jpg");
            
//            System.out.println("Hola Mundo3");
        } catch (Exception ex) {
                ex.printStackTrace();
//                System.out.println("Hola Mundo4");
        } finally {
            
//            JOptionPane.showMessageDialog(this,"Imagen generada con éxito en I:\\"+nomArchivo+".jpg"); 
        }

  }
    
}

    
    
    

