package com.quipux.certificacion.gestiondeatencion.model.builder;

import com.quipux.certificacion.gestiondeatencion.model.Credenciales;

import java.util.List;
import java.util.Map;

public class CredencialesBuilder {

    public static Credenciales deUsuario(List<Map<String, String>> list){
        return Builder.build(list, Credenciales.class);
    }
}
