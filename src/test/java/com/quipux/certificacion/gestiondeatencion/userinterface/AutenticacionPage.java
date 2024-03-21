package com.quipux.certificacion.gestiondeatencion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutenticacionPage {

    public static final Target CAMPO_USUARIO = Target.the("Campo de texto para ingresar el usuario")
            .located(By.id("user-name"));
    public static final Target CAMPO_CONTRASENA = Target.the("Campo de texto para ingresar la contrase\u00F1a")
            .located(By.name("password"));
    public static final Target BTN_INGRESAR = Target.the("Bot\u00F3n de autenticaci\u00F3n")
            .located(By.id("login-button"));
}
