/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.menu;

import com.login.Login;
import javax.swing.ImageIcon;

/**
 *
 * @author PC
 */
public class Menu extends javax.swing.JFrame {

ImageIcon imagen1 = new ImageIcon("/com/images/city3.jpg");
ImageIcon imagen2 = new ImageIcon("/com/images/city4.jpg");
ImageIcon imagen3 = new ImageIcon("/com/images/city5.jpg");
       

    
    
    
    public Menu() {
        initComponents();
        limpiarCampos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuusuario = new javax.swing.JPopupMenu();
        cargo = new javax.swing.JMenuItem();
        area = new javax.swing.JMenuItem();
        usuario = new javax.swing.JMenuItem();
        menuproductos = new javax.swing.JPopupMenu();
        proveedor = new javax.swing.JMenuItem();
        producto = new javax.swing.JMenuItem();
        back = new javax.swing.JPanel();
        subtxt3 = new javax.swing.JLabel();
        sub3 = new javax.swing.JLabel();
        subtxt2 = new javax.swing.JLabel();
        sub2 = new javax.swing.JLabel();
        subtxt1 = new javax.swing.JLabel();
        sub1 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        img_Menu = new javax.swing.JLabel();
        lateral = new javax.swing.JPanel();
        logoname = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        OPCLOG = new javax.swing.JButton();
        OPCU = new javax.swing.JButton();
        OPCP = new javax.swing.JButton();
        OPCS = new javax.swing.JButton();

        cargo.setText("Cargo");
        cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargoActionPerformed(evt);
            }
        });
        menuusuario.add(cargo);

        area.setText("Area");
        area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaActionPerformed(evt);
            }
        });
        menuusuario.add(area);

        usuario.setText("Usuario");
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        menuusuario.add(usuario);

        proveedor.setText("Proveedor");
        proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedorActionPerformed(evt);
            }
        });
        menuproductos.add(proveedor);

        producto.setText("Producto");
        producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoActionPerformed(evt);
            }
        });
        menuproductos.add(producto);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(844, 500));
        setPreferredSize(new java.awt.Dimension(849, 660));
        setResizable(false);

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subtxt3.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        subtxt3.setForeground(new java.awt.Color(153, 204, 255));
        subtxt3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtxt3.setText("jLabel2");
        subtxt3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        back.add(subtxt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 340, 80));

        sub3.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        sub3.setForeground(new java.awt.Color(153, 204, 255));
        sub3.setText("jLabel2");
        sub3.setMaximumSize(new java.awt.Dimension(120, 40));
        sub3.setMinimumSize(new java.awt.Dimension(120, 40));
        sub3.setPreferredSize(new java.awt.Dimension(120, 40));
        back.add(sub3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, -1, -1));

        subtxt2.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        subtxt2.setForeground(new java.awt.Color(153, 204, 255));
        subtxt2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtxt2.setText("jLabel2");
        subtxt2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        back.add(subtxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 340, 80));

        sub2.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        sub2.setForeground(new java.awt.Color(153, 204, 255));
        sub2.setText("jLabel2");
        sub2.setMaximumSize(new java.awt.Dimension(120, 40));
        sub2.setMinimumSize(new java.awt.Dimension(120, 40));
        sub2.setPreferredSize(new java.awt.Dimension(120, 40));
        back.add(sub2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, -1, -1));

        subtxt1.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        subtxt1.setForeground(new java.awt.Color(153, 204, 255));
        subtxt1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtxt1.setText("jLabel2");
        subtxt1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        back.add(subtxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 340, 80));

        sub1.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        sub1.setForeground(new java.awt.Color(153, 204, 255));
        sub1.setText("jLabel3");
        sub1.setMaximumSize(new java.awt.Dimension(120, 40));
        sub1.setMinimumSize(new java.awt.Dimension(120, 40));
        sub1.setPreferredSize(new java.awt.Dimension(120, 40));
        back.add(sub1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 120, 40));

        titulo.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(153, 204, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("jLabel2");
        back.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 220, 90));
        back.add(img_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 409, 660));

        lateral.setBackground(new java.awt.Color(204, 255, 255));

        logoname.setBackground(new java.awt.Color(255, 255, 255));
        logoname.setFont(new java.awt.Font("Roboto Medium", 1, 36)); // NOI18N
        logoname.setForeground(new java.awt.Color(255, 255, 255));
        logoname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoname.setText("SEIS S.A de C.V");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/logo.png"))); // NOI18N

        OPCLOG.setBackground(new java.awt.Color(255, 0, 0));
        OPCLOG.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        OPCLOG.setText("CIERRE DE SESION");
        OPCLOG.setBorder(null);
        OPCLOG.setBorderPainted(false);
        OPCLOG.setContentAreaFilled(false);
        OPCLOG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OPCLOGMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OPCLOGMouseExited(evt);
            }
        });
        OPCLOG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OPCLOGActionPerformed(evt);
            }
        });

        OPCU.setBackground(new java.awt.Color(153, 204, 255));
        OPCU.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        OPCU.setText("ALTAS DE USUARIO");
        OPCU.setBorder(null);
        OPCU.setBorderPainted(false);
        OPCU.setContentAreaFilled(false);
        OPCU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OPCUMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OPCUMouseExited(evt);
            }
        });
        OPCU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OPCUActionPerformed(evt);
            }
        });

        OPCP.setBackground(new java.awt.Color(51, 204, 255));
        OPCP.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        OPCP.setText("ALTAS DE PRODUCTO");
        OPCP.setBorder(null);
        OPCP.setBorderPainted(false);
        OPCP.setContentAreaFilled(false);
        OPCP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OPCPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OPCPMouseExited(evt);
            }
        });
        OPCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OPCPActionPerformed(evt);
            }
        });

        OPCS.setBackground(new java.awt.Color(0, 204, 255));
        OPCS.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        OPCS.setText("SALIDA DE PRODUCTO");
        OPCS.setBorder(null);
        OPCS.setBorderPainted(false);
        OPCS.setContentAreaFilled(false);
        OPCS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OPCSMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OPCSMouseExited(evt);
            }
        });
        OPCS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OPCSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lateralLayout = new javax.swing.GroupLayout(lateral);
        lateral.setLayout(lateralLayout);
        lateralLayout.setHorizontalGroup(
            lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lateralLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(OPCU, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(lateralLayout.createSequentialGroup()
                .addComponent(logoname)
                .addGap(0, 13, Short.MAX_VALUE))
            .addComponent(OPCP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(OPCS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OPCLOG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        lateralLayout.setVerticalGroup(
            lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoname)
                .addGap(27, 27, 27)
                .addComponent(OPCU, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OPCP, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OPCS, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(OPCLOG, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        back.add(lateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OPCSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OPCSActionPerformed
        //Salida

    }//GEN-LAST:event_OPCSActionPerformed

    private void OPCUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OPCUActionPerformed
        //Usuarios
        
        menuusuario.show(OPCU, OPCU.getWidth(), 0);
       
        
    }//GEN-LAST:event_OPCUActionPerformed

    private void OPCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OPCPActionPerformed
        //Productos
        menuproductos.show(OPCP, OPCP.getWidth(), 0);

    }//GEN-LAST:event_OPCPActionPerformed

    private void cargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargoActionPerformed
        System.out.println("Cargo");
        
       }//GEN-LAST:event_cargoActionPerformed

    private void areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaActionPerformed
        System.out.println("Area");
    }//GEN-LAST:event_areaActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        System.out.println("Usuario");
    }//GEN-LAST:event_usuarioActionPerformed

    private void proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedorActionPerformed
        System.out.println("Proveedor");
    }//GEN-LAST:event_proveedorActionPerformed

    private void productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoActionPerformed
        System.out.println("Producto");
    }//GEN-LAST:event_productoActionPerformed

    private void OPCUMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OPCUMouseEntered
        textoUsuario();
        OPCU.setContentAreaFilled(true);
        lateral.setBackground(new java.awt.Color(153, 204, 255));
        img_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/city3.jpg")));
    }//GEN-LAST:event_OPCUMouseEntered

    private void OPCPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OPCPMouseEntered
        textoProducto();
        OPCP.setContentAreaFilled(true);
        lateral.setBackground(new java.awt.Color(51, 204, 255));
        img_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/city4.jpg")));
    }//GEN-LAST:event_OPCPMouseEntered

    private void OPCSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OPCSMouseEntered
        textoSalida();
        OPCS.setContentAreaFilled(true);
        lateral.setBackground(new java.awt.Color(0, 204, 255));
        img_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/city5.jpg")));
    }//GEN-LAST:event_OPCSMouseEntered

    private void OPCUMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OPCUMouseExited
        OPCU.setContentAreaFilled(false);
        lateral.setBackground(new java.awt.Color(204, 255, 255));
        img_Menu.setIcon(null);
        limpiarCampos();
    }//GEN-LAST:event_OPCUMouseExited

    private void OPCPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OPCPMouseExited
        OPCP.setContentAreaFilled(false);
        lateral.setBackground(new java.awt.Color(204, 255, 255));
        img_Menu.setIcon(null);
        limpiarCampos();
    }//GEN-LAST:event_OPCPMouseExited

    private void OPCSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OPCSMouseExited
        OPCS.setContentAreaFilled(false);
        lateral.setBackground(new java.awt.Color(204, 255, 255));
        img_Menu.setIcon(null);
        limpiarCampos();
    }//GEN-LAST:event_OPCSMouseExited

    private void OPCLOGMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OPCLOGMouseEntered
        OPCLOG.setContentAreaFilled(true);
        lateral.setBackground(new java.awt.Color(255, 0, 0));
        img_Menu.setIcon(null);
        limpiarCampos();
    }//GEN-LAST:event_OPCLOGMouseEntered

    private void OPCLOGMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OPCLOGMouseExited
        OPCLOG.setContentAreaFilled(false);
        lateral.setBackground(new java.awt.Color(204, 255, 255));
        img_Menu.setIcon(null);
        limpiarCampos();
    }//GEN-LAST:event_OPCLOGMouseExited

    private void OPCLOGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OPCLOGActionPerformed
        dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_OPCLOGActionPerformed
    
    
    private void limpiarCampos(){
                titulo.setText("");
                sub1.setText("");
                sub2.setText("");
                sub3.setText("");
                subtxt1.setText("");
                subtxt2.setText("");
                subtxt3.setText("");
    }
    
    
    private void textoUsuario(){
                titulo.setText("Usuario");
                sub1.setText("Cargo");
                sub2.setText("Area");
                sub3.setText("Usuario");
                subtxt1.setText("Crea los roles(cargos) dentro de la empresa");
                subtxt2.setText("Crea las Areas dentro de la empresa");
                subtxt3.setText("Da de Alta Usuarios nuevos y compañeros");
    }
    private void textoProducto(){
                titulo.setText("Productos");
                sub1.setText("Proveedor");
                sub2.setText("Productos");
                subtxt1.setText("Da de alta los Proovedores");
                subtxt2.setText("Da de alta Productos");   
    }
    private void textoSalida(){
                titulo.setText("Salida");
                sub1.setText("Salida");
                subtxt1.setText("Marca una salida de Producto");     
    }
    //Acciones del menu de usuarios

  
    
    
    
    
    //Acciones del menu de usuarios
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OPCLOG;
    private javax.swing.JButton OPCP;
    private javax.swing.JButton OPCS;
    private javax.swing.JButton OPCU;
    private javax.swing.JMenuItem area;
    private javax.swing.JPanel back;
    private javax.swing.JMenuItem cargo;
    private javax.swing.JLabel img_Menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel lateral;
    private javax.swing.JLabel logoname;
    private javax.swing.JPopupMenu menuproductos;
    private javax.swing.JPopupMenu menuusuario;
    private javax.swing.JMenuItem producto;
    private javax.swing.JMenuItem proveedor;
    private javax.swing.JLabel sub1;
    private javax.swing.JLabel sub2;
    private javax.swing.JLabel sub3;
    private javax.swing.JLabel subtxt1;
    private javax.swing.JLabel subtxt2;
    private javax.swing.JLabel subtxt3;
    private javax.swing.JLabel titulo;
    private javax.swing.JMenuItem usuario;
    // End of variables declaration//GEN-END:variables

   













}
