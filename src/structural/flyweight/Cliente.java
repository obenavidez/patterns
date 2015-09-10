package structural.flyweight;

public class Cliente {

	public static void main(String[] args) {
		FabricaOpcion fabrica = new FabricaOpcion();
		VehiculoSolicitado vehiculo = new VehiculoSolicitado();
		vehiculo.agregarOpciones("air bag", 80, fabrica);
		vehiculo.agregarOpciones("direccion asistida", 90, fabrica);
		vehiculo.agregarOpciones("elevalunas eléctrico", 85, fabrica);
		vehiculo.muestraOpciones();
	}

}
