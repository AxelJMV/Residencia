/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apoyo;

import com.clases.Proveedor;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author PC
 */
public class ProveedorComboBoxModel extends DefaultComboBoxModel<Proveedor> {

    public ProveedorComboBoxModel(List<Proveedor> items) {
        super(items.toArray(new Proveedor[0]));
    }

    @Override
    public Proveedor getSelectedItem() {
        return (Proveedor) super.getSelectedItem();
    }
}