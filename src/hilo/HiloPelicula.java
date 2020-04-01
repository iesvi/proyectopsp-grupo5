package hilo;

import controller.Controlador;
import model.Model;
import model.VO.PeliculaVO;
import view.VistaPelicula;

public class HiloPelicula implements Runnable{
    Model model;

    String usuario;
    String pelicula;
    Controlador controller;

    public HiloPelicula(){

    }
    public HiloPelicula(Model model, String usuario, String pelicula, Controlador controller){
        this.model=model;
        this.usuario=usuario;
        this.pelicula=pelicula;
        this.controller=controller;

    }

    @Override
    public void run() {
        synchronized (pelicula){

            pelicula.notifyAll();

                verPelicula v = new verPelicula();
                v.verVistaPelicula();

             try {
                    pelicula.wait();
                    pelicula.notifyAll();
                } catch (InterruptedException e) {

               }
                pelicula.notify();
            }

    }
    class verPelicula{
        public void verVistaPelicula(){

            PeliculaVO pelicula2 = model.cargarPelicula(pelicula);
            VistaPelicula vistaP = new VistaPelicula(controller);
            vistaP.setLblDirector(vistaP.getLblDirector() + pelicula2.getDirector());
            vistaP.setLblReparto(vistaP.getLblReparto() + "\n" + pelicula2.getReparto());
            vistaP.setLblTitulo(pelicula2.getNombre());
            vistaP.setVisible(true);
            controller.setViewP(vistaP);
        }
    }
}
