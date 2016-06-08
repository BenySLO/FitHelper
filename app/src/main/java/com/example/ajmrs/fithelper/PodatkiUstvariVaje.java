package com.example.ajmrs.fithelper;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by AjMrs on 1.6.2016.
 */
public class PodatkiUstvariVaje {


    private ArrayList<PodatkiVaje> vseVaje;

    public PodatkiUstvariVaje() {

        vseVaje=new ArrayList<PodatkiVaje>();
        dodajPodatke();

    }

    public ArrayList<PodatkiVaje> getVseVaje() {
        return vseVaje;
    }

    public void dodajVseVaje(PodatkiVaje nazivVaje) {
        this.vseVaje.add(nazivVaje);
    }


     public void dodajPodatke() {

        //vseVaje lal=new vseVaje();
         this.vseVaje.add(new PodatkiVaje( "Sklece"));
         this.vseVaje.add(new PodatkiVaje( "Počepi"));
         this.vseVaje.add(new PodatkiVaje( "Skoki"));
         this.vseVaje.add(new PodatkiVaje( "Prevali"));
         this.vseVaje.add(new PodatkiVaje( "Planking"));
         this.vseVaje.add(new PodatkiVaje( "Poskoi v zvezdo"));
         this.vseVaje.add(new PodatkiVaje( "Vzgibi z nogo"));
         this.vseVaje.add(new PodatkiVaje( "Zamahi"));
         this.vseVaje.add(new PodatkiVaje( "Udarci z pešico"));

        //this.vseVaje=lal.vseVaje;
        //String nazivVaje, int kalorijeVaje, String linkSlike, int steviloOpravljenihVajDanes,
      //  int steviloCiljVajDanes, Date datumZadnjegaRefresha, int steviloOpravljenihVajVseskupaj, int stVajeSkupaj,
    //    Date datumZacetkaDela)
       // return lal;
    }




}
