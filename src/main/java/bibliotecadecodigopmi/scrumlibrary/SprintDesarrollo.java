package bibliotecadecodigopmi.scrumlibrary;
public class SprintDesarrollo extends Sprint {

	private int puntosDeHistoria;

	/**
	 * 
	 * @param numero
	 * @param objetivo
	 * @param duracionEnSemanas
	 * @param puntosDeHistoria
	 * @param nombre
	 */
	public SprintDesarrollo(int numero, String objetivo, int duracionEnSemanas, int puntosDeHistoria, String nombre) {
		super(numero, objetivo, duracionEnSemanas, nombre);
		this.puntosDeHistoria = puntosDeHistoria;
	}
	public int getPuntosDeHistoria() {
		return puntosDeHistoria;
	}

	@Override
	public void ejecutar() {

	}
}