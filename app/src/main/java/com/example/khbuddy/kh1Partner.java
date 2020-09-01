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

public class kh1Partner extends AppCompatActivity {


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
        driveList.add(new ItemsK (R.drawable.magesstaff, "Mage's Staff", "Default weapon", "Strength: +0",
                "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.morningstar, "Morning Star", "Item Shop", "Strength: +1",
                "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.shootingstar, "Shooting Star", "Item Shop",
                "Strength: +3", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.magusstaff, "Magus Staff", "Item Shop",
                "Strength: +2", "Magic: +1", ""));
        driveList.add(new ItemsK (R.drawable.wisdomstaff, "Wisdom Staff", "Item Shop",
                "Strength: +4", "Magic: +1", ""));
        driveList.add(new ItemsK (R.drawable.warhammer, "Warhammer", "Item Shop",
                "Strength: +3", "Magic: -1", ""));
        driveList.add(new ItemsK (R.drawable.silvermallet, "Silver Mallet", "Item Shop",
                "Strength: +6", "Magic: -1", ""));

        driveList.add(new ItemsK (R.drawable.grandmallet, "Grand Mallet", "Item Shop",
                "Strength: +8", "Magic: -1", ""));
        driveList.add(new ItemsK (R.drawable.lordfortune, "Lord Fortune", "Fairy Godmother after getting all summons",
                "Strength: +5", "Magic: +1", ""));
        driveList.add(new ItemsK (R.drawable.violetta, "Violetta", "White Trinity in Olymmpus Coliseum",
                "Strength: +8", "Magic: -1", ""));
        driveList.add(new ItemsK (R.drawable.wizardsrelic, "Wizard's Relic", "Wizard (.2%)",
                "Strength: +4", "Magic: +2", ""));

        driveList.add(new ItemsK (R.drawable.dreamrod, "Dream Rod", "Merlin after getting all tier 3 spells",
                "Strength: +7", "Magic: +2", ""));
        driveList.add(new ItemsK (R.drawable.savethequeen, "Save the Queen", "Win the solo Hades Cup",
                "Strength: +8", "Magic: +2", ""));
        driveList.add(new ItemsK (R.drawable.fantasista, "Fantasia", "Item Synth",
                "Strength: +3", "Magic: +3", ""));
        driveList.add(new ItemsK (R.drawable.meteorstrike, "Meteor Strike", "Chest in the End of the World Crevasse",
                "Strength: +13", "Magic: +0", ""));

        driveList.add(new ItemsK (R.drawable.knightsshield, "Knight's Shield", "Default",
                "Strength: +0", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.stoutshield, "Stout Shield", "Item Shop",
                "Strength: +1", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.smasher, "Smasher", "Item Shop",
                "Strength: +2", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.golemshield, "Golem Shield", "Item Shop",
                "Strength: +3", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.mythrilshield, "Mythril Shield", "Item Shop",
                "Strength: +4", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.adamantshield, "Adamant Shield", "Item Shop",
                "Strength: +5", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.onyxshield, "Onyx Shield", "Item Shop",
                "Strength: +6", "Magic: +0", ""));

        driveList.add(new ItemsK (R.drawable.dreamshield, "Dream Shield", "Get all 7 White Mushroom Arts",
                "Strength: +6", "Magic: +2", ""));
        driveList.add(new ItemsK (R.drawable.genjishield, "Genji Shield", "Defeat Yuffie in the Hades Cup",
                "Strength: +8", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.gigasfist, "Gigas Fist", "Item Shop",
                "Strength: +7", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.hercsshield, "Herc's Shield", "Defeat Hercules in the Hercules Cup",
                "Strength: +9", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.savetheking, "Save the King", "Hades Cup time trial",
                "Strength: +11", "Magic: +2", ""));

        driveList.add(new ItemsK (R.drawable.defender, "Defender", "Defender (.2%)",
                "Strength: +13", "Magic: +1", ""));
        driveList.add(new ItemsK (R.drawable.sevenelements, "Seven Elements", "Item Synth",
                "Strength: +4", "Magic: +3", ""));
        driveList.add(new ItemsK (R.drawable.mightyshield, "Mighty Shield", "End of the World World Terminus",
                "Strength: +15", "Magic: +0", ""));

        driveList.add(new ItemsK (R.drawable.emptykh1, "", "", "",
                "", ""));

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
