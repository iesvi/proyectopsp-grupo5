package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Model;
import view.VistaInicioSesion;
import view.VistaMenu;
import view.VistaRegistro;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Controlador implements ActionListener{
    VistaInicioSesion view;
    Model model;
    
    public void setModel(Model model){
        this.model=model;
    }
    public void setView (VistaInicioSesion view){
        this.view=view;
    }
  
    @Override
    public void actionPerformed(ActionEvent ae) {
        String nombre=ae.getActionCommand();
        if(nombre=="Aceptar"){
            AtenderCliente h1 = new AtenderCliente(view.getUsuario());
            h1.run();
            VistaMenu vista = new VistaMenu(this);
            vista.setVisible(true);
        }else if(nombre=="Registrarse"){
           
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
