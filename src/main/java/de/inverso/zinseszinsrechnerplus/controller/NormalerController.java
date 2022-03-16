package de.inverso.zinseszinsrechnerplus.controller;

import de.inverso.zinseszinsrechnerplus.skripte.Rechner;
import de.inverso.zinseszinsrechnerplus.skripte.Zzrechner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class NormalerController {

    @GetMapping("/zzrechner") //von /zzrechner
    public String zzrechnerForm(Model model) {

        model.addAttribute("zzrechner", new Zzrechner());

        return "zzrechner";
    }




    @PostMapping("/zzrechner") //zum /zzrechner
    public String zzrechnerSubmit(@ModelAttribute Zzrechner zzrechner, Model model) {

        Rechner berechnung1 = new Rechner(zzrechner.getK(), zzrechner.getS(),
                zzrechner.getN(), zzrechner.getP(), zzrechner.getA());

        System.out.println(zzrechner.getK() + zzrechner.getS() +
                zzrechner.getN() + zzrechner.getP() + zzrechner.getA());


        zzrechner.setEndkapital(berechnung1.berechnung());
        System.out.println("Endkapital beträgt:" + zzrechner.getEndkapital()); //gebe das Endkapital aus


        model.addAttribute("zzrechner", zzrechner);
        return "zzrechnererg";
    }




}
