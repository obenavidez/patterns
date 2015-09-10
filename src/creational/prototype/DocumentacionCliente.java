package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class DocumentacionCliente extends Documentacion {

	public DocumentacionCliente(String informacion) {
		documentos = new ArrayList<Documento>();
		DocumentacionEnBlanco documentacionEnBlanco = DocumentacionEnBlanco
				.Instance();
		List<Documento> documentosEnBlanco = documentacionEnBlanco
				.getDocumentos();
		for (Documento document : documentosEnBlanco) {
			Documento copiaDocumento = document.duplica();
			copiaDocumento.rellena(informacion);
			documentos.add(copiaDocumento);
		}
	}

	public void visualiza() {
		for (Documento documento : documentos)
			documento.visualiza();
	}

	public void imprime() {
		for (Documento documento : documentos)
			documento.imprime();
	}

}
