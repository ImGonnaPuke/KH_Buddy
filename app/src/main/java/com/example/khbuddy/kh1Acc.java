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

public class kh1Acc extends AppCompatActivity {

    private RecyclerView rView;
    private KH2keybladeAdapter mAdapter;
    private ArrayList<ItemsK> driveList;
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

        driveList.add(new ItemsK (R.drawable.slayer, "Ability Stud", "Accessory Shop in Traverse Town", "AP: +2" +
                " \t\t\tHP: +0\t\t\tDef: +0", "Str: +0", "MP: +0  \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%" +
                "\t\t\tDark Res: 0%"));

        driveList.add(new ItemsK (R.drawable.drawring, "Angel Bangle", "Item Synth, chest at Gate to the Darkness", "AP: +0 \t\t\tHP: +6\t\t\tDef: +2",
                "Str: +0", "MP: +0  \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.garn, "Atlas Armlet", "Item Synth", "AP: +0 \t\t\tHP: +0\t\t\tDef: +2",
                "Str: +0", "MP: +2  \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));

        driveList.add(new ItemsK (R.drawable.bam, "Blizzard Ring", "Equipped to Beast", "AP: +0 \t\t\tHP: +0\t\t\tDef: +1",
                "Str: +0", "MP: +0 \t\t\tIce Res: 20%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.baraam, "Blizzara Ring", "Blue Rhapsody .5%, chest at Rising Falls", "AP: +0 \t\t\tHP: +0\t\t\tDef: +2",
                "Str: +0", "MP: +0 \t\t\tIce Res: 20%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.bagaarm, "Blizzaga Ring", "Sea Neon .2% and Sheltering Zone 1%", "AP: +0 \t\t\tHP: +0\t\t\tDef: +3",
                "Str: +0", "MP: +0 \t\t\tIce Res: 20%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.bgunarm, "Blizzagun Band", "Accessory Shop", "AP: +0 \t\t\tHP: +0\t\t\tDef: +2",
                "Str: +2", "MP: +0 \t\t\tIce Res: 20%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));

        driveList.add(new ItemsK (R.drawable.cbelt, "Brave Warrior", "Defeat Guard Armor, World Terminus chest", "AP: +0 \t\t\tHP: +3\t\t\tDef: +0",
                "Str: +1", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.cank, "Chaos Ring", "Accessory Shop", "AP: +0 \t\t\tHP: +0\t\t\tDef: +0",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.cosmicarts, "Cosmic Arts", "Item Synth", "AP: +2 \t\t\tHP: +9\t\t\tDef: +0",
                "Str: +0", "MP: +2 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.masterring, "Crystal Crown", "Item Synth", "AP: +3 \t\t\tHP: +6\t\t\tDef: +2",
                "Str: +2", "MP: +1 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.mank, "Dark Ring", "Item Synth", "AP: +0 \t\t\tHP: +0\t\t\tDef: +3",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 20%"));

        driveList.add(new ItemsK (R.drawable.diamond, "Element Ring", "Accessory Shop, Battleship (2%)", "AP: +0 \t\t\tHP: +0\t\t\tDef: +2",
                "Str: +0", "MP: +0 \t\t\tIce Res: 20%\t\t\tFire Res: 20%\nElec Res: 20%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.tour, "Energy Bangle", "Item Synth", "AP: +0 \t\t\tHP: +3\t\t\tDef: +1",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.sarchive, "EXP Bracelet", "Item Synth", "AP: +0 \t\t\tHP: +0\t\t\tDef: -2",
                "Str: -2", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%\t\t\tEXP: +30%"));
        driveList.add(new ItemsK (R.drawable.magering, "EXP Earring", "Item Synth", "AP: +0 \t\t\tHP: +0\t\t\tDef: +0",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%\t\t\tEXP: +20%"));
        driveList.add(new ItemsK (R.drawable.sarchiveplus, "EXP Necklace", "Defeat Unknown, start with on Beginner", "AP: +2 \t\t\tHP: +0\t\t\tDef: +0",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%\t\t\tEXP: +30%"));

        driveList.add(new ItemsK (R.drawable.platring, "EXP Ring", "Finish 100 Acre Wood", "AP: +1 \t\t\tHP: +0\t\t\tDef: +0",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%\t\t\tEXP: +20%"));
        driveList.add(new ItemsK (R.drawable.fbangle, "Fire Ring", "Accessory Shop, chest in Agrabah,\non Alladin and Jack", "AP: +0 \t\t\tHP: +0\t\t\tDef: +1",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 20%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.firabangle, "Fira Ring", "Accessory Shop, chest in Hollow Bastion,\nRed Nocturne (.5%)", "AP: +0 \t\t\tHP: +0\t\t\tDef: +2",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 20%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.fagabang, "Firaga Ring", "Accessory Shop, Fat Bandit (1%)", "AP: +0 \t\t\tHP: +0\t\t\tDef: +3",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 20%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.fgunbang, "Firagun Ring", "Accessory Shop", "AP: +0 \t\t\tHP: +0\t\t\tDef: +2",
                "Str: +2", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 20%\nElec Res: 0%\t\t\tDark Res: 0%"));

        driveList.add(new ItemsK (R.drawable.gaiabelt, "Gaia Bangle", "Item Synth", "AP: +0 \t\t\tHP: +9\t\t\tDef: +3",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.aegischain, "Golem Chain", "Item Synth", "AP: +0 \t\t\tHP: +0\t\t\tDef: +1",
                "Str: +3", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.soldering, "Guard Earring", "Item Synth", "AP: +3 \t\t\tHP: +0\t\t\tDef: +1",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.goldring, "Heartguard", "Item Synth", "AP: +0 \t\t\tHP: +3\t\t\tDef: +4",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.gribb, "Holy Circlet", "Halloween Town", "AP: +3 \t\t\tHP: +0\t\t\tDef: +0",
                "Str: +0", "MP: +0 \t\t\tIce Res: 20%\t\t\tFire Res: 20%\nElec Res: 20%\t\t\tDark Res: 0%"));

        driveList.add(new ItemsK (R.drawable.gaiabelt, "Ifrit Belt", "White Trinity in Agrabah", "AP: +0 \t\t\tHP: +0\t\t\tDef: +0",
                "Str: +3", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 40%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.fullbloomplus, "Ifrit's Horn", "Wonderland", "AP: +1 \t\t\tHP: +0\t\t\tDef: +1",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 20%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.pribb, "Inferno Band", "Defeat Cerberus in the Prelims", "AP: +0 \t\t\tHP: +0\t\t\tDef: +2",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 20%\nElec Res: 0%\t\t\tDark Res: 20%"));
        driveList.add(new ItemsK (R.drawable.skillfulring, "Magic Armlet", "Item Synth", "AP: +0 \t\t\tHP: +0\t\t\tDef: +0",
                "Str: +0", "MP: +1 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.fencering, "Master Earring", "Item Synth", "AP: +4 \t\t\tHP: +0\t\t\tDef: +2",
                "Str: +0", "MP: +1 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));


        driveList.add(new ItemsK (R.drawable.pribb, "Moogle Band", "Item Synth", "AP: +2 \t\t\tHP: +6\t\t\tDef: +0",
                "Str: +0", "MP: +1 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.orichalring, "Obsidian Ring", "Accessory Shop", "AP: +0 \t\t\tHP: +0\t\t\tDef: +0",
                "Str: +1", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 20%"));
        driveList.add(new ItemsK (R.drawable.moonam, "Omega Arts", "Behemoth, chest at Gate to The Dark", "AP: +0 \t\t\tHP: +3\t\t\tDef: +3",
                "Str: +3", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.pband, "Power Chain", "Item Synth", "AP: +0 \t\t\tHP: +0\t\t\tDef: +0",
                "Str: +2", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.probelt, "Protect Chain", "Accessory Shop, chest at Destiny Islands,\nDeep Jungle Soldier(1%), most partners", "AP: +0 \t\t\tHP: +0\t\t\tDef: +1",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));

        driveList.add(new ItemsK (R.drawable.probelt, "Protectera Chain", "Accessory Shop, chests in Agrabah and\nNeverland, dropped by some enemies", "AP: +0 \t\t\tHP: +0\t\t\tDef: +3",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.probelt, "Protectega Chain", "Acessory Shop", "AP: +0 \t\t\tHP: +0\t\t\tDef: +3",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.scharmp, "Ramuh Belt", "Chest in Hollow Bastion", "AP: +2 \t\t\tHP: +0\t\t\tDef: +0",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 20%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.cank, "Raven's Claw", "Neverland - AntiSora", "AP: +0 \t\t\tHP: +0\t\t\tDef: +2",
                "Str: +2", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 20%"));
        driveList.add(new ItemsK (R.drawable.pribb, "Ray of Light", "Agrabah - Pot Centipede", "AP: +0 \t\t\tHP: +3\t\t\tDef: +0",
                "Str: +0", "MP: +1 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));

        driveList.add(new ItemsK (R.drawable.ribb, "Ribbon", "Item Synth, 90 Dalmations,\ndefault in Beginner", "AP: +0 \t\t\tHP: +0\t\t\tDef: +3",
                "Str: +0", "MP: +0 \t\t\tIce Res: 20%\t\t\tFire Res: 20%\nElec Res: 20%\t\t\tDark Res: 20%"));
        driveList.add(new ItemsK (R.drawable.executive, "Royal Crown", "Chest in Hollow Bastion", "AP: +0 \t\t\tHP: +0\t\t\tDef: +0",
                "Str: -2", "MP: +2 \t\t\tIce Res: 20%\t\t\tFire Res: 20%\nElec Res: 20%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.bband, "Rune Armlet", "Item Synth", "AP: +0 \t\t\tHP: +0\t\t\tDef: +2",
                "Str: +0", "MP: +1 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.champbelt, "Shiva Belt", "Chest in Olympus Colisseum", "AP: +0 \t\t\tHP: +0\t\t\tDef: +0",
                "Str: +0", "MP: +2 \t\t\tIce Res: 40%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.scharm, "Three Stars", "Item Synth", "AP: +0 \t\t\tHP: +0\t\t\tDef: +2",
                "Str: +0", "MP: +0 \t\t\tIce Res: 20%\t\t\tFire Res: 20%\nElec Res: 20%\t\t\tDark Res: 0%"));



        driveList.add(new ItemsK (R.drawable.ttrink, "Thunder Ring", "Accessory Shop, chest in Agrabah, Ariel", "AP: +0 \t\t\tHP: +0\t\t\tDef: +1",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 20%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.taratrink, "Thundara Ring", "Accessory Shop, chest in Hollow Bastion,\n" +
                "Yellow Opera (.5%)", "AP: +0 \t\t\tHP: +0\t\t\tDef: +2",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 20%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.tagatrink, "Thundaga Ring", "Accessory Shop, Aquatank(1%),\nScrewdriver(.2%),", "AP: +0 \t\t\tHP: +0\t\t\tDef: +3",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 20%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.tguntrink, "Thundagun Ring", "Accessory Shop", "AP: +0 \t\t\tHP: +0\t\t\tDef: +2",
                "Str: +2", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 20%\t\t\tDark Res: 0%"));

        driveList.add(new ItemsK (R.drawable.cchain, "Titan Chain", "Item Synth", "AP: +0 \t\t\tHP: +0\t\t\tDef: +2",
                "Str: +4", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.fullbloom, "White Fang", "Deep Jungle - Kill Sabor", "AP: +1 \t\t\tHP: +0\t\t\tDef: +1",
                "Str: +1", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));

        driveList.add(new ItemsK (R.drawable.emptykh1, "", "", "",
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

