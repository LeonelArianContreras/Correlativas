package correlatividad;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombreMateria; // Agregado nomas
    private String codigo; // Agregado nomas
    private boolean esDePrimerAnio;
    private final List<Materia> correlativas;

    public Materia(String nombreMateria, String codigo, boolean esDePrimerAnio, List<Materia> correlativas) {
        this.nombreMateria = nombreMateria;
        this.codigo = codigo;
        this.esDePrimerAnio = esDePrimerAnio;
        this.correlativas = esDePrimerAnio? new ArrayList<Materia>() : correlativas;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }
}