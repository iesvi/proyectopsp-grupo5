
package model.VO;

/**
 *
 * @author Usuario
 */
public class PeliculaVO {
    private String nombre;
    private String director;
    private String reparto;
    private String enlace;
    
    public PeliculaVO(){
        
    }
    public PeliculaVO(String nombre, String director, String reparto,String enlace){
        this.nombre=nombre;
        this.director=director;
        this.reparto=reparto;
        this.enlace=enlace;
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
    
    
    
    
}

