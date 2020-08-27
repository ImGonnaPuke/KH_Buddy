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

public class kh2Acc extends AppCompatActivity {

    private RecyclerView rView;
    private KH2keybladeAdapter mAdapter;
    private ArrayList<ItemsK> driveList;
    private RecyclerView.LayoutManager myLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kh2_acc);
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
        driveList.add(new ItemsK (R.drawable.abilityring, "Ability Ring", "Jesse's Accessory Shop", "AP: +1", "Str: +0",
                "Mag: + 0"));
        driveList.add(new ItemsK (R.drawable.aqua, "Aquamarine Ring", "Gumo's and Artemicion's Moogle Shops", "AP: +3", "Str: +1",
                "Mag: + 0"));
        driveList.add(new ItemsK (R.drawable.cosmicarts, "Cosmic Arts", "Chest at the Central Computer Mesa", "AP: +7", "Str: +2",
                "Mag: + 2"));

        driveList.add(new ItemsK (R.drawable.cosmicring, "Cosmic Ring", "Chest at the Starry Hill", "AP: +8", "Str: +0",
                "Mag: + 0"));
        driveList.add(new ItemsK (R.drawable.diamond, "Diamond Ring", "Item synthesis", "AP: +5", "Str: +1",
                "Mag: + 0"));
        driveList.add(new ItemsK (R.drawable.drawring, "Draw Ring", "Chest at Rabbit's House", "AP: +7", "Str: +0",
                "Mag: + 0\t\t\t\t\t\t\t\t\t\t\t\tGrants Draw"));
        driveList.add(new ItemsK (R.drawable.engring, "Engineer's Ring", "Can be bought at Mogatro's and Gumo's\nMoogle Shops", "AP: +2", "Str: +0",
                "Mag: + 0"));
        driveList.add(new ItemsK (R.drawable.expertring, "Expert's Ring", "Item synth", "AP: +6", "Str: +0",
                "Mag: + 0"));
        driveList.add(new ItemsK (R.drawable.fencering, "Fencer's Earring", "Item synth", "AP: +5", "Str: +2",
                "Mag: + 1"));

        driveList.add(new ItemsK (R.drawable.garn, "Garnet Ring", "Item Synth", "AP: +4", "Str: +1",
                "Mag: + 0"));
        driveList.add(new ItemsK (R.drawable.goldring, "Gold Ring", "Can be bought from Mogtaro's\nMoogle Shop", "AP: +2", "Str: +0",
                "Mag: + 1"));
        driveList.add(new ItemsK (R.drawable.luckyring, "Lucky Ring", "Complete the Pain and Panic Cup", "AP: +0", "Str: +0",
                "Mag: + 0\t\t\t\t\t\t\t\t\t\t\t\tGrants Lucky Lucky"));
        driveList.add(new ItemsK (R.drawable.magering, "Mage Earring", "Item synth", "AP: +4", "Str: + 0",
                "Mag: + 2"));
        driveList.add(new ItemsK (R.drawable.executive, "Executive's Ring", "Complete the Dawn Puzzle", "AP: + 30", "Str: + 0",
                "Mag: + 0"));

        driveList.add(new ItemsK (R.drawable.medal, "Medal", "Lose to Setzer", "AP: +0", "Str: + 1",
                "Mag: + 0"));
        driveList.add(new ItemsK (R.drawable.moonam, "Moon Amulet", "Item Synth", "AP: + 3", "Str: + 2",
                "Mag: + 2"));
        driveList.add(new ItemsK (R.drawable.mythring, "Mythril Ring", "Item Synth", "AP: + 4", "Str: + 0",
                "Mag: + 1"));
        driveList.add(new ItemsK (R.drawable.orichalring, "Orichalcum Ring", "Item Synth", "AP: + 5", "Str: + 0",
                "Mag: + 1"));
        driveList.add(new ItemsK (R.drawable.platring, "Platinum Ring", "Can be bought from Gumo's and\nArtemicion's Moogle Shops", "AP: + 1", "Str: + 1",
                "Mag: + 1"));

        driveList.add(new ItemsK (R.drawable.sard, "Sardonyx Ring", "Can be bought from Monty's Moogle Shop", "AP: + 0", "Str: + 0",
                "Mag: + 0"));
        driveList.add(new ItemsK (R.drawable.silverring, "Silver Ring", "Can be bought from Monty's Moogle Shop", "AP: + 1", "Str: + 0",
                "Mag: + 1"));
        driveList.add(new ItemsK (R.drawable.starcharm, "Star Charm", "Item Synth", "AP: + 5", "Str: + 2",
                "Mag: + 2"));
        driveList.add(new ItemsK (R.drawable.skillring, "Skill Ring", "Can be obtained from a chest at the\nPalace Walls", "AP: + 4", "Str: + 0",
                "Mag: + 0"));
        driveList.add(new ItemsK (R.drawable.skillfulring, "Skillful Ring", "Can be obtained by completing the\nTitan Cup", "AP: + 5", "Str: + 0",
                "Mag: + 0"));

        driveList.add(new ItemsK (R.drawable.slayer, "Slayer Earring", "Item Synth", "AP: + 5", "Str: + 1",
                "Mag: + 2"));
        driveList.add(new ItemsK (R.drawable.soldering, "Soldier Earring", "Item Synth", "AP: + 4", "Str: + 2",
                "Mag: + 0"));
        driveList.add(new ItemsK (R.drawable.techring, "Technician's Ring", "Item Synth", "AP: + 3", "Str: + 0",
                "Mag: + 0"));
        driveList.add(new ItemsK (R.drawable.tour, "Tourmaline Ring", "Item Synth", "AP: + 2", "Str: + 1",
                "Mag: + 0"));
        driveList.add(new ItemsK (R.drawable.fullbloom, "Full Bloom", "Item Synth", "AP: + 5", "Str: + 0",
                "Mag: + 3"));

        driveList.add(new ItemsK (R.drawable.fullbloomplus, "Full Bloom+", "Item Synth", "AP: + 5", "Str: + 0",
                "Mag: + 3\t\t\t\t\t\t\t\t\t\t\t\t Grants MP Haste"));
        driveList.add(new ItemsK (R.drawable.sarchive, "Shadow Archive", "Item Synth", "AP: + 5", "Str: + 0",
                "Mag: + 3"));
        driveList.add(new ItemsK (R.drawable.sarchiveplus, "Shadow Archive+", "Item Synth", "AP: + 5", "Str: + 0",
                "Mag: + 3\t\t\t\t\t\t\t\t\t\t\t\tGrants MP Rage"));

        driveList.add(new ItemsK (R.drawable.emptykh2, "", "", "",
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
