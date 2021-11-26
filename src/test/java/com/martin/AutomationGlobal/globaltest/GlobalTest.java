package com.martin.AutomationGlobal.globaltest;

import com.martin.AutomationGlobal.SpringBaseTestNGTest;
import com.martin.AutomationGlobal.pages.global.GlobalPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GlobalTest extends SpringBaseTestNGTest {
    @Value("${test.mail}")
    private String email;

    @Autowired
    private GlobalPage globalPage;

    //El test consiste de abrir la página, ir a la sección de contactos e ingresar un mail incorrecto y enviarlo
    @Test
    void abrirPagina() {
        this.globalPage.goTo();
        Assert.assertTrue(globalPage.isAt());

        this.globalPage.getHomePage().getBtnContacto().click();
        Assert.assertTrue(globalPage.getHomePage().isAt());


    }
}
