package com.martin.AutomationGlobal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

//La clase Base para todas las otras que manejan a Chrome una vez esté abierta la página
public abstract class Base {
    @Autowired
    protected WebDriver driver;

    @Autowired
    protected WebDriverWait wait;

    @PostConstruct
    private void init(){
        PageFactory.initElements(this.driver, this);
    }

    //Metodo para asegurarse que las cosas que se tenían que cargar lo hicieron correctamente
    public abstract boolean isAt();
}
