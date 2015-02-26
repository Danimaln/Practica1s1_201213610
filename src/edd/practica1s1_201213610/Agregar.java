/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.practica1s1_201213610;

import static edd.practica1s1_201213610.EDDPractica1s1_201213610.listaJ;
import static edd.practica1s1_201213610.EDDPractica1s1_201213610.personaje;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Agregar extends javax.swing.JFrame {

    /**
     * Creates new form Agregar
     */
    public Agregar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAJugador = new javax.swing.JButton();
        jButtonAPoZ = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        jButtonCatP = new javax.swing.JButton();
        jButtonCatZ = new javax.swing.JButton();
        jButtonCatPoZ = new javax.swing.JButton();
        jButtonCatJ = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAJugador.setText("Agregar Jugador");
        jButtonAJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAJugadorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 11, 160, -1));

        jButtonAPoZ.setText("Agregar Planta o Zombi");
        jButtonAPoZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAPoZActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAPoZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 45, 160, -1));

        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 112, -1));

        jButtonCatP.setText("Catalogo plantas");
        jButtonCatP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCatPActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCatP, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 79, 160, -1));

        jButtonCatZ.setText("Catalogo zombis");
        jButtonCatZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCatZActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCatZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 113, 160, -1));

        jButtonCatPoZ.setText("Catalogo pla. y zom.");
        jButtonCatPoZ.setMaximumSize(new java.awt.Dimension(111, 23));
        jButtonCatPoZ.setMinimumSize(new java.awt.Dimension(111, 23));
        jButtonCatPoZ.setPreferredSize(new java.awt.Dimension(111, 23));
        jButtonCatPoZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCatPoZActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCatPoZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 147, 160, -1));

        jButtonCatJ.setText("Catalogo jugadores");
        jButtonCatJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCatJActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCatJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 181, 160, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edd/Imagenes/PvZ.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 340, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAJugadorActionPerformed
        // TODO add your handling code here:
        AgregarJugador agregarJ = new AgregarJugador();
        agregarJ.setVisible(true);
        this.dispose();               
    }//GEN-LAST:event_jButtonAJugadorActionPerformed

    private void jButtonAPoZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAPoZActionPerformed
        // TODO add your handling code here:
        AgregarPoZ agregarP = new AgregarPoZ();
        agregarP.setVisible(true);
        this.dispose();  
    }//GEN-LAST:event_jButtonAPoZActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        // TODO add your handling code here:
        Inicio nuevo = new Inicio();
        nuevo.setVisible(true);  
        this.dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jButtonCatPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCatPActionPerformed
        // TODO add your handling code here:
        //variables que nos ayudaran a guardar atributos de cierto tipo
        String pno="", pnom="", ppa="", ppd="", pta="";
        int contp=1;

        //recorremos la lista para extraer valores
        for (int i=0; i<personaje.Length(); i++){
                       
                NodoPoZ ag = personaje.getPersonaje(i);

                //si es planta lo mostramos en el catalogo planta
                if (ag.getClase().equals("Planta")){

                        //recorremos los atributos del objeto y jalamos los 
                        //valores para guardarlos en las variables respectivas
                        pno=pno+"|"+Integer.toString(contp);
                        pnom=pnom+"|"+ag.getNombre();
                        ppa=ppa+"|"+ag.getPuntosA();
                        ppd=ppd+"|"+ag.getPuntosD();
                        pta=pta+"|"+ag.getTipo();

                        contp++;
                }
        }

        //si termino esto quiere decir que ya tenemos todos 
        //nuestros personajes en los string. Entonces:

        String completo="digraph tabla {"+
            "node [shape=record];"+
            "Titulo[label=\"Catalogo de Plantas\"];" +
            "node [shape=record];"+
            "Catalogo[label=\""+
            "{No."+pno+
            "}|{Nombre"+pnom+
            "}|{P. Ataque"+ppa+
            "}|{P. Defensa"+ppd+
            "}|{Tipo Ataque"+pta+
            "}\"];Titulo -> Catalogo;}";;
            
        //señalaremos que catalogo queremos si p o z y guardamos en titulo
        String titulo="Catalogo de Plantas";

         Pintar dibu = new Pintar(titulo,completo); 
         
         JOptionPane.showMessageDialog(this,"Imagen generada con éxito en I:\\"+titulo+".jpg"); 
    }//GEN-LAST:event_jButtonCatPActionPerformed

    private void jButtonCatJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCatJActionPerformed
        //Catalogo de jugadores
        //basicamente es lo mismo solo con menos atributos

        //variables que nos ayudaran a guardar atributos de cierto tipo
        String no="", nom="", usu="";
        int cont=1;

        //recorremos la lista para extraer valores
        for (int i=0; i<listaJ.Length(); i++){

                NodoJ ag = listaJ.getJugador(i);

                //recorremos los atributos del objeto y jalamos los 
                //valores para guardarlos en las variables respectivas
                no=no+"|"+Integer.toString(cont);
                nom=nom+"|"+ag.getNombre();
                usu=usu+"|"+ag.getUsuario();

                cont++;		
        }

        //si termino esto quiere decir que ya tenemos todos 
        //nuestros personajes en los string. Entonces:

        String completo="digraph tabla {"+
            "node [shape=record];"+
            "Titulo[label=\"Catalogo de Jugadores\"];" +
            "node [shape=record];"+
            "Catalogo[label=\""+
            "{No."+no+
            "}|{Nombre"+nom+
            "}|{Usuario"+usu+
            "}\"];Titulo -> Catalogo;}";

        String titulo="Catalogo de Jugadores";
        
        Pintar dibu = new Pintar(titulo,completo);      
        
        JOptionPane.showMessageDialog(this,"Imagen generada con éxito en I:\\"+titulo+".jpg"); 
    }//GEN-LAST:event_jButtonCatJActionPerformed

    private void jButtonCatZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCatZActionPerformed
        // TODO add your handling code here:
        //variables que nos ayudaran a guardar atributos de cierto tipo
        String zno="", znom="", zpa="", zpd="", zta="";
        int contz=1;

        //recorremos la lista para extraer valores
        for (int i=0; i<personaje.Length(); i++){

                NodoPoZ ag = personaje.getPersonaje(i);

                //si es planta lo mostramos en el catalogo planta
                if (ag.getClase().equals("Zombi")){

                        //recorremos los atributos del objeto y jalamos los 
                        //valores para guardarlos en las variables respectivas		
                        zno=zno+"|"+Integer.toString(contz);
                        znom=znom+"|"+ag.getNombre();
                        zpa=zpa+"|"+ag.getPuntosA();
                        zpd=zpd+"|"+ag.getPuntosD();
                        zta=zta+"|"+ag.getTipo();
                        contz++;
                }
        }

        //si termino esto quiere decir que ya tenemos todos 
        //nuestros personajes en los string. Entonces:

        String completo="digraph tabla {"+
            "node [shape=record];"+
            "Titulo[label=\"Catalogo de Zombis\"];" +
            "node [shape=record];"+
            "Catalogo[label=\""+
            "{No."+zno+
            "}|{Nombre"+znom+
            "}|{P. Ataque"+zpa+
            "}|{P. Defensa"+zpd+
            "}|{Tipo Ataque"+zta+
            "}\"];Titulo -> Catalogo;}";;
        //señalaremos que catalogo queremos si p o z y guardamos en titulo
        String titulo="Catalogo de Zombis";

        Pintar dibu = new Pintar(titulo,completo);     

        JOptionPane.showMessageDialog(this,"Imagen generada con éxito en I:\\"+titulo+".jpg"); 
    }//GEN-LAST:event_jButtonCatZActionPerformed

    private void jButtonCatPoZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCatPoZActionPerformed
        // TODO add your handling code here:
        //variables que nos ayudaran a guardar atributos de cierto tipo
        String pno="", pnom="", ppa="", ppd="", pta="";
        String zno="", znom="", zpa="", zpd="", zta="";
        int contp=1;
        int contz=1;

        //recorremos la lista para extraer valores
        for (int i=0; i<personaje.Length(); i++){

                NodoPoZ ag = personaje.getPersonaje(i);

                //si es planta lo mostramos en el catalogo planta
                if (ag.getClase().equals("Planta")){

                        //recorremos los atributos del objeto y jalamos los 
                        //valores para guardarlos en las variables respectivas
                        pno=pno+"|"+Integer.toString(contp);
                        pnom=pnom+"|"+ag.getNombre();
                        ppa=ppa+"|"+ag.getPuntosA();
                        ppd=ppd+"|"+ag.getPuntosD();
                        pta=pta+"|"+ag.getTipo();

                        contp++;

                }else{ //si no es planta es zombi
                        zno=zno+"|"+Integer.toString(contz);
                        znom=znom+"|"+ag.getNombre();
                        zpa=zpa+"|"+ag.getPuntosA();
                        zpd=zpd+"|"+ag.getPuntosD();
                        zta=zta+"|"+ag.getTipo();

                        contz++;
                }
        }

        //si termino esto quiere decir que ya tenemos todos 
        //nuestros personajes en los string. Entonces:

        //señalaremos que catalogo queremos si p o z y guardamos en titulo
        String titulo="Catalogo de Planas y Zombis";

        String completo="digraph tabla {"+
            "node [shape=record];"+
            "Titulo[label=\"Catalogo de Plantas y Zombis\"];" +
            "node [shape=record];"+
            "Catalogo[label=\""+
            "{No."+pno+
            "}|{Nombre"+pnom+
            "}|{P. Ataque"+ppa+
            "}|{P. Defensa"+ppd+
            "}|{Tipo Ataque"+pta+
            "}\"];"+
            "node [shape=record];"+
            "Cataloga[label=\""+
            "{No."+zno+
            "}|{Nombre"+znom+
            "}|{P. Ataque"+zpa+
            "}|{P. Defensa"+zpd+
            "}|{Tipo Ataque"+zta+
            "}\"];"+
            "Titulo -> Catalogo;Catalogo->Cataloga;}";

        Pintar dibu = new Pintar(titulo,completo);     

        JOptionPane.showMessageDialog(this,"Imagen generada con éxito en I:\\"+titulo+".jpg"); 
    }//GEN-LAST:event_jButtonCatPoZActionPerformed

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
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAJugador;
    private javax.swing.JButton jButtonAPoZ;
    private javax.swing.JButton jButtonCatJ;
    private javax.swing.JButton jButtonCatP;
    private javax.swing.JButton jButtonCatPoZ;
    private javax.swing.JButton jButtonCatZ;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}