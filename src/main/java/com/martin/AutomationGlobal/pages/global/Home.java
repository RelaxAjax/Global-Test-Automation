package com.martin.AutomationGlobal.pages.global;

import com.martin.AutomationGlobal.pages.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class Home extends Base {
    @FindBy(id = "menu-item-1364")
    private WebElement btnContacto;

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> this.btnContacto.isDisplayed());
    }

    public WebElement getBtnContacto() {
        return btnContacto;
    }
}
