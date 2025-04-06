package test.unitarios;

import correlatividad.Alumno;
import correlatividad.Materia;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InscripcionAMateriaDePrimerAnio {

    private Materia algoritmos = new Materia("AyED", true, null);

    @Test
    @DisplayName("El Alumno Puede Anotarse A Una Materia Que No Tiene Correlativas")
    public void alumnoPuedeAnotarseAMateriaSinCorrelativa() {
        Alumno alumno = new Alumno("Leonel", "213.613-2", new ArrayList<>());
        Assertions.assertTrue(alumno.puedoInscribirmeA(List.of(algoritmos)),
                "Alumno puede anotarse a materias de primer anio");
    }

}