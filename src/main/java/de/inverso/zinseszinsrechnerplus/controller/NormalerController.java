package de.inverso.zinseszinsrechnerplus.controller;

import de.inverso.zinseszinsrechnerplus.skripte.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class NormalerController {

   /* @GetMapping("/normal.html")
    public void normal() {
        System.out.println("Ausgabe der NormalSeite");
    }*/
   /* @RequestMapping(value = "/berechnungsgrundlage", method = RequestMethod.GET)
    public String rechner(){
        return "berechne";
    }*/

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("greeting", greeting);
        return "result";
    }

}
