package productor_consumidor;

import controller.Controlador;
import model.VO.PeliculaVO;
import model.VO.UsuarioVO;
import view.VistaPelicula;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Cola {
    private List<PeliculaVO> listaPeliculas= new ArrayList<>();
    private boolean disponible = false; //inicialmente cola vacia
    private int favoritos = 3;

    private Controlador controller;
    private String pelicula;
    private ArrayList<PeliculaVO> peliculas;
    public Cola(Controlador controller, String pelicula){
        this.controller=controller;
        this.pelicula=pelicula;
    }

    public synchronized List<PeliculaVO> get(){

        if(favoritos>3) { //Hay un usuario en la cola
            disponible = false;
            peliculas = new ArrayList<>(listaPeliculas);
            listaPeliculas.clear();

            return peliculas;

        }else{
            for(int i=0;i<listaPeliculas.size();i++){
                System.out.println(listaPeliculas.get(i).getNombre());
            }
        }
        return listaPeliculas;
    }
    public synchronized  boolean put (PeliculaVO pelicula){
        try{
         wait(1500);
        }catch (InterruptedException e){
           e.printStackTrace();
        }

        listaPeliculas.add(pelicula);
        System.out.println("Añadida pelicula "+pelicula.getNombre());
        pelicula.setFav(true);
        System.out.println("lista peliculas:"+listaPeliculas.size());
        if(listaPeliculas.size()<favoritos){
            listaPeliculas.add(pelicula);
            System.out.println(listaPeliculas.size());
            disponible=true;
            PeliculaVO pelicula2 = controller.getModel().cargarPelicula(pelicula.getNombre());
            VistaPelicula vistaP = new VistaPelicula(controller);
            vistaP.setLblDirector(vistaP.getLblDirector() + pelicula2.getDirector());
            vistaP.setLblReparto(vistaP.getLblReparto() + "\n" + pelicula2.getReparto());
            vistaP.setLblTitulo(pelicula2.getNombre());
            vistaP.setVisible(true);
            controller.setViewP(vistaP);

        }else{
            disponible=false;
            JOptionPane.showMessageDialog(null, "Error, ya hay un usuario en la cola, inténtelo mas tarde");
        }
        notify();
        return disponible;
    }
    public void setBusqueda(String pelicula){
        this.pelicula=pelicula;
    }
}
