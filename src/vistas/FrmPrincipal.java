/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author PABLO
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        iniciar();
        addAcciones();
    }

    final void iniciar() {
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(this.getClass().getResource("/iconos/funcion.png")).getImage());
        FrmBiseccion frm = new FrmBiseccion();
        frm.setSize(panelDatos.getWidth(), panelDatos.getHeight());
        panelDatos.add(frm);
    }

    final void addAcciones() {
        Component[] label = this.panelMenu.getComponents();

        for (Component label1 : label) {
            JLabel menu = (JLabel) label1;

            menu.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (e.getSource() == btnBiseccion) {
                        panelDatos.removeAll();

                        FrmBiseccion frm = new FrmBiseccion();
                        frm.setSize(panelDatos.getWidth(), panelDatos.getHeight());
                        panelDatos.add(frm);
                        panelDatos.revalidate();
                        panelDatos.repaint();
                    }

                    if (e.getSource() == btnNewton) {
                        panelDatos.removeAll();
                        FrmNewton frm = new FrmNewton();
                        frm.setSize(panelDatos.getWidth(), panelDatos.getHeight());
                        panelDatos.add(frm);
                        panelDatos.revalidate();
                        panelDatos.repaint();
                    }

                    if (e.getSource() == btnFalPos) {
                        panelDatos.removeAll();
                        FrmFalsaPosicion frm = new FrmFalsaPosicion();
                        frm.setSize(panelDatos.getWidth(), panelDatos.getHeight());
                        panelDatos.add(frm);
                        panelDatos.revalidate();
                        panelDatos.repaint();
                    }
                    
                    if (e.getSource() == btnSecante) {
                        panelDatos.removeAll();
                        FrmSecante frm = new FrmSecante();
                        frm.setSize(panelDatos.getWidth(), panelDatos.getHeight());
                        panelDatos.add(frm);
                        panelDatos.revalidate();
                        panelDatos.repaint();
                    }

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    menu.setBackground(new Color(0, 212, 238));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    menu.setBackground(new Color(0, 204, 204));
                }

            });
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

        panelMenu = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        btnBiseccion = new javax.swing.JLabel();
        btnNewton = new javax.swing.JLabel();
        btnSecante = new javax.swing.JLabel();
        btnFalPos = new javax.swing.JLabel();
        btnSobre = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        panelDatos = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Resolucion de Ecuaciones no Lineales");
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelMenu.setBackground(new java.awt.Color(0, 204, 204));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/calculator.png"))); // NOI18N

        btnBiseccion.setBackground(new java.awt.Color(0, 212, 238));
        btnBiseccion.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnBiseccion.setForeground(new java.awt.Color(255, 255, 255));
        btnBiseccion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBiseccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/compasses_icon-icons.com_60563.png"))); // NOI18N
        btnBiseccion.setText("Metodo Biseccion");
        btnBiseccion.setFocusable(false);
        btnBiseccion.setIconTextGap(15);
        btnBiseccion.setOpaque(true);
        btnBiseccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBiseccionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBiseccionMouseExited(evt);
            }
        });

        btnNewton.setBackground(new java.awt.Color(0, 204, 204));
        btnNewton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnNewton.setForeground(new java.awt.Color(255, 255, 255));
        btnNewton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNewton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/tools1_78422.png"))); // NOI18N
        btnNewton.setText("Metodo Newton");
        btnNewton.setFocusable(false);
        btnNewton.setIconTextGap(15);
        btnNewton.setOpaque(true);

        btnSecante.setBackground(new java.awt.Color(0, 204, 204));
        btnSecante.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnSecante.setForeground(new java.awt.Color(255, 255, 255));
        btnSecante.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSecante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/pencil_78427.png"))); // NOI18N
        btnSecante.setText("Metodo Secante");
        btnSecante.setFocusable(false);
        btnSecante.setIconTextGap(15);
        btnSecante.setOpaque(true);

        btnFalPos.setBackground(new java.awt.Color(0, 204, 204));
        btnFalPos.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnFalPos.setForeground(new java.awt.Color(255, 255, 255));
        btnFalPos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFalPos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/vector_78426.png"))); // NOI18N
        btnFalPos.setText("Metodo Falsa Posicion");
        btnFalPos.setFocusable(false);
        btnFalPos.setIconTextGap(15);
        btnFalPos.setOpaque(true);

        btnSobre.setBackground(new java.awt.Color(0, 204, 204));
        btnSobre.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnSobre.setForeground(new java.awt.Color(255, 255, 255));
        btnSobre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/businessapplications_information_briefcase_negoci_2317.png"))); // NOI18N
        btnSobre.setText("Acerca de");
        btnSobre.setFocusable(false);
        btnSobre.setIconTextGap(15);
        btnSobre.setOpaque(true);

        btnSalir.setBackground(new java.awt.Color(0, 204, 204));
        btnSalir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/shutdown_off_close_exit_15253.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setFocusable(false);
        btnSalir.setIconTextGap(15);
        btnSalir.setOpaque(true);
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnFalPos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNewton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBiseccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSecante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnSobre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBiseccion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnNewton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFalPos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSecante, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 128, Short.MAX_VALUE))
        );

        getContentPane().add(panelMenu, java.awt.BorderLayout.LINE_START);

        panelDatos.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 911, Short.MAX_VALUE)
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );

        getContentPane().add(panelDatos, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBiseccionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBiseccionMouseEntered

    }//GEN-LAST:event_btnBiseccionMouseEntered

    private void btnBiseccionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBiseccionMouseExited

    }//GEN-LAST:event_btnBiseccionMouseExited

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized

    }//GEN-LAST:event_formComponentResized

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int opc = JOptionPane.showConfirmDialog(this, "??Desea cerrar el programa?", "Cerrar aplicacion", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);

        if (opc == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        int opc = JOptionPane.showConfirmDialog(this, "??Desea cerrar el programa?", "Cerrar aplicacion", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);

        if (opc == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBiseccion;
    private javax.swing.JLabel btnFalPos;
    private javax.swing.JLabel btnNewton;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel btnSecante;
    private javax.swing.JLabel btnSobre;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
