package structural.bridge;

public class Usuario {

	public static void main(String[] args) {
		FormularioMatriculacionPortugal foamulario1 = new FormularioMatriculacionPortugal(
				new FormHtmlImpl());
		foamulario1.visualiza();
		if (foamulario1.administraZona()) {
			foamulario1.generaDocumento();
		}
		System.out.println();
		FormularioMatriculacionEspaña formulario2 = new FormularioMatriculacionEspaña(
				new FormAppletImpl());
		formulario2.visualiza();
		if (formulario2.administraZona()) {
			formulario2.generaDocumento();
		}
	}

}
