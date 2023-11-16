package modelo;

import java.util.List;
import java.util.Objects;

public class Especialidad {
    private int idEspecialidad;
    private String nombreEspecialidad;
    private String descripcion;
    private List<Tecnico> tecnicoTieneEspecialidad; // en la BD via la tabla Tecnico_tiene_Especialidad
    private List<TipoProblema> tipoProblemaResueltoPorEspecialidad; //en la BD via la tabla TipoProplema_resuelto_por_Especialidad

    public Especialidad(int idEspecialidad, String nombreEspecialidad, String descripcion, List<Tecnico> tecnicoTieneEspecialidad, List<TipoProblema> tipoProblemaResueltoPorEspecialidad) {
        this.idEspecialidad = idEspecialidad;
        this.nombreEspecialidad = nombreEspecialidad;
        this.descripcion = descripcion;
        this.tecnicoTieneEspecialidad = tecnicoTieneEspecialidad;
        this.tipoProblemaResueltoPorEspecialidad = tipoProblemaResueltoPorEspecialidad;
    }

    public Especialidad(String nombreEspecialidad, String descripcion, List<Tecnico> tecnicoTieneEspecialidad, List<TipoProblema> tipoProblemaResueltoPorEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
        this.descripcion = descripcion;
        this.tecnicoTieneEspecialidad = tecnicoTieneEspecialidad;
        this.tipoProblemaResueltoPorEspecialidad = tipoProblemaResueltoPorEspecialidad;
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Tecnico> getTecnicoTieneEspecialidad() {
        return tecnicoTieneEspecialidad;
    }

    public void setTecnicoTieneEspecialidad(List<Tecnico> tecnicoTieneEspecialidad) {
        this.tecnicoTieneEspecialidad = tecnicoTieneEspecialidad;
    }

    public List<TipoProblema> getTipoProblemaResueltoPorEspecialidad() {
        return tipoProblemaResueltoPorEspecialidad;
    }

    public void setTipoProblemaResueltoPorEspecialidad(List<TipoProblema> tipoProblemaResueltoPorEspecialidad) {
        this.tipoProblemaResueltoPorEspecialidad = tipoProblemaResueltoPorEspecialidad;
    }

    @Override
    public String toString() {
        return "Especialidad{" +
                "idEspecialidad=" + idEspecialidad +
                ", nombreEspecialidad='" + nombreEspecialidad + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Especialidad that = (Especialidad) o;
        return idEspecialidad == that.idEspecialidad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEspecialidad);
    }
}
