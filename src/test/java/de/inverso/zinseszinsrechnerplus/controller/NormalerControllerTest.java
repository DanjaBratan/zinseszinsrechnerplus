package de.inverso.zinseszinsrechnerplus.controller;

import de.inverso.zinseszinsrechnerplus.skripte.Zzrechner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.ui.Model;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;


@SpringBootTest
@AutoConfigureMockMvc
public class NormalerControllerTest  {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private NormalerController normalerController;


    @Mock
    private Model model;

    private Errors errors = new BeanPropertyBindingResult(normalerController, "objectName");
    private Zzrechner zzrechner;

    @Test
    void formTest() { //teste die Form Methode
        String ausgabe = normalerController.zzrechnerForm(model);
        System.out.println(ausgabe);
    }

    @Test
    void submitTest() { //teste die Submit Methode
        String ausgabe = normalerController.zzrechnerSubmit(zzrechner, errors, model);
        System.out.println(ausgabe);
    }

    @Test
    void contextLoads() {
        Assertions.assertNotNull(normalerController); //prüft ob normalerController initialisiert wurde
    }

    @Test //Integrationtest
    @DisplayName("Leeres Submit")
    void emptyControllerSubmit() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/zzrechner"));
    }

    @Test //Integrationtest
    @DisplayName("Leere Form")
    void emptyControllerFormForm() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/zzrechner"));
        System.out.println("Erfolgreiche leere get-form");
    }

}