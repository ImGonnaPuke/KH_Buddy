package com.example.khbuddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Drives extends AppCompatActivity {

    RecyclerView rView;

    String s1[], s2[];
    int images[] = {R.drawable.valor, R.drawable.wisdom, R.drawable.limit, R.drawable.master, R.drawable.finalf, R.drawable.heartless};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drives);

        rView = (RecyclerView) findViewById(R.id.recView);
        //s1[0] = "Wisdom";
        //s2[0] = "Received at...";

        s1 = getResources().getStringArray(R.array.driveForms);
        s2 = getResources().getStringArray(R.array.driveDesc);

        RecAdapter myAdapter = new RecAdapter(this, s1, s2, images);
        rView.setAdapter(myAdapter);
        rView.setLayoutManager(new LinearLayoutManager(this));



    }
}
