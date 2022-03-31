package de.inverso.zinseszinsrechnerplus.skripte;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

public class RechnerTest {

    Rechner rechner;

    public static int[] data() { //custom input fürs Kapital
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
    @DisplayName("Beispiel2 Eingabe vom Rechner prüfen")
    void BeispielEingabe2(){
        rechner = new Rechner(1000,50,20,3,3);
        double ergebnis = rechner.berechnung();
        assertEquals(17928.33, ergebnis); //assert
    }


    @Test
    @DisplayName("Beispiel Eingabe vom Rechner prüfen")
    void BeispielEingabe(){
        rechner = new Rechner(1000,100,20,5,3);
        double ergebnis = rechner.berechnung();
        assertEquals(42332.44, ergebnis); //assert
    }

    @Test
    @DisplayName("Beispiel1 Eingabe vom Rechner prüfen")
    void BeispielEingabe1(){
        rechner = new Rechner(1000,150,20,5,3);
        double ergebnis = rechner.berechnung();
        assertEquals(62172.01, ergebnis); //assert
    }


    @ParameterizedTest
    @MethodSource(value = "data")
    void verschiedeneKapital(long kapital){
        rechner = new Rechner(kapital, 100, 20,5,3 );
        double ergebnis = rechner.berechnung();
        System.out.println("das Ergebnis ist: "+ ergebnis);
        assertNotNull(ergebnis);
    }

    /*@Test
    void rechnerMonatlichTestFehler(){
        Throwable exception = assertThrows(NumberFormatException.class, () -> Rechner.rechnerMonatlich(5000,5,10.0,300));
        assertEquals("expected messages", exception.getMessage());

    }*/

    /*@Test
    public void rechnerMonatlichTestFehler(){
        Assertions.assertThrows(Exception.class, ()->{
            new Rechner(1000,2,10.5,4,1);
        });
    }*/


   /* @Test
    public void expectedException() {
        try {
            //methodThrowsException();
            //fail("Expected exception was not thrown");
            fail();
        } catch (Exception e) {
            assertNotNull(e);
        }
    }*/

}
