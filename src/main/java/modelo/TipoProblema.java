package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TipoProblema {
    private int idTipoProblema;
    private String problema;
    private String descripcion;
    private int tiempoMaxResolucion; // en horas
    private Servicio servicio; // en la BD vinculado por idServicio
    private List<Especialidad> tipoProblemaResueltoPorEspecialidad; // en la BD usa la tabla tipoproblema_resuelto_por_Especialidad

    public TipoProblema(int idTipoProblema, String problema, String descripcion,
                        int tiempoMaxResolucion, Servicio servicio, List<Especialidad> tipoProblemaResueltoPorEspecialidad) {
        this.idTipoProblema = idTipoProblema;
        this.problema = problema;
        this.descripcion = descripcion;
        this.tiempoMaxResolucion = tiempoMaxResolucion;
        this.servicio = servicio;
        this.tipoProblemaResueltoPorEspecialidad = tipoProblemaResueltoPorEspecialidad;
    }

    public TipoProblema(String problema, String descripcion, int tiempoMaxResolucion,
                        Servicio servicio, List<Especialidad> tipoProblemaResueltoPorEspecialidad) {
        this.problema = problema;
        this.descripcion = descripcion;
        this.tiempoMaxResolucion = tiempoMaxResolucion;
        this.servicio = servicio;
        this.tipoProblemaResueltoPorEspecialidad = tipoProblemaResueltoPorEspecialidad;
    }

    public TipoProblema(String problema, String descripcion, int tiempoMaxResolucion,
                        Servicio servicio) {
        this.problema = problema;
        this.descripcion = descripcion;
        this.tiempoMaxResolucion = tiempoMaxResolucion;
        this.servicio = servicio;
        this.tipoProblemaResueltoPorEspecialidad = new ArrayList<Especialidad>();
    }

    public int getIdTipoProblema() {
        return idTipoProblema;
    }

    public void setIdTipoProblema(int idTipoProblema) {
        this.idTipoProblema = idTipoProblema;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTiempoMaxResolucion() {
        return tiempoMaxResolucion;
    }

    public void setTiempoMaxResolucion(int tiempoMaxResolucion) {
        this.tiempoMaxResolucion = tiempoMaxResolucion;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public List<Especialidad> getTipoProblemaResueltoPorEspecialidad() {
        return tipoProblemaResueltoPorEspecialidad;
    }

    public void setTipoProblemaResueltoPorEspecialidad(List<Especialidad> tipoProblemaResueltoPorEspecialidad) {
        this.tipoProblemaResueltoPorEspecialidad = tipoProblemaResueltoPorEspecialidad;
    }

    @Override
    public String toString() {
        return "TipoProblema{" +
                "idTipoProblema=" + idTipoProblema +
                ", problema='" + problema + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tiempoMaxRsolucion=" + tiempoMaxResolucion +
                ", servicio=" + servicio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoProblema that = (TipoProblema) o;
        return idTipoProblema == that.idTipoProblema;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTipoProblema);
    }
}
