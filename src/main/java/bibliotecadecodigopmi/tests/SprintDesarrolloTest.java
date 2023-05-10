package bibliotecadecodigopmi.tests;
import bibliotecadecodigopmi.scrumlibrary.SprintDesarrollo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SprintDesarrolloTest {
    @Test
    void getPuntosDeHistoria() {
        SprintDesarrollo sprintDesarrollo = new SprintDesarrollo(1,"Objetivo",2,2,"Nombre");
        assertEquals(2,sprintDesarrollo.getPuntosDeHistoria());
    }
}