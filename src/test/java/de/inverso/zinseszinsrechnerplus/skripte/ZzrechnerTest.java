package de.inverso.zinseszinsrechnerplus.skripte;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZzrechnerTest {

    Zzrechner zzrechner;

    @BeforeEach
    void setUp(){
        zzrechner = new Zzrechner();
    }

    @Test
    @DisplayName("set und get von variable k")
    void setandgetK(){
        zzrechner.setKapital(5000); //setze k auf 5000
        assertEquals(5000, zzrechner.getKapital());//assert
    }

    @Test
    @DisplayName("set und get von variable s")
    void setandgetS(){
        zzrechner.setSparrateMonatlich(200); //setze s auf 200
        assertEquals(200, zzrechner.getSparrateMonatlich());//assert
    }

    @Test
    @DisplayName("set und get von variable n")
    void setandgetN(){
        zzrechner.setSpardauerJahre(10); //setze n auf 10
        assertEquals(10, zzrechner.getSpardauerJahre());//assert
    }

    @Test
    @DisplayName("set und get von variable p")
    void setandgetP(){
        zzrechner.setProzentZinsen(5); //setze p auf 5
        assertEquals(5, zzrechner.getProzentZinsen());//assert
    }

    @Test
    @DisplayName("set und get von variable a")
    void setandgetA(){
        zzrechner.setAusschuttungsintervall(3); //setze a auf 3
        assertEquals(3, zzrechner.getAusschuttungsintervall());//assert
    }

    @Test
    @DisplayName("set und get von variable endkapital")
    void setandgetEndkapital(){
        zzrechner.setEndkapital(50000); //setze endkapital auf 5000
        assertEquals(50000, zzrechner.getEndkapital());//assert
    }


}
