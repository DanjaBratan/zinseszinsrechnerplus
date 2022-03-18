package de.inverso.zinseszinsrechnerplus.skripte;

public class Rechner {

    //Konstanten
    private final long k; //anfangskapital
    private final double s; //monatliche Sparrate
    private final int n; //Spardauer in Jahren
    private final double p; //Jährlicher Zinssatz in %
    private final int a; //ausschüttungsintervall [monatlich = 2; quartal = 3; wöchentlich = 1; jährlich = 4]

    public Rechner(long k, double s, int n,double p, int a){
        this.k = k;
        this.s = s;
        this.n = n;
        this.p = p;
        this.a = a;
    } //Konstruktor zur Wertzuweisung


    public double berechnung(){ //Berechnungsmethode

        //Intervallprüfung
        if(a == 1){
            System.out.println("wöchentliche Ausschüttung noch nicht vorhanden!");
            return 0;
        }
        else if(a == 2){
            System.out.println("Monatliche Ausschüttung wird jetzt berechnet");
            return euro(rechner_m(k, p, n, s));
        }
        else if(a == 3){
            System.out.println("Quartals-Ausschüttung wird jetzt berechnet");
            return euro(rechner_q(k, p, n, s));
        }
        else if(a == 4){
            System.out.println("Jährliche Ausschüttung wird jetzt berechnet");
            return euro(rechner_j(k, p, n, s));
        }
        else{
            return 0;
        }
    }

    //Monatlicher Intervall
    public static double rechner_m(double k, double p, int n, double s) {
        p = (p/1200)+1;
        double erg = k * hoch(p, 12 * n);
        for (int i = 0; i <= 12*n-1; i++) {
            erg += hoch(p, i) * s;
        }
        return erg;
    }

    //Quartalsintervall
    public static double rechner_q(double k, double p, int n, double s) {
        p = (p/400)+1;
        double erg = k * hoch(p, 4 * n);
        for (int i = 0; i <= 4*n-1; i++) {
            erg += hoch(p, i) * s * 3;
        }
        return erg;
    }

    //Jährlicher Intervall
    public static double rechner_j(double k, double p, int n, double s) {
        p = (p/100)+1;
        double erg = k * hoch(p, n);
        for (int i = 0; i <= n-1; i++) {
            erg += hoch(p, i) * s * 12;
        }
        return erg;
    }


    //Potenzfunktion
    public static double hoch(double a, int n) {
        double erg = 1;
        for (int i = 0; i < n; i++) {
            erg *= a;
        }
        return erg;
    }


    //Konvertierungsfunktion
    public static double euro(double a) { //double Zahl zu Euro
        double tmp = a * 100;
        //int temp = (int) tmp;
        tmp = (int) tmp;
        tmp /= 100;
        return tmp;
    }


}
