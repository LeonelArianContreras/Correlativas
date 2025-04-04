package correlatividad;

import java.util.ArrayList;
import java.util.List;

import static correlatividad.Inscripcion.aprobada;

public class Alumno {
    private String nombreAlumno; // Agregado
    private String legajo; // Agregado
    private List<Materia> materiasAprobadas;
    private List<Materia> materiasInscriptas;

    public Alumno(String nombreAlumno, String legajo, List<Materia> materiasAprobadas) {
        this.nombreAlumno = nombreAlumno;
        this.legajo = legajo;
        this.materiasAprobadas = materiasAprobadas;
        this.materiasInscriptas = new ArrayList<Materia>();
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public List<Materia> getMateriasInscriptas() {
        return materiasInscriptas;
    }

    public void preinscribirseA(Materia unaMateria) {
        if(aprobada(unaMateria, this))
            materiasInscriptas.add(unaMateria);
        else
            System.out.println("El alumno " + nombreAlumno + " no cumple con las condiciones.");
    }

    public boolean tieneCorrelativasAprobadas(List<Materia> correlativas) {
        if(materiasAprobadas.isEmpty())
            return false;
        return materiasAprobadas.containsAll(correlativas);
    }

}