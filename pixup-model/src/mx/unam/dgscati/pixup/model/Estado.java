/**
 * 
 */
package mx.unam.dgscati.pixup.model;

/**
 * @author JAVA
 *
 */
public class Estado {

	private int identificador;
	private String nombre;
	
	
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	//Para que aparezca el nombre en ves de la localidad de memoria
	@Override
	public String toString() {
		return "Estado [identificador=" + identificador + ", nombre=" + nombre + "]";
	}
	
	
	
}
