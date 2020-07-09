package com.example.khbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class kh1Menu extends AppCompatActivity {

    private static Button spells1;
    private static Button part1;
    private static Button acc1;
    //private static Button drive1;
    private static Button key1;
    private static Button skill1;
    private static Button synth1;
    private static Button summ1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kh1_menu);


        spells1 = (Button) findViewById(R.id.spells);
        part1 = (Button) findViewById(R.id.part);
        acc1 = (Button) findViewById(R.id.acc);
        //drive1 = (Button) findViewById(R.id.drive);
        key1 = (Button) findViewById(R.id.key);
        skill1 = (Button) findViewById(R.id.skill);
        synth1 = (Button) findViewById(R.id.syth);
        summ1 = (Button) findViewById(R.id.summ);



    }
}
