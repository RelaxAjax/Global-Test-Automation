package com.martin.AutomationGlobal.pages.global;

import com.martin.AutomationGlobal.pages.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Contacto extends Base {
    @FindBy(css = "span.wpcf7-not-valid-tip")
    private List<WebElement> alertas;

    @FindBy(name="your-email")
    private WebElement inputEmail;

    @FindBy(css = "input.wpcf7-submit")
    private WebElement btnEnviar;

    public void enviarEmail(String email){
        WebElement mensaje = this.alertas.get(1);;

        this.inputEmail.sendKeys(email);
        System.out.println("Ingresando mail: "+ email);

        this.btnEnviar.click();
        System.out.println("Click en 'Enviar'");


        if(mensaje.getText() == "La dirección e-mail parece inválida."){
            System.out.println("Email invalido");
        }else if(mensaje.getText() == "Por favor, complete el campo requerido."){
            System.out.println("No se ingreso un email");
        }else{
            System.out.println("Email valido");
        }
    }

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> this.inputEmail.isDisplayed());
    }
}
