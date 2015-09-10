package creational.factorymethod;

public abstract class Pedido {

	protected double importe = 0.00;

	/**
	 * @param importe
	 */
	public Pedido(double importe) {
		super();
		this.importe = importe;
	}

	public abstract boolean valida();

	public abstract void paga();

}
