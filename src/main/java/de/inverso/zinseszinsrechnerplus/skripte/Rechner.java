package de.inverso.zinseszinsrechnerplus.skripte;

import org.springframework.stereotype.Service;

//@Service
public class Rechner {

    private char a = 'j';//ausschüttungsintervall [monatlich = m; quartal = q; wöchentlich = w; jährlich = j]
    private double k = 5000; //anfangskapital
    private double p = 10; //% jährlich
    private int n = 50; //jahre
    private double s = 100; //monatlich

    public Rechner(){
        System.out.println("Anfangskapital: " + k);
        System.out.println("Monatliche Sparrate: " + s);
        System.out.println("Spardauer (Jahre): " + n);
        System.out.println("Jährlicher Zinssatz: " + p + " %");
        System.out.println("Ausschüttungsintervall: " + a);


    }

    public void berechung(){

        switch (a) {
            case 'm': System.out.println("Kapital nach " + n + " Jahren: " + euro(rechner_m(k, p, n, s)) + " Euro");
                break;
            case 'q': System.out.println("Kapital nach " + n + " Jahren: " + euro(rechner_q(k, p, n, s)) + " Euro");
                break;
            case 'j': System.out.println("Kapital nach " + n + " Jahren: " + euro(rechner_j(k, p, n, s)) + " Euro");
                break;
            case 'w': System.out.println("wöchentliche Ausschüttung noch nicht implementier!");
                break;
            default: System.out.println("Fehler");
                break;
        }

    }

    public static double rechner_m(double k, double p, int n, double s) {
        p = (p/1200)+1;
        double erg = k * hoch(p, 12 * n);
        for (int i = 0; i <= 12*n-1; i++) {
            erg += hoch(p, i) * s;
        }
        return erg;
    }

    public static double rechner_q(double k, double p, int n, double s) {
        p = (p/400)+1;
        double erg = k * hoch(p, 4 * n);
        for (int i = 0; i <= 4*n-1; i++) {
            erg += hoch(p, i) * s * 3;
        }
        return erg;
    }

    public static double rechner_j(double k, double p, int n, double s) {
        p = (p/100)+1;
        double erg = k * hoch(p, n);
        for (int i = 0; i <= n-1; i++) {
            erg += hoch(p, i) * s * 12;
        }
        return erg;
    }

    public static double hoch(double a, int n) {
        double erg = 1;
        for (int i = 0; i < n; i++) {
            erg *= a;
        }
        return erg;
    }

    public static double euro(double a) { //double Zahl zu Euro
        double tmp = a * 100;
        int temp = (int) tmp;
        tmp = (double) temp;
        tmp /= 100;
        return tmp;
    }







}
