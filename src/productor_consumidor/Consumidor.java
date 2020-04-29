package productor_consumidor;

import controller.Controlador;
import model.VO.PeliculaVO;
import model.VO.UsuarioVO;


import java.util.ArrayList;
import java.util.List;

public class Consumidor extends Thread{
    private Cola cola;
    private Controlador controller;
    private List<PeliculaVO> listaPeliculas= new ArrayList<>();

    public Consumidor(Cola cola, Controlador controller){
        this.cola=cola;
        this.controller=controller;
        System.out.println("Entra constructor consumidor");
    }
    public void run(){
        System.out.println("Entra run consumidor");
        listaPeliculas.clear();
        listaPeliculas.addAll(cola.get());


    }
    public void clear(){
        listaPeliculas.clear();
    }
}
