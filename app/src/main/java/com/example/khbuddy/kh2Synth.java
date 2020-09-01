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

public class kh2Synth extends AppCompatActivity {

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

        driveList.add(new ItemsK (R.drawable.blazeshart, "Blazing Shard", "", "Rank C", "",
                "Hammer Frame (10%), Minute Bomb (6%)"));
        driveList.add(new ItemsK (R.drawable.blazestone, "Blazing Stone", "", "Rank B", "",
                "Cannon Gun (6%), Tornado Step (8%)"));
        driveList.add(new ItemsK (R.drawable.blazegem, "Blazing Gem", "", "Rank A", "",
                "Fat Bandit (12%), Fiery Globe (4%)"));
        driveList.add(new ItemsK (R.drawable.blazcr, "Blazing Crystal", "", "Rank S", "",
                "Crescendo (6%), Crimson Jazz (12%)"));

        driveList.add(new ItemsK (R.drawable.iceshart, "Frost Shard", "", "Rank C", "",
                "Hook Bat (6%), Lance Soldier (10%)"));
        driveList.add(new ItemsK (R.drawable.icestone, "Frost Stone", "", "Rank B", "",
                "Aeroplane (8%), Hot Rod (12%)"));
        driveList.add(new ItemsK (R.drawable.icegem, "Frost Gem", "", "Rank A", "",
                "Fortune Teller (8%), Icy Cube (4%)"));
        driveList.add(new ItemsK (R.drawable.icecry, "Frost Crystal", "", "Rank S", "",
                "Living Bone (12%)"));

        driveList.add(new ItemsK (R.drawable.thunshart, "Lightning Shard", "", "Rank C", "",
                "Bolt Tower (10%), Rapid Thruster (4%)"));
        driveList.add(new ItemsK (R.drawable.thunstone, "Lightning Stone", "", "Rank B", "",
                "Driller Mole (6%), Emerald Blues (10%)"));
        driveList.add(new ItemsK (R.drawable.thungem, "Lightning Gem", "", "Rank A", "",
                "Armored Knight (12%), Surveillance \nRobot (8%)"));
        driveList.add(new ItemsK (R.drawable.thuncryst, "Lightning Crystal", "", "Rank S", "",
                "Devastator (4%), Strafer (6%)"));

        //start

        driveList.add(new ItemsK (R.drawable.lucshard, "Lucid Shard", "", "Rank C", "",
                "Rabid Dog (6%), Trick Ghost (10%)"));
        driveList.add(new ItemsK (R.drawable.lucstone, "Lucid Stone", "", "Rank B", "",
                "Wight Knight (8%), Graveyard/Toy Soldier\n(12%)"));
        driveList.add(new ItemsK (R.drawable.lucgem, "Lucid Gem", "", "Rank A", "",
                "Bookmaster (10%), Magnum Loader (8%)"));
        driveList.add(new ItemsK (R.drawable.luccryst, "Lucid Crystal", "", "Rank S", "",
                "Neoshadow (8%)"));

        driveList.add(new ItemsK (R.drawable.pshart, "Power Shard", "", "Rank C", "",
                "Creeper Plant (8%), Large Body (12%)"));
        driveList.add(new ItemsK (R.drawable.pstone, "Power Stone", "", "Rank B", "",
                "Luna Bandit (8%), Silver Rock (6%)"));
        driveList.add(new ItemsK (R.drawable.pgem, "Power Gem", "", "Rank A", "",
                "Aerial Knocker (8%), Shaman (10%)"));
        driveList.add(new ItemsK (R.drawable.pcryst, "Power Crystal", "", "Rank S", "",
                "Morning Star (12%)"));

        driveList.add(new ItemsK (R.drawable.darkshart, "Dark Shard", "", "Rank C", "",
                "Shadow (4%), Soldier (8%)"));
        driveList.add(new ItemsK (R.drawable.darkstone, "Dark Stone", "", "Rank B", "",
                "Assault Rider (12%), Nightwalker (10%)"));
        driveList.add(new ItemsK (R.drawable.darkgem, "Dark Gem", "", "Rank A", "",
                "Gargoyle Knight/Gargoyle Warrior (10%)"));
        driveList.add(new ItemsK (R.drawable.darkcryst, "Dark Crystal", "", "Rank S", "",
                "Air Pirate (8%)"));

        driveList.add(new ItemsK (R.drawable.denseshart, "Dense Shard", "", "Rank C", "",
                "Creeper (8%), Dragoon (12%)"));
        driveList.add(new ItemsK (R.drawable.densestone, "Dense Stone", "", "Rank B", "",
                "Sniper (12%)"));
        driveList.add(new ItemsK (R.drawable.densegem, "Dense Gem", "", "Rank A", "",
                "Samurai (12%)"));
        driveList.add(new ItemsK (R.drawable.densecryst, "Dense Crystal", "", "Rank S", "",
                "Berserker (12%)"));

        driveList.add(new ItemsK (R.drawable.twishart, "Twilight Shard", "", "Rank C", "",
                "Dusk (10%), Gambler (12%)"));
        driveList.add(new ItemsK (R.drawable.twistone, "Twilight Stone", "", "Rank B", "",
                "Dancer (12%)"));
        driveList.add(new ItemsK (R.drawable.twigem, "Twilight Gem", "", "Rank A", "",
                "Assassin (12%)"));
        driveList.add(new ItemsK (R.drawable.twicryst, "Twilight Crystal", "", "Rank S", "",
                "Sorcerer(12%)"));

