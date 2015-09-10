package behavioral.chainofresponsability;

public class Vehiculo extends ObjetoBasico {

	protected String descripcion;

	/**
	 * @param descripcion
	 */
	public Vehiculo(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	protected String getDescripcion() {
		return descripcion;
	}

}
