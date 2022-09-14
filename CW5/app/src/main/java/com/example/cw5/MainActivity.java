package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Fruits> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fruits fruit1 = new Fruits("Strawberry",1.2,R.drawable.strawberry);
        Fruits fruit2 = new Fruits("Kiwi",0.9,R.drawable.kiwii);
        Fruits fruit3 = new Fruits("Pineapple",0.5,R.drawable.ppineapple);
        Fruits fruit4 = new Fruits("Grape",0.65,R.drawable.ggrape);
        Fruits fruit5 = new Fruits("Cherry",0.8,R.drawable.ch);
        Fruits fruit6 = new Fruits("Watermelon",1.5,R.drawable.watermelon);

        fruitList.add(fruit1);
        fruitList.add(fruit2);
        fruitList.add(fruit3);
        fruitList.add(fruit4);
        fruitList.add(fruit5);
        fruitList.add(fruit6);

        RecyclerView recycler = findViewById(R.id.rv);
        recycler.setHasFixedSize(true);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recycler.setLayoutManager(manager);

        ItemAdapter adapter = new ItemAdapter(fruitList,this);
        recycler.setAdapter(adapter);






    }
}