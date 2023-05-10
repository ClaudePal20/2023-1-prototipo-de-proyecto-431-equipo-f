package bibliotecadecodigopmi.tests;
import bibliotecadecodigopmi.scrumlibrary.SprintTesting;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SprintTestingTest {
    @Test
    void getNumeroDeErrores() {
        SprintTesting sprintTesting = new SprintTesting(1,"Objetivo",2,2,"Nombre");
        assertEquals(2,sprintTesting.getCasosDePrueba());
    }
}