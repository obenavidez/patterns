package creational.builder;

public class Vendedor {

	protected ConstructorDocumentacionVehiculo constructor;
	/**
	 * @param constructor
	 */
	public Vendedor(ConstructorDocumentacionVehiculo constructor) {
		this.constructor = constructor;
	}

	public Documentacion construye(String nombreCliente) {
		constructor.construyeSolicitudPedido(nombreCliente);
		constructor.construyeSolicitudMatriculacion(nombreCliente);
		return constructor.resultado();
	}

}
