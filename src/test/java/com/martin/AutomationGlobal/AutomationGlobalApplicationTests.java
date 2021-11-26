package com.martin.AutomationGlobal;

import com.martin.AutomationGlobal.pages.global.GlobalPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AutomationGlobalApplicationTests {
	@Value("${test.mail}")
	private String email;

	@Autowired
	private GlobalPage globalPage;

	@Test
	void abrirPagina() {
		this.globalPage.goTo();

	}

}
