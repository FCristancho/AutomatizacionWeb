package com.quipux.certificacion.gestiondeatencion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target BTN_MENU = Target.the("Bot\u00F3n de despliegue menu")
            .located(By.id("react-burger-menu-btn"));

    public static final Target FIRST_ELEMENT = Target.the("Primer elemento")
            .located(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
}
