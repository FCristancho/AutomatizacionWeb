package com.quipux.certificacion.gestiondeatencion.model.builder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.quipux.certificacion.gestiondeatencion.model.AgendarCita;
import com.quipux.certificacion.gestiondeatencion.model.Credenciales;

import java.util.List;
import java.util.Map;

public class Builder{

    private Builder () {}

    public static <T> T build(List<Map<String, String>> list, Class<T> type){
        if (list.isEmpty()) {
            return null;  //Deberia lanzar una Exception, lo pongo null mientras
        }
        ObjectMapper mapper = new ObjectMapper();
        return mapper.convertValue(list.get(0), type); // {usuario : felipe, contrasena : 123} -> lo transforma a clase
    }
}


























