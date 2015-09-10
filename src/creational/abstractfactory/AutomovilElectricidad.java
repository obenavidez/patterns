package creational.abstractfactory;

public class AutomovilElectricidad extends Automovil {

	public AutomovilElectricidad(String modelo, String color, int potencia,
			double espacio) {
		super(modelo, color, potencia, espacio);
	}

	@Override
	public void mostrarCarateristicas() {
		System.out.println("Automovil electrico de modelo: " + modelo
				+ " de color: " + color + " de potencia: " + potencia
				+ " de espacio: " + espacio);
	}

}
