package mx.unam.dgscati.pixup.model;

import java.util.Date;
import java.util.List;

public class Usuario {

	private int identificador;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String correoElectronico;
	private Date fechaNacimiento;
	private Catalogo preguntaSecreta;
	private String respuestaSecreta;
	private String contrasenia;
	private String login;
	private boolean estatus;
	private List<Perfil> perfiles;

	/**
	 * Constructor
	 */
	public Usuario() {
	}

	/**
	 * @param contrasenia
	 * @param login
	 */
	public Usuario(String login, String contrasenia) {
		this.login = login;
		this.contrasenia = contrasenia;
	}

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
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}

	/**
	 * @param primerApellido the primerApellido to set
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}

	/**
	 * @param segundoApellido the segundoApellido to set
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	/**
	 * @return the correoElectronico
	 */
	public String getCorreoElectronico() {
		return correoElectronico;
	}

	/**
	 * @param correoElectronico the correoElectronico to set
	 */
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the preguntaSecreta
	 */
	public Catalogo getPreguntaSecreta() {
		return preguntaSecreta;
	}

	/**
	 * @param preguntaSecreta the preguntaSecreta to set
	 */
	public void setPreguntaSecreta(Catalogo preguntaSecreta) {
		this.preguntaSecreta = preguntaSecreta;
	}

	/**
	 * @return the respuestaSecreta
	 */
	public String getRespuestaSecreta() {
		return respuestaSecreta;
	}

	/**
	 * @param respuestaSecreta the respuestaSecreta to set
	 */
	public void setRespuestaSecreta(String respuestaSecreta) {
		this.respuestaSecreta = respuestaSecreta;
	}

	/**
	 * @return the contrasenia
	 */
	public String getContrasenia() {
		return contrasenia;
	}

	/**
	 * @param contrasenia the contrasenia to set
	 */
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the estatus
	 */
	public boolean isEstatus() {
		return estatus;
	}

	/**
	 * @param estatus the estatus to set
	 */
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}

	/**
	 * @return the perfiles
	 */
	public List<Perfil> getPerfiles() {
		return perfiles;
	}

	/**
	 * @param perfiles the perfiles to set
	 */
	public void setPerfiles(List<Perfil> perfiles) {
		this.perfiles = perfiles;
	}

	/**
	 * Modelo Enriquecido, juega con los atributos, los pone en conjunto los datos crudos
	 */
	public String getNombreCompleto(int identificador) {
		
		return this.nombre.concat(this.primerApellido).concat(this.segundoApellido);
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Usuario [identificador=" + identificador + ", nombre=" + nombre + ", primerApellido=" + primerApellido
				+ ", segundoApellido=" + segundoApellido + ", correoElectronico=" + correoElectronico
				+ ", fechaNacimiento=" + fechaNacimiento + ", preguntaSecreta=" + preguntaSecreta
				+ ", respuestaSecreta=" + respuestaSecreta + ", contrasenia=" + contrasenia + ", login=" + login
				+ ", estatus=" + estatus + ", perfiles=" + perfiles + "]";
	}

}
