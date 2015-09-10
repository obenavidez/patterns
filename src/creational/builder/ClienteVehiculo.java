package creational.builder;

import java.util.Scanner;

public class ClienteVehiculo {

	public static void main(String [] args) {
		Scanner reader = new Scanner(System.in);
		ConstructorDocumentacionVehiculo constructor;
		System.out.println("Desea generar documento PDF(1) o HTML(2): ");
		String seleccion = reader.next();
		if(seleccion.equals("1"))
			constructor = new ConstructorDocumentacionVehiculoPdf();
		else
			constructor = new ConstructorDocumentacionVehiculoHtml();
		Vendedor vendedor = new Vendedor(constructor);
		Documentacion documentacion = vendedor.construye("Martin");
		documentacion.imprime();
		reader.close();
	}

}
