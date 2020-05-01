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

    public synchronized List<PeliculaVO> get() {
        while (favoritos >= 3) {
            try {

                wait();
                JOptionPane.showMessageDialog(null, "Error, ya hay un usuario en la cola, inténtelo mas tarde");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        notify();
        System.out.println("La lista de películas favoritas es: ");
        for(int i=0;i<listaPeliculas.size();i++) {
            System.out.println("-" + listaPeliculas.get(i).getNombre());
        }
        return listaPeliculas;

    }

    public synchronized boolean put(PeliculaVO pelicula1) {
        getFavoritos(pelicula1);
        while (favoritos >= 3) {
            try {
                wait();
                JOptionPane.showMessageDialog(null, "Error, ya hay un usuario en la cola, inténtelo mas tarde");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        listaPeliculas.add(pelicula1);
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
        return disponible;

    }

    public void setBusqueda(String pelicula) {
        this.pelicula = pelicula;
    }

    public int getFavoritos(PeliculaVO pelicula) {
        favoritos = controller.getModel().cargarPelicula(pelicula.getNombre()).getFav();
        return favoritos;
    }
}
