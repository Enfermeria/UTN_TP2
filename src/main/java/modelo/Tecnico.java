package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Tecnico {
    private int idTecnico;
    private String nombre;
    private String mail;
    private String whatsapp;
    private boolean prefiereMail;
    private List<Especialidad> tecnicoTieneEspecialidad; // en la BD usa Tecnico_tiene_especialidad

    public Tecnico(int idTecnico, String nombre, String mail, String whatsapp, boolean prefiereMail,
                   List<Especialidad> tecnicoTieneEspecialidad) {
        this.idTecnico = idTecnico;
        this.nombre = nombre;
        this.mail = mail;
        this.whatsapp = whatsapp;
        this.prefiereMail = prefiereMail;
        this.tecnicoTieneEspecialidad = tecnicoTieneEspecialidad;
    }

    public Tecnico(String nombre, String mail, String whatsapp, boolean prefiereMail,
                   List<Especialidad> tecnicoTieneEspecialidad) {
        this.nombre = nombre;
        this.mail = mail;
        this.whatsapp = whatsapp;
        this.prefiereMail = prefiereMail;
        this.tecnicoTieneEspecialidad = tecnicoTieneEspecialidad;
    }

    public Tecnico(String nombre, String mail, String whatsapp, boolean prefiereMail) {
        this.nombre = nombre;
        this.mail = mail;
        this.whatsapp = whatsapp;
        this.prefiereMail = prefiereMail;
        this.tecnicoTieneEspecialidad = new ArrayList<Especialidad>();
    }

    public int getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(int idTecnico) {
        this.idTecnico = idTecnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public boolean isPrefiereMail() {
        return prefiereMail;
    }

    public void setPrefiereMail(boolean prefiereMail) {
        this.prefiereMail = prefiereMail;
    }

    public List<Especialidad> getTecnicoTieneEspecialidad() {
        return tecnicoTieneEspecialidad;
    }

    public void setTecnicoTieneEspecialidad(List<Especialidad> tecnicoTieneEspecialidad) {
        this.tecnicoTieneEspecialidad = tecnicoTieneEspecialidad;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "idTecnico=" + idTecnico +
                ", nombre='" + nombre + '\'' +
                ", mail='" + mail + '\'' +
                ", whatsapp='" + whatsapp + '\'' +
                ", prefiereMail=" + prefiereMail +
                ", tecnicoTieneEspecialidad=" + tecnicoTieneEspecialidad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tecnico tecnico = (Tecnico) o;
        return idTecnico == tecnico.idTecnico;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTecnico);
    }
}