        driveList.add(new ItemsK (R.drawable.mythshar, "Mythril Shard", "", "Rank C", "",
                "Through item synthesis and found in\nchests"));
        driveList.add(new ItemsK (R.drawable.mythstone, "Mythril Stone", "", "Rank B", "",
                "Through item synthesis and found in\nchests"));
        driveList.add(new ItemsK (R.drawable.mythgem, "Mythril Gem", "", "Rank A", "",
                "Through item synthesis and found in\nchests"));
        driveList.add(new ItemsK (R.drawable.mythcrys, "Mythril Crystal", "", "Rank S", "",
                "Through item synthesis and found in\nchests"));

        driveList.add(new ItemsK (R.drawable.brightshart, "Bright Shard", "", "Rank C", "",
                "Bulky Vendor (Common), Hook Bat/Minute\nBomb/Rabid Dog (3%), Creeper Plant/\nSoldier (4%)"));
        driveList.add(new ItemsK (R.drawable.brightstone, "Bright Stone", "", "Rank B", "",
                "Bulky Vendor (Rare), Cannon Gun/Silver\nRock (3%), Aeroplane/Tornado Step/Wight\nKnight/Driller Mole/Luna/Bandit (4%)"));
        driveList.add(new ItemsK (R.drawable.brightgem, "Bright Gem", "", "Rank A", "",
                "Bulky Vendor (Limited), \nSurveillance Robot (3%), Aerial Knocker/\nMagnum Loader (4%),"));
        driveList.add(new ItemsK (R.drawable.brightcryst, "Bright Crystal", "", "Rank S", "",
                "Bulky Vendor (Prime), Air Pirate (4%), \nCrescendo (3%), Neoshadow (4%),\nStrafer (4%)"));

        driveList.add(new ItemsK (R.drawable.enshart, "Energy Shard", "", "Rank C", "",
                "Bolt Tower/Gargoyle Knight/\nGargoyle Warrior/Nightwalker (4%)"));
        driveList.add(new ItemsK (R.drawable.enstone, "Energy Stone", "", "Rank B", "",
                "Hammer Frame/Lance Soldier/Trick Ghost\n(4%)"));
        driveList.add(new ItemsK (R.drawable.engem, "Energy Gem", "", "Rank A", "",
                "Emerald Blues/Fortuneteller (4%)"));
        driveList.add(new ItemsK (R.drawable.encryst, "Energy Crystal", "", "Rank S", "",
                "Bookmaster/Shaman (4%)"));

        driveList.add(new ItemsK (R.drawable.serenshard, "Serenity Shard", "", "Rank C", "",
                "Creeper (2%), Assault Rider/Fat Bandit/\nGraveyard/Hot Rod/Large Body/Toy\nSoldier(4%)"));
        driveList.add(new ItemsK (R.drawable.serenstone, "Serenity Stone", "", "Rank B", "",
                "Dusk (2%), Crimson Jazz/Devastator/\nLiving Bone/Morning Star (4%)"));
        driveList.add(new ItemsK (R.drawable.serengem, "Serenity Gem", "", "Rank A", "",
                "Dancer/Dragoon/Gambler/Sniper (4%)"));
        driveList.add(new ItemsK (R.drawable.serencryst, "Serenity Crystal", "", "Rank S", "",
                "Assassin/Berserker/Samurai/Sorcerer (4%)\n" +
                        "Bulky Vendor (Prime), Item synthesis"));

        driveList.add(new ItemsK (R.drawable.rememshar, "Rememberance Shard", "", "Rank C", "",
                "Silent Launcher/Perplex (6%),\nIron Hammer (10%) "));
        driveList.add(new ItemsK (R.drawable.rememstone, "Rememberance Stone", "", "Rank B", "",
                "Air Viking (6%), Magic Phantom/\nLance Warrior/Necromancer (10%)"));
        driveList.add(new ItemsK (R.drawable.rememgem, "Rememberance Gem", "", "Rank A", "",
                "Spring Metal/Runemaster (10%), \nMad Bumper (12%)"));
        driveList.add(new ItemsK (R.drawable.rememcrys, "Rememberance Crystal", "", "Rank S", "",
                "Reckless (12%), \nCavern of Remembrance: Engine Chamber"));

        driveList.add(new ItemsK (R.drawable.tranqshart, "Tranquil Shard", "", "Rank C", "",
                "Mushroom XIII"));
        driveList.add(new ItemsK (R.drawable.tranqstone, "Tranquil Stone", "", "Rank B", "",
                "Mushroom XIII"));
        driveList.add(new ItemsK (R.drawable.tranqgem, "Tranquil Gem", "", "Rank A", "",
                "Mushroom XIII"));
        driveList.add(new ItemsK (R.drawable.tranqcrys, "Tranquil Crystal", "", "Rank S", "",
                "Mushroom XIII"));

        //end

        driveList.add(new ItemsK (R.drawable.orichal, "Orichalcum", "", "Rank A", "",
                "Bulky Vendor (Common - 10%/Rare - 12%/\nLimited - 16%/Prime - 18%)"));
        driveList.add(new ItemsK (R.drawable.orichalplus, "Orichalcum+", "", "Rank S", "",
                "Found in chests and events"));
        driveList.add(new ItemsK (R.drawable.manifestill, "Manifest Illusion", "", "Rank A", "",
                "Lingering Sentiment, Frontier Puzzle, \nItem synthesis, Cavern of Remembrance:\nDepths"));
        driveList.add(new ItemsK (R.drawable.lostill, "Lost Illusion", "", "Rank S", "",
                "Absent silhouettes, Org XIII Replica battles"));

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
