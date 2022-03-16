package de.inverso.zinseszinsrechnerplus.controller;

import de.inverso.zinseszinsrechnerplus.skripte.Zzrechner;
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


    @GetMapping("/zzrechner")
    public String zzrechnerForm(Model model) {
        model.addAttribute("zzrechner", new Zzrechner());
        return "zzrechner";
    }

    @PostMapping("/zzrechner")
    public String zzrechnerSubmit(@ModelAttribute Zzrechner zzrechner, Model model) {
        model.addAttribute("zzrechner", zzrechner);
        return "zzrechnererg";
    }




}
