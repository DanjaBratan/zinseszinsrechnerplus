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
    //dasselbe wie: @RequestMapping(value = "/zzrechner", method = RequestMethod.GET)
    @GetMapping("/zzrechner") //von /zzrechner
    public String zzrechnerForm(Model model)
    {
        model.addAttribute("zzrechner", new Zzrechner());
        return "zzrechner";
    }


    //dasselbe wie: @RequestMapping(value = "/zzrechner", method = RequestMethod.POST)
    @PostMapping("/zzrechner") //zum /zzrechner
    public String zzrechnerSubmit(@ModelAttribute @Valid Zzrechner zzrechner, Errors errors, Model model) {

        if(errors.hasErrors()){
            //Rechner rechnerfehler = new Rechner(0, 0, 0, 0, 2); //Rechner Objekt erstellen
            zzrechner.setEndkapital(0); //Endkapital 0
            model.addAttribute("zzrechner", zzrechner); //alle Ergebnisse in die Datenklasse einfügen
            return "zzrechner";
        }

        try{
            Rechner rechnerobjekt = new Rechner(zzrechner.getKapital(), zzrechner.getSparrateMonatlich(),
                    zzrechner.getSpardauerJahre(), zzrechner.getProzentZinsen(), zzrechner.getAusschuttungsintervall()); //Rechner Objekt erstellen

            System.out.println("Kapital: " + zzrechner.getKapital() + " Sparrate" + zzrechner.getSparrateMonatlich() + " Jahre:" +
                    zzrechner.getSpardauerJahre() + " Zinssatz" + zzrechner.getProzentZinsen() + " Intervall" + zzrechner.getAusschuttungsintervall()); //gebe aktuelle Angaben aus


            zzrechner.setEndkapital(rechnerobjekt.berechnung()); //lasse das Endkapital berechnen und setze das Ergebnis in die Datenklasse
            System.out.println("Endkapital beträgt:" + zzrechner.getEndkapital()); //gebe das Endkapital aus


            model.addAttribute("zzrechner", zzrechner); //alle Ergebnisse in die Datenklasse einfügen
            return "zzrechnererg";

        } catch(Exception e){
            System.out.println("Fehler entstanden");
            System.out.println(e);
            return "zzrechner";
        }

    }

}
