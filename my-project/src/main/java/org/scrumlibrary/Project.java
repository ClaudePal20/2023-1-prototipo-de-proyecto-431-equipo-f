package org.scrumlibrary;

import java.util.Collection;
import java.util.Date;
import java.util.List;

public class Project {

	private String nombre;
	private java.time.LocalDate FechaDeInicio;
	private java.time.LocalDate FechaDeTerminado;
	private String presupuesto;
	private String ManagerDeProyecto;
	private List<String> sprints;
	private Collection<Tarea> tareas;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setFechaDeInicio(java.time.LocalDate FechaDeInicio) {
		this.FechaDeInicio = FechaDeInicio;
	}

	public void setFechaDeTerminado(java.time.LocalDate FechaDeTerminado) {
		this.FechaDeTerminado = FechaDeTerminado;
	}

	public String getPresupuesto() {
		return this.presupuesto;
	}

	public String getManagerDeProyecto() {
		return this.ManagerDeProyecto;
	}

	public Collection<Tarea> getTareas() {
		return this.tareas;
	}

	public void setTareas(Collection<Tarea> tareas) {
		this.tareas = tareas;
	}

	/**
	 * 
	 * @param nombre
	 * @param FechaDeInicio
	 * @param FechaDeTerminado
	 * @param tareas
	 * @param presupuesto
	 * @param ManagerDeProyecto
	 */
	public Project(String nombre, java.time.LocalDate FechaDeInicio, java.time.LocalDate FechaDeTerminado, List<Tarea> tareas, String presupuesto, String ManagerDeProyecto) {
		// TODO - implement Project.Project
		throw new UnsupportedOperationException();
	}

	public Date getFechaDeInicio() {
		// TODO - implement Project.getFechaDeInicio
		throw new UnsupportedOperationException();
	}

	public Date getFechaDeTerminado() {
		// TODO - implement Project.getFechaDeTerminado
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nombre
	 * @param FechaDeInicio
	 * @param FechaDeTerminado
	 * @param Descripcion
	 */
	public void createTarea(String nombre, java.time.LocalDate FechaDeInicio, java.time.LocalDate FechaDeTerminado, String Descripcion) {
		// TODO - implement Project.createTarea
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param tarea
	 */
	public void addTarea(Tarea tarea) {
		// TODO - implement Project.addTarea
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param tarea
	 */
	public void removeTarea(Tarea tarea) {
		// TODO - implement Project.removeTarea
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		// TODO - implement Project.toString
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param task
	 */
	public void agregarTarea(Tarea task) {
		// TODO - implement Project.agregarTarea
		throw new UnsupportedOperationException();
	}

	public List<String> getSprintsFases() {
		// TODO - implement Project.getSprintsFases
		throw new UnsupportedOperationException();
	}

}