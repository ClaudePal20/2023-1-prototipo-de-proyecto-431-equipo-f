package com.example.bibliotecadecodigopmi.scrumlibrary;

public class SprintTesting extends Sprint {

	private int casosDePrueba;

	/**
	 * 
	 * @param numero
	 * @param objetivo
	 * @param duracionEnSemanas
	 * @param casosDePrueba
	 * @param nombre
	 */
	public SprintTesting(int numero, String objetivo, int duracionEnSemanas, int casosDePrueba, String nombre) {
		super(numero, objetivo, duracionEnSemanas, nombre);
		this.casosDePrueba = casosDePrueba;
	}

	public int getCasosDePrueba() {
		return casosDePrueba;
	}

	@Override
	public void ejecutar() {

	}
}