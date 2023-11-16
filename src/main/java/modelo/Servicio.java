package modelo;

import java.util.List;
import java.util.Objects;

public class Servicio {
    private int idServicio;
    private String aplicacion;
    private String descripcion;
    private List<Cliente> serviciosContratados; // en la BD via la tabla Servicios_Contratados
    List<TipoProblema> tipoProblemas;

    public Servicio(int idServicio, String aplicacion, String descripcion, List<Cliente> serviciosContratados) {
        this.idServicio = idServicio;
        this.aplicacion = aplicacion;
        this.descripcion = descripcion;
        this.serviciosContratados = serviciosContratados;
    }

    public Servicio(String aplicacion, String descripcion, List<Cliente> serviciosContratados) {
        this.aplicacion = aplicacion;
        this.descripcion = descripcion;
        this.serviciosContratados = serviciosContratados;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public String getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Cliente> getServiciosContratados() {
        return serviciosContratados;
    }

    public void setServiciosContratados(List<Cliente> serviciosContratados) {
        this.serviciosContratados = serviciosContratados;
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "idServicio=" + idServicio +
                ", aplicacion='" + aplicacion + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Servicio servicio = (Servicio) o;
        return idServicio == servicio.idServicio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idServicio);
    }
}
