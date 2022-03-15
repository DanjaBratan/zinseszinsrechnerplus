package de.inverso.zinseszinsrechnerplus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NormalerController {

    @GetMapping("/normal.html")
    public void hello() {
        System.out.println("Ausgabe der NormalSeite");
    }

}
