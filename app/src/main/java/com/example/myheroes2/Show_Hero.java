package com.example.myheroes2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Show_Hero extends AppCompatActivity {

    TextView txtHeroName;
    ImageView imgSuperHero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_hero);

        txtHeroName = (TextView) findViewById(R.id.txtHeroName);
        imgSuperHero = (ImageView) findViewById(R.id.imgSuperHero);

        Intent intent = getIntent();
        String heroname = "Hero is "+intent.getExtras().getString("HeroName");
        txtHeroName.setText(heroname);

        int resImg = intent.getExtras().getInt("ResNo");
        imgSuperHero.setImageResource(getResources().getIdentifier("hero"+resImg, "drawable",getPackageName()));
    }
}