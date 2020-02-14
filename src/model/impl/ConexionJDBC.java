
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Este método sirve para conectarse y desconectarse de la base de datos
 * @author usuario
 */
public class ConexionJDBC {
    Connection conn = null;
    /**
     * Constructor vacio, se conecta a la base de datos
     */
    public ConexionJDBC(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/videoclub?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=CET", "root", "");
        }catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    /**
     * Devuelve el valor de el atributo conn
     * @return devuelve el atributo conn
     */
    public Connection getConnection(){
        return conn;
    }
    /**
     * Se desconecta de la base de datos
     */
    public void desconectar(){
        conn=null;
    }
}

