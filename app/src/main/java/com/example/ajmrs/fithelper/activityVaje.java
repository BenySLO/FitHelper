package com.example.ajmrs.fithelper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class activityVaje extends AppCompatActivity {
   // public static final String PARAMETER_POSITION_1 = "POSITION_OGLAS";
   Button  btnClick;
    PodatkiUporabnika anek;
    LinearLayout linLayout;
    PodatkiUstvariVaje vseVaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vaje_layout);
anek=new PodatkiUporabnika();
        btnClick=(Button)findViewById(R.id.buttonSeriaPlus);
//app=(shraniPodatkeStorage) getApplication();
        PodatkiUporabnika anek1=new PodatkiUporabnika();
        linLayout=(LinearLayout) findViewById(R.id.layoutDod);




        if((new File(getFilesDir(), "neki.bin")).exists()) {
            try {
                FileInputStream fstream = new FileInputStream(new File(getFilesDir(), "neki.bin"));


                DataInputStream in = new DataInputStream(fstream);
                BufferedReader br = new BufferedReader(new InputStreamReader(in));
                StringBuffer sb = new StringBuffer();
                String strLine;
                while ((strLine = br.readLine()) != null) {
                    sb.append(strLine).append('\n');
                }
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                PodatkiUporabnika a = gson.fromJson(sb.toString(), PodatkiUporabnika.class);
                anek = a;
            } catch (FileNotFoundException e) {
                btnClick.setText(e.toString());

            } catch (IOException e) {
                btnClick.setText(e.toString());

            }
        }
        btnClick.setText("OPRAVI VAJO\n"+anek.getSteviloVajSkupajOpravljenih());
dodajGumbe();



    }

    public void onClick(View v) {

        beri();
        //for(int i=0;i<=anek.getNazivVaje().size()-1;i++) {
            anek.opravilSerijo();

        finish();
        startActivity(getIntent());

        anek.setSteviloVajSkupajOpravljenih(anek.getSteviloVajSkupajOpravljenih()+1);
        btnClick.setText("OPRAVI VAJO\n"+anek.getSteviloVajSkupajOpravljenih());
        shrani();
        //}
      //  anek=new PodatkiUstvariVaje();
       // linLayout=(LinearLayout) findViewById(R.id.layoutDod);

       // PodatkiUporabnika anek1=new PodatkiUporabnika();

       // anek.dodajPodatke(new PodatkiVaje("tekanje"));
        //anek.dodajPodatke(new PodatkiVaje("Naslonjalo"));
      //  ArrayList<PodatkiVaje> vseVaje= anek.getVseVaje();
    /*  for(int i=0;i<=anek.getNazivVaje().size()-1;i++){


       // PodatkiVaje mojavaja=new PodatkiVaje("Skleca");
          Button btnTag = new Button(this);
      Button  btnClick=(Button)findViewById(R.id.button);
        btnTag.setText(anek.getNazivVaje().get(i).getNazivVaje());
          linLayout.addView(btnTag);

      }*/
        //app.setAll(anek);


    }




    private void dodajGumbe(){
        for(int i=0;i<=anek.getNazivVaje().size()-1;i++){


            // PodatkiVaje mojavaja=new PodatkiVaje("Skleca");
            Button btnTag = new Button(this);
            Button  btnClick=(Button)findViewById(R.id.buttonSeriaPlus);
            btnTag.setText(anek.getNazivVaje().get(i).toString());
            linLayout.addView(btnTag);


        }

       /* for(int i=0;i<anek.getNazivVaje().size();i++) {

                Button btnTag = new Button(this);
                //  Button btnClick = (Button) findViewById(R.id.button);
                btnTag.setText(vseVaje.getVseVaje().get(i).getNazivVaje());
                btnTag.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Button b=(Button)v;
                        String iskana=b.getText().toString();
                        for(int i=0;i<vseVaje.getVseVaje().size();i++) {
                            if(vseVaje.getVseVaje().get(i).getNazivVaje()==iskana){
                                anek.dodajPodatke(vseVaje.getVseVaje().get(i));
                                break;
                            }
                        }
                        b.setVisibility(View.INVISIBLE);
                    }
                });

                layout.addView(btnTag);

        }*/

    }

    public void odpirIntent(View view){
       Intent aa = new Intent(this, activityDodajVaje.class);
    startActivity(aa);
    //   VajeFitness a=new VajeFitness();
    //Button but=(Button)findViewById(R.id.buttonDodajVajo);
    }

    private void shrani(){
        try{
            FileOutputStream fs=new FileOutputStream(new File(getFilesDir(), "neki.bin"));
            //ObjectOutputStream os=new ObjectOutputStream(fs);

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            PrintWriter pw = new PrintWriter(fs);
            String sss=gson.toJson(anek);
            pw.println(sss);
            pw.close();

        }catch (FileNotFoundException e){

            //  Button btnClick = (Button) findViewById(R.id.button);
            // btnTag.setText(e.toString());
        }catch (IOException e){
            // btnClick.setText(e.toString());
            //  btnTag.setText(e.toString());

        }}

    private void beri(){


        try {
            FileInputStream fstream=new FileInputStream(new File(getFilesDir(), "neki.bin"));



            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader( new InputStreamReader(in));
            StringBuffer sb = new StringBuffer();
            String strLine;
            while ((strLine = br.readLine()) != null) {sb.append(strLine).append('\n');}
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            PodatkiUporabnika a = gson.fromJson(sb.toString(), PodatkiUporabnika.class);
            anek=a;
        }catch (FileNotFoundException e){
            // btnTag.setText(e.toString());

        }catch (IOException e){
            // btnTag.setText(e.toString());


        }
    }


    }
