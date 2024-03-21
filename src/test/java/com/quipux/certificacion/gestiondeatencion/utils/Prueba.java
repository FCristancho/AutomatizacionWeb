package com.quipux.certificacion.gestiondeatencion.utils;

import java.io.IOException;

import static com.quipux.certificacion.gestiondeatencion.model.builder.AgendarCitaBuilder.conLosDatosDelUsuario;
import static com.quipux.certificacion.gestiondeatencion.model.builder.AgendarCitaBuilder.conLosDatosDelUsuario1;
import static com.quipux.certificacion.gestiondeatencion.utils.UtileriaCsv.obtenerDatosDeCsv;

public class Prueba {

    public static void main(String[] args) throws IOException {
        System.out.println(conLosDatosDelUsuario(obtenerDatosDeCsv("agendar_cita", "Lavado de carro")).build());
        System.out.println(conLosDatosDelUsuario1(obtenerDatosDeCsv("agendar_cita", "Lavado de carro")));
    }
}
