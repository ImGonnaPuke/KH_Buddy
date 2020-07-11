package com.example.khbuddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class Drives extends AppCompatActivity {

    private RecyclerView rView;
    private RecAdapter mAdapter;
    private ArrayList<Items> driveList;
    private RecyclerView.LayoutManager myLayout;

    //private String s1[], s2[];
    //int images[] = {R.drawable.valor, R.drawable.wisdom, R.drawable.limit, R.drawable.master, R.drawable.finalf, R.drawable.heartless};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drives);

        genList();
        buildRecycle();



    }

    public void genList(){
        driveList = new ArrayList<>();
        driveList.add(new Items (R.drawable.valor, "Valor Form", "Obtained at Mysterious Tower"));
        driveList.add(new Items (R.drawable.wisdom, "Wisdom Form", "Obtained after completing Timeless River"));
        driveList.add(new Items (R.drawable.master, "Master Form", "After the second visit to Hollow Bastion"));
        driveList.add(new Items (R.drawable.valor, "Master Form", "Obtained after reuniting with \nMickey at Hollow Bastion"));
        driveList.add(new Items (R.drawable.finalf, "Final Form", "Obtained after fighting Roxas, randomly \nupon activating any drive"));
        driveList.add(new Items (R.drawable.heartless, "Anti Form", "Activated randomly upon using drive \nforms 5 or  more times"));
    }

    public void showItem (int position) {


        String toToast = driveList.get(position).getText1();
        //Toast toast = Toast. makeText(getApplicationContext(), toToast + " selected", Toast. LENGTH_SHORT);
        //toast.show();

        if(toToast.equals("Valor Form")) {
            startActivity(new Intent(Drives.this, kh2Menu.class));
        }
        else{
            Toast toast = Toast. makeText(getApplicationContext(), toToast + " is a nigger form", Toast. LENGTH_SHORT);
            toast.show();
        }

    }

    public void buildRecycle(){
        rView = (RecyclerView) findViewById(R.id.recView);
        rView.setHasFixedSize(true);
        myLayout = new LinearLayoutManager(this);
        mAdapter = new RecAdapter(driveList);
        rView.setLayoutManager(myLayout);
        rView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new RecAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                showItem(position);
            }
        });


    }
}
