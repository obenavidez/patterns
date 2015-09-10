package creational.abstractfactory;

import java.util.Scanner;

public class Catalogo {

	public static int nAutos = 3;
	public static int nScooters = 2;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		FabricaVehiculo fabrica;
		Automovil[] autos = new Automovil[nAutos];
		Scooter[] scooters = new Scooter[nScooters];
		System.out.print("Seleccione el tipo de vehiculos a crear ");
		System.out.print(" 1 - Electricos ");
		System.out.print(" 2 - Gasolina ");
		String seleccion = reader.next();
		if (seleccion.equals("1")) {
			fabrica = new FabricaVehiculoEletricidad();
		} else {
			fabrica = new FabricaVehiculoGasolina();
		}
		for (int i = 0; i < nAutos; i++) {
			autos[i] = fabrica.creaAutomovil("estandar", "amarillo", (6 + i),
					3.2);
		}
		for (int i = 0; i < nScooters; i++) {
			scooters[i] = fabrica.creaScooter("clásico", "rojo", (2 + i));
		}
		for (Automovil auto : autos)
			auto.mostrarCarateristicas();
		for (Scooter scooter : scooters)
			scooter.mostrarCarateristicas();
	}

}
