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

public class kh1Synth extends AppCompatActivity {


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
        driveList.add(new Items (R.drawable.blazeshart, "Blaze Shard", "Red Nocturne (6%), White Mushroom"));
        driveList.add(new Items (R.drawable.blazegem, "Blaze Gem", "Bandit (4%), Fat Bandit (8%),\nWhite Mushroom"));
        driveList.add(new Items (R.drawable.blazestone, "Blaze Stone", "Chimera"));

        driveList.add(new Items (R.drawable.iceshart, "Frost Shard", "Blue Rhapsody (12%), White Mushroom"));
        driveList.add(new Items (R.drawable.icegem, "Frost Gem", "Sea Neon (4%), Sheltering Zone (8%),\nWhite Mushroom"));
        driveList.add(new Items (R.drawable.icestone, "Frost Stone", "Grand Ghost"));

        driveList.add(new Items (R.drawable.thunshart, "Thunder Shard", "Yellow Opera (8%), White Mushroom"));
        driveList.add(new Items (R.drawable.thungem, "Thunder Gem", "Screwdriver (4%), Aquatank (8%),\nWhite Mushroom"));
        driveList.add(new Items (R.drawable.thunstone, "Thunder Stone", "Black Ballade"));

        driveList.add(new Items (R.drawable.lucshard, "Lucid Shard", "Shadow (6%), White Mushroom"));
        driveList.add(new Items (R.drawable.lucgem, "Lucid Gem", "Gargoyle (4%), Wight Knight (4%),\nWhite Mushroom"));
        driveList.add(new Items (R.drawable.luccryst, "Lucid Crystal", "Darkball (1%)"));

        driveList.add(new Items (R.drawable.pshart, "Power Shard", "Bouncywild (Flee: 24%/Defeat: 12%),\nPowerwild (Flee: 16%/Defeat: 8%),\nWhite Mushroom"));
        driveList.add(new Items (R.drawable.pgem, "Power Gem", "Air Pirate (8%), Battleship(Mast: 16%/\nDefeat: 8%),Pirate (4%),\nWhite Mushroom"));
        driveList.add(new Items (R.drawable.pstone, "Power Stone", "Sniper Wild"));

        driveList.add(new Items (R.drawable.rememshar, "Spirit Shard", "Large Body (12%), Soldier(8%),\nWhite Mushroom"));
        driveList.add(new Items (R.drawable.rememgem, "Spirit Gem", "Air Soldier (4%), White Mushroom"));
        driveList.add(new Items (R.drawable.rememstone, "Spirit Stone", "Gigant Shadow"));

        driveList.add(new Items (R.drawable.brightshart, "Bright Shard", "Green Requiem (10%), White Mushroom"));
        driveList.add(new Items (R.drawable.brightgem, "Bright Gem", "Search Ghost (4%), White Mushroom"));
        driveList.add(new Items (R.drawable.brightcryst, "Bright Crystal", "Defender (2%)"));

        driveList.add(new Items (R.drawable.serencryst, "Shiny Crystal", "Wizard (2%)"));
        driveList.add(new Items (R.drawable.serenstone, "Shiny Stone", "Jet Balloon"));

        driveList.add(new Items (R.drawable.mythshar, "Myhtril Shard", "Barrel Spider (1%), Behemoth (20%),\nPot Spider (1%)"));
        driveList.add(new Items (R.drawable.mythcrys, "Mythril", "Angel Star (1%), Behemoth (20%)"));
        driveList.add(new Items (R.drawable.mythstone, "Mythril Stone", "Pot Scorpion"));

        driveList.add(new Items (R.drawable.tranqgem, "Mystery Goo", "Rare Truffle, White Mushroom, Black Fungus"));
        driveList.add(new Items (R.drawable.tranqcrys, "Mystery/Serenity Power", "Pink Agaricus"));
        driveList.add(new Items (R.drawable.enstone, "Energy Stone", "Stealth Soldier (35%)"));

        driveList.add(new Items (R.drawable.lostill, "Gale", "Angel Star (6%), Invisible (6%)"));
        driveList.add(new Items (R.drawable.manifestill, "Gale Stone", "Neoshadow"));

        driveList.add(new Items (R.drawable.orichal, "Orichalcum", "Chests and item shop"));
        driveList.add(new Items (R.drawable.darkmatter, "Dark Matter", "Chests, minigames and item synth"));

        driveList.add(new Items (R.drawable.emptykh1, "", ""));





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
