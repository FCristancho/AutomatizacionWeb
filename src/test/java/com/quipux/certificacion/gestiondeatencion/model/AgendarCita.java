package com.quipux.certificacion.gestiondeatencion.model;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.quipux.certificacion.gestiondeatencion.model.builder.AgendarCitaBuilder;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AgendarCita {
    private  String subSede;
    private  String tipoDocumento;
    private  String primerNombre;
    private  String segundoNombre;
    private  String primerApellido;
    private  String segundoApellido;
    private  String entidadPrestadora;
    @JsonProperty("filtro")
    private  String servicio;
    private  String correoElectronico;
    private  String numeroDeTelefono;
    private  String direccionResidencia;
    private  String fechaCita;
    private  String comentario;
    private  String usuario;
    private  String contrasena;

    public AgendarCita() {
    }

    public AgendarCita(AgendarCitaBuilder agendarCitaBuilder) {
        this.subSede = agendarCitaBuilder.getUsuarios().get(0).getSubSede();
        this.tipoDocumento = agendarCitaBuilder.getUsuarios().get(0).getTipoDocumento();
        this.primerNombre = agendarCitaBuilder.getUsuarios().get(0).getPrimerNombre();
        this.segundoNombre = agendarCitaBuilder.getUsuarios().get(0).getSegundoNombre();
        this.primerApellido = agendarCitaBuilder.getUsuarios().get(0).getPrimerApellido();
        this.segundoApellido = agendarCitaBuilder.getUsuarios().get(0).getSegundoApellido();
        this.correoElectronico = agendarCitaBuilder.getUsuarios().get(0).getCorreoElectronico();
        this.numeroDeTelefono = agendarCitaBuilder.getUsuarios().get(0).getNumeroDeTelefono();
        this.direccionResidencia = agendarCitaBuilder.getUsuarios().get(0).getDireccionResidencia();
        this.fechaCita = agendarCitaBuilder.getUsuarios().get(0).getFechaCita();
        this.comentario = agendarCitaBuilder.getUsuarios().get(0).getComentario();
        this.usuario = agendarCitaBuilder.getUsuarios().get(0).getUsuario();
        this.contrasena = agendarCitaBuilder.getUsuarios().get(0).getContrasena();
        this.entidadPrestadora = agendarCitaBuilder.getUsuarios().get(0).getEntidadPrestadora();
        this.servicio = agendarCitaBuilder.getUsuarios().get(0).getServicio();
    }

    public String getSubSede() {
        return subSede;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getEntidadPrestadora() {
        return entidadPrestadora;
    }

    public String getServicio() {
        return servicio;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public String getComentario() {
        return comentario;
    }

    @Override
    public String toString() {
        return "AgendarCita{" +
                "subSede='" + subSede + '\'' +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", primerNombre='" + primerNombre + '\'' +
                ", segundoNombre='" + segundoNombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", entidadPrestadora='" + entidadPrestadora + '\'' +
                ", servicio='" + servicio + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", numeroDeTelefono='" + numeroDeTelefono + '\'' +
                ", direccionResidencia='" + direccionResidencia + '\'' +
                ", fechaCita='" + fechaCita + '\'' +
                ", comentario='" + comentario + '\'' +
                ", usuario='" + usuario + '\'' +
                ", contrasena='" + contrasena + '\'' +
                '}';
    }
}
