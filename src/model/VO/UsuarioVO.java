
package model.VO;

import java.io.Serializable;

/**
 *
 * @author usuario
 */
public class UsuarioVO implements Serializable {
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
