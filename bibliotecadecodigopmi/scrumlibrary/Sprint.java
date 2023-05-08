package com.example.bibliotecadecodigopmi.scrumlibrary;

public abstract class Sprint {

	protected int numero;
	protected String objetivo;
	protected int duracionEnSemanas;
	protected String nombre;

	/**
	 * 
	 * @param numero
	 * @param objetivo
	 * @param duracionEnSemanas
	 * @param nombre
	 */
	public Sprint(int numero, String objetivo, int duracionEnSemanas, String nombre) {
		// TODO - implement Sprint.Sprint
		throw new UnsupportedOperationException();
	}

	public abstract void ejecutar();

}