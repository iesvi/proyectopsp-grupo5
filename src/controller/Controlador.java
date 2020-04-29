package controller;


import Chat.UDPMultiChat2;
import ClienteFTP.ClienteFTP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

import SMTP.ClienteSMTP;
import hilo.FinalizarSesion;
import hilo.HiloCliente;
import hilo.InicioSesion;
import model.Model;
import model.VO.PeliculaVO;
import model.VO.UsuarioVO;
import productor_consumidor.Cola;
import productor_consumidor.Consumidor;
import productor_consumidor.Productor;
import servidor.EstructuraFicheros;
import servidor.HiloServidor;
import servidor.Servidor;
import view.VistaBuscarPelicula;
import view.VistaConsultarLista;
import view.VistaInicioSesion;
import view.VistaMenu;
import view.VistaMenuAdmin;
import view.VistaPelicula;
import view.VistaRegistro;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author usuario
 */
public class Controlador implements ActionListener {
    VistaInicioSesion view;
    Model model;
    VistaRegistro viewR;
    VistaMenu viewM;
    VistaBuscarPelicula viewB;
    VistaConsultarLista viewL;
    VistaMenuAdmin viewMA;
    VistaPelicula viewP;
    PeliculaVO pelicula;
    Cola cola;
    ObjectOutputStream userSal;
    DataInputStream flujoEntrada;
    DataOutputStream flujoSalida;

    public Controlador() {
        model = new Model();

    }

