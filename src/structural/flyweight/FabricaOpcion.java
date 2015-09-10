package structural.flyweight;

import java.util.Map;
import java.util.TreeMap;

public class FabricaOpcion {

	protected Map<String, OpcionVehiculo> opciones = new TreeMap<String, OpcionVehiculo>();

	public OpcionVehiculo getOpcion(String nombre) {
		OpcionVehiculo resultado;
		if (opciones.containsKey(nombre)) {
			return opciones.get(nombre);
		} else {
			resultado = new OpcionVehiculo(nombre);
			opciones.put(nombre, resultado);
		}
		return resultado;
	}

}
