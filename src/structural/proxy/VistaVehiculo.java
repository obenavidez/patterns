package structural.proxy;

public class VistaVehiculo {

	public static void main(String[] args) {
		Animacion animacion = new AnimacionProxy();
		animacion.dibuja();
		animacion.clic();
		animacion.dibuja();
	}

}
