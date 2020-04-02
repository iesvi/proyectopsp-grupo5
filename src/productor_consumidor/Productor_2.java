package productor_consumidor;

import model.VO.UsuarioVO;
import productorconsumidor.Productor;

public class Productor_2 extends Thread{
    private Cola_2 cola;
    private UsuarioVO usuario;
    private boolean disponible;

    public Productor_2(UsuarioVO usuario,Cola_2 cola){
        this.usuario=usuario;
        this.cola=cola;
    }

    public void run() {
        System.out.println("Entra run productor");
        boolean hueco = cola.put(usuario);
        System.out.println("Cola put return =>" + hueco);

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
