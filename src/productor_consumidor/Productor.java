package productor_consumidor;

import model.VO.UsuarioVO;


public class Productor extends Thread{
    private Cola cola;
    private UsuarioVO usuario;


    public Productor(UsuarioVO usuario, Cola cola){
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
