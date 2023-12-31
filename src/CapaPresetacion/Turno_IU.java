/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package CapaPresentacion;

import CapaDatos.Turno;
import CapaNegocios.TurnoBD;
import CapaNegocios.UsuarioBD;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Labor
 */
public class Turno_IU extends javax.swing.JInternalFrame {

    int fila_seleccionada = -1;

    /**
     * Creates new form Turno_IU
     */
    public Turno_IU() {
        initComponents();
        reporte();
    }

    private void limpiar_tabla_formulario() {
        DefaultTableModel tabla_temporal_turno = (DefaultTableModel) tabla_reporte_turno.getModel();
        tabla_temporal_turno.setRowCount(0);
    }

    private void limpiar() {
        txtDNI.setText("");
        txtUSUARIO.setText("");
        txtHORARIOINICIO.setText("");
        txtHORARIOFINAL.setText("");
        cmbTURNO.setSelectedIndex(0);
        fila_seleccionada = -1;
    }

    private void exito(String mensaje) {
        JOptionPane.showConfirmDialog(this, mensaje, "MENSAJE", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }

    private void error(String mensaje) {
        JOptionPane.showConfirmDialog(this, mensaje, "ERROR", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
    }

    private void advertencia(String mensaje) {
        JOptionPane.showConfirmDialog(this, mensaje, "ADVERTENCIA", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
    }

    private void reporte() {
        try {
            setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
            limpiar_tabla_formulario();
            DefaultTableModel tabla_temporal_turno = (DefaultTableModel) tabla_reporte_turno.getModel();

            DefaultTableModel tabla_temporal;
            TurnoBD oTurnoBD = new TurnoBD();
            tabla_temporal = oTurnoBD.reportarTurno();
            int cant = tabla_temporal.getRowCount();
            for (int i = 0; i < cant; i++) {
                int idturno = Integer.parseInt(tabla_temporal.getValueAt(i, 0).toString());
                String descripcion = tabla_temporal.getValueAt(i, 1).toString();
                String inicio = tabla_temporal.getValueAt(i, 2).toString();
                String fin = tabla_temporal.getValueAt(i, 3).toString();
                String uDni = tabla_temporal.getValueAt(i, 4).toString();
                Object[] data = {idturno, descripcion, inicio, fin, uDni};
                tabla_temporal_turno.addRow(data);
            }
            tabla_reporte_turno.setModel(tabla_temporal_turno);
            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        } catch (Exception e) {
            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            e.printStackTrace();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        txtUSUARIO = new javax.swing.JTextField();
        btnBUSCAR = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtHORARIOINICIO = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtHORARIOFINAL = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbTURNO = new javax.swing.JComboBox<>();
        btnREGISTRAR = new javax.swing.JButton();
        btnELIMINAR = new javax.swing.JButton();
        btnCERRAR = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_reporte_turno = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("TURNO");
        setToolTipText("TURNO");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Del Usuario"));

        jLabel1.setText("DNI");

        jLabel2.setText("USUARIO");

        txtDNI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDNIFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDNIFocusLost(evt);
            }
        });
        txtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDNIKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIKeyTyped(evt);
            }
        });

        txtUSUARIO.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUSUARIOFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUSUARIOFocusLost(evt);
            }
        });
        txtUSUARIO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUSUARIOKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUSUARIOKeyTyped(evt);
            }
        });

        btnBUSCAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.gif"))); // NOI18N
        btnBUSCAR.setText("BUSCAR");
        btnBUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBUSCARActionPerformed(evt);
            }
        });
        btnBUSCAR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnBUSCARKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(txtUSUARIO)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBUSCAR)
                        .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUSUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Del Turno"));

        jLabel3.setText("HORA DE INICIO");

        txtHORARIOINICIO.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHORARIOINICIOFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHORARIOINICIOFocusLost(evt);
            }
        });
        txtHORARIOINICIO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHORARIOINICIOKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHORARIOINICIOKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHORARIOINICIOKeyTyped(evt);
            }
        });

        jLabel4.setText("HORA FINAL");

        txtHORARIOFINAL.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHORARIOFINALFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHORARIOFINALFocusLost(evt);
            }
        });
        txtHORARIOFINAL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHORARIOFINALKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHORARIOFINALKeyTyped(evt);
            }
        });

        jLabel5.setText("TURNO");

        cmbTURNO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TURNO 1", "TURNO 2", "TURNO 3", "TURNO 4" }));
        cmbTURNO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbTURNOKeyPressed(evt);
            }
        });

        btnREGISTRAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/report_user_1.png"))); // NOI18N
        btnREGISTRAR.setText("REGISTRAR");
        btnREGISTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnREGISTRARActionPerformed(evt);
            }
        });

        btnELIMINAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar2.png"))); // NOI18N
        btnELIMINAR.setText("ELIMINAR");
        btnELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnELIMINARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHORARIOINICIO, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHORARIOFINAL, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbTURNO, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnREGISTRAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnELIMINAR)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(btnREGISTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnELIMINAR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtHORARIOINICIO)
                            .addComponent(txtHORARIOFINAL)
                            .addComponent(cmbTURNO))
                        .addGap(4, 4, 4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCERRAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancel.png"))); // NOI18N
        btnCERRAR.setText("CERRAR");
        btnCERRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCERRARActionPerformed(evt);
            }
        });

        tabla_reporte_turno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "DESCRIPCION", "HORA INICIO", "HORA FINAL", "USUARIO"
            }
        ));
        tabla_reporte_turno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_reporte_turnoMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_reporte_turno);
        if (tabla_reporte_turno.getColumnModel().getColumnCount() > 0) {
            tabla_reporte_turno.getColumnModel().getColumn(0).setMinWidth(40);
            tabla_reporte_turno.getColumnModel().getColumn(0).setPreferredWidth(40);
            tabla_reporte_turno.getColumnModel().getColumn(0).setMaxWidth(40);
            tabla_reporte_turno.getColumnModel().getColumn(1).setMinWidth(120);
            tabla_reporte_turno.getColumnModel().getColumn(1).setPreferredWidth(120);
            tabla_reporte_turno.getColumnModel().getColumn(1).setMaxWidth(120);
            tabla_reporte_turno.getColumnModel().getColumn(2).setMinWidth(120);
            tabla_reporte_turno.getColumnModel().getColumn(2).setPreferredWidth(120);
            tabla_reporte_turno.getColumnModel().getColumn(2).setMaxWidth(120);
            tabla_reporte_turno.getColumnModel().getColumn(3).setMinWidth(120);
            tabla_reporte_turno.getColumnModel().getColumn(3).setPreferredWidth(120);
            tabla_reporte_turno.getColumnModel().getColumn(3).setMaxWidth(120);
        }

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 51));
        jLabel6.setText("*El formato de la hora serian : 10:00:00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(503, 503, 503)
                            .addComponent(btnCERRAR)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(btnCERRAR))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBUSCARActionPerformed
        // TODO add your handling code here:
        if (txtDNI.getText().length() > 0) {
            DefaultTableModel tabla_temporal;
            UsuarioBD oUsuarioBD = new UsuarioBD();
            tabla_temporal = oUsuarioBD.buscarUsuarioXdni(txtDNI.getText());
            int cant = tabla_temporal.getRowCount();
            if (cant > 0) {
                String nombre = tabla_temporal.getValueAt(0, 1).toString();
                String apellidos = tabla_temporal.getValueAt(0, 2).toString();

                txtUSUARIO.setText(apellidos + " " + nombre);
            } else {
                error("No Existe Este Usuario");
            }
        } else {
            advertencia("Tiene Que Ingresar Un Dni");
            txtDNI.requestFocus();
        }
    }//GEN-LAST:event_btnBUSCARActionPerformed

    private void btnREGISTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnREGISTRARActionPerformed
        // TODO add your handling code here:
        if (txtDNI.getText().length() > 0) {
            if (txtHORARIOINICIO.getText().length() > 0) {
                if (txtHORARIOFINAL.getText().length() > 0) {
                    if (!cmbTURNO.getSelectedItem().equals("Seleccione Turno")) {

                        Turno oTurno = new Turno();
                        TurnoBD oTurnoBD = new TurnoBD();

                        oTurno.setDescripcion(cmbTURNO.getSelectedItem().toString());
                        oTurno.setInicio(txtHORARIOINICIO.getText());
                        oTurno.setFin(txtHORARIOFINAL.getText());
                        oTurno.setuDni(txtDNI.getText());

                        boolean rpta = oTurnoBD.resgistarTurno(oTurno);
                        if (rpta) {
                            exito("SE REGISTRO CON EXITO");
                            reporte();
                            limpiar();
                        } else {
                            error("TIENES PROBLEMAS AL REGISTRAAR");
                        }
                    } else {
                        advertencia("SELECCIONA TURNO");

                    }
                } else {
                    advertencia("INGRESE HORA FINAL");
                    txtHORARIOFINAL.requestFocus();
                }
            } else {
                advertencia("INGRESE HORA DE INICIO");
                txtHORARIOINICIO.requestFocus();
            }
        } else {
            advertencia("INGRESE UN DNI");
            txtDNI.requestFocus();
        }
    }//GEN-LAST:event_btnREGISTRARActionPerformed

    private void btnELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnELIMINARActionPerformed
        // TODO add your handling code here:
        if (fila_seleccionada > -1) {
            int aviso = JOptionPane.showConfirmDialog(rootPane, "Estas Seguro De Eliminar A La Fila" + fila_seleccionada);
            if (aviso == 0) {
                TurnoBD oTurnoBD = new TurnoBD();
                int idturno = Integer.parseInt(tabla_reporte_turno.getValueAt(fila_seleccionada, 0).toString());
                boolean rpta = oTurnoBD.eliminarTurno(idturno);
                if (rpta) {
                    exito("SE ELIMINO CON EXITO ");
                    reporte();
                    limpiar();
                } else {
                    error("TIENES PROBLEMAS AL ELIMINAR");
                }
            } else {
                advertencia("TIENES QUE SELCCIONAR UNA FILA");
            }
        }
    }//GEN-LAST:event_btnELIMINARActionPerformed

    private void tabla_reporte_turnoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_reporte_turnoMousePressed
        // TODO add your handling code here:

        fila_seleccionada = tabla_reporte_turno.getSelectedRow();

    }//GEN-LAST:event_tabla_reporte_turnoMousePressed

    private void btnCERRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCERRARActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCERRARActionPerformed

    private void txtDNIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btnBUSCAR.requestFocus();
        }
    }//GEN-LAST:event_txtDNIKeyPressed

    private void btnBUSCARKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBUSCARKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtUSUARIO.requestFocus();
        }
    }//GEN-LAST:event_btnBUSCARKeyPressed

    private void txtUSUARIOKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUSUARIOKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtHORARIOINICIO.requestFocus();
        }
    }//GEN-LAST:event_txtUSUARIOKeyPressed

    private void txtHORARIOINICIOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHORARIOINICIOKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHORARIOINICIOKeyReleased

    private void txtHORARIOINICIOKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHORARIOINICIOKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtHORARIOFINAL.requestFocus();
        }
    }//GEN-LAST:event_txtHORARIOINICIOKeyPressed

    private void txtHORARIOFINALKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHORARIOFINALKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            cmbTURNO.requestFocus();
        }
    }//GEN-LAST:event_txtHORARIOFINALKeyPressed

    private void cmbTURNOKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbTURNOKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btnREGISTRAR.requestFocus();
        }
    }//GEN-LAST:event_cmbTURNOKeyPressed

    private void txtDNIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDNIFocusGained
        // TODO add your handling code here:
        txtDNI.setBackground(Color.CYAN);
    }//GEN-LAST:event_txtDNIFocusGained

    private void txtDNIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDNIFocusLost
        // TODO add your handling code here:
        txtDNI.setBackground(Color.CYAN);
    }//GEN-LAST:event_txtDNIFocusLost

    private void txtUSUARIOFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUSUARIOFocusGained
        // TODO add your handling code here:
        txtUSUARIO.setBackground(Color.CYAN);
    }//GEN-LAST:event_txtUSUARIOFocusGained

    private void txtUSUARIOFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUSUARIOFocusLost
        // TODO add your handling code here:
        txtUSUARIO.setBackground(Color.CYAN);
    }//GEN-LAST:event_txtUSUARIOFocusLost

    private void txtHORARIOINICIOFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHORARIOINICIOFocusGained
        // TODO add your handling code here:
        txtHORARIOINICIO.setBackground(Color.CYAN);
    }//GEN-LAST:event_txtHORARIOINICIOFocusGained

    private void txtHORARIOINICIOFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHORARIOINICIOFocusLost
        // TODO add your handling code here:
        txtHORARIOINICIO.setBackground(Color.CYAN);
    }//GEN-LAST:event_txtHORARIOINICIOFocusLost

    private void txtHORARIOFINALFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHORARIOFINALFocusGained
        // TODO add your handling code here:
        txtHORARIOFINAL.setBackground(Color.CYAN);
    }//GEN-LAST:event_txtHORARIOFINALFocusGained

    private void txtHORARIOFINALFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHORARIOFINALFocusLost
        // TODO add your handling code here:
        txtHORARIOFINAL.setBackground(Color.CYAN);
    }//GEN-LAST:event_txtHORARIOFINALFocusLost

    private void txtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || txtDNI.getText().length() >= 8) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDNIKeyTyped

    private void txtUSUARIOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUSUARIOKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c) || txtUSUARIO.getText().length() >= 30) {
            evt.consume();
        }
    }//GEN-LAST:event_txtUSUARIOKeyTyped

    private void txtHORARIOINICIOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHORARIOINICIOKeyTyped
       
    }//GEN-LAST:event_txtHORARIOINICIOKeyTyped

    private void txtHORARIOFINALKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHORARIOFINALKeyTyped
   
    }//GEN-LAST:event_txtHORARIOFINALKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBUSCAR;
    private javax.swing.JButton btnCERRAR;
    private javax.swing.JButton btnELIMINAR;
    private javax.swing.JButton btnREGISTRAR;
    private javax.swing.JComboBox<String> cmbTURNO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla_reporte_turno;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtHORARIOFINAL;
    private javax.swing.JTextField txtHORARIOINICIO;
    private javax.swing.JTextField txtUSUARIO;
    // End of variables declaration//GEN-END:variables
}
