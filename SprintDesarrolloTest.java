import com.example.bibliotecadecodigopmi.scrumlibrary.SprintDesarrollo;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SprintDesarrolloTest {
        @org.junit.jupiter.api.Test
        void getPuntosDeHistoria() {
            SprintDesarrollo sprintDesarrollo = new SprintDesarrollo(1,"Objetivo",2,2,"Nombre");
            assertEquals(2,sprintDesarrollo.getPuntosDeHistoria());
        }
}