package com.example.cardviewdemo1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
List<CardViewData> card_ViewData_List;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));




        card_ViewData_List=new ArrayList<>();





        card_ViewData_List.add(new CardViewData("Yogesh","Android Developer"));
        card_ViewData_List.add(new CardViewData("Yogesh","Android Developer"));
        card_ViewData_List.add(new CardViewData("Yogesh","Android Developer"));
        card_ViewData_List.add(new CardViewData("Yogesh","Android Developer"));
        card_ViewData_List.add(new CardViewData("Yogesh","Android Developer"));

        CardViewAdapter adapter=new CardViewAdapter(this,card_ViewData_List);
        recyclerView.setAdapter(adapter);

    }
}
