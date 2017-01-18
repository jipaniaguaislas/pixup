/**
 * 
 */
package mx.unam.dgscati.pixup.model;

/**
 * @author JAVA
 *
 */
public class Domicilio {

	private int identifiacdor;
	private String calle;
	private String numeroExterior;
	private String numeroInterior;
	private Usuario usuario;
	private Colonia colonia;
	private TipoDomicilio tipoDomicilio;
	
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
	 * @return the calle
	 */
	public String getCalle() {
		return calle;
	}
	/**
	 * @param calle the calle to set
	 */
	public void setCalle(String calle) {
		this.calle = calle;
	}
	/**
	 * @return the numeroExterior
	 */
	public String getNumeroExterior() {
		return numeroExterior;
	}
	/**
	 * @param numeroExterior the numeroExterior to set
	 */
	public void setNumeroExterior(String numeroExterior) {
		this.numeroExterior = numeroExterior;
	}
	/**
	 * @return the numeroInterior
	 */
	public String getNumeroInterior() {
		return numeroInterior;
	}
	/**
	 * @param numeroInterior the numeroInterior to set
	 */
	public void setNumeroInterior(String numeroInterior) {
		this.numeroInterior = numeroInterior;
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
	 * @return the colonia
	 */
	public Colonia getColonia() {
		return colonia;
	}
	/**
	 * @param colonia the colonia to set
	 */
	public void setColonia(Colonia colonia) {
		this.colonia = colonia;
	}
	/**
	 * @return the tipoDomicilio
	 */
	public TipoDomicilio getTipoDomicilio() {
		return tipoDomicilio;
	}
	/**
	 * @param tipoDomicilio the tipoDomicilio to set
	 */
	public void setTipoDomicilio(TipoDomicilio tipoDomicilio) {
		this.tipoDomicilio = tipoDomicilio;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Domicilio [identifiacdor=" + identifiacdor + ", calle=" + calle + ", numeroExterior=" + numeroExterior
				+ ", numeroInterior=" + numeroInterior + ", usuario=" + usuario + ", colonia=" + colonia
				+ ", tipoDomicilio=" + tipoDomicilio + "]";
	}
	
	
}
