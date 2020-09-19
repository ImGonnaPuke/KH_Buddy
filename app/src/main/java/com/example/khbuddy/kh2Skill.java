package com.example.khbuddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
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

public class kh2Skill extends AppCompatActivity {

    private RecyclerView rView;
    private KH2keybladeAdapter mAdapter;
    private ArrayList<ItemsK> driveList;
    private RecyclerView.LayoutManager myLayout;

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kh2_puzz);
        genList();
        buildRecycle();

        int currentOrientation = getResources().getConfiguration().orientation;
        if (currentOrientation == Configuration.ORIENTATION_PORTRAIT) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }else {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }

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
        driveList.add(new ItemsK (R.drawable.emptykh2, "Combo Boost", "Deal more damage for longer combos", "Sword: lv 7",
                "Shield: lv 9", "Rod: lv 17"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Experience Boost", "Doubles XP received when HP is <50%", "Sword: lv 9",
                "Shield: lv 17", "Rod: lv 7"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Magic Lock-On", "Magic attacks will automatically\nlock-on", "Sword: lv 12",
                "Shield: lv 12", "Rod: lv 12"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Reaction Boost", "Reaction commands will do 50% more\ndamage", "Sword: lv 15",
                "Shield: lv 23", "Rod: lv 33"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Item Boost", "Item effectiveness is increased", "Sword: lv 17",
                "Shield: lv 7", "Rod: lv 9"));

        driveList.add(new ItemsK (R.drawable.emptykh2, "Leaf Bracer", "Invincible when casting any form\nof cure", "Sword: lv 20",
                "Shield: lv 20", "Rod: lv 20"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Fire Boost", "Fire attacks do more damage", "Sword: lv 23",
                "Shield: lv 33", "Rod: lv 15"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Drive Boost", "Drives last longer", "Sword: lv 25",
                "Shield: lv 25", "Rod: lv 47"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Draw", "Draw in dropped items/munny/xp", "Sword: lv 28",
                "Shield: lv 27", "Rod: lv 25"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Combination Boost", "Limits last longer", "Sword: lv 31",
                "Shield: lv 39", "Rod: lv 59"));

        driveList.add(new ItemsK (R.drawable.emptykh2, "Damage Drive", "Restores drive when hit", "Sword: lv 33",
                "Shield: lv 15", "Rod: lv 23"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Air Combo Boost", "Deal more damage for longer\nair combos", "Sword: lv 36",
                "Shield: lv 44", "Rod: lv 73"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Blizzard Boost", "Blizzard attacks deal more damage", "Sword: lv 41",
                "Shield: lv 59", "Rod: lv 99"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Drive Converter", "Converts munny to drive orbs", "Sword: lv 7",
                "Shield: lv 53", "Rod: lv 17"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Negative Combo", "Combo is 1 hit less", "Sword: lv 41",
                "Shield: lv 73", "Rod: lv 36"));

        driveList.add(new ItemsK (R.drawable.emptykh2, "Once More", "Survive a combo if you would have\ndied to it", "Sword: lv 47",
                "Shield: lv 25", "Rod: lv 28"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Finishing Plus", "Finishers deal more damage", "Sword: lv 47",
                "Shield: lv 65", "Rod: lv 85"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Thunder Boost", "Thunder attacks deal more damage", "Sword: lv 7",
                "Shield: lv 99", "Rod: lv 41"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Defender", "Boosts def when in crit HP range", "Sword: lv 59",
                "Shield: lv 31", "Rod: lv 39"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Berserk Charge", "Deal more damage for longer combos", "Sword: lv 65",
                "Shield: lv 85", "Rod: lv 49"));

        driveList.add(new ItemsK (R.drawable.emptykh2, "Jackpot", "Enemies drop more munny", "Sword: lv 73",
                "Shield: lv 36", "Rod: lv 44"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Second Chance", "Survive a fatal blow", "Sword: lv 85",
                "Shield: lv 49", "Rod: lv 65"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Damage Control", "Take 1/2 damage when at crit HP", "Sword: lv 99",
                "Shield: lv 41", "Rod: lv 153"));

        driveList.add(new ItemsK (R.drawable.emptykh2, "Aerial Recovery", "Press O while staggered to recover", "",
                "", "Defeat Dusks at the Station of Serenity"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Guard", "Guard against attacks", "",
                "", "Defeat Twilight Thorn"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Scan", "See enemy health", "",
                "", "Defeat Axel at the Sandlot"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Sliding Dash", "Slide toward an enemy and\ndeal damage", "",
                "", "Complete the Village Cave"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Aerial Sweep", "Leap into the air against aerial enemies", "",
                "", "Defeat Shan-Yu"));

        driveList.add(new ItemsK (R.drawable.emptykh2, "Upper Slash", "Launch enemies into the air with []", "",
                "", "Defeat Thresholder & Possessor"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Retaliating Slash", "Press [] while staggered to attack", "",
                "", "Defeat Dark Thorn"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Counterguard", "Retaliate out of a guard", "",
                "", "Defeat Cerberus"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Trinity Limit", "Unlocks the Trinity Limit", "",
                "", "Defeat Pete at the Coliseum"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Auto Summon", "Use reaction commands to summon", "",
                "", "Escort Minnie"));

        driveList.add(new ItemsK (R.drawable.emptykh2, "Dodge Slash", "don't use this", "",
                "", "Defeat Pete at his Steamboat"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Aerial Finish", "A different aerial finisher", "",
                "", "Defeat Barbossa"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Summon Boost", "Summons last longer", "",
                "", "Pass the Stone Guardians"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Finishing Leap", "Press [] instead of a normal finisher", "",
                "", "Defeat Volcanic & Blizzard Lord"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Flash Step", "Shorter range Sliding Dash, easy to\nparry attacks", "",
                "", "Defeat Prison Keeper"));

        driveList.add(new ItemsK (R.drawable.emptykh2, "Vicinity Break", "When surrounded by enemies\nspin attack", "",
                "", "Defeat Hostile Program"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Guard Break", "Stong finisher", "",
                "", "Defeat 1000 Heartless"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Aerial Spiral", "Spiral into the air against\n" +
                "airborne enemies", "",
                "", "Recover Medallions"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Horizontal Slash", "Press [] during an air combo", "",
                "", "Defeat Grim Reaper on the Black Pearl"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Magnet Burst", "Aerial finisher that draws in enemies", "",
                "", "Defeat Hades"));

        driveList.add(new ItemsK (R.drawable.emptykh2, "Explosion", "A finisher with good range and damage", "",
                "", "Complete the Solar Sailer"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Slapshot", "Fast starting attack", "",
                "", "Complete Betwixt and Between"));
        driveList.add(new ItemsK (R.drawable.emptykh2, "Combo Master", "Always complete a combo", "",
                "", "Defeat Roxas"));




    }

    public void showItem (int position) {


        String toToast = driveList.get(position).getText2();
        //Toast toast = Toast. makeText(getApplicationContext(), toToast + "", Toast. LENGTH_SHORT);
        //toast.show();

        if(toToast.equals("emptykh2 Form")) {
            //startActivity(new Intent(Drives.this, kh2Menu.class));
        }
        else{
            Toast toast = Toast. makeText(getApplicationContext(), toToast + "", Toast. LENGTH_SHORT);
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
