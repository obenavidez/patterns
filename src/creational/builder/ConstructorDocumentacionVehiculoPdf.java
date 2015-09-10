package creational.builder;

public class ConstructorDocumentacionVehiculoPdf extends
		ConstructorDocumentacionVehiculo {

	public ConstructorDocumentacionVehiculoPdf() {
		documentacion = new DocumentacionPdf();
	}

	@Override
	public void construyeSolicitudPedido(String nombreCliente) {
		String documento = "";
		documento = "<PDF> Solicitud de pedido del cliente: ".concat(
				nombreCliente).concat(" </PDF>");
		documentacion.agregarDocumento(documento);
	}

	@Override
	public void construyeSolicitudMatriculacion(String nombreSolicitante) {
		String documento = "";
		documento = "<PDF> Solicitud de matriculación solicitante: ".concat(
				nombreSolicitante).concat(" </PDF>");
		documentacion.agregarDocumento(documento);
	}

}
