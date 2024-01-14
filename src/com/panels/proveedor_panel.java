/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.panels;


import com.clases.*;
import com.impldao.*;

/**
 *
 * @author PC
 */
public class proveedor_panel extends javax.swing.JPanel {

    /**
     * Creates new form proveedor_panel
     */
    public proveedor_panel() {
        initComponents();
    }

    private void agregar(){
        String nom = nombretxt.getText();
        String desc = descripciontxt.getText();
        if(nom.equals("")){
            javax.swing.JOptionPane.showMessageDialog(this, "ERROR EL CAMPO NOMBRE ESTA VACIO", "", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        return;
        }
        if(desc.equals("")){
            javax.swing.JOptionPane.showMessageDialog(this, "ERROR EL CAMPO DESCRIPCION", "", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        return;
        }
        DAOProveedorImpl daoProveedor = new DAOProveedorImpl();
        try{
            daoProveedor.registrar(new Proveedor(nom, desc));
            daoProveedor = null;
            javax.swing.JOptionPane.showMessageDialog(this, "¡Registro exitoso!", "REGISTRO EXITOSO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            nombretxt.setText("");
            descripciontxt.setText("");
            daoProveedor = null;
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(this, "ERROR: "+e, "", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            daoProveedor = null;
        }
     
    }
    
    
    private void modificar(){
        String nom = nombretxt.getText();
        DAOProveedorImpl daoProveedor = new DAOProveedorImpl();
        Proveedor prove;
        try{
            prove = daoProveedor.buscarPorNombre(new Proveedor(nom, ""));
            if(nom.equals("")){
             javax.swing.JOptionPane.showMessageDialog(this, "ERROR EL CAMPO NOMBRE ESTA VACIO", "", javax.swing.JOptionPane.INFORMATION_MESSAGE);
             return;
            }
            if(prove == null){
                javax.swing.JOptionPane.showMessageDialog(this, "NO EXISTE", "", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                nombretxt.setText("");
                return;
            }
            int idact = prove.getIdProveedor();
            String nuevonom = javax.swing.JOptionPane.showInputDialog("Nuevo Nombre");
            String nuevadesc = javax.swing.JOptionPane.showInputDialog("Nueva Descripcion");
            daoProveedor.modificar(new Proveedor(idact,nuevonom, nuevadesc)); 
            javax.swing.JOptionPane.showMessageDialog(this, "¡Actualizacion exitosa!", "ACTUALIZACION", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            nombretxt.setText("");
            descripciontxt.setText("");
            prove = null;
            daoProveedor = null;
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(this, "ERROR: "+e, "", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            daoProveedor = null;
        }
    
    }
    
    private void eliminar(){
        String nom = nombretxt.getText();
        DAOProveedorImpl daoProveedor = new DAOProveedorImpl();
        Proveedor prove;
        try{
            prove = daoProveedor.buscarPorNombre(new Proveedor(nom, ""));
            if(nom.equals("")){
             javax.swing.JOptionPane.showMessageDialog(this, "ERROR EL CAMPO NOMBRE ESTA VACIO", "", javax.swing.JOptionPane.INFORMATION_MESSAGE);
             return;
            }
            if(prove == null){
            javax.swing.JOptionPane.showMessageDialog(this, "NO EXISTE", "", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            nombretxt.setText("");
            return;
            }
            daoProveedor.eliminarNombre(new Proveedor(nombretxt.getText(), ""));
            javax.swing.JOptionPane.showMessageDialog(this, "¡Eliminacion exitosa!", "ELIMINACION", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            nombretxt.setText("");
            descripciontxt.setText("");
             prove = null;
             daoProveedor = null;
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(this, "ERROR: "+e, "", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            daoProveedor = null;
        }
    
    }
    
    
    private void buscarModificar(){
        String nom = nombretxt.getText();
        DAOProveedorImpl daoProveedor = new DAOProveedorImpl();
        Proveedor prove;
        try{
            prove = daoProveedor.buscarPorNombre(new Proveedor(nom, ""));
            if(prove == null){
            javax.swing.JOptionPane.showMessageDialog(this, "NO EXISTE", "", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            nombretxt.setText("");
            return;
            }
            nombretxt.setText(prove.getNombre());
            descripciontxt.setText(prove.getDescripcion());
            prove = null;
            daoProveedor = null;
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(this, "ERROR: "+e, "", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            daoProveedor = null;
        }
        
    
    }
    
    
    
    
    
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Agregar = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        textidentificador = new javax.swing.JLabel();
        nombretxt = new javax.swing.JTextField();
        textnombre = new javax.swing.JLabel();
        descripciontxt = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(977, 657));
        setMinimumSize(new java.awt.Dimension(977, 657));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("PROVEEEDOR");

        Agregar.setBackground(new java.awt.Color(51, 153, 255));
        Agregar.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Agregar.setForeground(new java.awt.Color(255, 255, 255));
        Agregar.setText("AGREGAR");
        Agregar.setMaximumSize(new java.awt.Dimension(200, 40));
        Agregar.setMinimumSize(new java.awt.Dimension(200, 40));
        Agregar.setPreferredSize(new java.awt.Dimension(200, 40));
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        Actualizar.setBackground(new java.awt.Color(51, 153, 255));
        Actualizar.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Actualizar.setForeground(new java.awt.Color(255, 255, 255));
        Actualizar.setText("ACTUALIZAR");
        Actualizar.setMaximumSize(new java.awt.Dimension(200, 40));
        Actualizar.setMinimumSize(new java.awt.Dimension(200, 40));
        Actualizar.setPreferredSize(new java.awt.Dimension(200, 40));
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        Eliminar.setBackground(new java.awt.Color(255, 102, 102));
        Eliminar.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Eliminar.setText("ELIMINAR");
        Eliminar.setMaximumSize(new java.awt.Dimension(200, 40));
        Eliminar.setMinimumSize(new java.awt.Dimension(200, 40));
        Eliminar.setPreferredSize(new java.awt.Dimension(200, 40));
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        textidentificador.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        textidentificador.setText("NOMBRE:");

        nombretxt.setMaximumSize(new java.awt.Dimension(159, 34));
        nombretxt.setMinimumSize(new java.awt.Dimension(159, 34));
        nombretxt.setPreferredSize(new java.awt.Dimension(159, 34));

        textnombre.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        textnombre.setText("DESCRIPCION:");

        descripciontxt.setMaximumSize(new java.awt.Dimension(159, 34));
        descripciontxt.setMinimumSize(new java.awt.Dimension(159, 34));
        descripciontxt.setPreferredSize(new java.awt.Dimension(159, 34));

        buscar.setBackground(new java.awt.Color(51, 153, 255));
        buscar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setText("BUSCAR");
        buscar.setMaximumSize(new java.awt.Dimension(159, 34));
        buscar.setMinimumSize(new java.awt.Dimension(159, 34));
        buscar.setPreferredSize(new java.awt.Dimension(159, 34));
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textidentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(151, 151, 151)
                                .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(descripciontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(405, 405, 405)
                        .addComponent(jLabel1)))
                .addContainerGap(143, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(384, 384, 384))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addComponent(textidentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(descripciontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
       agregar();
    }//GEN-LAST:event_AgregarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
       buscarModificar();
    }//GEN-LAST:event_buscarActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
       modificar();
    }//GEN-LAST:event_ActualizarActionPerformed
    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
       eliminar();
    }//GEN-LAST:event_EliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField descripciontxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JLabel textidentificador;
    private javax.swing.JLabel textnombre;
    // End of variables declaration//GEN-END:variables
}
