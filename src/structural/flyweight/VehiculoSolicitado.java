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
		int indice, tama�o;
		tama�o = opciones.size();
		for (indice = 0; indice < tama�o; indice++) {
			opciones.get(indice).visualiza(precioDeventaOpciones.get(indice));
			System.out.println();
		}
	}

}
