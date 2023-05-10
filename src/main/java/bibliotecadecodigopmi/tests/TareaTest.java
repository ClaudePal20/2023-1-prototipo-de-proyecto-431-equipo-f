package bibliotecadecodigopmi.tests;
import bibliotecadecodigopmi.scrumlibrary.Tarea;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TareaTest {
    @Test
    void getNombreTest() {
        LocalDate fecha = LocalDate.now();
        LocalDate fecha2 = LocalDate.now();
        Tarea tarea = new Tarea("Nombre",fecha,fecha2,"Descripcion");
        tarea.setNombre("Nombre2");
        assertEquals("Nombre2",tarea.getNombre());
    }
    @Test
    void getFechaDeTerminadoTest(){
        LocalDate fecha = LocalDate.now();
        LocalDate fecha2 = LocalDate.now();
        LocalDate fecha3 = LocalDate.now();
        Tarea tarea = new Tarea("Nombre",fecha,fecha2,"Descripcion");
        assertEquals(fecha3,tarea.getFechaDeTerminado());
    }
    @Test
    void getDescripcionTest() {
        LocalDate fecha = LocalDate.now();
        LocalDate fecha2 = LocalDate.now();
        Tarea tarea = new Tarea("Nombre",fecha,fecha2,"Descripcion");
        assertEquals("Descripcion",tarea.getDescripcion());
    }
}