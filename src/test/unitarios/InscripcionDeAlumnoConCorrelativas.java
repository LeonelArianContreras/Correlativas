package test.unitarios;

import correlatividad.Alumno;
import correlatividad.Materia;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InscripcionDeAlumnoConCorrelativas {

    private final Materia algoritmos = new Materia("AyED", true, null);
    private final Materia discretas = new Materia("LyED", true, null);
    private final Materia pdep = new Materia("PdeP", false, List.of(algoritmos, discretas));

    @Test
    public void alumnoPuedeAnotarseAMateriaSinCorrelativa() {
        Alumno alumno = new Alumno("Leonel", "213.613-2", List.of(algoritmos, discretas));
        Assertions.assertTrue(alumno.puedoInscribirmeA(List.of(pdep)),
                "Alumno con las correlativas necesarias puede anotarse a una materia");
    }

}