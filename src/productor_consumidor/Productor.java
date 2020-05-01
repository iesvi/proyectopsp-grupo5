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
        cola.put(pelicula);

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
