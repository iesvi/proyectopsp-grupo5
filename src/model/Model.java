/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.VO.PeliculaVO;
import model.impl.RepositoryJDBC;
import model.VO.UsuarioVO;

/**
 *
 * @author usuario
 */
public class Model {
    private final RepositoryJDBC jdbc;
    //Hacer conexion con base de datos
    public Model(){
        this.jdbc=RepositoryJDBC.getSingletonInstance();
    }
    
    public boolean comprobarUsuario(UsuarioVO usuario){
        return jdbc.comprobarUsuario(usuario);
    }
    public boolean insertarCliente(UsuarioVO usuario){
       return jdbc.insertarCliente(usuario);
    }
    public boolean comprobarPelicula(String pelicula){
        return jdbc.comprobarPelicula(pelicula);
    }
    public PeliculaVO cargarPelicula(String pelicula){
        return jdbc.cargarPelicula(pelicula);
    }
    public boolean aumentarVisitas(){
        return jdbc.aumentarVisitas();
    }
    public int obtenerVisitas(){
        return jdbc.obtenerVisitas();
    }
    
}
