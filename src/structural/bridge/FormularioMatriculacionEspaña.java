package structural.bridge;

public class FormularioMatriculacionEspaņa extends FormularioMatriculacion {

	public FormularioMatriculacionEspaņa(FormularioImpl formularioImpl) {
		super(formularioImpl);
	}

	@Override
	protected boolean controlZona(String matricula) {
		return matricula.length() == 7;
	}

}
