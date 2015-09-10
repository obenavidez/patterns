package creational.builder;

public class ConstructorDocumentacionVehiculoHtml extends
		ConstructorDocumentacionVehiculo {

	public ConstructorDocumentacionVehiculoHtml() {
		documentacion = new DocumentacionHtml();
	}

	@Override
	public void construyeSolicitudPedido(String nombreCliente) {
		String documento = "";
		documento = "<HTML> Solicitud de pedido de cliente: ".concat(
				nombreCliente).concat(" </HTML>");
		documentacion.agregarDocumento(documento);
	}

	@Override
	public void construyeSolicitudMatriculacion(String nombreSolicitante) {
		String documento = "";
		documento = "<HTML> Solicitud de matriculación solicitante: ".concat(
				nombreSolicitante).concat(" </HTML>");
		documentacion.agregarDocumento(documento);
	}

}
