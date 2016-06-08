package com.example.ajmrs.fithelper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

//import com.example.VajeFitness;

public class MainActivity extends AppCompatActivity {
    public PodatkiUporabnika anek;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openIntent(View view) {
        Intent intent = new Intent(this, activityVaje.class);
        startActivity(intent);
        anek=new PodatkiUporabnika();
     //   VajeFitness a=new VajeFitness();
      //  Button but=(Button)findViewById(R.id.buttonNastavitve);

     //   a.lal=3;
//but.setText(a.lal);
    }




}
