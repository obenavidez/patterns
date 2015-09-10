package creational.factorymethod;

public class Usuario {
  
	public static void main(String[] args) {
		Cliente cliente;
		cliente = new ClienteContado();
		cliente.nuevoPedido(2000.00);
		cliente.nuevoPedido(1000.00);
		cliente = new ClienteCredito();
		cliente.nuevoPedido(2000.00);
		cliente.nuevoPedido(1000.00);
	}

}
