package correlatividad;

public class Inscripcion {

    public static boolean aprobada(Materia unaMateria, Alumno unAlumno) {
        return unAlumno.tieneCorrelativasAprobadas(unaMateria.getCorrelativas());
    }
}