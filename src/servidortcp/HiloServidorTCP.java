package servidortcp;

import model.Model;
import model.VO.PeliculaVO;
import model.VO.UsuarioVO;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class HiloServidorTCP implements Runnable {
    Socket cliente=null;
    ObjectInputStream accion;
    ObjectInputStream entraObj;
    ObjectOutputStream outObjeto;
    Model model;
    String holo;
    public HiloServidorTCP(Socket cliente) throws IOException {
        this.cliente=cliente;
        this.accion= new ObjectInputStream(cliente.getInputStream());
        this.entraObj= new ObjectInputStream(cliente.getInputStream());
        this.outObjeto= new ObjectOutputStream(cliente.getOutputStream());
        this.model= new Model();
        this.holo="";


    }
    @Override
    public void run() {
        try {
        switch (accion.readObject().toString()) {

            case "Comprobar":
                System.out.println("");
                System.out.println("Comprueba usuario");

                UsuarioVO recibido = (UsuarioVO) entraObj.readObject();

                System.out.println("Recibo: " + recibido.getNombreUsuario() + ".");
                if (model.comprobarUsuario(recibido) == true) {
                    holo = "true";
                } else {
                    holo = "false";
                }
                outObjeto.writeObject(holo);
                System.out.println("Envio: " + holo + ".");
                break;

            case "Comprobar pelicula" :

                PeliculaVO pelirecibido = (PeliculaVO) entraObj.readObject();
                System.out.println("Recibo: " + pelirecibido.getNombre() + ".");
                if (model.comprobarPelicula(pelirecibido.getNombre()) == true) {
                    holo = "true";

                } else {
                    holo = "false";
                }
                outObjeto.writeObject(holo);
                System.out.println("Envio: " + holo + ".");
            break;

            case "Insertar usuario":
                System.out.println("");
                System.out.println("Inserta usuario");
                UsuarioVO insertaruser = (UsuarioVO) entraObj.readObject();
                System.out.println("Recibo: " + insertaruser.getNombreUsuario() + ".");
                if (model.insertarCliente(insertaruser) == true) {

                    holo = "true";

                } else {
                    holo = "false";
                }
                outObjeto.writeObject(holo);
                System.out.println("Envio: " + holo + ".");

           break;


            case"Eliminar fav":
                PeliculaVO pelicula = (PeliculaVO) entraObj.readObject();
                System.out.println("Recibo: " + pelicula.getNombre() + ".");
                model.quitarFav(pelicula.getNombre());
                System.out.println("La película ha sido eliminada de favoritos");

            break;
        }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }


    }
    }

