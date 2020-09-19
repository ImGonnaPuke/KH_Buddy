package com.example.khbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import static com.example.khbuddy.kh2Menu.mAdView;

public class kh1Menu extends AppCompatActivity {

    private static Button spells1;
    private static Button part1;
    private static Button acc1;
    //private static Button drive1;
    private static Button key1;
    private static Button skill1;
    private static Button synth1;
    private static Button summ1;
    private static Button dal1;


    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kh1_menu);

        int currentOrientation = getResources().getConfiguration().orientation;
        if (currentOrientation == Configuration.ORIENTATION_PORTRAIT) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }else {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }


        spells1 = (Button) findViewById(R.id.spells);
        part1 = (Button) findViewById(R.id.part);
        acc1 = (Button) findViewById(R.id.acc);
        //drive1 = (Button) findViewById(R.id.drive);
        key1 = (Button) findViewById(R.id.key);
        skill1 = (Button) findViewById(R.id.skill);
        synth1 = (Button) findViewById(R.id.syth);
        summ1 = (Button) findViewById(R.id.summ);
        dal1 = (Button) findViewById(R.id.dal);

        AdView mAdView;
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        summ1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                //Toast toast = Toast. makeText(getApplicationContext(), "This feature is not yet avaliable", Toast. LENGTH_SHORT);
                //toast.show();
                startActivity(new Intent(kh1Menu.this, kh1Summon.class));
            }
        });

        dal1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                //Toast toast = Toast. makeText(getApplicationContext(), "This feature is not yet avaliable", Toast. LENGTH_SHORT);
                //toast.show();
                startActivity(new Intent(kh1Menu.this, kh1Dal.class));
            }
        });

        spells1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                //Toast toast = Toast. makeText(getApplicationContext(), "This feature is not yet avaliable", Toast. LENGTH_SHORT);
                //toast.show();
                startActivity(new Intent(kh1Menu.this, kh1Spells.class));
            }
        });

        key1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                //Toast toast = Toast. makeText(getApplicationContext(), "This feature is not yet avaliable", Toast. LENGTH_SHORT);
                //toast.show();
                startActivity(new Intent(kh1Menu.this, kh1Keyblades.class));
            }
        });

        acc1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                //Toast toast = Toast. makeText(getApplicationContext(), "This feature is not yet avaliable", Toast. LENGTH_SHORT);
                //toast.show();
                startActivity(new Intent(kh1Menu.this, kh1Acc.class));
            }
        });

        synth1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                //Toast toast = Toast. makeText(getApplicationContext(), "This feature is not yet avaliable", Toast. LENGTH_SHORT);
                //toast.show();
                startActivity(new Intent(kh1Menu.this, kh1Synth.class));
            }
        });

        part1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                //Toast toast = Toast. makeText(getApplicationContext(), "This feature is not yet avaliable", Toast. LENGTH_SHORT);
                //toast.show();
                startActivity(new Intent(kh1Menu.this, kh1Partner.class));
            }
        });

        skill1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                //Toast toast = Toast. makeText(getApplicationContext(), "This feature is not yet avaliable", Toast. LENGTH_SHORT);
                //toast.show();
                startActivity(new Intent(kh1Menu.this, kh1Skill.class));
            }
        });



    }



}
