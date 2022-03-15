package de.inverso.zinseszinsrechnerplus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AllgemeinerController {

    @GetMapping("/hello")
    public String hello() {
        System.out.println("Ausgabe der HalloSeite");
        return "Hallo, hier funktioniert alles unter dem /hello";
    }


    /*@GetMapping("/index.home")
    public String index() {
        System.out.println("Ausgabe der StartSeite");
        return "Startseite ist wild";
    }*/


}
