package com.example.khbuddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;

public class kh2Armor extends AppCompatActivity {

    private RecyclerView rView;
    private KH2keybladeAdapter mAdapter;
    private ArrayList<ItemsK> driveList;
    private RecyclerView.LayoutManager myLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kh2_puzz);
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

        driveList.add(new ItemsK (R.drawable.abaschain, "Abas Chain", "Kupo's Moogle Shop", "Def: +1" +
                "", "", "Ice Res: 20%\t\t\tFire Res: 20%\nElec Res: 20%" +
                "\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.acris, "Acrisius", "Item Synth", "Def: +3" +
                "", "", "Ice Res: 20%\t\t\tFire Res: 20%\nElec Res: 20%" +
                "\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.acrisp, "Acrisius+", "Item Synth", "Def: +3" +
                "", "", "Ice Res: 25%\t\t\tFire Res: 25%\nElec Res: 25%" +
                "\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.aegischain, "Aegis Chain", "Mojito's and Artemicion's Moogle Shops", "Def: +2" +
                "", "", "Ice Res: 20%\t\t\tFire Res: 20%\nElec Res: 20%" +
                "\t\t\tDark Res: 0%"));

        driveList.add(new ItemsK (R.drawable.bam, "Blizzard Armlet", "Kupo's Moogle Shop", "Def: +1" +
                "", "", "Ice Res: 20%\t\t\tFire Res: 0%\nElec Res: 0%" +
                "\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.baraam, "Blizzara Armlet", "Mojito's Moogle Shop", "Def: +2" +
                "", "", "Ice Res: 20%\t\t\tFire Res: 0%\nElec Res: 0%" +
                "\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.bagaarm, "Blizzaga Armlet", "Item Synth", "Def: +3" +
                "", "", "Ice Res: 20%\t\t\tFire Res: 0%\nElec Res: 0%" +
                "\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.bgunarm, "Blizzagun Armlet", "Item Synth", "Def: +3" +
                "", "", "Ice Res: 25%\t\t\tFire Res: 0%\nElec Res: 0%" +
                "\t\t\tDark Res: 0%"));

        driveList.add(new ItemsK (R.drawable.bband, "Buster Band", "Item Synth", "Def: +5" +
                "", "", "Ice Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%" +
                "\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.champbelt, "Champion Belt", "Defeat Setzer", "Def: +0" +
                "", "", "Ice Res: 20%\t\t\tFire Res: 20%\nElec Res: 20%" +
                "\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.cbelt, "Cosmic Belt", "Chest at Twilight's View", "Def: +6" +
                "", "", "Ice Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%" +
                "\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.cchain, "Cosmic Chain", "Chest at Heartless Manufactory", "Def: +3" +
                "", "", "Ice Res: 30%\t\t\tFire Res: 30%\nElec Res: 30%" +
                "\t\t\tDark Res: 0%"));

        driveList.add(new ItemsK (R.drawable.divine, "Divine Bandana", "Mogjiro's and Mogjito's Moogle Shops.", "Def: +2" +
                "", "", "Ice Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%" +
                "\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.elven, "Elven Bandana", "Biggs' Armor Shop; chest at the Mansion: D. Room", "Def: +1" +
                "", "", "Ice Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%" +
                "\t\t\tDark Res: 0%"));

        driveList.add(new ItemsK (R.drawable.fbangle, "Fire Bangle", "Kupo's Moogle Shop", "Def: +1" +
                "", "", "Ice Res: 0%\t\t\tFire Res: 20%\nElec Res: 0%" +
                "\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.firabangle, "Fira Bangle", "Mojito's Moogle Shop", "Def: +2" +
                "", "", "Ice Res: 0%\t\t\tFire Res: 20%\nElec Res: 0%" +
                "\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.fagabang, "Firaga Bangle", "Item Synth", "Def: +3" +
                "", "", "Ice Res: 0%\t\t\tFire Res: 20%\nElec Res: 0%" +
                "\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.fgunbang, "Firagun Bangle", "Item Synth", "Def: +3" +
                "", "", "Ice Res: 0%\t\t\tFire Res: 25%\nElec Res: 0%" +
                "\t\t\tDark Res: 0%"));

        driveList.add(new ItemsK (R.drawable.gaiabelt, "Gaia Belt", "Chest at the I/O Tower: Comms Room", "Def: +3" +
                "", "", "Ice Res: 0%\t\t\tFire Res: 0%\nElec Res: 20%" +
                "\t\t\tDark Res: 20%"));
        driveList.add(new ItemsK (R.drawable.pribb, "Petit Ribbon", "Item Synth", "Def: +4" +
                "", "", "Ice Res: 10%\t\t\tFire Res: 10%\nElec Res: 10%" +
                "\t\t\tDark Res: 10%"));
        driveList.add(new ItemsK (R.drawable.ribb, "Ribbon", "Item Synth, default item in Beginner", "Def: +4" +
                "", "", "Ice Res: 15%\t\t\tFire Res: 15%\nElec Res: 15%" +
                "\t\t\tDark Res: 15%"));
        driveList.add(new ItemsK (R.drawable.gribb, "Grand Ribbon", "Item Synth", "Def: +4" +
                "", "", "Ice Res: 25%\t\t\tFire Res: 25%\nElec Res: 25%" +
                "\t\t\tDark Res: 25%"));

        driveList.add(new ItemsK (R.drawable.pband, "Power Band", "Item Synth", "Def: +4" +
                "", "", "Ice Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%" +
                "\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.probelt, "Protect Belt", "Finish the Cerberus Cup", "Def: +3" +
                "", "", "Ice Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%" +
                "\t\t\tDark Res: 0%"));

        driveList.add(new ItemsK (R.drawable.sank, "Shadow Anklet", "Biggs' Armor Shop", "Def: +1" +
                "", "", "Ice Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%" +
                "\t\t\tDark Res: 20%"));
        driveList.add(new ItemsK (R.drawable.dank, "Dark Anklet", "Mogjiro's Moogle Shop", "Def: +2" +
                "", "", "Ice Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%" +
                "\t\t\tDark Res: 20%"));
        driveList.add(new ItemsK (R.drawable.mank, "Midnight Anklet", "Item Synth", "Def: +3" +
                "", "", "Ice Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%" +
                "\t\t\tDark Res: 20%"));
        driveList.add(new ItemsK (R.drawable.cank, "Chaos Anklet", "Item Synth", "Def: +3" +
                "", "", "Ice Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%" +
                "\t\t\tDark Res: 25%"));

        driveList.add(new ItemsK (R.drawable.ttrink, "Thunder Trinket", "Biggs' Armor Shop", "Def: +1" +
                "", "", "Ice Res: 0%\t\t\tFire Res: 0%\nElec Res: 20%" +
                "\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.taratrink, "Thundara Trinket", "Mogjiro's Moogle Shop", "Def: +2" +
                "", "", "Ice Res: 0%\t\t\tFire Res: 0%\nElec Res: 20%" +
                "\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.tagatrink, "Thundaga Trinkett", "Item Synth", "Def: +3" +
                "", "", "Ice Res: 0%\t\t\tFire Res: 0%\nElec Res: 20%" +
                "\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.tguntrink, "Thunagun Trinket", "Item Synth", "Def: +3" +
                "", "", "Ice Res: 0%\t\t\tFire Res: 0%\nElec Res: 25%" +
                "\t\t\tDark Res: 0%"));

        driveList.add(new ItemsK (R.drawable.scharm, "Shock Charm", "Item Synth", "Def: +3" +
                "", "", "Ice Res: 0%\t\t\tFire Res: 0%\nElec Res: 40%" +
                "\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.scharmp, "Shock Charm+", "Item Synth", "Def: +3\t\t\tGrants Thunder Boost" +
                "", "", "Ice Res: 0%\t\t\tFire Res: 0%\nElec Res: 40%" +
                "\t\t\tDark Res: 0%"));




        driveList.add(new ItemsK (R.drawable.emptykh2, "", "", "",
                "", ""));

    }

    public void showItem (int position) {


        String toToast = driveList.get(position).getText1();
        //Toast toast = Toast. makeText(getApplicationContext(), toToast + " selected", Toast. LENGTH_SHORT);
        //toast.show();

        if(toToast.equals("emptykh1 Form")) {
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
        mAdapter = new KH2keybladeAdapter(driveList);
        rView.setLayoutManager(myLayout);
        rView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new KH2keybladeAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                showItem(position);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater mInfalter = getMenuInflater();
        mInfalter.inflate(R.menu.menu, menu);

        MenuItem searchI = menu.findItem(R.id.action_search);
        SearchView searchV = (SearchView) searchI.getActionView();

        searchV.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                mAdapter.getFilter().filter(s);
                return false;
            }
        });
        return true;
    }
}

