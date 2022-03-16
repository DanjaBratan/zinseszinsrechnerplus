package de.inverso.zinseszinsrechnerplus;

import de.inverso.zinseszinsrechnerplus.controller.AllgemeinerController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ZinseszinsrechnerplusApplicationTests {

	@Autowired
	private AllgemeinerController controller;

	@Test
	void contextLoads() {
		Assertions.assertNotNull(controller);
	}

	//prüft die verschiedenen berechnungen von Zinsen

}
