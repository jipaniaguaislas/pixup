/**
 * 
 */
package mx.unam.dgscati.pixup.model;

/**
 * @author JAVA
 *
 */
public class Municipio {

	private int identificador;
	private String nombre;
	//Se mapea al objeto
	private Estado estado;
	
	
	/**
	 * @return the identificador
	 */
	public int getIdentificador() {
		return identificador;
	}
	/**
	 * @param identificador the identificador to set
	 */
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the idEstado
	 */
	public Estado getEstado() {
		return estado;
	}
	/**
	 * @param idEstado the idEstado to set
	 */
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Municipio [identificador=" + identificador + ", nombre=" + nombre + ", estado=" + estado + "]";
	}
	
}
