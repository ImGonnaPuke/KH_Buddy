package com.example.khbuddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;

public class kh1Summon extends AppCompatActivity {

    private RecyclerView rView;
    private RecAdapter mAdapter;
    private ArrayList<Items> driveList;
    private RecyclerView.LayoutManager myLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kh1_dal);

        genList();
        buildRecycle();

        AdView mAdView;
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);




    }

    public void genList(){
        driveList = new ArrayList<>();
        driveList.add(new Items (R.drawable.simba, "Simba", "Eathshine Gem from Leon in the Secret\nWaterway"));
        driveList.add(new Items (R.drawable.genie, "Genie", "Complete Agrabah"));
        driveList.add(new Items (R.drawable.dumbo, "Dumbo", "Chest in Monstro's Mouth"));
        driveList.add(new Items (R.drawable.tink, "Tinker Bell", "Complete Neverland"));
        driveList.add(new Items (R.drawable.mushu, "Mushu", "Defeat Dragon Maleficent"));

        driveList.add(new Items (R.drawable.bambi, "Bambi", "Complete the Hunny Tree minigame"));
        driveList.add(new Items (R.drawable.emptykh1, "", ""));

    }

    public void showItem (int position) {


        String toToast = driveList.get(position).getText1();
        //Toast toast = Toast. makeText(getApplicationContext(), toToast + " selected", Toast. LENGTH_SHORT);
        //toast.show();

        if(toToast.equals("Valor Form")) {
            //startActivity(new Intent(Drives.this, kh2Menu.class));
        }
        else{
            Toast toast = Toast. makeText(getApplicationContext(), toToast + " selected", Toast. LENGTH_SHORT);
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
