package productor_consumidor;

import model.VO.PeliculaVO;
import model.VO.UsuarioVO;


public class Productor extends Thread{
    private Cola cola;
    private PeliculaVO pelicula;


    public Productor(PeliculaVO pelicula, Cola cola){
        this.pelicula=pelicula;
        this.cola=cola;
    }

    public void run() {
        System.out.println("Entra run productor");
        boolean hueco = cola.put(pelicula);
        System.out.println("Cola put return =>" + hueco);

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
