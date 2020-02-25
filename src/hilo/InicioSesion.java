package hilo;

import model.Model;

public class InicioSesion implements Runnable{
    Model model;
    String usuario;

    public InicioSesion(Model model,String usuario){
        this.model=model;
        this.usuario=usuario;
    }
    @Override
    public void run() {
        model.aumentarVisitas();
        System.out.println("El usuario:"+usuario+" ha sido la visita número "+model.obtenerVisitas());
    }


}
