
package model.VO;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class PeliculaVO implements Serializable {
    private String nombre;
    private String director;
    private String reparto;
    private String enlace;
    private boolean fav;
    public PeliculaVO(){
        
    }
    public PeliculaVO(String nombre, String director, String reparto,String enlace, boolean fav){
        this.nombre=nombre;
        this.director=director;
        this.reparto=reparto;
        this.enlace=enlace;
        this.fav=fav;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getReparto() {
        return reparto;
    }

    public void setReparto(String reparto) {
        this.reparto = reparto;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    public boolean isFav() {
        return fav;
    }

    public void setFav(Boolean fav) {
        this.fav = fav;
    }

    
    
    
}

