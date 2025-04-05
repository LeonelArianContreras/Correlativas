package correlatividad;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombre; // Agregado
    private final boolean esDePrimerAnio;
    private final List<Materia> correlativas;

    public Materia(String nombre, boolean esDePrimerAnio, List<Materia> correlativas) {
        this.nombre = nombre;
        this.esDePrimerAnio = esDePrimerAnio;
        this.correlativas = esDePrimerAnio? new ArrayList<>() : correlativas;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

}