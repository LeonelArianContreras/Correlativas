package test.integracion; // No se muy bien si con integracion refiere a esto, pero yo vendo humo

import correlatividad.Alumno;
import correlatividad.Materia;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class InscripcionDeAlternativaCompletaTest {
    // ToDo: Preguntar si hay que tomar en cuenta la repeticion de logica entre tests!
    private final Materia algoritmos = new Materia("AyED", true, null);
    private final Materia discretas = new Materia("LyED", true, null);
    private final Materia sypn = new Materia("SyPN", true, null);
    private final Materia ingles1 = new Materia("Ingles 1", true, null);
    private final Materia adc = new Materia("AdC", true, null);
    private final Materia ssl = new Materia("SSL", false, List.of(algoritmos, discretas));
    private final Materia ads = new Materia("AdS", false, List.of(sypn, discretas));
    private final Materia pdep = new Materia("PdeP", false, List.of(algoritmos, discretas));
    private final Materia dsi = new Materia("DSI", false, List.of(pdep, ads));
    private final Materia ssoo = new Materia("SSOO", false, List.of(adc));
    private final Materia bdd = new Materia("BdD", false, List.of(sypn, discretas));

    private final List<Materia> materiasAprobadasDeLeo = List.of(algoritmos, discretas,
            ads, pdep, sypn, adc);
    private final List<Materia> materiasAprobadasDeBurro = List.of(algoritmos, discretas,
            ads, pdep, sypn);
    private final List<Materia> materiasAInscribirse = List.of(dsi, bdd, ssl, ingles1, ssoo);

    @Test
    public void alternativaElegida() {
        Alumno alumno = new Alumno("Leonel", "213.613-2", materiasAprobadasDeLeo);
        assertTrue("Alternativa elegida satisfactoriamente!",
                alumno.puedoInscribirmeA(materiasAInscribirse));
    }

    @Test
    public void alternativaNoElegida() {
        Alumno alumnoBurro = new Alumno("NN", "213.613-3", materiasAprobadasDeBurro);
        assertFalse("Alternativa no elegida", alumnoBurro.puedoInscribirmeA(materiasAInscribirse));
    }

}