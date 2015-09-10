package creational.abstractfactory;

public abstract class Automovil {

	protected String modelo;
	protected String color;
	protected int potencia;
	protected double espacio;

	/**
	 * @param modelo
	 * @param color
	 * @param potencia
	 * @param espacio
	 */
	public Automovil(String modelo, String color, int potencia, double espacio) {
		super();
		this.modelo = modelo;
		this.color = color;
		this.potencia = potencia;
		this.espacio = espacio;
	}

	public abstract void mostrarCarateristicas();
}
