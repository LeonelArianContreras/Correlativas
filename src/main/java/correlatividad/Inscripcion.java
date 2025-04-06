package correlatividad;


import java.util.Date;
import java.util.List;

public class Inscripcion {
    private final Alumno alumno;
    private final Date fecha; // Agregado
    private final List<Materia> materiasInscriptas;

    public Inscripcion(Alumno alumno, Date fecha, List<Materia> materiasInscriptas) {
        this.alumno = alumno;
        this.fecha = fecha;
        this.materiasInscriptas = materiasInscriptas;
    }

    public boolean aprobada() {
        return cumpleTodaCorrelativaRequerida();
    }

    // Mapeo las materias a inscribirse en listas de sus correlativas
    public List<List<Materia>> correlativasCadaDeMateria() {
        return materiasInscriptas.stream().map(Materia::getCorrelativas).toList();
    }

    private boolean cumpleTodaCorrelativaRequerida() {
        return correlativasCadaDeMateria().stream().allMatch(alumno::tieneCorrelativasAprobadas);
    }

    public Date getFecha() {
        return fecha;
    }

}