package structural.bridge;

public abstract class FormularioMatriculacion {

	protected String contenido;
	protected FormularioImpl implementacion;

	/**
	 * @param formularioImpl
	 */
	public FormularioMatriculacion(FormularioImpl formularioImpl) {
		this.implementacion = formularioImpl;
	}

	public void visualiza() {
		implementacion.dibujaTexto("número de matrícula existente: ");
	}

	public void generaDocumento() {
		implementacion.dibujaTexto("Solicitud de Matriculación ");
		implementacion.dibujaTexto("Número de matrícula ".concat(contenido));
	}

	public boolean administraZona() {
		contenido = implementacion.administraZonaIndicada();
		return this.controlZona(contenido);
	}

	protected abstract boolean controlZona(String matricula);

}
