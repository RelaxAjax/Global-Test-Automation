package com.martin.AutomationGlobal.pages.global;

import com.martin.AutomationGlobal.pages.Base;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GlobalPage extends Base {
    @Autowired
    private Home homePage;

    @Autowired
    private Contacto contacto;

    @Value("${app.url}")
    private String url;

    public void goTo(){
        this.driver.get(url);
        System.out.println("Ingresando a la pagina: "+ url);
    }

    @Override
    public boolean isAt() {
        return homePage.isAt();
    }

    public Home getHomePage() {
        return homePage;
    }

    public Contacto getContacto() {
        return contacto;
    }
}
