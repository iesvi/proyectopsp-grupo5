package controller;

import EjemplosTema3.ChatUDP.UDPMultiChat;
import EjemplosTema3.ChatUDP.UDPMultiChat2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Model;
import model.VO.PeliculaVO;
import model.VO.UsuarioVO;
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
 *
 * @author usuario
 */
public class Controlador implements ActionListener{
    VistaInicioSesion view;
    Model model;
    VistaRegistro viewR;
    VistaMenu viewM;
    VistaBuscarPelicula viewB;
    VistaConsultarLista viewL;
    VistaMenuAdmin viewMA;
    VistaPelicula viewP;
    PeliculaVO pelicula;
    
    public Controlador(){
        model=new Model();
    }
    public void setViewP(VistaPelicula viewP){
        this.viewP=viewP;
    }
    public void setModel(Model model){
        this.model=model;
    }
    public void setView (VistaInicioSesion view){
        this.view=view;
    }
    public void setViewR(VistaRegistro viewR){
        this.viewR=viewR;
    }
    public void setViewM(VistaMenu viewM){
        this.viewM=viewM;
    }
    public void setViewB(VistaBuscarPelicula viewB){
        this.viewB=viewB;
    }
    public void setViewL(VistaConsultarLista viewL){
        this.viewL=viewL;
    }
    public void setViewMA(VistaMenuAdmin viewMA){
        this.viewMA=viewMA;
    }
  
    @Override
    public void actionPerformed(ActionEvent ae) {
        String nombre=ae.getActionCommand();
        if(nombre=="Aceptar"){
            UsuarioVO usuario = new UsuarioVO();
            usuario.setNombreUsuario(view.getUsuario());
            usuario.setPwsd(view.getPswd());
            if(model.comprobarUsuario(usuario)==true){
                     AtenderCliente h1 = new AtenderCliente(view.getUsuario());
                     h1.run();
                     VistaMenu vista = new VistaMenu(this);
                     vista.setVisible(true); 
                     this.setViewM(vista);
                     
            }else if(view.getUsuario().equalsIgnoreCase("admin") && view.getPswd().equalsIgnoreCase("admin")){
                VistaMenuAdmin vistaMA = new VistaMenuAdmin(this);
                vistaMA.setVisible(true);
                this.setViewMA(vistaMA);
                
            }else{
                JOptionPane.showMessageDialog(null, "El usuario y/o contraseña no son correctos");

                view.clear();
            }
      
        }else if(nombre=="¡Registrate!"){
           VistaRegistro view = new VistaRegistro(this);
           view.setVisible(true);
           this.setViewR(view);
        }else if(nombre=="Registrarse"){
            UsuarioVO usuario = new UsuarioVO();
            usuario.setNombreUsuario(viewR.getUsuario());
            usuario.setPwsd(viewR.getPsswd());
            if(model.comprobarUsuario(usuario)==false){
                model.insertarCliente(usuario);
                
                System.out.println("El usuario"+usuario.getNombreUsuario()+" ha sido registrado exitosamente");
                viewR.setVisible(false);
            }else{
                viewR.clear();
                JOptionPane.showMessageDialog(null, "El nombre de usuario ya existe, elige otro");
                
            }
        }else if (nombre=="Cancelar"){
            viewR.dispose();
        }else if(nombre=="Buscar Peliculas"){
            VistaBuscarPelicula viewB = new VistaBuscarPelicula(this);
            viewB.setVisible(true);
            this.setViewB(viewB);
        }else if(nombre=="Consultar listas"){
            VistaConsultarLista viewL = new VistaConsultarLista();
            viewL.setVisible(true);
            this.setViewL(viewL);
        }else if (nombre=="Salir"){
            viewM.dispose();
            
        }else if(nombre=="Buscar"){
                if(model.comprobarPelicula(viewB.getBusqueda())==true){
                    //Cargar vista pelicula con datos
                   pelicula=model.cargarPelicula(viewB.getBusqueda());
                    VistaPelicula vistaP = new VistaPelicula(this);
                    vistaP.setLblDirector(vistaP.getLblDirector()+pelicula.getDirector());
                    vistaP.setLblReparto(vistaP.getLblReparto()+"\n"+pelicula.getReparto());
                    vistaP.setLblTitulo(pelicula.getNombre());
                    vistaP.setVisible(true);
                    
                    this.setViewP(viewP);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "No hay ninguna película con ese nombre");
                }
        }else if(nombre=="Ver enlaces"){
            JOptionPane.showMessageDialog(null, pelicula.getEnlace());
        }else if(nombre=="Subir enlace"){
            JOptionPane.showInputDialog(null, "Introduce el enlace");
        }else if(nombre=="Ver detalles"){
            JOptionPane.showMessageDialog(null,
                    "Esta película se estrenó en 1994. La vida de Lloyd y Harry, dos amigos de una estupidez supina  es un auténtico desastre.\n"
                            + " El primero trabaja como chófer de una limousina, y el segundo se dedica a transportar perros.Cuando Lloyd se\n"
                            + " enamora de una chica de buena posición, que deja olvidado un maletín en el coche, los dos amigos\n"
                             + " emprenden un viaje por todo el país para devolvérselo.");
        }else if(nombre=="Desconectarse"){
            viewMA.dispose();
        }else if(nombre=="Chat administrador"){
            System.out.println("Entra chat admin");
            UDPMultiChat chatadmin = new UDPMultiChat("admin");
            chatadmin.run();
        }else if(nombre=="Pulse para abrir el chat"){
            System.out.println("Entra chat usuario");
            UDPMultiChat2 chatuser= new UDPMultiChat2("user");
            chatuser.run();
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
