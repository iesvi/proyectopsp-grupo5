package servidortcp;

import model.Model;
import model.VO.PeliculaVO;
import model.VO.UsuarioVO;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorTCP {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int puerto = 6000;

        ServerSocket server = new ServerSocket(puerto);
        Model model = new Model();
        System.out.println("Esperando al cliente...");
        Socket cliente = server.accept();

        int contador=0;

        ObjectInputStream entraObj = new ObjectInputStream(cliente.getInputStream());
        ObjectOutputStream outObjeto = new ObjectOutputStream(cliente.getOutputStream());

        String holo = "";



        if(contador ==0) {
            contador++;
            UsuarioVO recibido = (UsuarioVO) entraObj.readObject();

            System.out.println("Recibo: " + recibido.getNombreUsuario() + ".");
            if (model.comprobarUsuario(recibido) == true) {
                holo = "true";
            } else {
                holo = "false";
            }
            outObjeto.writeObject(holo);
            System.out.println("Envio: " + holo + ".");

        }else if(contador==1){
            PeliculaVO pelirecibido=(PeliculaVO) entraObj.readObject();
            System.out.println("Recibo: " + pelirecibido.getNombre() + ".");
            if(model.comprobarPelicula(pelirecibido.getNombre())==true){
                holo="true";

            }else{
                holo="false";
            }
            outObjeto.writeObject(holo);
            System.out.println("Envio: " + holo + ".");
        }

        outObjeto.close();
        entraObj.close();
        cliente.close();
        server.close();

    }

}