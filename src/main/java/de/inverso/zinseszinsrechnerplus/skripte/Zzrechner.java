package de.inverso.zinseszinsrechnerplus.skripte;

public class Zzrechner {

    private long k; //anfangskapital
    private double s; //monatliche Sparrate
    private int n; //Spardauer in Jahren
    private double p; //Jährlicher Zinssatz in %
    private int a; //ausschüttungsintervall [monatlich = 1; quartal = 2; wöchentlich = 3; jährlich = 4]


    public long getK() {
        return k;
    }
    public void setK(long k) {
        this.k = k;
    }


    public double getS() {
        return s;
    }
    public void setS(double s) {
        this.s = s;
    }


    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }


    public double getP() {
        return p;
    }
    public void setP(double p) {
        this.p = p;
    }


    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }





}
