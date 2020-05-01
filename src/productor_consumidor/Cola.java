package productor_consumidor;

import controller.Controlador;
import model.VO.PeliculaVO;
import model.VO.UsuarioVO;
import view.VistaPelicula;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Cola {
    private List<PeliculaVO> listaPeliculas = new ArrayList<>();
    private boolean disponible = false; //inicialmente cola vacia
    int favoritos;

    private Controlador controller;
    private String pelicula;
    private ArrayList<PeliculaVO> peliculas;

    public Cola(Controlador controller, String pelicula) {
        this.controller = controller;
        this.pelicula = pelicula;
    }

    public synchronized int get() {
        System.out.println("get Favoritos:"+favoritos);
        while (favoritos >= 3) {
            try {
                JOptionPane.showMessageDialog(null, "Error, se ha marcado 3 veces como favorita.");
                wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        notify();
        System.out.println("Peliculas favoritas:");
        for(int i=0;i<listaPeliculas.size();i++) {
            System.out.println(listaPeliculas.get(i).getNombre());
        }
        return favoritos;
    }

    public synchronized void put(PeliculaVO pelicula1) {

        getFavoritos(pelicula1);

        while (favoritos >= 3) {
            try {

                wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


        System.out.println("Añadida pelicula " + pelicula1.getNombre());
        controller.getModel().incrementarFav(pelicula1.getNombre());


        listaPeliculas.add(pelicula1);
        System.out.println(listaPeliculas.size());
        PeliculaVO pelicula2 = controller.getModel().cargarPelicula(pelicula1.getNombre());
        VistaPelicula vistaP = new VistaPelicula(controller);
        vistaP.setLblDirector(vistaP.getLblDirector() + pelicula2.getDirector());
        vistaP.setLblReparto(vistaP.getLblReparto() + "\n" + pelicula2.getReparto());
        vistaP.setLblTitulo(pelicula2.getNombre());
        vistaP.setVisible(true);
        controller.setViewP(vistaP);


        notify();


    }

    public void setBusqueda(String pelicula) {
        this.pelicula = pelicula;
    }

    public int getFavoritos(PeliculaVO pelicula) {
        favoritos = controller.getModel().cargarPelicula(pelicula.getNombre()).getFav();
        return favoritos;
    }
}
