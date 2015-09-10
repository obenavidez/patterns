package structural.bridge;

public class FormularioMatriculacionEspaña extends FormularioMatriculacion {

	public FormularioMatriculacionEspaña(FormularioImpl formularioImpl) {
		super(formularioImpl);
	}

	@Override
	protected boolean controlZona(String matricula) {
		return matricula.length() == 7;
	}

}
