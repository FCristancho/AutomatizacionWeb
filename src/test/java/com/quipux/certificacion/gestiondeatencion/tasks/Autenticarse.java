package com.quipux.certificacion.gestiondeatencion.tasks;

import com.quipux.certificacion.gestiondeatencion.model.Credenciales;
import com.quipux.certificacion.gestiondeatencion.userinterface.AutenticacionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Autenticarse implements Task {
    private final Credenciales credenciales;

    public Autenticarse(Credenciales credenciales) {
        this.credenciales = credenciales;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(credenciales.getUsuario()).into(AutenticacionPage.CAMPO_USUARIO),
                Enter.theValue(credenciales.getContrasena()).into(AutenticacionPage.CAMPO_CONTRASENA),
                Click.on(AutenticacionPage.BTN_INGRESAR)
        );
    }

    public static Performable withCredentials(Credenciales credenciales){
        return instrumented(Autenticarse.class, credenciales);
    }

}
