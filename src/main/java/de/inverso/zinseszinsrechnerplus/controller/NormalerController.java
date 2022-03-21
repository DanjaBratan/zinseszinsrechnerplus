package de.inverso.zinseszinsrechnerplus.controller;

import de.inverso.zinseszinsrechnerplus.skripte.Rechner;
import de.inverso.zinseszinsrechnerplus.skripte.Zzrechner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;


@Controller
public class NormalerController {

    // value = path = '' => "/zzrechner"
    //@RequestMapping(value = "/zzrechner", method = RequestMethod.GET)
    @GetMapping("/zzrechner") //von /zzrechner
    public String zzrechnerForm(Model model)
    {
        model.addAttribute("zzrechner", new Zzrechner());
        return "zzrechner";
    }


    //@RequestMapping(value = "/zzrechner", method = RequestMethod.POST)
    @PostMapping("/zzrechner") //zum /zzrechner
    public String zzrechnerSubmit(@ModelAttribute @Valid Zzrechner zzrechner, Errors errors, Model model) {

        if(errors.hasErrors()){
            Rechner berechnung1 = new Rechner(0, 0, 0, 0, 2); //Rechner Objekt erstellen
            zzrechner.setEndkapital(berechnung1.berechnung());  //lasse das Endkapital berechnen und setze das Ergebnis in die Datenklasse
            model.addAttribute("zzrechner", zzrechner); //alle Ergebnisse in die Datenklasse einfügen
            return "zzrechner";
        }

        try{
            Rechner berechnung1 = new Rechner(zzrechner.getK(), zzrechner.getS(),
                    zzrechner.getN(), zzrechner.getP(), zzrechner.getA()); //Rechner Objekt erstellen

            System.out.println("Kapital: " + zzrechner.getK() + " Sparrate" + zzrechner.getS() + " Jahre:" +
                    zzrechner.getN() + " Zinssatz" + zzrechner.getP() + " Intervall" + zzrechner.getA()); //gebe aktuelle Angaben aus


            zzrechner.setEndkapital(berechnung1.berechnung()); //lasse das Endkapital berechnen und setze das Ergebnis in die Datenklasse
            System.out.println("Endkapital beträgt:" + zzrechner.getEndkapital()); //gebe das Endkapital aus


            model.addAttribute("zzrechner", zzrechner); //alle Ergebnisse in die Datenklasse einfügen
            return "zzrechnererg";

        } catch(Exception e){
            System.out.println("Fehler entstanden");
            return "zzrechner";
        }

    }

}
