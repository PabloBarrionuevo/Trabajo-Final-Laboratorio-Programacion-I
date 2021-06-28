/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author melid
 */
public class Multa extends javax.swing.JInternalFrame {

    Entidades.Multa multa = null;
    BD.MultaData md = new BD.MultaData(grupo1tpfinal.Grupo1TPFinal.CONEXION);
    /**
     * Creates new form Multa
     */
    public Multa() {
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

        jbtnNuevo = new javax.swing.JButton();
        jbtnModificar = new javax.swing.JButton();
        jbtnBorrar = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        infoMulta = new javax.swing.JPanel();
        jdcInicio = new com.toedter.calendar.JDateChooser();
        jtLector = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtEjemplar = new javax.swing.JTextField();
        jdcFin = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnVerEjemplar = new javax.swing.JButton();
        btnVerLector = new javax.swing.JButton();
        infoBuscar = new javax.swing.JPanel();
        jbtnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtId = new javax.swing.JTextField();
        infoPrestamo = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        datoPrestamo = new javax.swing.JLabel();
        btnVerPrestamo = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("REGISTRO DE MULTAS            ");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jbtnNuevo.setVisible(false);
        jbtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/nuevo.png"))); // NOI18N
        jbtnNuevo.setText("NUEVO");
        jbtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoActionPerformed(evt);
            }
        });

        jbtnModificar.setVisible(false);
        jbtnModificar.setText("MODIFICAR");
        jbtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarActionPerformed(evt);
            }
        });

        jbtnBorrar.setText("BORRAR");
        jbtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBorrarActionPerformed(evt);
            }
        });

        jbtnLimpiar.setVisible(false);
        jbtnLimpiar.setText("LIMPIAR");
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("REGISTRO DE MULTAS");

        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        jbSalir.setText("SALIR");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel5.setText("FECHA  FINAL:");

        jLabel4.setText("FECHA DE INICIO:");

        jLabel3.setText("LECTOR:");

        jLabel2.setText("EJEMPLAR:");

        btnVerEjemplar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ver.png"))); // NOI18N
        btnVerEjemplar.setToolTipText("");
        btnVerEjemplar.setBorder(null);
        btnVerEjemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEjemplarActionPerformed(evt);
            }
        });

        btnVerLector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ver.png"))); // NOI18N
        btnVerLector.setBorder(null);
        btnVerLector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerLectorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout infoMultaLayout = new javax.swing.GroupLayout(infoMulta);
        infoMulta.setLayout(infoMultaLayout);
        infoMultaLayout.setHorizontalGroup(
            infoMultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoMultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoMultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoMultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(infoMultaLayout.createSequentialGroup()
                        .addComponent(jtLector)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerLector))
                    .addComponent(jdcInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jdcFin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(infoMultaLayout.createSequentialGroup()
                        .addComponent(jtEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerEjemplar)))
                .addContainerGap())
        );
        infoMultaLayout.setVerticalGroup(
            infoMultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoMultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoMultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(infoMultaLayout.createSequentialGroup()
                        .addGroup(infoMultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVerEjemplar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infoMultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtLector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVerLector))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(12, 12, 12))
                    .addComponent(jdcInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoMultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        infoMultaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jdcFin, jdcInicio, jtEjemplar, jtLector});

        jbtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/buscar.png"))); // NOI18N
        jbtnBuscar.setText("BUSCAR");
        jbtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("ID:");

        javax.swing.GroupLayout infoBuscarLayout = new javax.swing.GroupLayout(infoBuscar);
        infoBuscar.setLayout(infoBuscarLayout);
        infoBuscarLayout.setHorizontalGroup(
            infoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnBuscar)
                .addContainerGap())
        );
        infoBuscarLayout.setVerticalGroup(
            infoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnBuscar))
                .addContainerGap())
        );

        jLabel7.setText("Prestamo: ");

        btnVerPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ver.png"))); // NOI18N
        btnVerPrestamo.setBorder(null);
        btnVerPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPrestamoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout infoPrestamoLayout = new javax.swing.GroupLayout(infoPrestamo);
        infoPrestamo.setLayout(infoPrestamoLayout);
        infoPrestamoLayout.setHorizontalGroup(
            infoPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPrestamoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datoPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerPrestamo)
                .addContainerGap())
        );
        infoPrestamoLayout.setVerticalGroup(
            infoPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPrestamoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datoPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(infoPrestamoLayout.createSequentialGroup()
                        .addComponent(btnVerPrestamo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnBorrar))
                            .addComponent(infoPrestamo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(infoMulta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(infoBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(infoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnNuevo)
                    .addComponent(jbtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarActionPerformed
        if(!(jtId.getText().chars().allMatch( Character::isDigit ))){
            mensaje("El ID debe ser de tipo numerico, por favor, ingreseló nuevamente");
            return;
        }
        int id = Integer.parseInt(jtId.getText());
        multa = md.buscarMulta(id);
        if (multa == null) {
            mensaje("El ID buscado no se encuentra en la base de datos.");
            jbtnLimpiarActionPerformed(null);
            return;
        } 
        ver(multa);
    }//GEN-LAST:event_jbtnBuscarActionPerformed

    private void jbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoActionPerformed
        multa = null;
        jbtnLimpiarActionPerformed(null);
    }//GEN-LAST:event_jbtnNuevoActionPerformed

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        datoPrestamo.setText("");
        jtId.setText("");
        jtEjemplar.setText("");
        jtLector.setText("");
        jdcInicio.setDate(null);
        jdcFin.setDate(null);
        jdcInicio.setEnabled(false);
        jdcFin.setEnabled(false);
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBorrarActionPerformed
        if(multa != null){
            int id = multa.getId_multa();
            md.borrarMulta(id);
            mensaje("Multa borrada...");
        }else mensaje("Error, no hay una multa seleccionada...");
    }//GEN-LAST:event_jbtnBorrarActionPerformed

    private void jbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarActionPerformed
        if(multa != null){
            //Modificar multa asignando nuevos valores
            
            if(md.modificar(multa) == 1) mensaje("Se modifico la multa.");
            else mensaje("Error al modificar la multa.");
        }else mensaje("Error, no hay una multa seleccionada...");
    }//GEN-LAST:event_jbtnModificarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
        if(multa != null) ver(multa);
        else jbtnLimpiarActionPerformed(null);
    }//GEN-LAST:event_formComponentShown

    private void btnVerPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPrestamoActionPerformed
        if(multa != null && multa.getPrestamo() != null){
            Principal.abrir(Principal.VISTAS.PRESTAMO, multa.getPrestamo());
        }else mensaje("Error al ver el prestamo...");
    }//GEN-LAST:event_btnVerPrestamoActionPerformed

    private void btnVerEjemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEjemplarActionPerformed
        if(multa != null && multa.getPrestamo() != null && multa.getPrestamo().getEjemplar() != null){
            Principal.abrir(Principal.VISTAS.EJEMPLAR, multa.getPrestamo().getEjemplar());
        }else mensaje("Error al ver el ejemplar...");
    }//GEN-LAST:event_btnVerEjemplarActionPerformed

    private void btnVerLectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerLectorActionPerformed
        if(multa != null && multa.getPrestamo() != null && multa.getPrestamo().getLector() != null){
            Principal.abrir(Principal.VISTAS.LECTOR, multa.getPrestamo().getLector());
        }else mensaje("Error al ver el lector...");
    }//GEN-LAST:event_btnVerLectorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerEjemplar;
    private javax.swing.JButton btnVerLector;
    private javax.swing.JButton btnVerPrestamo;
    private javax.swing.JLabel datoPrestamo;
    private javax.swing.JPanel infoBuscar;
    private javax.swing.JPanel infoMulta;
    private javax.swing.JPanel infoPrestamo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbtnBorrar;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JButton jbtnModificar;
    private javax.swing.JButton jbtnNuevo;
    private com.toedter.calendar.JDateChooser jdcFin;
    private com.toedter.calendar.JDateChooser jdcInicio;
    private javax.swing.JTextField jtEjemplar;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtLector;
    // End of variables declaration//GEN-END:variables

    public void ver(Entidades.Multa m) {
        if(m != null){
            multa = m;
            datoPrestamo.setText(m.getPrestamo().toString());
            jtId.setText(m.getId_multa() + "");
            jtEjemplar.setText(m.getPrestamo().getEjemplar().toString());
            jtLector.setText(m.getPrestamo().getLector().toString());
            jdcInicio.setDate(java.sql.Date.valueOf(m.getFecha_inicio()));
            jdcFin.setDate(java.sql.Date.valueOf(m.getFecha_fin()));
        }
    }

    private void mensaje(String msg) {
        javax.swing.JOptionPane.showMessageDialog(this, msg);
    }
}
