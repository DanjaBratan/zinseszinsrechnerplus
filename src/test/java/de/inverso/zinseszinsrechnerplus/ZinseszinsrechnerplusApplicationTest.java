package de.inverso.zinseszinsrechnerplus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ZinseszinsrechnerplusApplicationTest {
	@Autowired
	ZinseszinsrechnerplusApplication zinseszinsrechnerplusApplication;

	@Test
	void contextLoads() {
		zinseszinsrechnerplusApplication = new ZinseszinsrechnerplusApplication();
		Assertions.assertNotNull(zinseszinsrechnerplusApplication); //prüft ob allgemeinerController initialisiert wurde
	}

}
