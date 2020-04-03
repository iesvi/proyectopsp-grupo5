package productor_consumidor;

import controller.Controlador;
import model.VO.UsuarioVO;


import java.util.ArrayList;
import java.util.List;

public class Consumidor extends Thread{
    private Cola cola;
    private Controlador controller;
    private List<UsuarioVO> listaUsuarios= new ArrayList<>();

    public Consumidor(Cola cola, Controlador controller){
        this.cola=cola;
        this.controller=controller;
        System.out.println("Entra constructor consumidor");
    }
    public void run(){
        System.out.println("Entra run consumidor");
        listaUsuarios.clear();
        listaUsuarios.addAll(cola.get());

    }
    public void clear(){
        listaUsuarios.clear();
    }
}
