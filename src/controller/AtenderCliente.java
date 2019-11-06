/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author usuario
 */
public class AtenderCliente extends Thread{
    String usuario;
    public AtenderCliente (){
        
    }
    public AtenderCliente(String usuario){
        this.usuario=usuario;
    }
    

    @Override
    public void run(){
        super.run();
        System.out.println("El usuario "+usuario+" ha iniciado sesión.");
    
}
}