    public void setViewP(VistaPelicula viewP) {
        this.viewP = viewP;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void setView(VistaInicioSesion view) {
        this.view = view;
    }

    public void setViewR(VistaRegistro viewR) {
        this.viewR = viewR;
    }

    public void setViewM(VistaMenu viewM) {
        this.viewM = viewM;
    }

    public void setViewB(VistaBuscarPelicula viewB) {
        this.viewB = viewB;
    }

    public void setViewL(VistaConsultarLista viewL) {
        this.viewL = viewL;
    }

    public void setViewMA(VistaMenuAdmin viewMA) {
        this.viewMA = viewMA;
    }
    public Model getModel(){
        return this.model;
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        String nombre = ae.getActionCommand();
       /* String host = "localhost";

        int puerto = 6000;
        System.out.println("Cliente iniciado...");
        Socket cliente = null;
        try {
            cliente = new Socket(host, puerto);



        userSal = new ObjectOutputStream(cliente.getOutputStream());




        ObjectInputStream entraObj = new ObjectInputStream(cliente.getInputStream());
        String recibido = (String) entraObj.readObject();
        System.out.println("Recibo: " + recibido + ".");
        entraObj.close();
        userSal.close();
        cliente.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        if (nombre == "Aceptar") {
            HiloCliente h1 = new HiloCliente();
            UsuarioVO usuario1 = new UsuarioVO();
            usuario1.setNombreUsuario(view.getUsuario());
            usuario1.setPwsd(view.getPswd());
            h1.setUsuario(usuario1);

            //try {
                //flujoSalida.writeUTF("Comprobar usuario");

                //System.out.println("Mensaje enviado");



            /*userSal.writeObject(usuario);
                System.out.println("Objeto enviado: " + usuario.getNombreUsuario() + ".");
        } catch (IOException ex) {
            ex.printStackTrace();
        }*/
            h1.setAccion("Comprobar");
            h1.run();



                if (h1.getRecibido().equals("true")) {


                        //Iniciar hilo
                        InicioSesion hilo = new InicioSesion(model, view.getUsuario());
                        hilo.run();


                        //Envia correo
                        Calendar calendario = Calendar.getInstance();
                        int hora = calendario.get(Calendar.HOUR_OF_DAY);
                        int minutos = calendario.get(Calendar.MINUTE);
                        int segundos = calendario.get(Calendar.SECOND);
                        int dia = calendario.get(Calendar.DAY_OF_MONTH);
                        String nomUser = view.getUsuario();
                        int numVisitas = model.obtenerVisitas();
                        String mensaje = "El usuario: " + nomUser + " ha iniciado sesion a las " + hora + ":" + minutos + ":" + segundos + " el dia " + dia + ". El total de inicios de sesion a la aplicacion es de " + numVisitas + ".";
                        String asunto = "Inicio de sesión";
                        String destinatario = "damblinders@gmail.com";
                        ClienteSMTP smtp = new ClienteSMTP();
                        smtp.enviarCorreo(asunto, mensaje, destinatario);

                        VistaMenu vista = new VistaMenu(this);
                        vista.setVisible(true);
                        this.setViewM(vista);

                    } else if (view.getUsuario().equalsIgnoreCase("admin") && view.getPswd().equalsIgnoreCase("admin")) {
                        VistaMenuAdmin vistaMA = new VistaMenuAdmin(this);
                        vistaMA.setVisible(true);
                        this.setViewMA(vistaMA);

                    } else {
                        JOptionPane.showMessageDialog(null, "El usuario y/o contraseña no son correctos");

                        view.clear();
                    }



        } else if (nombre == "¡Registrate!") {
            VistaRegistro view = new VistaRegistro(this);
            view.setVisible(true);
            this.setViewR(view);
        } else if (nombre == "Registrarse") {
            UsuarioVO usuario = new UsuarioVO();
            usuario.setNombreUsuario(viewR.getUsuario());
            usuario.setPwsd(viewR.getPsswd());
            if (model.comprobarUsuario(usuario) == false) {
                model.insertarCliente(usuario);

                System.out.println("El usuario" + usuario.getNombreUsuario() + " ha sido registrado exitosamente");
                viewR.setVisible(false);
            } else {
                viewR.clear();
                JOptionPane.showMessageDialog(null, "El nombre de usuario ya existe, elige otro");

            }
        } else if (nombre == "Cancelar") {
            viewR.dispose();
        } else if (nombre == "Buscar Peliculas") {
            VistaBuscarPelicula viewB = new VistaBuscarPelicula(this);
            viewB.setVisible(true);
            this.setViewB(viewB);

            UsuarioVO usuario = new UsuarioVO();
            usuario.setNombreUsuario(view.getUsuario());
            usuario.setPwsd(view.getPswd());
            cola=  new Cola(this,viewB.getBusqueda());

        } else if (nombre == "Consultar listas") {
            VistaConsultarLista viewL = new VistaConsultarLista();
            viewL.setVisible(true);
            this.setViewL(viewL);
        } else if (nombre == "Salir") {
            viewM.dispose();

//Iniciar hilo
            FinalizarSesion hilo = new FinalizarSesion(model, view.getUsuario());
            hilo.run();

            //Envia correo
            Calendar calendario = Calendar.getInstance();
            int hora = calendario.get(Calendar.HOUR_OF_DAY);
            int minutos = calendario.get(Calendar.MINUTE);
            int segundos = calendario.get(Calendar.SECOND);
            int dia = calendario.get(Calendar.DAY_OF_MONTH);

            String nomUser = view.getUsuario();
            String mensaje = "El usuario: " + nomUser + " ha salido  de la aplicación a las " + hora + ":" + minutos + ":" + segundos + " el dia " + dia + ".";
            String asunto = "Fin de sesión";

            String destinatario = "damblinders@gmail.com";
            ClienteSMTP smtp = new ClienteSMTP();
            smtp.enviarCorreo(asunto, mensaje, destinatario);

        } else if (nombre == "Buscar") {

            cola.setBusqueda(viewB.getBusqueda());
            if (model.comprobarPelicula(viewB.getBusqueda()) == true) {
                //Cargar vista pelicula con datos
               // HiloPelicula h1 = new HiloPelicula(model,view.getUsuario(),viewB.getBusqueda(),this);
               // h1.run();
                PeliculaVO peli =model.cargarPelicula(viewB.getBusqueda());

                //UsuarioVO usuariocola = new UsuarioVO();
               // usuariocola.setNombreUsuario(view.getUsuario());
                //usuariocola.setPwsd(view.getPswd());

                Productor p = new Productor(peli,cola);
                Consumidor c = new Consumidor(cola,this);
                p.start();
                c.start();


            } else {
                JOptionPane.showMessageDialog(null, "No hay ninguna película con ese nombre");
            }



        }else if(nombre=="ServidorTCP"){

        }else if(nombre=="ClienteTCP"){


        } else if (nombre == "Ver enlaces") {
            JOptionPane.showMessageDialog(null, pelicula.getEnlace());
        } else if (nombre == "Subir enlace") {
            JOptionPane.showInputDialog(null, "Introduce el enlace");
        } else if (nombre == "Ver detalles") {
            JOptionPane.showMessageDialog(null,
                    "Esta película se estrenó en 1994. La vida de Lloyd y Harry, dos amigos de una estupidez supina  es un auténtico desastre.\n"
                            + " El primero trabaja como chófer de una limousina, y el segundo se dedica a transportar perros.Cuando Lloyd se\n"
                            + " enamora de una chica de buena posición, que deja olvidado un maletín en el coche, los dos amigos\n"
                            + " emprenden un viaje por todo el país para devolvérselo.");
        } else if (nombre == "Desconectarse") {
            viewMA.dispose();
        } else if (nombre == "Chat administrador") {
            System.out.println("Entra chat admin");
            try {
                System.out.println("Entra chat admin");
                UDPMultiChat2 chatadmin = new UDPMultiChat2("admin");

                String nombrechat = "admin";
                // Se crea el socket multicast
                chatadmin.setMs(new MulticastSocket(12345));
                chatadmin.setGrupo(InetAddress.getByName("225.0.0.1"));// Grupo
                // Nos unimos al grupo
                chatadmin.getMs().joinGroup(chatadmin.getGrupo());
                if (!nombrechat.trim().equals("")) {
                    UDPMultiChat2 server = new UDPMultiChat2(nombrechat);
                    server.setBounds(0, 0, 540, 400);
                    server.setVisible(true);
                    new Thread(server).start();

                } 
                
                /*
                     System.out.println("Entra chat usuario");
                UDPMultiChat2 chatuser = new UDPMultiChat2("user");

                String nombrechat = view.getUsuario();
                // Se crea el socket multicast
                chatuser.setMs(new MulticastSocket(12345));
                chatuser.setGrupo(InetAddress.getByName("225.0.0.1"));// Grupo
                // Nos unimos al grupo
                chatuser.getMs().joinGroup(chatuser.getGrupo());
                if (!nombrechat.trim().equals("")) {
                    UDPMultiChat2 server = new UDPMultiChat2(nombrechat);
                    server.setBounds(0, 0, 540, 400);
                    server.setVisible(true);
                    new Thread(server).start();

                }
            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
                */
            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }


        } else if (nombre == "Pulse para abrir el chat") {
            try {
                System.out.println("Entra chat usuario");
                UDPMultiChat2 chatuser = new UDPMultiChat2("user");

                String nombrechat = view.getUsuario();
                // Se crea el socket multicast
                chatuser.setMs(new MulticastSocket(12345));
                chatuser.setGrupo(InetAddress.getByName("225.0.0.1"));// Grupo
                // Nos unimos al grupo
                chatuser.getMs().joinGroup(chatuser.getGrupo());
                if (!nombrechat.trim().equals("")) {
                    UDPMultiChat2 server = new UDPMultiChat2(nombrechat);
                    server.setBounds(0, 0, 540, 400);
                    server.setVisible(true);
                    new Thread(server).start();

                }
            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (nombre == "ClienteFTP") {
            try {
                ClienteFTP clienteftp = new ClienteFTP();
                clienteftp.setCab2(view.getUsuario());
            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(nombre=="Servidor de archivos"){
            Servidor servidor1= new Servidor();
            String Directorio = "";
            JFileChooser f = new JFileChooser();
            f.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            f.setDialogTitle("SELECCIONA EL DIRECTORIO DONDE ESTÁN LOS FICHEROS");
            int returnVal = f.showDialog(f, "Seleccionar");
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = f.getSelectedFile();
                Directorio = file.getAbsolutePath();
                System.out.println(Directorio);
            }
            //si no se selecciona nada salir

            if (Directorio.equals("")) {
                System.out.println("Debe seleccionar un directorio.");
                System.exit(1);
            }
            ServerSocket servidor = null;
            try {
                servidor = new ServerSocket(servidor1.getPUERTO());
            } catch (IOException e) {
                e.printStackTrace();
            }
            servidor1.setServidor(servidor);
            System.out.println(("Servidor iniciado en Puerto: " + servidor1.getPUERTO()));
            while (true) {
                try {
                   // Socket cliente = servidor.accept();
                    System.out.println("Bienvenido al cliente");

                  EstructuraFicheros  NF = new EstructuraFicheros(Directorio);
                 servidor1.setNF(NF);
                   // HiloServidor hilo = new HiloServidor(cliente, NF);
                   // hilo.start(); //Ejecutamos el hilo
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                    System.exit(0);
                }
            }
        }else if(nombre=="Calculadora"){
Runtime r=Runtime.getRuntime();
String comando[]={"calc"};
Process p =null;
for (int i=0;i<comando.length;i++){
    System.out.println("************************************");
    System.out.println("Comando: "+comando[i]);
    System.out.println("************************************");
    try {
        p=r.exec(comando[i]);
        InputStream is = p.getInputStream();
        BufferedReader br = new BufferedReader( new InputStreamReader(is));
        String linea;
        while ((linea=br.readLine())!=null)
            //lee una linea del fichero
            System.out.println(linea);
        br.close();
    }catch (Exception e){
        e.printStackTrace();
    }

}
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
