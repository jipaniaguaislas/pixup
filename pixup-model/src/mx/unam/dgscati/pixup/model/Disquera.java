/**
 * 
 */
package mx.unam.dgscati.pixup.model;

/**
 * @author JPaniagua
 *
 */
public class Disquera {

	private int identifiacdor;
	private String nombre;
	
	/**
	 * Constructor 
	 */
	public Disquera() {
	}
	
	public Disquera(String disquera){
		this.nombre = disquera;
	}
	/**
	 * @return the identifiacdor
	 */
	public int getIdentifiacdor() {
		return identifiacdor;
	}

	/**
	 * @param identifiacdor the identifiacdor to set
	 */
	public void setIdentifiacdor(int identifiacdor) {
		this.identifiacdor = identifiacdor;
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
	@Override
	public String toString() {
		return "Disquera [identifiacdor=" + identifiacdor + ", nombre=" + nombre + "]";
	}
	
}
