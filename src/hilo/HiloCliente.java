package hilo;

import model.VO.UsuarioVO;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class HiloCliente implements Runnable {
    String host="localhost";
    int puerto=6000;
    ObjectOutputStream userSal;
    ObjectInputStream entraObj;
    ObjectOutputStream salAccion;
    UsuarioVO usuario;
    String accion;
    String recibido;
    @Override
    public void run() {
        System.out.println("Cliente iniciado...");
        Socket cliente = null;
        try {
            cliente = new Socket(host, puerto);

        userSal = new ObjectOutputStream(cliente.getOutputStream());
        salAccion = new ObjectOutputStream(cliente.getOutputStream());

        salAccion.writeObject(accion);
        System.out.println("Accion enviada: "+accion);
        userSal.writeObject(usuario);
        System.out.println("Objeto enviado: " + usuario.getNombreUsuario() + ".");
        entraObj = new ObjectInputStream(cliente.getInputStream());
         recibido = (String) entraObj.readObject();
        System.out.println("Recibo: " + recibido + ".");


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    public ObjectOutputStream getUserSal() {
        return userSal;
    }

    public void setUserSal(ObjectOutputStream userSal) {
        this.userSal = userSal;
    }

    public ObjectInputStream getEntraObj() {
        return entraObj;
    }

    public void setEntraObj(ObjectInputStream entraObj) {
        this.entraObj = entraObj;
    }

    public UsuarioVO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioVO usuario) {
        this.usuario = usuario;
    }

    public String getRecibido() {
        return recibido;
    }

    public void setRecibido(String recibido) {
        this.recibido = recibido;
    }

    public ObjectOutputStream getSalAccion() {
        return salAccion;
    }

    public void setSalAccion(ObjectOutputStream salAccion) {
        this.salAccion = salAccion;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }
    /*









        */
}

