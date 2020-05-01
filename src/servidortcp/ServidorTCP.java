package servidortcp;

import model.Model;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorTCP {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int puerto = 6000;
        boolean p = true;
        ServerSocket server = new ServerSocket(puerto);
        Model model = new Model();
        System.out.println("Esperando al cliente...");




        while (true) {
        Socket cliente = new Socket();
        cliente=server.accept();
        HiloServidorTCP hilo=new HiloServidorTCP(cliente);
        hilo.run();
        }

    }
}