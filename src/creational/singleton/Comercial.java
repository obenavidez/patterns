package creational.singleton;

public class Comercial {

	protected String nombre;
	protected String direccion;
	protected String email;

	private static Comercial _instance = null;

	private Comercial() {
	}

	public static Comercial Instance() {
		return (_instance == null) ? (_instance = new Comercial()) : _instance;
	}

	public void visualiza() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Dirección: " + direccion);
		System.out.println("Email: " + email);
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion
	 *            the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the _instance
	 */
	public static Comercial get_instance() {
		return _instance;
	}

	/**
	 * @param _instance
	 *            the _instance to set
	 */
	public static void set_instance(Comercial _instance) {
		Comercial._instance = _instance;
	}

}
