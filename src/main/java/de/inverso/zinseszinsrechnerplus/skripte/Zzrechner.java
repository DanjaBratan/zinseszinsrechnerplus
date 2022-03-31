package de.inverso.zinseszinsrechnerplus.skripte;

import javax.validation.constraints.NotNull;

public class Zzrechner {

    @NotNull
    private long kapital; //anfangskapital

    @NotNull
    private double sparrateMonatlich; //monatliche Sparrate

    @NotNull
    private int spardauerJahre; //Spardauer in Jahren

    @NotNull
    private double prozentZinsen; //Jährlicher Zinssatz in %

    @NotNull
    private int ausschuttungsintervall; //ausschüttungsintervall

    @NotNull
    private double endkapital;


    public long getKapital() {
        return kapital;
    }
    public void setKapital(long kapital) {
        this.kapital = kapital;
    }


    public double getSparrateMonatlich() {
        return sparrateMonatlich;
    }
    public void setSparrateMonatlich(double sparrateMonatlich) {
        this.sparrateMonatlich = sparrateMonatlich;
    }


    public int getSpardauerJahre() {
        return spardauerJahre;
    }
    public void setSpardauerJahre(int spardauerJahre) {
        this.spardauerJahre = spardauerJahre;
    }


    public double getProzentZinsen() {
        return prozentZinsen;
    }
    public void setProzentZinsen(double prozentZinsen) {
        this.prozentZinsen = prozentZinsen;
    }


    public int getAusschuttungsintervall() {
        return ausschuttungsintervall;
    }
    public void setAusschuttungsintervall(int ausschuttungsintervall) {
        this.ausschuttungsintervall = ausschuttungsintervall;
    }

    public double getEndkapital() {
        return endkapital;
    }
    public void setEndkapital(double endkapital) {
        this.endkapital = endkapital;
    }


}
