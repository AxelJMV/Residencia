/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.panels;

import com.clases.Proveedor;
import com.impldao.*;
import com.apoyo.ProveedorComboBoxModel;
import com.clases.Producto;
import java.math.BigInteger;
import java.util.List;
import javax.swing.JComboBox;
/**
 *
 * @author PC
 */
public class productos_panel extends javax.swing.JPanel {

    
    
        
    public productos_panel() {
        initComponents();
        init();
    }
    
    public void init(){
        obtenerProveedores();
    }
    
    
    private void obtenerProveedores(){
    DAOProveedorImpl daoProveedor = new DAOProveedorImpl();
    try {
    List<Proveedor> proveedores = daoProveedor.listar();
    // Especifica el tipo de elementos (Proveedor) para el JComboBox
    ComboProveedor.setModel(new ProveedorComboBoxModel(proveedores));
    daoProveedor = null;
    // Resto del código...
    } catch (Exception e) {
    javax.swing.JOptionPane.showMessageDialog(this, "ERROR PROVEEDORES: " + e, "", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    daoProveedor = null;
    }

    }
    
    private void insertarProducto(){
        if(identificadortxt.equals("")){
            javax.swing.JOptionPane.showMessageDialog(this, "EL CAMPO IDENTIFICADOR NO PUEDE ESTAR VACIO: ", "VACIO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }
         if(nombretxt.equals("")){
            javax.swing.JOptionPane.showMessageDialog(this, "EL CAMPO NOMBRE NO PUEDE ESTAR VACIO: ", "VACIO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
         }
         if(cantidadtxt.equals("")){
            javax.swing.JOptionPane.showMessageDialog(this, "EL CAMPO CANTIDAD NO PUEDE ESTAR VACIO: ", "VACIO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
         }
         
         if(preciotxt.equals("")){
            javax.swing.JOptionPane.showMessageDialog(this, "EL CAMPO PRECIO NO PUEDE ESTAR VACIO: ", "VACIO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
         }
         
         
        String identificador = identificadortxt.getText();
        String nom = nombretxt.getText();
        int cantidad = Integer.parseInt(cantidadtxt.getText());
        double precio = Double.parseDouble(preciotxt.getText());
        Proveedor pro = (Proveedor) ComboProveedor.getSelectedItem();
        
         if(cantidad <= 0){
             javax.swing.JOptionPane.showMessageDialog(this, "EL CAMPO CANTIDAD NO PUEDE SER MENOR O IGUAL A 0 ", "VALIDACION", javax.swing.JOptionPane.INFORMATION_MESSAGE);
             return;
         }
         if(precio <= 0){
             javax.swing.JOptionPane.showMessageDialog(this, "EL CAMPO PRECIO NO PUEDE SER MENOR O IGUAL A 0 ", "VALIDACION", javax.swing.JOptionPane.INFORMATION_MESSAGE);
             return;
         }
         
         DAOProductoImpl daoProducto = new DAOProductoImpl();
         
         try{
             daoProducto.registrar(new Producto(identificador,nom,cantidad,pro.getIdProveedor(),precio));
             javax.swing.JOptionPane.showMessageDialog(this, "REGISTRO EXITOSO ", "EXITO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
             identificadortxt.setText("");
             nombretxt.setText("");
             cantidadtxt.setText("");
             preciotxt.setText("");
             ComboProveedor.setSelectedIndex(0);
             daoProducto = null;
         }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(this, "ERROR: "+e, "", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            daoProducto = null;
         }  
    }
    
        private void eliminar(){
            DAOProductoImpl daoProducto = new DAOProductoImpl();
            Producto pro = new Producto();
             try{
             if(identificadortxt.getText().equals("")){
                javax.swing.JOptionPane.showMessageDialog(this, "EL CAMPO IDENTIFICADOR NO PUEDE ESTAR VACIO: ", "VACIO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                return;
             }
             pro.setIdentificador(identificadortxt.getText());
             
             Producto res = daoProducto.buscarPorIdentificador(pro);
             if(res == null){
                javax.swing.JOptionPane.showMessageDialog(this, "NO SE ENCONTRO: ", "RESULTADO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                return;
             }
             daoProducto.eliminarIdentificador(res);
             javax.swing.JOptionPane.showMessageDialog(this, "ELIMINADO", "ELIMINADO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
             identificadortxt.setText("");
             nombretxt.setText("");
             cantidadtxt.setText("");
             preciotxt.setText("");
             ComboProveedor.setSelectedIndex(0);
             daoProducto = null;
             pro = null;
             }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(this, "ERROR: "+e, "", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            daoProducto = null;
            }
        }
    
    
        private void regresaIDProveedor(){
            DAOProductoImpl daoProducto = new DAOProductoImpl();
            Producto pro = new Producto();
             try{
             if(identificadortxt.getText().equals("")){
                javax.swing.JOptionPane.showMessageDialog(this, "EL CAMPO IDENTIFICADOR NO PUEDE ESTAR VACIO: ", "VACIO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                return;
             }
             pro.setIdentificador(identificadortxt.getText());
             
             Producto res = daoProducto.buscarPorIdentificador(pro);
             if(res == null){
                javax.swing.JOptionPane.showMessageDialog(this, "NO SE ENCONTRO: ", "RESULTADO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                return;
             }
             javax.swing.JOptionPane.showMessageDialog(this, "BUSQUEDA EXITOSA", "BUSQUEDA", javax.swing.JOptionPane.INFORMATION_MESSAGE);
             nombretxt.setText(res.getNombre());
             cantidadtxt.setText(String.valueOf(res.getCantidad()));
             preciotxt.setText(String.valueOf(res.getPrecio()));
             //ComboProveedor.setSelectedItem(ABORT);
             //ComboProveedor.setSelectedIndex(res.getIdProveedor()-1);
             daoProducto = null;
             pro = null;
             }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(this, "ERROR: "+e, "", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            daoProducto = null;
            }
        
        }
        
        private void actualizar(){
            if(identificadortxt.equals("")){
            javax.swing.JOptionPane.showMessageDialog(this, "EL CAMPO IDENTIFICADOR NO PUEDE ESTAR VACIO: ", "VACIO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
            }
            if(nombretxt.equals("")){
            javax.swing.JOptionPane.showMessageDialog(this, "EL CAMPO NOMBRE NO PUEDE ESTAR VACIO: ", "VACIO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
            }
            if(cantidadtxt.equals("")){
            javax.swing.JOptionPane.showMessageDialog(this, "EL CAMPO CANTIDAD NO PUEDE ESTAR VACIO: ", "VACIO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
            }
         
            if(preciotxt.equals("")){
            javax.swing.JOptionPane.showMessageDialog(this, "EL CAMPO PRECIO NO PUEDE ESTAR VACIO: ", "VACIO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
            }
            DAOProductoImpl daoProducto = new DAOProductoImpl();
            Producto pro = new Producto();
            try{
             pro.setIdentificador(identificadortxt.getText());
             Producto res = daoProducto.buscarPorIdentificador(pro);
             if(res == null){
                javax.swing.JOptionPane.showMessageDialog(this, "NO SE ENCONTRO: ", "RESULTADO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                return;
             }
             Proveedor prove = (Proveedor) ComboProveedor.getSelectedItem();
             res.setNombre(nombretxt.getText());
             res.setIdentificador(identificadortxt.getText());
             res.setCantidad(Integer.parseInt(cantidadtxt.getText()));
             res.setPrecio(Double.parseDouble(preciotxt.getText()));
             res.setIdProveedor(prove.getIdProveedor());
             daoProducto.modificar(res);
             javax.swing.JOptionPane.showMessageDialog(this, "MODIFICACION EXITOSA", "MODIFICACION", javax.swing.JOptionPane.INFORMATION_MESSAGE);
             identificadortxt.setText("");
             nombretxt.setText("");
             cantidadtxt.setText("");
             preciotxt.setText("");
             ComboProveedor.setSelectedIndex(0);
             daoProducto = null;
             pro = null;
            }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(this, "ERROR: "+e, "", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            daoProducto = null;
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
        Agregar = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        textidentificador = new javax.swing.JLabel();
        identificadortxt = new javax.swing.JTextField();
        textnombre = new javax.swing.JLabel();
        nombretxt = new javax.swing.JTextField();
        cantidadtxt = new javax.swing.JTextField();
        textcantidad = new javax.swing.JLabel();
        textprecio = new javax.swing.JLabel();
        preciotxt = new javax.swing.JTextField();
        textproveedor = new javax.swing.JLabel();
        ComboProveedor = new javax.swing.JComboBox<>();
        Buscar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(977, 657));
        setMinimumSize(new java.awt.Dimension(977, 657));
        setPreferredSize(new java.awt.Dimension(977, 657));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("PRODUCTOS");

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
        textidentificador.setText("IDENTIFICADOR:");

        identificadortxt.setMaximumSize(new java.awt.Dimension(159, 34));
        identificadortxt.setMinimumSize(new java.awt.Dimension(159, 34));
        identificadortxt.setPreferredSize(new java.awt.Dimension(159, 34));

        textnombre.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        textnombre.setText("NOMBRE:");

        nombretxt.setMaximumSize(new java.awt.Dimension(159, 34));
        nombretxt.setMinimumSize(new java.awt.Dimension(159, 34));
        nombretxt.setPreferredSize(new java.awt.Dimension(159, 34));

        cantidadtxt.setMaximumSize(new java.awt.Dimension(159, 34));
        cantidadtxt.setMinimumSize(new java.awt.Dimension(159, 34));
        cantidadtxt.setPreferredSize(new java.awt.Dimension(159, 34));

        textcantidad.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        textcantidad.setText("CANTIDAD:");

        textprecio.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        textprecio.setText("PRECIO:");

        preciotxt.setMaximumSize(new java.awt.Dimension(159, 34));
        preciotxt.setMinimumSize(new java.awt.Dimension(159, 34));
        preciotxt.setPreferredSize(new java.awt.Dimension(159, 34));

        textproveedor.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        textproveedor.setText("PROVEEDOR:");

        Buscar.setBackground(new java.awt.Color(51, 153, 255));
        Buscar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Buscar.setText("BUSCAR");
        Buscar.setMaximumSize(new java.awt.Dimension(159, 34));
        Buscar.setMinimumSize(new java.awt.Dimension(159, 34));
        Buscar.setPreferredSize(new java.awt.Dimension(159, 34));
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(textprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(preciotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textidentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(identificadortxt, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cantidadtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ComboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(402, 402, 402)
                        .addComponent(jLabel1)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textidentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(identificadortxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(preciotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
     insertarProducto();
    }//GEN-LAST:event_AgregarActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
    actualizar();
    }//GEN-LAST:event_ActualizarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
      eliminar();
    }//GEN-LAST:event_EliminarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
     regresaIDProveedor();
    }//GEN-LAST:event_BuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Buscar;
    private javax.swing.JComboBox<Proveedor> ComboProveedor;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField cantidadtxt;
    private javax.swing.JTextField identificadortxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JTextField preciotxt;
    private javax.swing.JLabel textcantidad;
    private javax.swing.JLabel textidentificador;
    private javax.swing.JLabel textnombre;
    private javax.swing.JLabel textprecio;
    private javax.swing.JLabel textproveedor;
    // End of variables declaration//GEN-END:variables
}
