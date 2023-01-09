package com.example.myheroes2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvSuperHero;
    String[] items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvSuperHero = (ListView) findViewById(R.id.lvSuperHero);
        items = getResources().getStringArray(R.array.superHeroArray);

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,items);
        lvSuperHero.setAdapter(adapter);

        lvSuperHero.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String Nameposition = items[i];
//                String res = "hero"+i;
                Intent intent = new Intent(MainActivity.this, Show_Hero.class);
                Bundle bundle = new Bundle();
                bundle.putString("HeroName", Nameposition);
                bundle.putInt("ResNo",i);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}