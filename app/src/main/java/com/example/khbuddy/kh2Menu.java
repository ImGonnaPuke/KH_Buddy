package com.example.khbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


public class kh2Menu extends AppCompatActivity {

    private static Button spells1;
    private static Button part1;
    private static Button acc1;
    private static Button drive1;
    private static Button key1;
    private static Button skill1;
    private static Button synth1;
    private static Button summ1;
    private static Button arm1;
    private static Button puzz1;
    public static AdView mAdView;


    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kh2_menu);

        int currentOrientation = getResources().getConfiguration().orientation;
        if (currentOrientation == Configuration.ORIENTATION_PORTRAIT) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }else {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }




        spells1 = (Button) findViewById(R.id.spells);
        part1 = (Button) findViewById(R.id.part);
        acc1 = (Button) findViewById(R.id.acc);
        drive1 = (Button) findViewById(R.id.drive);
        key1 = (Button) findViewById(R.id.key);
        skill1 = (Button) findViewById(R.id.skill);
        synth1 = (Button) findViewById(R.id.syth);
        summ1 = (Button) findViewById(R.id.summ);
        arm1 = (Button) findViewById(R.id.arm);
        puzz1 = (Button) findViewById(R.id.puzz);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mAdView.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded(){
                //Toast toast = Toast. makeText(getApplicationContext(), "Working!!", Toast. LENGTH_SHORT);
                //toast.show();
            }
            @Override
            public void onAdFailedToLoad(int errorCode){
                //Toast toast = Toast. makeText(getApplicationContext(), "Failed!! Code: " + errorCode, Toast. LENGTH_SHORT);
                //toast.show();
            }




        });



        drive1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                //Toast toast = Toast. makeText(getApplicationContext(), "This feature is not yet avaliable", Toast. LENGTH_SHORT);
                //toast.show();
                startActivity(new Intent(kh2Menu.this, Drives.class));
            }
        });
        puzz1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                //Toast toast = Toast. makeText(getApplicationContext(), "This feature is not yet avaliable", Toast. LENGTH_SHORT);
                //toast.show();
                startActivity(new Intent(kh2Menu.this, kh2Puzz.class));
            }
        });
        summ1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                //Toast toast = Toast. makeText(getApplicationContext(), "This feature is not yet avaliable", Toast. LENGTH_SHORT);
                //toast.show();
                startActivity(new Intent(kh2Menu.this, kh2Summon.class));
            }
        });

        spells1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                //Toast toast = Toast. makeText(getApplicationContext(), "This feature is not yet avaliable", Toast. LENGTH_SHORT);
                //toast.show();
                startActivity(new Intent(kh2Menu.this, kh2Spells.class));
            }
        });

        key1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                //Toast toast = Toast. makeText(getApplicationContext(), "This feature is not yet avaliable", Toast. LENGTH_SHORT);
                //toast.show();
                startActivity(new Intent(kh2Menu.this, kh2Keyblades.class));
            }
        });

        acc1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                //Toast toast = Toast. makeText(getApplicationContext(), "This feature is not yet avaliable", Toast. LENGTH_SHORT);
                //toast.show();
                startActivity(new Intent(kh2Menu.this, kh2Acc.class));
            }
        });

        synth1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                //Toast toast = Toast. makeText(getApplicationContext(), "This feature is not yet avaliable", Toast. LENGTH_SHORT);
                //toast.show();
                startActivity(new Intent(kh2Menu.this, kh2Synth.class));
            }
        });

        part1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                //Toast toast = Toast. makeText(getApplicationContext(), "This feature is not yet avaliable", Toast. LENGTH_SHORT);
                //toast.show();
                startActivity(new Intent(kh2Menu.this, kh2Partner.class));
            }
        });

        skill1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                //Toast toast = Toast. makeText(getApplicationContext(), "This feature is not yet avaliable", Toast. LENGTH_SHORT);
                //toast.show();
                startActivity(new Intent(kh2Menu.this, kh2Skill.class));
            }
        });

        arm1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                //Toast toast = Toast. makeText(getApplicationContext(), "This feature is not yet avaliable", Toast. LENGTH_SHORT);
                //toast.show();
                startActivity(new Intent(kh2Menu.this, kh2Armor.class));
            }
        });



    }



}
