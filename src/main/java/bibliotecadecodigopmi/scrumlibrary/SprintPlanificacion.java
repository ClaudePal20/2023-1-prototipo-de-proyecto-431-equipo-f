package bibliotecadecodigopmi.scrumlibrary;

import java.util.ArrayList;

public class SprintPlanificacion extends Sprint {

	/**
	 * Aqui van los productos a entregar al final o bien las funcionalidades o requerimientos
	 * a crear
	 */
	private ArrayList<String> entregables;

	/**
	 * 
	 * @param numero
	 * @param objetivo
	 * @param duracionEnSemanas
	 * @param entregables
	 * @param nombre
	 */
	public SprintPlanificacion(int numero, String objetivo, int duracionEnSemanas, ArrayList<String> entregables, String nombre) {
		super(numero, objetivo, duracionEnSemanas, nombre);
		this.entregables = entregables;
	}

	public ArrayList<String> getEntregables() {
		return entregables;
	}

	@Override
	public void ejecutar() {

	}
}