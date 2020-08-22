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

import java.util.ArrayList;

public class kh2Synth extends AppCompatActivity {

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



    }

    public void genList(){
        driveList = new ArrayList<>();

        driveList.add(new ItemsK (R.drawable.valor, "Blazing Shard", "", "Rank C", "",
                "Hammer Frame (10%), Minute Bomb (6%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Blazing Stone", "", "Rank B", "",
                "Cannon Gun (6%), Tornado Step (8%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Blazing Gem", "", "Rank A", "",
                "Fat Bandit (12%), Fiery Globe (4%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Blazing Crystal", "", "Rank S", "",
                "Crescendo (6%), Crimson Jazz (12%)"));

        driveList.add(new ItemsK (R.drawable.valor, "Frost Shard", "", "Rank C", "",
                "Hook Bat (6%), Lance Soldier (10%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Frost Stone", "", "Rank B", "",
                "Aeroplane (8%), Hot Rod (12%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Frost Gem", "", "Rank A", "",
                "Fortune Teller (8%), Icy Cube (4%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Frost Crystal", "", "Rank S", "",
                "Living Bone (12%)"));

        driveList.add(new ItemsK (R.drawable.valor, "Lightning Shard", "", "Rank C", "",
                "Bolt Tower (10%), Rapid Thruster (4%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Lightning Stone", "", "Rank B", "",
                "Driller Mole (6%), Emerald Blues (10%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Lightning Gem", "", "Rank A", "",
                "Armored Knight (12%), Surveillance \nRobot (8%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Lightning Crystal", "", "Rank S", "",
                "Devastator (4%), Strafer (6%)"));

        //start

        driveList.add(new ItemsK (R.drawable.valor, "Lucid Shard", "", "Rank C", "",
                "Rabid Dog (6%), Trick Ghost (10%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Lucid Stone", "", "Rank B", "",
                "Wight Knight (8%), Graveyard/Toy Soldier\n(12%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Lucid Gem", "", "Rank A", "",
                "Bookmaster (10%), Magnum Loader (8%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Lucid Crystal", "", "Rank S", "",
                "Neoshadow (8%)"));

        driveList.add(new ItemsK (R.drawable.valor, "Power Shard", "", "Rank C", "",
                "Creeper Plant (8%), Large Body (12%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Power Stone", "", "Rank B", "",
                "Luna Bandit (8%), Silver Rock (6%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Power Gem", "", "Rank A", "",
                "Aerial Knocker (8%), Shaman (10%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Power Crystal", "", "Rank S", "",
                "Morning Star (12%)"));

        driveList.add(new ItemsK (R.drawable.valor, "Dark Shard", "", "Rank C", "",
                "Shadow (4%), Soldier (8%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Dark Stone", "", "Rank B", "",
                "Assault Rider (12%), Nightwalker (10%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Dark Gem", "", "Rank A", "",
                "Gargoyle Knight/Gargoyle Warrior (10%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Dark Crystal", "", "Rank S", "",
                "Air Pirate (8%)"));

        driveList.add(new ItemsK (R.drawable.valor, "Dense Shard", "", "Rank C", "",
                "Creeper (8%), Dragoon (12%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Dense Stone", "", "Rank B", "",
                "Sniper (12%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Dense Gem", "", "Rank A", "",
                "Samurai (12%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Dense Crystal", "", "Rank S", "",
                "Berserker (12%)"));

        driveList.add(new ItemsK (R.drawable.valor, "Twilight Shard", "", "Rank C", "",
                "Dusk (10%), Gambler (12%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Twilight Stone", "", "Rank B", "",
                "Dancer (12%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Twilight Gem", "", "Rank A", "",
                "Assassin (12%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Twilight Crystal", "", "Rank S", "",
                "Sorcerer(12%)"));

        driveList.add(new ItemsK (R.drawable.valor, "Mythril Shard", "", "Rank C", "",
                "Through item synthesis and found in\nchests"));
        driveList.add(new ItemsK (R.drawable.valor, "Mythril Stone", "", "Rank B", "",
                "Through item synthesis and found in\nchests"));
        driveList.add(new ItemsK (R.drawable.valor, "Mythril Gem", "", "Rank A", "",
                "Through item synthesis and found in\nchests"));
        driveList.add(new ItemsK (R.drawable.valor, "Mythril Crystal", "", "Rank S", "",
                "Through item synthesis and found in\nchests"));

        driveList.add(new ItemsK (R.drawable.valor, "Bright Shard", "", "Rank C", "",
                "Bulky Vendor (Common), Hook Bat/Minute\nBomb/Rabid Dog (3%), Creeper Plant/\nSoldier (4%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Bright Stone", "", "Rank B", "",
                "Bulky Vendor (Rare), Cannon Gun/Silver\nRock (3%), Aeroplane/Tornado Step/Wight\nKnight/Driller Mole/Luna/Bandit (4%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Bright Gem", "", "Rank A", "",
                "Bulky Vendor (Limited), \nSurveillance Robot (3%), Aerial Knocker/\nMagnum Loader (4%),"));
        driveList.add(new ItemsK (R.drawable.valor, "Bright Crystal", "", "Rank S", "",
                "Bulky Vendor (Prime), Air Pirate (4%), \nCrescendo (3%), Neoshadow (4%),\nStrafer (4%)"));

        driveList.add(new ItemsK (R.drawable.valor, "Energy Shard", "", "Rank C", "",
                "Bolt Tower/Gargoyle Knight/\nGargoyle Warrior/Nightwalker (4%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Energy Stone", "", "Rank B", "",
                "Hammer Frame/Lance Soldier/Trick Ghost\n(4%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Energy Gem", "", "Rank A", "",
                "Emerald Blues/Fortuneteller (4%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Energy Crystal", "", "Rank S", "",
                "Bookmaster/Shaman (4%)"));

        driveList.add(new ItemsK (R.drawable.valor, "Serenity Shard", "", "Rank C", "",
                "Creeper (2%), Assault Rider/Fat Bandit/\nGraveyard/Hot Rod/Large Body/Toy\nSoldier(4%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Serenity Stone", "", "Rank B", "",
                "Dusk (2%), Crimson Jazz/Devastator/\nLiving Bone/Morning Star (4%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Serenity Gem", "", "Rank A", "",
                "Dancer/Dragoon/Gambler/Sniper (4%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Serenity Crystal", "", "Rank S", "",
                "Assassin/Berserker/Samurai/Sorcerer (4%)\n" +
                        "Bulky Vendor (Prime), Item synthesis"));

        driveList.add(new ItemsK (R.drawable.valor, "Rememberance Shard", "", "Rank C", "",
                "Silent Launcher/Perplex (6%),\nIron Hammer (10%) "));
        driveList.add(new ItemsK (R.drawable.valor, "Rememberance Stone", "", "Rank B", "",
                "Air Viking (6%), Magic Phantom/\nLance Warrior/Necromancer (10%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Rememberance Gem", "", "Rank A", "",
                "Spring Metal/Runemaster (10%), \nMad Bumper (12%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Rememberance Crystal", "", "Rank S", "",
                "Reckless (12%), \nCavern of Remembrance: Engine Chamber"));

        driveList.add(new ItemsK (R.drawable.valor, "Tranquil Shard", "", "Rank C", "",
                "Mushroom XIII"));
        driveList.add(new ItemsK (R.drawable.valor, "Tranquil Stone", "", "Rank B", "",
                "Mushroom XIII"));
        driveList.add(new ItemsK (R.drawable.valor, "Tranquil Gem", "", "Rank A", "",
                "Mushroom XIII"));
        driveList.add(new ItemsK (R.drawable.valor, "Tranquil Crystal", "", "Rank S", "",
                "Mushroom XIII"));

        //end

        driveList.add(new ItemsK (R.drawable.valor, "Orichalcum", "", "Rank A", "",
                "Bulky Vendor (Common - 10%/Rare - 12%/\nLimited - 16%/Prime - 18%)"));
        driveList.add(new ItemsK (R.drawable.valor, "Orichalcum+", "", "Rank S", "",
                "Found in chests and events"));
        driveList.add(new ItemsK (R.drawable.valor, "Manifest Illusion", "", "Rank A", "",
                "Lingering Sentiment, Frontier Puzzle, \nItem synthesis, Cavern of Remembrance:\nDepths"));
        driveList.add(new ItemsK (R.drawable.valor, "Lost Illusion", "", "Rank S", "",
                "Absent silhouettes, Org XIII Replica battles"));



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
