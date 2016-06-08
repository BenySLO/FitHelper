package com.example.ajmrs.fithelper;

import android.app.Application;
import android.os.Environment;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
//import com.example.Application;
/**
 * Created by AjMrs on 31.5.2016.
 */
public class PodatkiUporabnika implements Serializable {
    private ArrayList<PodatkiVaje> nazivVaje;
private int steviloVajSkupajOpravljenih;

    private static final String DATA_MAP = "vajemojemapa";
    private static final String FILE_NAME = "vajemoje.json";

    public PodatkiUporabnika() {

        nazivVaje=new ArrayList<PodatkiVaje>();
        steviloVajSkupajOpravljenih=0;
       // nalozi();
    }


    public int getSteviloVajSkupajOpravljenih() {
        for (PodatkiVaje a:  this.nazivVaje ) {
            steviloVajSkupajOpravljenih=a.getSteviloOpravljenihVajVseskupaj()+steviloVajSkupajOpravljenih;
        }
        return steviloVajSkupajOpravljenih;
    }

    public ArrayList<PodatkiVaje> getNazivVaje() {
        return nazivVaje;
    }

    public void setNazivVaje(PodatkiVaje nazivVaje) {
        this.nazivVaje.add(nazivVaje);

    }



    public void setSteviloVajSkupajOpravljenih(int steviloVajSkupajOpravljenih) {
        this.steviloVajSkupajOpravljenih = steviloVajSkupajOpravljenih;
    }

    @Override
    public String toString() {
        return "PodatkiUporabnika{" +
                "nazivVaje=" + nazivVaje +
                ", steviloVajSkupajOpravljenih=" + steviloVajSkupajOpravljenih +
                '}';
    }



    public void dodajPodatke(PodatkiVaje nekia) {
        this.nazivVaje.add(nekia);


    }
    public void dodajPodatke1() {
        this.nazivVaje.add(new PodatkiVaje("SprintNaDaelcse"));


    }

public void opravilSerijo(){
   int i=0;
    for (PodatkiVaje a:nazivVaje
         ) {

        nazivVaje.get(i).opravilVajo();
        i++;

    }


}



}
