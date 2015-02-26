/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.practica1s1_201213610;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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

        try {
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
            
            File file = new File("I:\\"+nomArchivo+".jpg");
            Desktop.getDesktop().open(file);
                         
        } catch (Exception ex) {
                ex.printStackTrace();
        } finally {           
        }

  }
    
}

    
    
    

