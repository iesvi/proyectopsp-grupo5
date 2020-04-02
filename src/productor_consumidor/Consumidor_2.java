package productor_consumidor;

import controller.Controlador;
import model.VO.UsuarioVO;
import productorconsumidor.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class Consumidor_2 extends Thread{
    private Cola_2 cola;
    private Controlador controller;
    private List<UsuarioVO> listaUsuarios= new ArrayList<>();

    public Consumidor_2(Cola_2 cola, Controlador controller){
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
