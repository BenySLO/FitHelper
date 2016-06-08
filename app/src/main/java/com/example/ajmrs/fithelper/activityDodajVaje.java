package com.example.ajmrs.fithelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

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
import java.io.PrintWriter;
import java.util.ArrayList;

public class activityDodajVaje extends AppCompatActivity {

    PodatkiUstvariVaje vseVaje;
    PodatkiUporabnika anek;
    TextView btnTag;
    Button opravoVajeoButton;
    private ArrayList<PodatkiVaje> vajeButtons;
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        shrani();
    }

    //private VsiPodatki mPodatki;
    //PodatkiUstvariVaje vseVaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        anek=new PodatkiUporabnika();
        super.onCreate(savedInstanceState);
        opravoVajeoButton=(Button)findViewById(R.id.buttonSeriaPlus);
        setContentView(R.layout.activity_activity_dodaj_vaje);
        Button opravoVajeo;
        if((new File(getFilesDir(), "neki.bin")).exists()) {
            beri();
        }
        LinearLayout layout=(LinearLayout) findViewById(R.id.linearLayoutVaje);
       // btnTag = (TextView) findViewById(null);
        vseVaje=new PodatkiUstvariVaje();


        //vseVaje.dodajPodatke();
        for(int i=0;i<vseVaje.getVseVaje().size();i++) {
            if (!containa(vseVaje.getVseVaje().get(i))) {
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
                                shrani();
                                break;
                            }
                        }
                        finish();
                        startActivity(getIntent());
                    }
                });

                layout.addView(btnTag);
            }
        }

    }

private boolean containa(PodatkiVaje tuletmp){
    LinearLayout layout=(LinearLayout) findViewById(R.id.linearLayoutVaje);

boolean jeni=false;
    for(int i=0;i<anek.getNazivVaje().size();i++) {

      if(anek.getNazivVaje().get(i).getNazivVaje().equals(tuletmp.getNazivVaje())){



            jeni=true;
        }


    }
return jeni;


}

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

        }




    }



}
