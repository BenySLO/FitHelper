package com.example.ajmrs.fithelper;

import java.util.Date;

/**
 * Created by AjMrs on 31.5.2016.
 */
public class PodatkiVaje {

    private String  nazivVaje;
    private int kalorijeVaje;
    private String linkSlike;
    private int steviloOpravljenihVajDanes;
    private int steviloCiljVajDanes;
    private Date datumZadnjegaRefresha;
    private int stVajeSkupaj;
    private Date datumZacetkaDela;


    public PodatkiVaje() {
        nazivVaje="";
        kalorijeVaje=1;
        linkSlike="\\slika";
        steviloOpravljenihVajDanes=0;
        steviloCiljVajDanes=10;
        datumZadnjegaRefresha=new Date();
        stVajeSkupaj=0;
        datumZacetkaDela=new Date();

    }


    public int getSteviloOpravljenihVajVseskupaj() {
        return steviloOpravljenihVajVseskupaj;
    }

    public void setSteviloOpravljenihVajVseskupaj(int steviloOpravljenihVajVseskupaj) {
        this.steviloOpravljenihVajVseskupaj = steviloOpravljenihVajVseskupaj;
    }

    private int steviloOpravljenihVajVseskupaj;






    public PodatkiVaje(String vaja){
        this.nazivVaje=vaja;
        kalorijeVaje=1;
        linkSlike="\\slika";
        steviloOpravljenihVajDanes=0;
        steviloCiljVajDanes=10;
        datumZadnjegaRefresha=new Date(0);
        stVajeSkupaj=0;
        datumZacetkaDela=new Date(0);
    }




    public String getNazivVaje() {
        return nazivVaje;
    }

    public void setNazivVaje(String nazivVaje) {
        this.nazivVaje = nazivVaje;
    }

    public int getKalorijeVaje() {
        return kalorijeVaje;
    }

    public void setKalorijeVaje(int kalorijeVaje) {
        this.kalorijeVaje = kalorijeVaje;
    }

    public String getLinkSlike() {
        return linkSlike;
    }

    public void setLinkSlike(String linkSlike) {
        this.linkSlike = linkSlike;
    }

    public int getSteviloOpravljenihVajDanes() {
        return steviloOpravljenihVajDanes;
    }

    public void setSteviloOpravljenihVajDanes(int steviloOpravljenihVajDanes) {
        this.steviloOpravljenihVajDanes = steviloOpravljenihVajDanes;
    }

    public int getSteviloCiljVajDanes() {
        return steviloCiljVajDanes;
    }

    public void setSteviloCiljVajDanes(int steviloCiljVajDanes) {
        this.steviloCiljVajDanes = steviloCiljVajDanes;
    }

    public Date getDatumZadnjegaRefresha() {
        return datumZadnjegaRefresha;
    }

    public void setDatumZadnjegaRefresha(Date datumZadnjegaRefresha) {
        this.datumZadnjegaRefresha = datumZadnjegaRefresha;
    }



    public int getStVajeSkupaj() {
        return stVajeSkupaj;
    }

    public void setStVajeSkupaj(int stVajeSkupaj) {
        this.stVajeSkupaj = stVajeSkupaj;
    }

    public Date getDatumZacetkaDela() {
        return datumZacetkaDela;
    }

    public void setDatumZacetkaDela(Date datumZacetkaDela) {
        this.datumZacetkaDela = datumZacetkaDela;
    }
public void opravilVajo(){
    steviloOpravljenihVajDanes+=steviloCiljVajDanes;
    stVajeSkupaj+=steviloOpravljenihVajDanes;

}
    @Override
    public String toString() {
        return "PodatkiVaje{" +
                "nazivVaje='" + nazivVaje.toString() + '\'' +
                "\n, kalorijeVaje=" + kalorijeVaje +
               // ", linkSlike='" + linkSlike.toString() + '\'' +
                "\n, stevilo Opravljenih Vaj Danes=" + steviloOpravljenihVajDanes +
                "\n, Stevilo Vaj v Seriji=" + steviloCiljVajDanes +
              // ", datumZadnjegaRefresha=" + datumZadnjegaRefresha.toString() +

                "\n, stevilo Vaje Skupaj=" + stVajeSkupaj +
              //  ", datumZacetkaDela=" + datumZacetkaDela.toString() +
                '}';
    }


























}
