package correlatividad;

import java.util.Date;
import java.util.List;

public class Alumno {
    private String nombreAlumno; // Agregado
    private String legajo; // Agregado
    private List<Materia> materiasAprobadas;

    public Alumno(String nombreAlumno, String legajo, List<Materia> materiasAprobadas) {
        this.nombreAlumno = nombreAlumno;
        this.legajo = legajo;
        this.materiasAprobadas = materiasAprobadas;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public boolean puedoInscribirmeA(List<Materia> materiasParaInscribirse) {
        Inscripcion inscripcion = new Inscripcion(this, new Date(), materiasParaInscribirse);
        return inscripcion.aprobada();
    }

    public boolean tieneCorrelativasAprobadas(List<Materia> correlativas) {
        return materiasAprobadas.containsAll(correlativas);
    }
}