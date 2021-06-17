/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Entidades.Autor;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author melid
 */
public class Libros extends javax.swing.JInternalFrame {

    List<Entidades.Autor> lista = null;

    /**
     * Creates new form Libros
     */
    public Libros() {
        initComponents();
        actualizarCBAutores();      
    }

    public void actualizarCBAutores() {
        cbAutor.removeAllItems();
        cbAutor.addItem(new Autor());
        cbAutor.setSelectedItem(null);
        BD.AutorData ad = new BD.AutorData(grupo1tpfinal.Grupo1TPFinal.CONEXION);
        lista = ad.obtenerAutores();
        for (Autor autor : lista) {
            cbAutor.addItem(autor);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        tfTitulo = new javax.swing.JTextField();
        tfEditorial = new javax.swing.JTextField();
        jbNuevo = new javax.swing.JButton();
        btnBuscarIsbn = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tfIsbn = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnBuscarId = new javax.swing.JButton();
        cbEstado = new javax.swing.JCheckBox();
        tfTipo = new javax.swing.JTextField();
        ycAnio = new com.toedter.calendar.JYearChooser();
        jbGuardar = new javax.swing.JButton();
        cbAutor = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Registro de Libros");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/libros.png"))); // NOI18N

        jLabel2.setText("ID:");

        jLabel4.setText("Titulo:");

        jLabel5.setText("Editorial:");

        jLabel6.setText("Tipo:");

        jLabel7.setText("Año:");

        tfTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTituloActionPerformed(evt);
            }
        });

        tfEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEditorialActionPerformed(evt);
            }
        });

        jbNuevo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/nuevo.png"))); // NOI18N
        jbNuevo.setText("NUEVO");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        btnBuscarIsbn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/buscar.png"))); // NOI18N
        btnBuscarIsbn.setText("Buscar [ISBN]");
        btnBuscarIsbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIsbnActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        jbSalir.setText("SALIR");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel8.setText("Autor:");

        jLabel9.setText("ISBN:");

        btnBuscarId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/buscar.png"))); // NOI18N
        btnBuscarId.setText("Buscar [ID]");
        btnBuscarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIdActionPerformed(evt);
            }
        });

        cbEstado.setText("Estado");

        ycAnio.setMaximum(4000);

        jbGuardar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guardar.png"))); // NOI18N
        jbGuardar.setText("GUARDAR");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel9))
                                        .addGap(15, 15, 15))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfIsbn, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                    .addComponent(tfTitulo)
                                    .addComponent(tfEditorial)
                                    .addComponent(tfId))
                                .addGap(23, 23, 23)
                                .addComponent(cbEstado))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBuscarIsbn)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarId)
                                .addGap(18, 18, 18)
                                .addComponent(jbGuardar)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 169, Short.MAX_VALUE)
                                .addComponent(jbNuevo)
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbSalir)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ycAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                    .addComponent(cbAutor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(42, 42, 42)
                                .addComponent(jLabel3)))
                        .addContainerGap(299, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addGap(0, 239, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEstado))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cbAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(ycAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(87, 87, 87))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscarId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarIsbn)
                            .addComponent(jbSalir)
                            .addComponent(jbGuardar))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jbNuevo)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void tfTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTituloActionPerformed

    private void tfEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEditorialActionPerformed

    private void btnBuscarIsbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIsbnActionPerformed
        actualizarCBAutores();
        long isbn = Long.parseLong(tfIsbn.getText());
        BD.LibroData ld = new BD.LibroData(grupo1tpfinal.Grupo1TPFinal.CONEXION);
        Entidades.Libro libro = ld.buscarLibro(isbn);
        tfId.setText(libro.getId() + "");
        tfIsbn.setText(libro.getIsbn() + "");
        tfTitulo.setText(libro.getNombre());
        tfEditorial.setText(libro.getEditorial());
        cbAutor.setSelectedItem(libro.getAutor().getNombre());
        ycAnio.setYear(libro.getAño());
        boolean estado = false;
        if (libro.getEstado() == 1) {
            estado = true;
        }
        cbEstado.setSelected(estado);
        tfTipo.setText(libro.getTipo());
    }//GEN-LAST:event_btnBuscarIsbnActionPerformed

    private void btnBuscarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIdActionPerformed
        actualizarCBAutores();
        int id = Integer.parseInt(tfId.getText());
        BD.LibroData ld = new BD.LibroData(grupo1tpfinal.Grupo1TPFinal.CONEXION);
        Entidades.Libro libro = ld.buscarLibroXId(id);
        tfId.setText(libro.getId() + "");
        tfIsbn.setText(libro.getIsbn() + "");
        tfTitulo.setText(libro.getNombre());
        tfEditorial.setText(libro.getEditorial());
        cbAutor.setSelectedItem(libro.getAutor().getNombre());
        ycAnio.setYear(libro.getAño());
        boolean estado = false;
        if (libro.getEstado() == 1) {
            estado = true;
        }
        cbEstado.setSelected(estado);
        tfTipo.setText(libro.getTipo());

    }//GEN-LAST:event_btnBuscarIdActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        tfId.setText("");
        tfIsbn.setText("");
        tfTitulo.setText("");
        tfEditorial.setText("");
        cbAutor.setSelectedItem("");
        ycAnio.setYear(Integer.parseInt(java.time.Year.now() + ""));
        cbEstado.setSelected(false);
        tfTipo.setText("");

    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        int rt=0;
        actualizarCBAutores();
        int aux = 0;
        BD.LibroData ld = new BD.LibroData(grupo1tpfinal.Grupo1TPFinal.CONEXION);
        Entidades.Libro libro = new Entidades.Libro();
        BD.AutorData ad = new BD.AutorData(grupo1tpfinal.Grupo1TPFinal.CONEXION);
        libro.setAutor((Entidades.Autor)cbAutor.getSelectedItem());
        if(libro.getAutor().toString()==""){
            JOptionPane.showMessageDialog(this, "Por favor, elija un autor.");
            return;
        }
        libro.setAño(Short.parseShort(ycAnio.getYear() + ""));
        if (ld.buscarLibro(Long.parseLong(tfIsbn.getText())) == null) {
            libro.setIsbn(Long.parseLong(tfIsbn.getText()));
        } else {
            JOptionPane.showMessageDialog(this, "El ISBN ingresado ya existe, intente con otro.");
            tfIsbn.setText("");
            return;
        }
        libro.setEditorial(tfEditorial.getText());
        if (cbEstado.isSelected()) {
            aux = 1;
        }
        libro.setEstado(aux);
        libro.setNombre(tfTitulo.getText());
        libro.setTipo(tfTipo.getText());
        rt = ld.guardar(libro);
        if (rt>0) {
            JOptionPane.showMessageDialog(this, "¡Libro guardado con exito!");
        } else {
            JOptionPane.showMessageDialog(this, "¡Error al guardar libro!");
        }
        tfId.setText(rt+"");
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarId;
    private javax.swing.JButton btnBuscarIsbn;
    private javax.swing.JComboBox<Autor> cbAutor;
    private javax.swing.JCheckBox cbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField tfEditorial;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfIsbn;
    private javax.swing.JTextField tfTipo;
    private javax.swing.JTextField tfTitulo;
    private com.toedter.calendar.JYearChooser ycAnio;
    // End of variables declaration//GEN-END:variables
}
