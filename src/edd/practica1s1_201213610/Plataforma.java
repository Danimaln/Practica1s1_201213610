/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.practica1s1_201213610;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static edd.practica1s1_201213610.EDDPractica1s1_201213610.listaJ;
import static edd.practica1s1_201213610.EDDPractica1s1_201213610.personaje;
import static edd.practica1s1_201213610.EDDPractica1s1_201213610.pila;
import static edd.practica1s1_201213610.EDDPractica1s1_201213610.cola;
import static edd.practica1s1_201213610.EDDPractica1s1_201213610.contz;
import static edd.practica1s1_201213610.EDDPractica1s1_201213610.contp;
import static edd.practica1s1_201213610.EDDPractica1s1_201213610.jugp;
import static edd.practica1s1_201213610.EDDPractica1s1_201213610.jugz;
import static edd.practica1s1_201213610.EDDPractica1s1_201213610.personaje;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Plataforma extends javax.swing.JFrame {
    
    private int tamanoColumna;
    private int tamanoFila;
//    private int posPersonajeColumna = 2; 
//    private int posPersonajeFila = 1;
    
    public static final int tamanoCuadrito = 60;
    
    //matriz logica
    private int[][] mLogica;
    //matriz grafica
    private JLabel[][] mGrafica;
    
    private String enviar="";
    private String enviar2="";
    
    /**
     * Creates new form Plataforma
     */
    public Plataforma() {
        initComponents();
        RandomZ();
        RandomP();
//        
//        setTamanoTablero(A.tPequeno);
////
//        mLogica = new int[tamanoColumna][tamanoFila];    
//        mGrafica = new JLabel[tamanoColumna][tamanoFila];
////
//        crearMapaLogico(A.tPequeno);
//        desplegarMatriz();
    }
   
    
            
    public void RandomZ(){        
        for (int i=0; i<contz; i++){     
            
//            boolean rot=true;
//            while (rot==true){
                int random = (int) (Math.random() * contz );
                System.out.println(random);           

                NodoPoZ pil = personaje.getPersonaje(random);
                
//                if(pil.getClase().equals("Zombi")){                
                    String apoyo = "";
                    apoyo = enviar;
                    enviar ="|"+ pil.getNombre() + apoyo;
                    System.out.println(enviar);
                    pila.push(pil);  
//                    rot=false; 
//                }
//            }        
        }
        System.out.println(enviar);
    }
    
    
    public void RandomP(){        
        for (int i=0; i<contp; i++){     
            
//            boolean rot=true;
//            while (rot==true){
                int random = (int) (Math.random() * contp + 1 );
                System.out.println(random);            

                NodoPoZ col = personaje.getPersonaje(random);
//                try{
//                if(col.getClase().equals("Planta")){                
                    String apoyo = "";
                    apoyo = enviar2;
                    enviar2 ="|"+ col.getNombre() + apoyo;
                    System.out.println(enviar2);
                    cola.offer(col);                    
//                    rot=false;                    
//                }
//                }catch(Exception ex){}
//            }
        }        
        System.out.println(enviar2);
    }
    
    
//    private void setTamanoTablero(int tamano){
//        switch(tamano){
//            case A.tPequeno:
//                tamanoColumna = 8;
//                tamanoFila = 5;
//                break;
//            case A.tMediano:
//                tamanoColumna = 12;
//                tamanoFila = 8;
//                break;
//            case A.tGrande:
//                tamanoColumna = 15;
//                tamanoFila = 10;
//                break;
//        }
//    }
//    
//    private void crearMapaLogico(int tamano){
//        
////        switch(tamano){
////            case A.tPequeno:
//                                //filas
//                int[][] temp1 = {{1,1,1,1,1},//Columnas
//                                {1,0,0,0,1},
//                                {1,9,0,0,1},
//                                {1,0,0,0,1},                                
//                                {1,0,0,0,1},
//                                {1,0,2,0,1},
//                                {1,0,3,0,1},
//                                {1,1,1,1,1}
//                                };
//                mLogica = temp1;
////                break;
////            case A.tMediano:
////                int[][] temp2 = {{1,1,1,1,1,1,1,1},
////                                {1,0,0,0,0,0,0,1},
////                                {1,9,0,0,0,0,0,1},
////                                {1,0,0,0,0,0,0,1},
////                                {1,0,0,0,0,0,0,1},
////                                {1,0,0,0,0,0,0,1},
////                                {1,0,0,0,0,0,0,1},
////                                {1,0,0,0,0,0,0,1},                                
////                                {1,0,0,0,2,2,0,1},
////                                {1,0,0,0,3,2,0,1},
////                                {1,0,0,3,0,2,0,1},                                                               
////                                {1,1,1,1,1,1,1,1}
////                                };
////                mLogica = temp2;
////                break;
////            case A.tGrande:                                    
////                int[][] temp = {{1,1,1,1,1,1,1,1,1,1},
////                                {1,0,0,0,0,0,0,0,0,1},
////                                {1,9,0,0,0,0,0,0,0,1},
////                                {1,0,0,0,0,0,0,0,0,1},
////                                {1,0,0,0,0,0,0,0,0,1},
////                                {1,0,0,0,0,0,0,0,0,1},
////                                {1,0,0,0,0,0,0,0,0,1},
////                                {1,0,0,0,0,0,0,0,0,1},
////                                {1,0,0,0,0,0,0,0,0,1},
////                                {1,0,0,0,0,0,2,2,0,1},
////                                {1,0,0,0,0,0,3,2,0,1},
////                                {1,0,0,0,0,3,0,2,0,1},
////                                {1,0,0,0,0,0,0,0,0,1},
////                                {1,0,0,0,0,0,0,0,0,1},
////                                {1,1,1,1,1,1,1,1,1,1}
////                                };
////                mLogica = temp;
////                break;
////        }
//        
//        
//    }
//    
//    private void desplegarMatriz(){
//        for (int i=0; i<tamanoColumna;i++){
//            for (int j=0; j<tamanoFila;j++){
//                mGrafica[i][j] = new JLabel();
//                mGrafica[i][j].setOpaque(true);
//                mGrafica[i][j].setBounds((i*tamanoCuadrito)+30, 
//                        (j*tamanoCuadrito)+30, tamanoCuadrito, tamanoCuadrito);
//                
//                mGrafica[i][j].setVisible(true);
//                mGrafica[i][j].setBackground(Color.red);
//                mGrafica[i][j].setIcon(getImagen(mLogica[i][j]));
//                this.jPanelContenedor.add(mGrafica[i][j]);                
//            }
//        }
//    }
//    
//    private ImageIcon getImagen(int tipo){
//        switch(tipo){
//            case 0:
//                return new ImageIcon(getClass().getResource("/edd.Imagenes/pasto.jpg"));
//            case 1:
//                return new ImageIcon(getClass().getResource("/edd.Imagenes/pared.jpg"));
//            case A.caja:
//                return new ImageIcon(getClass().getResource("/edd.Imagenes/caja.jpg"));
//            case A.muerte:
//                return new ImageIcon(getClass().getResource("/edd.Imagenes/muerte.jpg"));
//            case 9:
//                return new ImageIcon(getClass().getResource("/edd.Imagenes/persona.jpg"));    
//            default:                
//                return new ImageIcon(getClass().getResource("/edd.Imagenes/pasto.jpg"));
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalir = new javax.swing.JButton();
        jPanelPlanta = new javax.swing.JPanel();
        jPanelZombi = new javax.swing.JPanel();
        jPanelContenedor = new javax.swing.JPanel();
        jButtonPila = new javax.swing.JButton();
        jButtonCola = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jPanelPlanta.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelPlantaLayout = new javax.swing.GroupLayout(jPanelPlanta);
        jPanelPlanta.setLayout(jPanelPlantaLayout);
        jPanelPlantaLayout.setHorizontalGroup(
            jPanelPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanelPlantaLayout.setVerticalGroup(
            jPanelPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanelZombi.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelZombiLayout = new javax.swing.GroupLayout(jPanelZombi);
        jPanelZombi.setLayout(jPanelZombiLayout);
        jPanelZombiLayout.setHorizontalGroup(
            jPanelZombiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanelZombiLayout.setVerticalGroup(
            jPanelZombiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanelContenedor.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanelContenedorLayout = new javax.swing.GroupLayout(jPanelContenedor);
        jPanelContenedor.setLayout(jPanelContenedorLayout);
        jPanelContenedorLayout.setHorizontalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );
        jPanelContenedorLayout.setVerticalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );

        jButtonPila.setText("Pila");
        jButtonPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPilaActionPerformed(evt);
            }
        });

        jButtonCola.setText("Cola");
        jButtonCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonColaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jButtonPila, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButtonCola, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelZombi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelPlanta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelZombi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalir)
                    .addComponent(jButtonPila)
                    .addComponent(jButtonCola))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        pila.empty();
        cola.empty();
        Inicio nuevo = new Inicio();
        nuevo.setVisible(true);    
        this.dispose();   
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPilaActionPerformed
 
        //si termino esto quiere decir que ya tenemos todos 
        //nuestros personajes en los string. Entonces:

        String completo="digraph tabla {"+            
            "node [shape=record];"+
            "Catalogo[label=\""+
            "{Pila Zombis"+enviar+
            "}\"];}";;
        //señalaremos que catalogo queremos si p o z y guardamos en titulo
        String titulo="Pila de Zombis";

        Pintar dibu = new Pintar(titulo,completo);     

        JOptionPane.showMessageDialog(this,"Imagen generada con éxito en I:\\"+titulo+".jpg"); 
    }//GEN-LAST:event_jButtonPilaActionPerformed

    private void jButtonColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonColaActionPerformed
        String completo2="digraph tabla {"+            
            "node [shape=record];"+
            "Catalogo[label=\""+
            "{Cola Plantas"+enviar2+
            "}\"];}";;
        //señalaremos que catalogo queremos si p o z y guardamos en titulo
        String titulo2="Cola de Plantas";

        Pintar dibu = new Pintar(titulo2,completo2);     

        JOptionPane.showMessageDialog(this,"Imagen generada con éxito en I:\\"+titulo2+".jpg"); 
    }//GEN-LAST:event_jButtonColaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Plataforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Plataforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Plataforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Plataforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Plataforma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCola;
    private javax.swing.JButton jButtonPila;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JPanel jPanelContenedor;
    private javax.swing.JPanel jPanelPlanta;
    private javax.swing.JPanel jPanelZombi;
    // End of variables declaration//GEN-END:variables
}
