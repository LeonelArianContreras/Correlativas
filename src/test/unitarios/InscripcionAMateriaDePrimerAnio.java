package test.unitarios;

import correlatividad.Alumno;
import correlatividad.Materia;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class InscripcionAMateriaDePrimerAnio {

    private Materia algoritmos = new Materia("AyED", true, null);

    @Test
    public void alumnoPuedeAnotarseAMateriaSinCorrelativa() {
        Alumno alumno = new Alumno("Leonel", "213.613-2", new ArrayList<>());
        assertTrue("Alumno puede anotarse a materias de primer anio",
                alumno.puedoInscribirmeA(List.of(algoritmos)));
    }

}