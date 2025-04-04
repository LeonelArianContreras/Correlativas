package test.unitarios;

import correlatividad.Materia;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotNull;

public class MateriaSinCorrelativasTest {
    private Materia algoritmos = new Materia("Algoritmos y Estructuras Discretas",
            "ABC2005", true, null);

    @Test
    public void materiaSinCorrelativaSeInstancia() {
        assertNotNull(algoritmos);
    }

}