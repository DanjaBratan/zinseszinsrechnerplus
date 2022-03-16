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


    @GetMapping("/index")
    public String indexnormal() {
        System.out.println("Ausgabe der StartSeite");
        return "Startseite ist wild";
    }


    @GetMapping("/index.home")
    public void index() {
        System.out.println("Ausgabe der StartSeite");
    }


    @GetMapping(path="/")
    public String sayHello() {
        System.out.println("wild");
        return "Hallo lol";
    }





}
