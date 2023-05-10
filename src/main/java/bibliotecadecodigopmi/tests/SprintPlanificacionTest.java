package bibliotecadecodigopmi.tests;

import bibliotecadecodigopmi.scrumlibrary.SprintPlanificacion;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SprintPlanificacionTest {
    @org.junit.jupiter.api.Test
    void getEntregables() {
        ArrayList<String> entregables = new ArrayList<>();
        entregables.add("Entregable 1");
        entregables.add("Entregable 2");
        SprintPlanificacion sprintPlanificacion = new SprintPlanificacion(1,"Objetivo",2,entregables,"Nombre");
        assertEquals(entregables,sprintPlanificacion.getEntregables());
    }
}