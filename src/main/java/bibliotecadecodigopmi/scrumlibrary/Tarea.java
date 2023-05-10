package bibliotecadecodigopmi.scrumlibrary;
import java.util.*;

public class Tarea {

	private String Nombre;
	private java.time.LocalDate FechaDeInicio;
	private java.time.LocalDate FechaDeTerminado;
	private String Descripcion;
	private Collection<Recurso> recursos;

	public String getNombre() {
		return this.Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	public java.time.LocalDate getFechaDeInicio() {
		return this.FechaDeInicio;
	}

	public void setFechaDeInicio(java.time.LocalDate FechaDeInicio) {
		this.FechaDeInicio = FechaDeInicio;
	}

	public java.time.LocalDate getFechaDeTerminado() {
		return this.FechaDeTerminado;
	}

	public void setFechaDeTerminado(java.time.LocalDate FechaDeTerminado) {
		this.FechaDeTerminado = FechaDeTerminado;
	}

	public String getDescripcion() {
		return this.Descripcion;
	}

	public void setDescripcion(String Descripcion) {
		this.Descripcion = Descripcion;
	}

	/**
	 * 
	 * @param Nombre
	 * @param FechaDeInicio
	 * @param FechaDeTerminado
	 * @param Descripcion
	 */
	public Tarea(String Nombre, java.time.LocalDate FechaDeInicio, java.time.LocalDate FechaDeTerminado, String Descripcion) {
		this.Nombre = Nombre;
		this.FechaDeInicio = FechaDeInicio;
		this.FechaDeTerminado = FechaDeTerminado;
		this.Descripcion = Descripcion;
	}

	/**
	 * 
	 * @param recurso
	 */
	public void setResources(Recurso recurso) {
		// TODO - implement Tarea.setResources
		throw new UnsupportedOperationException();
	}

	public java.util.List<Recurso> getResources() {
		// TODO - implement Tarea.getResources
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		// TODO - implement Tarea.toString
		throw new UnsupportedOperationException();
	}

}