package com.quipux.certificacion.gestiondeatencion.model.builder;

import com.quipux.certificacion.gestiondeatencion.model.AgendarCita;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AgendarCitaBuilder implements com.sun.istack.Builder<AgendarCita> {
    private String subSede;
    private String tipoDocumento;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String correoElectronico;
    private String numeroDeTelefono;
    private String direccionResidencia;
    private String entidadPrestadora;
    private String servicio;
    private String fechaCita;
    private String comentario;
    private String usuario;
    private String contrasena;
    private List<AgendarCitaBuilder> usuarios = new ArrayList<>();

    public AgendarCitaBuilder(Map<String, String> datosDeUsuario) {
        this.subSede = datosDeUsuario.get("subSede");
        this.tipoDocumento = datosDeUsuario.get("tipoDocumento");
        this.primerNombre = datosDeUsuario.get("primerNombre");
        this.segundoNombre = datosDeUsuario.get("segundoNombre");
        this.primerApellido = datosDeUsuario.get("primerApellido");
        this.segundoApellido = datosDeUsuario.get("segundoApellido");
        this.correoElectronico = datosDeUsuario.get("correoElectronico");
        this.numeroDeTelefono = datosDeUsuario.get("numeroDeTelefono");
        this.direccionResidencia = datosDeUsuario.get("direccionResidencia");
        this.entidadPrestadora = datosDeUsuario.get("entidadPrestadora");
        this.servicio = datosDeUsuario.get("filtro");
        this.fechaCita = datosDeUsuario.get("fechaCita");
        this.comentario = datosDeUsuario.get("comentario");
        this.usuario = datosDeUsuario.get("usuario");
        this.contrasena = datosDeUsuario.get("contrasena");
    }

    public AgendarCitaBuilder(List<Map<String, String>> datosDeUsuario) {
        crearConstructor(datosDeUsuario);
    }

    public static AgendarCitaBuilder deUsuario(List<Map<String, String>> datosDeUsuario) {
        return new AgendarCitaBuilder(datosDeUsuario);
    }

    public static AgendarCitaBuilder conLosDatosDelUsuario(List<Map<String, String>> datosDeUsuario) {
        return new AgendarCitaBuilder(datosDeUsuario);
    }

    public static AgendarCita conLosDatosDelUsuario1(List<Map<String, String>> list){
        return Builder.build(list, AgendarCita.class);
    }

    public String getSubSede() {
        return subSede;
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

    public String getUsuario() {
        return usuario;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public String getComentario() {
        return comentario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public List<AgendarCitaBuilder> getUsuarios() {
        return usuarios;
    }

    private void crearConstructor(List<Map<String, String>> datosDeUsuario) {
        for (Map<String, String> datoDeUsuario : datosDeUsuario) {
            usuarios.add(new AgendarCitaBuilder(datoDeUsuario));
        }
    }

    @Override
    public AgendarCita build() {
        return new AgendarCita(this);
    }
}
