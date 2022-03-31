package de.inverso.zinseszinsrechnerplus.skripte;


import de.inverso.zinseszinsrechnerplus.interfaces.rechnerInterface;

import static java.lang.Math.pow;

public class Rechner implements rechnerInterface {

    //Konstanten (die eigentlich final sind, weil immer wieder neues Objekt erzeugt wird)
    private long kapital; //anfangskapital in Euro
    private double sparrateMonatlich; //monatliche Sparrate in Euro
    private int spardauerJahre; //Spardauer in Jahren
    private double prozentZinsen; //Jährlicher Zinssatz in %
    private int ausschuttungsintervall; //ausschüttungsintervall [monatlich = 1; quartal = 2; jährlich = 3]


    public Rechner(long kapital, double sparrateMonatlich, int spardauerJahre, double prozentZinsen, int ausschuttungsintervall) {
        this.kapital = kapital;
        this.sparrateMonatlich = sparrateMonatlich;
        this.spardauerJahre = spardauerJahre;
        this.prozentZinsen = prozentZinsen;
        this.ausschuttungsintervall = ausschuttungsintervall;
    } //Konstruktor zur Wertzuweisung


    @Override
    public double berechnung() { //Berechnungsmethode
        //Intervallprüfung
        if (ausschuttungsintervall == 1) {
            System.out.println("Monatliche Ausschüttung wird berechnet");
            return doubleZuEuro(rechnerMonatlich(kapital, prozentZinsen, spardauerJahre, sparrateMonatlich));
        } else if (ausschuttungsintervall == 2) {
            System.out.println("Quartals-Ausschüttung wird berechnet");
            return doubleZuEuro(rechnerQuartalsweise(kapital, prozentZinsen, spardauerJahre, sparrateMonatlich));
        } else if (ausschuttungsintervall == 3) {
            System.out.println("Jährliche Ausschüttung wird berechnet");
            return doubleZuEuro(rechnerJahr(kapital, prozentZinsen, spardauerJahre, sparrateMonatlich));
        } else {
            return 0;
        }
    }

    //Monatlicher Intervall ####//berechungMonatsintervall
    public static double rechnerMonatlich(double kapital, double prozentZinsen, int spardauerJahre, double sparrateMonatlich) {
        try {

            prozentZinsen = (prozentZinsen / 1200) + 1;
            double erg = kapital * pow(prozentZinsen, 12 * spardauerJahre);
            for (int i = 0; i <= 12 * spardauerJahre - 1; i++) {
                erg += pow(prozentZinsen, i) * sparrateMonatlich;
            }
            return erg;

        } catch (NumberFormatException e) {
            System.out.println("Falsches Zahlenformat!");
            System.out.println(e);
            return 0;
        }catch(ArithmeticException e1){
            System.out.println("Fehler bei Berechnung");
            System.out.println(e1);
            return 0;
        }
    }

    //Quartalsintervall
    public static double rechnerQuartalsweise(double kapital, double prozentZinsen, int spardauerJahre, double sparrateMonatlich) {
        try {

            prozentZinsen = (prozentZinsen / 400) + 1;
            double erg = kapital * pow(prozentZinsen, 4 * spardauerJahre);
            for (int i = 0; i <= 4 * spardauerJahre - 1; i++) {
                erg += pow(prozentZinsen, i) * sparrateMonatlich * 3;
            }
            return erg;

        } catch (NumberFormatException e) {
            System.out.println("Falsches Zahlenformat!");
            System.out.println(e);
            return 0;
        }catch(ArithmeticException e1){
            System.out.println("Fehler bei Berechnung");
            System.out.println(e1);
            return 0;
        }
    }

    //Jährlicher Intervall
    public static double rechnerJahr(double kapital, double prozentZinsen, int spardauerJahre, double sparrateMonatlich) {
        try {

            prozentZinsen = (prozentZinsen / 100) + 1;
            double erg = kapital * pow(prozentZinsen, spardauerJahre);
            for (int i = 0; i <= spardauerJahre - 1; i++) {
                erg += pow(prozentZinsen, i) * sparrateMonatlich * 12;
            }
            return erg;

        } catch (NumberFormatException e) {
            System.out.println("Falsches Zahlenformat!");
            System.out.println(e);
            return 0;
        }catch(ArithmeticException e1){
            System.out.println("Fehler bei Berechnung");
            System.out.println(e1);
            return 0;
        }
    }


    //Konvertierungsfunktion /////////#####bessere begriff
    public static double doubleZuEuro(double a) { //double Zahl zu Euro
        double tmp = a * 100;
        tmp = (int) tmp;
        tmp /= 100;
        return tmp;
    }


}
