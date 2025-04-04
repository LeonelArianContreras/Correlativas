package test.integracion;

import correlatividad.Alumno;
import correlatividad.Materia;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class InscripcionTest {
    private final Materia algoritmos = new Materia("Algoritmos y Estructuras Discretas",
            "ABC2005", true, null);
    private final Materia discretas = new Materia("Discretas", "ABD2005",
            true, null);

    private final List<Materia> correlativasSSL = List.of(algoritmos, discretas);
    private final Materia sintaxis = new Materia("Sintaxis", "CCD2001",
            false, correlativasSSL);

    private final List<Materia> correlativasPdeP = List.of(algoritmos, discretas);
    private final Materia pdep = new Materia("Paradigmas de Programacion",
            "ABX2005", false, correlativasPdeP);

    private final List<Materia> correlativasDSI = List.of(algoritmos, pdep);
    private final Materia dsi = new Materia("DSI", "ABX2001",
            false, correlativasDSI);

    private final List<Materia> materiasAprobadasDeLeo = List.of(algoritmos, pdep);
    private final List<Materia> materiasAprobadasDeNico = List.of(algoritmos);
    private final List<Materia> materiasAprobadasDeMatundo = List.of(algoritmos, sintaxis);

    private Alumno leonel = new Alumno("Leonel Contreras", "213.613-2", materiasAprobadasDeLeo);
    private Alumno nicolas = new Alumno("Nicolas Cahue", "213.614-2", materiasAprobadasDeNico);
    private Alumno matundo = new Alumno("Facundo Cao", "213.616-2", materiasAprobadasDeMatundo);

    @Test
    public void inscripcionDSIAceptada() {
        leonel.preinscribirseA(dsi);
        assertTrue(leonel.getMateriasInscriptas().contains(dsi));
    }

    @Test
    public void inscripcionDSIRechazada() {
        nicolas.preinscribirseA(dsi);
        assertFalse(nicolas.getMateriasInscriptas().contains(dsi));
    }

    @Test
    public void inscripcionDSIRechazada2() {
        matundo.preinscribirseA(dsi);
        assertFalse(matundo.getMateriasAprobadas().contains(dsi));
    }

}