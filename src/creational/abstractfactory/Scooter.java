package creational.abstractfactory;

public abstract class Scooter {

	protected String modelo;
	protected String color;
	protected int potencia;

	/**
	 * @param modelo
	 * @param color
	 * @param potencia
	 */
	public Scooter(String modelo, String color, int potencia) {
		super();
		this.modelo = modelo;
		this.color = color;
		this.potencia = potencia;
	}

	public abstract void mostrarCarateristicas();
}
