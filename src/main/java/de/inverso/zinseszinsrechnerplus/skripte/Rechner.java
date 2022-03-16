package de.inverso.zinseszinsrechnerplus.skripte;

public class Rechner {

    private long k; //anfangskapital
    private double s; //monatliche Sparrate
    private int n; //Spardauer in Jahren
    private double p; //Jährlicher Zinssatz in %
    private int a; //ausschüttungsintervall [monatlich = 2; quartal = 3; wöchentlich = 1; jährlich = 4]

    public Rechner(long k, double s, int n,double p, int a){
        this.k = k;
        this.s = s;
        this.n = n;
        this.p = p;
        this.a = a;
    } //Konstruktor

    public double berechnung(){

        if(a == 1){
            System.out.println("wöchentliche Ausschüttung noch nicht implementiert!");
            return 0;
        }
        else if(a == 2){
            System.out.println("Monatliche Ausschütttung wird jetzt berechnet");
            return euro(rechner_m(k, p, n, s));
        }
        else if(a == 3){
            System.out.println("Quartals-Ausschütttung wird jetzt berechnet");
            return euro(rechner_q(k, p, n, s));
        }
        else if(a == 4){
            System.out.println("Jährliche Ausschütttung wird jetzt berechnet");
            return euro(rechner_j(k, p, n, s));
        }

        return 1;
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
