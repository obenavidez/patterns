package structural.composite;

public class EmpresaSinFilial extends Empresa {

	@Override
	public double calculaCosteMantenimiento() {
		return nVehiculos * costeUnitarioVehiculo;
	}

	@Override
	public boolean agregaFilial(Empresa filial) {
		return false;
	}

}
