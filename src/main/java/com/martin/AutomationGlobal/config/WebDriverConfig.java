package com.martin.AutomationGlobal.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebDriverConfig {
	//Se encarga de manejar el WebDriver que permite manipular Chrome
	@Value("${default.timeout: 30}")
	private int timeOut;

	@Bean
	public WebDriver chromeDriver() {//Driver de Chrome
		WebDriverManager.chromedriver().setup();
		return new ChromeDriver();
	}
	
	@Bean//Maneja el timeout para cuando la conexion tarda mucho
	public WebDriverWait webDriverWait(WebDriver driver){
		return new WebDriverWait(driver, this.timeOut);
	}
}
