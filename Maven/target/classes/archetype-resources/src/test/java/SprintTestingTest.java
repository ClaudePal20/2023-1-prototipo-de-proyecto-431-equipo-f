package com.example.bibliotecadecodigopmi;

import com.example.bibliotecadecodigopmi.scrumlibrary.SprintTesting;

import static org.junit.jupiter.api.Assertions.*;

class SprintTestingTest {
    @org.junit.jupiter.api.Test
    void getNumeroDeErrores() {
        SprintTesting sprintTesting = new SprintTesting(1,"Objetivo",2,2,"Nombre");
        assertEquals(2,sprintTesting.getCasosDePrueba());
    }
}