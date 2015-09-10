package structural.bridge;

public class FormularioMatriculacionEspa�a extends FormularioMatriculacion {

	public FormularioMatriculacionEspa�a(FormularioImpl formularioImpl) {
		super(formularioImpl);
	}

	@Override
	protected boolean controlZona(String matricula) {
		return matricula.length() == 7;
	}

}
