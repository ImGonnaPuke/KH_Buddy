package com.example.khbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static Button kh1Butt;
    private static Button kh2Butt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kh1Butt = (Button) findViewById(R.id.kh1);
        kh2Butt = (Button) findViewById(R.id.kh2);

        kh1Butt.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Toast toast = Toast. makeText(getApplicationContext(), "This feature is not yet avaliable", Toast. LENGTH_SHORT);
                toast.show();
                //startActivity(new Intent(MainActivity.this, kh1Menu.class));
            }
        });

        kh2Butt.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                startActivity(new Intent(MainActivity.this, kh2Menu.class));
            }
        });


    }


}
