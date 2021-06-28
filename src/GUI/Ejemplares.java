/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Entidades.Libro;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author giani
 */
public class Ejemplares extends javax.swing.JInternalFrame {

    BD.EjemplarData ed = new BD.EjemplarData(grupo1tpfinal.Grupo1TPFinal.CONEXION);
    BD.LibroData ld = new BD.LibroData(grupo1tpfinal.Grupo1TPFinal.CONEXION);
    Entidades.Ejemplar ejemplar = null;
    java.util.List<Entidades.Libro> libros = null;

    /**
     * Creates new form Ejemplares
     */
    public Ejemplares() {
        libros = new java.util.ArrayList<>();
        initComponents();
        actualizarCBLibros();
        actualizarCBEstado();
    }

    private void actualizarCBLibros() {
        cbLibro.removeAllItems();
        //cbLibro.addItem(new Libro());
        //cbLibro.setSelectedIndex(0);
        libros = ld.obtenerLibros();
        libros.add(0, null);
        for (Libro libro : libros) {
            cbLibro.addItem(libro);
        }
    }

    private int libroEnLibros(Entidades.Libro libro) {
        int indice = -1;
        if (libro != null) {
            for (Libro l : libros) {
                indice++;
                if (l != null && l.getId() == libro.getId()) {
                    return indice;
                }
            }
        }
        return indice;
    }

    private void actualizarCBEstado() {
        //comboEstado.removeAllItems();
        //comboEstado.addItem("");
        comboEstado.setSelectedIndex(0);
        //comboEstado.addItem("Prestado");
        //comboEstado.addItem("Retraso");
        //comboEstado.addItem("Reparacion");
        //comboEstado.addItem("Disponible");
    }

    private void limpiar() {
        tfId.setText("");
        comboEstado.setSelectedIndex(0);
        cbLibro.setSelectedIndex(0);
        btnEliminar.setVisible(false);
    }

    public void ver(Entidades.Ejemplar e) {
        if (e != null) {
            ejemplar = e;
            tfId.setText(String.valueOf(e.getId()));
            comboEstado.setSelectedIndex(e.getEstado() + 1);
            cbLibro.setSelectedIndex(libroEnLibros(e.getLibro()));
            btnEliminar.setVisible(true);
        } else {
            btnEliminar.setVisible(false);
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

        jLabel1 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbLibro = new javax.swing.JComboBox<>();
        bBuscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        bActualizar = new javax.swing.JButton();
        bCrearEjemplar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnVerLibro = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Registro de Ejemplares");

        jLabel2.setText("ID:");

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<String>(Entidades.Biblioteca.CONF.EJEMPLARESTADOS));
        ((javax.swing.DefaultComboBoxModel)comboEstado.getModel()).insertElementAt(" ", 0);

        jLabel3.setText("Estado:");

        jLabel4.setText("Libro:");

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bActualizar.setText("Actualizar estado");
        bActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActualizarActionPerformed(evt);
            }
        });

        bCrearEjemplar.setText("Crear Ejemplar");
        bCrearEjemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrearEjemplarActionPerformed(evt);
            }
        });

        btnEliminar.setVisible(false);
        btnEliminar.setText("Borrar Ejemplar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnVerLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ver.png"))); // NOI18N
        btnVerLibro.setToolTipText("");
        btnVerLibro.setBorder(null);
        btnVerLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerLibroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(bCrearEjemplar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboEstado, 0, 183, Short.MAX_VALUE)
                                    .addComponent(cbLibro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfId))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bActualizar)
                                    .addComponent(bBuscar)
                                    .addComponent(btnVerLibro))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(132, 132, 132))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(bBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVerLibro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(cbLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCrearEjemplar)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        if (tfId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se ha ingresado un ID, por favor, ingrese uno.");
            return;
        }
        if (!(tfId.getText().chars().allMatch(Character::isDigit))) {
            JOptionPane.showMessageDialog(this, "El ID debe ser de tipo numerico, por favor, ingreseló nuevamente");
            return;
        }
        ejemplar = ed.buscarEjemplar(Integer.parseInt(tfId.getText()));
        if (ejemplar == null) {
            JOptionPane.showMessageDialog(this, "No se encontró un ejemplar con ese ID.");
            limpiar();
            return;
        }
        ver(ejemplar);
        btnEliminar.setVisible(true);
        JOptionPane.showMessageDialog(this, ejemplar.toString());
    }//GEN-LAST:event_bBuscarActionPerformed

    private void bActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActualizarActionPerformed
