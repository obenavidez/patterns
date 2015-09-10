package structural.proxy;

public class Video implements Animacion {

	@Override
	public void dibuja() {
		System.out.println("Dibuja el video");
	}

	public void carga() {
		System.out.println("Carga el video");
	}

	public void reproduce() {
		System.out.println("Reproduce el video");
	}

	@Override
	public void clic() {
	}
}
