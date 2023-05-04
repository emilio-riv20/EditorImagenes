package Ventanas;

import Imagenes.ListaDoble;
import Imagenes.NodoImagen;
import java.awt.Image;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Biblioteca extends javax.swing.JFrame {

    DefaultListModel<String> modelo = new DefaultListModel<>();
    JComboBox<String> comboBox = new JComboBox<String>();
    ListaDoble imagenes = new ListaDoble();
    String img;

    public Biblioteca() {
        initComponents();
        this.setLocationRelativeTo(null);

        Lista.setModel(modelo);
        modelo.addElement("Default");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        EtiquetaImagen = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Caja = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        Categoria = new javax.swing.JTextField();
        Anterior = new javax.swing.JButton();
        Siguiente = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setForeground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setViewportView(Lista);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 98, 367));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Categorias");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, 16));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Agregar Imagen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 53, -1, -1));

        jButton2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Eliminar Imagen");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 53, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Biblioteca");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 6, -1, -1));
        jPanel1.add(EtiquetaImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 480, 300));

        jButton3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Agregar Categoria");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        jButton4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Eliminar Categoria");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        Caja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaActionPerformed(evt);
            }
        });
        jPanel1.add(Caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 83, 540, -1));

        jButton5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, -1, -1));
        jPanel1.add(Categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 140, -1));

        Anterior.setText("←");
        Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnteriorActionPerformed(evt);
            }
        });
        jPanel1.add(Anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, 300));

        Siguiente.setText("→");
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(Siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, -1, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Principal menu = new Principal();
        this.setVisible(false);
        menu.setVisible(true);

    }//GEN-LAST:event_jButton5ActionPerformed

    private NodoImagen buscar() {
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagenes", "png", "jpg");
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
            mostrar(this.EtiquetaImagen, img);
            imagenes.add(actual);
            Caja.addItem(img);
        }
    }

    private void mostrar(JLabel cuadro, String ruta) {
        if (!ruta.equals("")) {
            Image img = new ImageIcon(ruta).getImage();
            img = img.getScaledInstance(EtiquetaImagen.getWidth(), EtiquetaImagen.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imgI = new ImageIcon(img);
            cuadro.setIcon(imgI);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        agregar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (Categoria.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rellene el campo de texto");
        } else {
            agregarCat();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed
        if (Caja.getItemCount() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una imagen");
        } else {
            NodoImagen actual = (NodoImagen) imagenes.getNext();
            System.out.println(actual.getRuta());
            mostrar(EtiquetaImagen, actual.getRuta());
        }
    }//GEN-LAST:event_SiguienteActionPerformed

    private void CajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaActionPerformed

    }//GEN-LAST:event_CajaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        eliminar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnteriorActionPerformed
        if (Caja.getItemCount() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una imagen");
        } else {
            NodoImagen actual = (NodoImagen) imagenes.getBack();
            System.out.println(actual.getRuta());
            mostrar(EtiquetaImagen, actual.getRuta());
        }


    }//GEN-LAST:event_AnteriorActionPerformed

    /* public DefaultListModel limpiar() {

        DefaultListModel modelo = new DefaultListModel();
        Lista.setModel(modelo);
        modelo.addElement("Default");
        return modelo;

    }*/
    public DefaultListModel agregarCat() {

        DefaultListModel modelo = (DefaultListModel) Lista.getModel();
        modelo.addElement(Categoria.getText());
        return modelo;
    }

    public DefaultListModel eliminar() {
        DefaultListModel modelo = (DefaultListModel) Lista.getModel();
        modelo.remove(Lista.getSelectedIndex());
        return modelo;
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
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Biblioteca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anterior;
    private javax.swing.JComboBox<String> Caja;
    private javax.swing.JTextField Categoria;
    private javax.swing.JLabel EtiquetaImagen;
    private javax.swing.JList<String> Lista;
    private javax.swing.JButton Siguiente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
