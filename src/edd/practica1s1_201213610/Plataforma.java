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

/**
 *
 * @author Daniel
 */
public class Plataforma extends javax.swing.JFrame {
    
    
    
    private int tamanoColumna;
    private int tamanoFila;
    private int posPersonajeColumna = 2; 
    private int posPersonajeFila = 1;
    
    public static final int tamanoCuadrito = 60;
    
    //matriz logica
    private int[][] mLogica;
    //matriz grafica
    private JLabel[][] mGrafica;
    
    
    /**
     * Creates new form Plataforma
     */
    public Plataforma() {
//        initComponents();
//        
//        setTamanoTablero(A.tPequeno);
////
//        mLogica = new int[tamanoColumna][tamanoFila];    
//        mGrafica = new JLabel[tamanoColumna][tamanoFila];
////
//        crearMapaLogico(A.tPequeno);
//        desplegarMatriz();
        
        
        
        JPanel pPlanta = new JPanel();
        JPanel pZombi = new JPanel();

        Nodo nodito = 
        for (int i=0; i<personaje.Length(); i++){
                       
                NodoPoZ ag = personaje.getPersonaje(i);

                //si es planta lo mostramos en el catalogo planta
                if (ag.getClase().equals("Planta")){                   
                    cola.agregarACola(ag);
                    nodito = nodito.siguienteNodo; 
                }
        }
        
        
        Nodo nodoCatalogoPlanta = Inicio.catalogoPlanta.primerNodo;
        for (int i = 0; i < Inicio.catalogoPlanta.tamanioDeLaLista(); i++) {

            Planta planta = (Planta) nodoCatalogoPlanta.datos;
            Inicio.colaPlantas.agregarACola(planta);
            nodoCatalogoPlanta = nodoCatalogoPlanta.siguienteNodo;
        }



        NodoSimple nodoCola = Inicio.colaPlantas.primerNodo;
        for (int i = 0; i < Inicio.colaPlantas.tamanioDeLaCola(); i++) {

//            JButton b=new JButton();
//            b.setBounds(0, 0, 100,100);
//            panelPlanta.add(b);

            Planta plantaCola = (Planta) nodoCola.datos;
            plantaCola.setBounds(0, i * 100, 100, 100);
            pPlanta.add(plantaCola);

            nodoCola = nodoCola.siguienteNodo;
        }

        pPlanta.setLayout(null);
        pPlanta.setVisible(true);
        pPlanta.setPreferredSize(new Dimension(100, Inicio.colaPlantas.tamanioDeLaCola() * 100));
        scrolPlanta.setViewportView(pPlanta);

        NodoSimple nodo = Inicio.catalogoZombi.primerNodo;
        for (int i = 0; i < Inicio.catalogoZombi.tamanioDeLaLista(); i++) {

            Zombi zombi = (Zombi) nodo.datos;
            Inicio.pilaZombis.apilar(zombi);
            nodo = nodo.siguienteNodo;
        }

        NodoSimple nodoPila = Inicio.pilaZombis.primerNodo;
        for (int i = 0; i < Inicio.pilaZombis.tamanioDeLaPila(); i++) {

//            JButton b=new JButton();
//            b.setBounds(0, 0, 100,100);
//            panelPlanta.add(b);

            Zombi zombiPila = (Zombi) nodoPila.datos;
            zombiPila.setBounds(0, i * 100, 100, 100);
            panelZombi.add(zombiPila);

            nodoPila = nodoPila.siguienteNodo;
    
    }
    
   
    private void setTamanoTablero(int tamano){
        switch(tamano){
            case A.tPequeno:
                tamanoColumna = 8;
                tamanoFila = 5;
                break;
            case A.tMediano:
                tamanoColumna = 12;
                tamanoFila = 8;
                break;
            case A.tGrande:
                tamanoColumna = 15;
                tamanoFila = 10;
                break;
        }
    }
    
    private void crearMapaLogico(int tamano){
        
//        switch(tamano){
//            case A.tPequeno:
                                //filas
                int[][] temp1 = {{1,1,1,1,1},//Columnas
                                {1,0,0,0,1},
                                {1,9,0,0,1},
                                {1,0,0,0,1},                                
                                {1,0,0,0,1},
                                {1,0,2,0,1},
                                {1,0,3,0,1},
                                {1,1,1,1,1}
                                };
                mLogica = temp1;
//                break;
//            case A.tMediano:
//                int[][] temp2 = {{1,1,1,1,1,1,1,1},
//                                {1,0,0,0,0,0,0,1},
//                                {1,9,0,0,0,0,0,1},
//                                {1,0,0,0,0,0,0,1},
//                                {1,0,0,0,0,0,0,1},
//                                {1,0,0,0,0,0,0,1},
//                                {1,0,0,0,0,0,0,1},
//                                {1,0,0,0,0,0,0,1},                                
//                                {1,0,0,0,2,2,0,1},
//                                {1,0,0,0,3,2,0,1},
//                                {1,0,0,3,0,2,0,1},                                                               
//                                {1,1,1,1,1,1,1,1}
//                                };
//                mLogica = temp2;
//                break;
//            case A.tGrande:                                    
//                int[][] temp = {{1,1,1,1,1,1,1,1,1,1},
//                                {1,0,0,0,0,0,0,0,0,1},
//                                {1,9,0,0,0,0,0,0,0,1},
//                                {1,0,0,0,0,0,0,0,0,1},
//                                {1,0,0,0,0,0,0,0,0,1},
//                                {1,0,0,0,0,0,0,0,0,1},
//                                {1,0,0,0,0,0,0,0,0,1},
//                                {1,0,0,0,0,0,0,0,0,1},
//                                {1,0,0,0,0,0,0,0,0,1},
//                                {1,0,0,0,0,0,2,2,0,1},
//                                {1,0,0,0,0,0,3,2,0,1},
//                                {1,0,0,0,0,3,0,2,0,1},
//                                {1,0,0,0,0,0,0,0,0,1},
//                                {1,0,0,0,0,0,0,0,0,1},
//                                {1,1,1,1,1,1,1,1,1,1}
//                                };
//                mLogica = temp;
//                break;
//        }
        
        
    }
    
    private void desplegarMatriz(){
        for (int i=0; i<tamanoColumna;i++){
            for (int j=0; j<tamanoFila;j++){
                mGrafica[i][j] = new JLabel();
                mGrafica[i][j].setOpaque(true);
                mGrafica[i][j].setBounds((i*tamanoCuadrito)+30, 
                        (j*tamanoCuadrito)+30, tamanoCuadrito, tamanoCuadrito);
                
                mGrafica[i][j].setVisible(true);
                mGrafica[i][j].setBackground(Color.red);
                mGrafica[i][j].setIcon(getImagen(mLogica[i][j]));
                this.jPanelContenedor.add(mGrafica[i][j]);                
            }
        }
    }
    
    private ImageIcon getImagen(int tipo){
        switch(tipo){
            case 0:
                return new ImageIcon(getClass().getResource("/edd.Imagenes/pasto.jpg"));
            case 1:
                return new ImageIcon(getClass().getResource("/edd.Imagenes/pared.jpg"));
            case A.caja:
                return new ImageIcon(getClass().getResource("/edd.Imagenes/caja.jpg"));
            case A.muerte:
                return new ImageIcon(getClass().getResource("/edd.Imagenes/muerte.jpg"));
            case 9:
                return new ImageIcon(getClass().getResource("/edd.Imagenes/persona.jpg"));    
            default:                
                return new ImageIcon(getClass().getResource("/edd.Imagenes/pasto.jpg"));
        }
    }

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
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
                .addComponent(jButtonSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        Inicio nuevo = new Inicio();
        nuevo.setVisible(true);    
        this.dispose();   
    }//GEN-LAST:event_jButtonSalirActionPerformed

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
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JPanel jPanelContenedor;
    private javax.swing.JPanel jPanelPlanta;
    private javax.swing.JPanel jPanelZombi;
    // End of variables declaration//GEN-END:variables
}
