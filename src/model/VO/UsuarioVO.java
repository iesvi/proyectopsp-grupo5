
package model.VO;

/**
 *
 * @author usuario
 */
public class UsuarioVO {
    private String nombreUsuario;
    private String pwsd;

    public UsuarioVO() {

    }

    public UsuarioVO(String nombreUsuario, String pwsd) {
        this.nombreUsuario = nombreUsuario;
        this.pwsd = pwsd;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPwsd() {
        return pwsd;
    }

    public void setPwsd(String pwsd) {
        this.pwsd = pwsd;
    }


}
