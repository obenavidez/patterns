package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class VehiculoSolicitado {

	protected List<OpcionVehiculo> opciones = new ArrayList<>();
	protected List<Integer> precioDeventaOpciones = new ArrayList<>();

	public void agregarOpciones(String nombre, int precioVenta,
			FabricaOpcion fabrica) {
		opciones.add(fabrica.getOpcion(nombre));
		precioDeventaOpciones.add(precioVenta);
	}

	public void muestraOpciones() {
		int indice, tamaño;
		tamaño = opciones.size();
		for (indice = 0; indice < tamaño; indice++) {
			opciones.get(indice).visualiza(precioDeventaOpciones.get(indice));
			System.out.println();
		}
	}

}
