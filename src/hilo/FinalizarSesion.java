package hilo;

import model.Model;

public class FinalizarSesion implements Runnable{
    Model model;
    String usuario;

    public FinalizarSesion(Model model,String usuario){
        this.model=model;
        this.usuario=usuario;
    }
    @Override
    public void run() {
        model.disminuirVisitas();
        model.obtenerVisitas();
        System.out.println("El usuario:"+usuario+" ha sido la visita número "+model.obtenerVisitas());
    }
}
