package org.scrumlibrary;

public abstract class Sprint {

	protected int numero;
	protected String objetivo;
	protected int duracionEnSemanas;
	protected String nombre;

	public Sprint(int numero, String objetivo, int duracionEnSemanas, String nombre) {
		this.numero = numero;
		this.objetivo = objetivo;
		this.duracionEnSemanas = duracionEnSemanas;
		this.nombre = nombre;
	}

	public abstract void ejecutar();

}