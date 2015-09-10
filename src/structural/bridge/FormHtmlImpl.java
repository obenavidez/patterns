package structural.bridge;

import java.util.Scanner;

public class FormHtmlImpl implements FormularioImpl {

	Scanner reader = new Scanner(System.in);

	@Override
	public void dibujaTexto(String texto) {
		System.out.println("HTML: ".concat(texto));
	}

	@Override
	public String administraZonaIndicada() {
		return reader.next();
	}

}
