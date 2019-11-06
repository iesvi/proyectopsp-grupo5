/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controller.Controlador;
import model.Model;
import view.VistaInicioSesion;

/**
 *
 * @author usuario
 */
public class Main {
    public static void main (String[] args){
        Controlador controller = new Controlador();
       // Model model = new Model();
        //controller.setModel(model);
        VistaInicioSesion view = new VistaInicioSesion(controller);
        controller.setView(view);
        view.setVisible(true);
        
    }
    
}
