package productor_consumidor;

import controller.Controlador;
import model.VO.PeliculaVO;
import model.VO.UsuarioVO;
import view.VistaPelicula;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Cola {
    private List<UsuarioVO> listaUsuarios= new ArrayList<>();
    private boolean disponible = false; //inicialmente cola vacia
    private int numeroUsuarios = 1;
    private UsuarioVO usuario;
    private Controlador controller;
    private String pelicula;
    public Cola(UsuarioVO usuario, Controlador controller, String pelicula){
        this.usuario=usuario;
        this.controller=controller;
        this.pelicula=pelicula;
    }

    public synchronized List<UsuarioVO> get(){
        if(numeroUsuarios>1) { //Hay un usuario en la cola
            disponible = false;
            List<UsuarioVO> usuarios = new ArrayList<>(listaUsuarios);
            listaUsuarios.clear();
            notify();
            return usuarios;

        }
        return listaUsuarios;
    }
    public synchronized  boolean put (UsuarioVO usuario){
        try{
         wait(1500);
        }catch (InterruptedException e){
           e.printStackTrace();
        }
        if(listaUsuarios.size()<numeroUsuarios){
            listaUsuarios.add(usuario);
            System.out.println(listaUsuarios.size());
            System.out.println(usuario.getNombreUsuario());
            disponible=true;
            PeliculaVO pelicula2 = controller.getModel().cargarPelicula(pelicula);
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
