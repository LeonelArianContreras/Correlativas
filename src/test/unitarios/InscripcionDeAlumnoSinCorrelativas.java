package test.unitarios;

import correlatividad.Alumno;
import correlatividad.Materia;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;

public class InscripcionDeAlumnoSinCorrelativas {

    private final Materia algoritmos = new Materia("AyED", true, null);
    private final Materia discretas = new Materia("LyED", true, null);
    private final Materia pdep = new Materia("PdeP", false, List.of(algoritmos, discretas));
    private final Materia ads = new Materia("AdS", false, List.of(algoritmos)); // No tengo ganas de crear tantas materias
    private final Materia dsi = new Materia("DSI", false, List.of(pdep, ads));

    private final List<Materia> materiasAprobadasDeLeo = List.of(algoritmos, discretas, pdep);

    @Test
    public void alumnoPuedeAnotarseAMateriaSinCorrelativa() {
        Alumno alumno = new Alumno("Leonel", "213.613-2", materiasAprobadasDeLeo);
        assertFalse("Alumno con correlativas insuficientes no puede anotarse a una materia",
                alumno.puedoInscribirmeA(List.of(dsi)));
    }

}