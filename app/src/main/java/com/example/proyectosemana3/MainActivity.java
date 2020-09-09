package com.example.proyectosemana3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    private int sumas;
    Mascota mas;
   //ArrayList<Mascota>mascotasSuma;

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ///////TOOL BAR
        Toolbar miActionBAr=(Toolbar)findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBAr);
        ///////TOOL BAR

        listaMascotas=(RecyclerView)findViewById(R.id.rvMascotas);
        //LinearLayoutManager llm = new LinearLayoutManager(this);
        //llm.setOrientation(LinearLayoutManager.VERTICAL);

        LinearLayoutManager llm= new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        incializarListaDeMAscotas();
        inicializarAdapatador();


        //mascotas.get()









    }


    public void irSegundaActividad(View v){
        Intent intent =new Intent(this, segundoActivity.class);
        startActivity(intent);
    }

    public void inicializarAdapatador(){
        MascotaAdaptador adaptador= new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void incializarListaDeMAscotas(){
        mascotas =new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.masco1,"Pollito",5));
        mascotas.add(new Mascota(R.drawable.masco2,"Pulpito",3));
        mascotas.add(new Mascota(R.drawable.masco3,"Conejito",2));
        mascotas.add(new Mascota(R.drawable.masco4,"Perrito",1));
        mascotas.add(new Mascota(R.drawable.masco5,"Monito",0));
        mascotas.add(new Mascota(R.drawable.masco6,"Gatito",1));
        mascotas.add(new Mascota(R.drawable.masco7,"Croco",4));



    }

    //public void sumarRaiting(){
      //  mascotas.

    //}




}
