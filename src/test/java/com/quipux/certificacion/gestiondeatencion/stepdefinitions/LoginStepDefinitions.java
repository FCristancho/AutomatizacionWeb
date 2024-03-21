package com.quipux.certificacion.gestiondeatencion.stepdefinitions;

import com.quipux.certificacion.gestiondeatencion.tasks.Autenticarse;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.io.IOException;

import static com.quipux.certificacion.gestiondeatencion.model.builder.CredencialesBuilder.deUsuario;
import static com.quipux.certificacion.gestiondeatencion.userinterface.HomePage.BTN_MENU;
import static com.quipux.certificacion.gestiondeatencion.userinterface.HomePage.FIRST_ELEMENT;
import static com.quipux.certificacion.gestiondeatencion.utils.UtileriaCsv.obtenerDatosDeCsv;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinitions {

    @Dado("que Sergey tiene una cuenta activa")
    public void queSergeyTieneUnaCuentaActiva() {
        System.out.println("sergey tiene una cuenta activa");
    }

    @Cuando("el envia sus credenciales validas")
    public void elEnviaSusCredencialesValidas() throws IOException {
        theActorInTheSpotlight().attemptsTo(
                //Autenticarse.withCredentials("standard_user", "secret_sauce")
                Autenticarse.withCredentials(deUsuario(obtenerDatosDeCsv("autenticacion", "")))
        );
    }
    @Entonces("deberia tener acceso para manejar su cuenta")
    public void deberiaTenerAccesoParaManejarSuCuenta() {
        System.out.println("tiene acceso a la cuenta");
        theActorInTheSpotlight().attemptsTo(Ensure.that(BTN_MENU).isDisplayed());
//        theActorInTheSpotlight().attemptsTo(Ensure.that(FIRST_ELEMENT).value().isEqualTo("Sauce Labs Backpack")); //values se usa para traer valores de campo de texto
        theActorInTheSpotlight().attemptsTo(Ensure.that(FIRST_ELEMENT).text().isEqualTo("Sauce Labs Backpack"));
    }
}
