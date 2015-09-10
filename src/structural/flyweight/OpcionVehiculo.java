package structural.flyweight;

public class OpcionVehiculo {

	protected String nombre;
	protected String descripcion;
	protected int precioEstandar;

	/**
	 * @param nombre
	 * @param descripcion
	 * @param precioEstandar
	 */
	public OpcionVehiculo(String nombre) {
		super();
		this.nombre = nombre;
		this.descripcion = "Descripci�n de ".concat(nombre);
		this.precioEstandar = 100;
	}

	public void visualiza(int precioVenta) {
		System.out.println("Opci�n");
		System.out.println("Nombre: ".concat(this.nombre));
		System.out.println(this.descripcion);
		System.out.println("Precio estandar: ".concat(String
				.valueOf(this.precioEstandar)));
		System.out.println("Precio de Venta: ".concat(String
				.valueOf(precioVenta)));
	}

}
