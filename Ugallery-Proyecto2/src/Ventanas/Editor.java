package Ventanas;

import Imagenes.BlancoNegro;
import Imagenes.CambiarColores;
import Imagenes.Convertidor;
import Imagenes.CopiaImg;
import Imagenes.Modificar;
import Imagenes.NodoImagen;
import handlers.JPEGHandler;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Editor extends javax.swing.JFrame {

    String img;

    public Editor() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Convertir = new javax.swing.JRadioButton();
        Copia = new javax.swing.JRadioButton();
        Colores = new javax.swing.JRadioButton();
        Modificar = new javax.swing.JRadioButton();
        BN = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        EtiquetaImg = new javax.swing.JLabel();
        Url = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(Convertir);
        Convertir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Convertir.setText("JPEG a BMP y Viceversa");
        jPanel1.add(Convertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 210, -1));

        buttonGroup1.add(Copia);
        Copia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Copia.setText("Copia JPEG");
        jPanel1.add(Copia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 210, -1));

        buttonGroup1.add(Colores);
        Colores.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Colores.setText("Rojo, Verde, Azul, Sepia");
        jPanel1.add(Colores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 210, -1));

        buttonGroup1.add(Modificar);
        Modificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Modificar.setText("Modificar Imagen");
        jPanel1.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 210, -1));

        buttonGroup1.add(BN);
        BN.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BN.setText("Blanco y Negro");
        BN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNActionPerformed(evt);
            }
        });
        jPanel1.add(BN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 210, -1));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("Ejecutar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("Seleccionar Imagen");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setText("Volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, -1));
        jPanel1.add(EtiquetaImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 270, 240));
        jPanel1.add(Url, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 300, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Principal principal = new Principal();
        principal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        agregar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (Url.getText() == "") {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Elija una imagen");
        } else {
            if (Convertir.isSelected()) {
                Convertir();
                JOptionPane.showMessageDialog(null, "Proceso completado");
            } else if (BN.isSelected()) {
                BlancoNegro();
                JOptionPane.showMessageDialog(null, "Proceso completado");
            }else if(Copia.isSelected()){
                Copia();
                JOptionPane.showMessageDialog(null, "Proceso completado");
            }else if (Modificar.isSelected()) {
                Voltear();
                JOptionPane.showMessageDialog(null, "Proceso completado");
            }else if (Colores.isSelected()) {
                Cambiar();
                JOptionPane.showMessageDialog(null, "Proceso completado");
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BlancoNegro() {
        BlancoNegro cambiar = new BlancoNegro(img);
        try {
            JPEGHandler.runHandler(cambiar);
        } catch (Exception ex) {
        }
    }
    
    private void Convertir(){
        Convertidor convertir = new Convertidor(img);
        try {
            JPEGHandler.runHandler(convertir);
        } catch (Exception ex) {
            
        }
    }
    private void Copia(){
        CopiaImg copia = new CopiaImg(img);
        try {
            JPEGHandler.runHandler(copia);
        } catch (Exception ex) {

        }
    }
    
    private void Cambiar(){
        CambiarColores cambiar = new CambiarColores(img);
        try {
            JPEGHandler.runHandler(cambiar);
        } catch (Exception ex) {
        }
    }
    
    private void Voltear(){
        Modificar volteo = new Modificar(img);
        try {
            JPEGHandler.runHandler(volteo);
        } catch (Exception ex) {
        }
    }

    private void BNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BNActionPerformed

    private NodoImagen buscar() {
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagenes", "jpg", "jpeg", "bmp");
        fc.setFileFilter(filtro);
        int opcion = fc.showOpenDialog(this);

        if (opcion == JFileChooser.APPROVE_OPTION) {
            String nombre = fc.getSelectedFile().getName();
            String ubicacion = fc.getSelectedFile().getPath();
            return new NodoImagen(nombre, ubicacion);
        }
        return null;
    }

    private void agregar() {
        NodoImagen actual = buscar();
        img = actual.getRuta();
        if (!img.equals("")) {
            mostrar(this.EtiquetaImg, img);
            Url.setText(img);
        }
    }

    private void mostrar(JLabel cuadro, String ruta) {

        if (!ruta.equals("")) {
            Image img = new ImageIcon(ruta).getImage();
            img = img.getScaledInstance(EtiquetaImg.getWidth(), EtiquetaImg.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imgI = new ImageIcon(img);
            cuadro.setIcon(imgI);
        }
    }

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
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BN;
    private javax.swing.JRadioButton Colores;
    private javax.swing.JRadioButton Convertir;
    private javax.swing.JRadioButton Copia;
    private javax.swing.JLabel EtiquetaImg;
    private javax.swing.JRadioButton Modificar;
    private javax.swing.JLabel Url;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
