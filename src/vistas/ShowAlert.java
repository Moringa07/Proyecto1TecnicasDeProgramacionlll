/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author yorman
 */
public class ShowAlert {
    private int respuesta;
    /*
    * @param title titulo del mensaje
    * @param desc descripcion del mensaje
    * @param icon icono del mensaje
    */
    public ShowAlert(String title, String desc, int icon){
        JOptionPane optionPane = new JOptionPane(desc, icon); 
        JDialog dialog = optionPane.createDialog(title); 
        dialog.setAlwaysOnTop(true); 
        dialog.setVisible(true);
    }
    
    public ShowAlert(String title, String desc, int type, int icon){
        respuesta = JOptionPane.showConfirmDialog(null, desc, title, type, icon);
    }
    
    public int getRespuesta(){
        return respuesta;
    }
}
