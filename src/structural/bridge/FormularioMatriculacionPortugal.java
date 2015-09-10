package structural.bridge;

public class FormularioMatriculacionPortugal extends FormularioMatriculacion {

	public FormularioMatriculacionPortugal(FormularioImpl formularioImpl) {
		super(formularioImpl);
	}

	@Override
	protected boolean controlZona(String matricula) {
		return matricula.length() == 6;
	}

}
