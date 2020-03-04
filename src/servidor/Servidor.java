package servidor;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    static Integer PUERTO = 44441;
    static public servidor.EstructuraFicheros NF;
    static ServerSocket servidor;

    public Servidor(){

    }

    public static Integer getPUERTO() {
        return PUERTO;
    }

    public static void setPUERTO(Integer PUERTO) {
        Servidor.PUERTO = PUERTO;
    }

    public static EstructuraFicheros getNF() {
        return NF;
    }

    public static void setNF(EstructuraFicheros NF) {
        Servidor.NF = NF;
    }

    public static ServerSocket getServidor() {
        return servidor;
    }

    public static void setServidor(ServerSocket servidor) {
        Servidor.servidor = servidor;
    }
}
