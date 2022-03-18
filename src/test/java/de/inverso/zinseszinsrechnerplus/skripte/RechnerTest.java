package de.inverso.zinseszinsrechnerplus.skripte;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RechnerTest {

    Rechner rechner;

    public static int[] data() {
        return new int[] { 2000, 1500, 4000};
    }



    @Test
    @DisplayName("leere Eingabe vom Rechner prüfen")
    void leereEingabe(){
        rechner = new Rechner(0,0,0,0,0); //setze 0
        double ergebnis = rechner.berechnung(); //berechne
        assertEquals(0, ergebnis); //assert
    }

    @Test
    @DisplayName("Beispiel Eingabe vom Rechner prüfen")
    void BeispielEingabe(){
        rechner = new Rechner(1000,100,20,5,4);
        double ergebnis = rechner.berechnung();
        assertEquals(42332.44, ergebnis); //assert
    }

    @ParameterizedTest
    @MethodSource(value = "data")
    void verschiedeneKapital(long kapital){
        rechner = new Rechner(kapital, 100, 20,5,4 );
        double ergebnis = rechner.berechnung();
        System.out.println("das Ergebnis ist: "+ ergebnis);
        assertNotNull(ergebnis);
    }

}