//        if (tfId.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(this, "No se ha ingresado un ID, por favor, ingrese uno.");
//            return;
//        }
//        if (!(tfId.getText().chars().allMatch(Character::isDigit))) {
//            JOptionPane.showMessageDialog(this, "El ID debe ser de tipo numerico, por favor, ingreseló nuevamente");
//            return;
//        }
        //usamos directamente el ejemplar en memoria
        if (ejemplar != null && ejemplar.getEstado() != comboEstado.getSelectedIndex() - 1) {
            if (comboEstado.getSelectedIndex() == 1) {
                JOptionPane.showMessageDialog(this, "Para prestar el ejemplar, dirigase a la vista Prestamos.");
                comboEstado.setSelectedIndex(ejemplar.getEstado() + 1);
                return;
            }
              if (ejemplar.getEstado()==0) {
                JOptionPane.showMessageDialog(this, "El libro esta en prestamo, dirigase a la vista Prestamos para devolverlo.");
                comboEstado.setSelectedIndex(ejemplar.getEstado() + 1);
                return;
            }

            ejemplar.setEstado((comboEstado.getSelectedIndex() == 0) ? 3 : comboEstado.getSelectedIndex() - 1); //si es 0 va a estar disponible

            if (ed.cambiarEstado(ejemplar) == 1) {
                JOptionPane.showMessageDialog(this, "Se actualizo el estado del ejemplar.");
            } else {
                JOptionPane.showMessageDialog(this, "Error al actualizar el estado.");
            }
        } else if (ejemplar.getEstado() == comboEstado.getSelectedIndex() - 1) {
            JOptionPane.showMessageDialog(this, "El estado no fue modificado.");
        } else {
            JOptionPane.showMessageDialog(this, "Error con el ejemplar, busque o cree uno.");
        }
    }//GEN-LAST:event_bActualizarActionPerformed

    private void bCrearEjemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearEjemplarActionPerformed
        if (((Entidades.Libro) cbLibro.getSelectedItem()).getEstado() == 0) {
            JOptionPane.showMessageDialog(this, "El libro seleccionado esta inactivo");
            return;
        }
        ejemplar = new Entidades.Ejemplar();
        ejemplar.setEstado((comboEstado.getSelectedIndex() == 0) ? 3 : comboEstado.getSelectedIndex() - 1);
        ejemplar.setLibro((Entidades.Libro) cbLibro.getSelectedItem());
        int aux = ed.guardar(ejemplar);
        if (aux > 0) {
            ejemplar.setId(aux);
            btnEliminar.setVisible(true);
            tfId.setText(aux + "");
            JOptionPane.showMessageDialog(this, "El ejemplar se ha creado con exito con el ID:" + aux);
        } else {
            JOptionPane.showMessageDialog(this, "Error al crear ejemplar!");
        }
    }//GEN-LAST:event_bCrearEjemplarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        actualizarCBLibros();
        if (ejemplar == null) {
            btnEliminar.setVisible(false);
        } else {
            cbLibro.setSelectedIndex(libroEnLibros(ejemplar.getLibro()));
            btnEliminar.setVisible(true);
        }
    }//GEN-LAST:event_formComponentShown

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (ejemplar != null && JOptionPane.showConfirmDialog(this, "¿Esta seguro? va a eliminar un ejemplar del libro: " + ejemplar.getLibro().getNombre() + "...") == 0) {
            if (ed.borrarEjemplar(ejemplar)) {
                limpiar();
                JOptionPane.showMessageDialog(this, "El ejemplar fue eliminado");
            } else {
                JOptionPane.showMessageDialog(this, "Error al borrar el ejemplar...\nAsegurese de borrar los prestamos asociados al mismo...");
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnVerLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerLibroActionPerformed
        if (ejemplar != null && ejemplar.getLibro() != null) {
            Principal.abrir(Principal.VISTAS.LIBRO, ejemplar.getLibro());
        } else {
            JOptionPane.showMessageDialog(this, "Error con el libro del ejemplar, busque o cree uno.");
        }
    }//GEN-LAST:event_btnVerLibroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bActualizar;
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bCrearEjemplar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVerLibro;
    private javax.swing.JComboBox<Libro> cbLibro;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tfId;
    // End of variables declaration//GEN-END:variables
}
