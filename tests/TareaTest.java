package tests;

import com.example.bibliotecadecodigopmi.scrumlibrary.Tarea;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class TareaTest {

    @org.junit.jupiter.api.Test
    void getNombreTest() {
        LocalDate fecha = LocalDate.now();
        LocalDate fecha2 = LocalDate.now();
        Tarea tarea = new Tarea("Nombre",fecha,fecha2,"Descripcion");
        tarea.setNombre("Nombre2");
        assertEquals("Nombre2",tarea.getNombre());
    }

    @org.junit.jupiter.api.Test
    void getFechaDeTerminadoTest(){
        LocalDate fecha = LocalDate.now();
        LocalDate fecha2 = LocalDate.now();
        LocalDate fecha3 = LocalDate.now();
        Tarea tarea = new Tarea("Nombre",fecha,fecha2,"Descripcion");
        assertEquals(fecha3,tarea.getFechaDeTerminado());
    }

    @org.junit.jupiter.api.Test
    void getDescripcionTest() {
        LocalDate fecha = LocalDate.now();
        LocalDate fecha2 = LocalDate.now();
        Tarea tarea = new Tarea("Nombre",fecha,fecha2,"Descripcion");
        assertEquals("Descripcion",tarea.getDescripcion());
    }


}