import com.example.bibliotecadecodigopmi.scrumlibrary.SprintPlanificacion;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SprintPlanificacionTest {

    @Test
    void getEntregables() {
        ArrayList<String> entregables = new ArrayList<>();
        entregables.add("Entregable 1");
        entregables.add("Entregable 2");
        SprintPlanificacion sprintPlanificacion = new SprintPlanificacion(1,"Objetivo",2,entregables,"Nombre");
        assertEquals(entregables,sprintPlanificacion.getEntregables());
    }

}