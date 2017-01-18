/**
 * 
 */
package mx.unam.dgscati.pixup.model;

/**
 * @author JAVA
 *
 */
public class Perfil {

	private Usuario usuario;
	private TipoUsuario tipoUsuario;
	/**
	 * @param usuario
	 * @param tipoUsuario
	 * Para realcion muchos a muchos se obliga a que se genere la dupla de elementos
	 */
	public Perfil(Usuario usuario, TipoUsuario tipoUsuario) {
		super();
		this.usuario = usuario;
		this.tipoUsuario = tipoUsuario;
	}
	
	
	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the tipoUsuario
	 */
	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}
	/**
	 * @param tipoUsuario the tipoUsuario to set
	 */
	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Perfil [usuario=" + usuario + ", tipoUsuario=" + tipoUsuario + "]";
	}
	
	
	
}
