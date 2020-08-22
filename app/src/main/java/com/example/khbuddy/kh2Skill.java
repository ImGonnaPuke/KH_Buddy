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

public class kh2Skill extends AppCompatActivity {

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
        driveList.add(new ItemsK (R.drawable.valor, "Combo Boost", "Deal more damage for longer combos", "Sword: lv 7",
                "Shield: lv 9", "Rod: lv 17"));
        driveList.add(new ItemsK (R.drawable.valor, "Experience Boost", "Doubles XP received when HP is <50%", "Sword: lv 9",
                "Shield: lv 17", "Rod: lv 7"));
        driveList.add(new ItemsK (R.drawable.valor, "Magic Lock-On", "Magic attacks will automatically lock-on", "Sword: lv 12",
                "Shield: lv 12", "Rod: lv 12"));
        driveList.add(new ItemsK (R.drawable.valor, "Reaction Boost", "Reaction commands will do 50% more\ndamage", "Sword: lv 15",
                "Shield: lv 23", "Rod: lv 33"));
        driveList.add(new ItemsK (R.drawable.valor, "Item Boost", "Item effectiveness is increased", "Sword: lv 17",
                "Shield: lv 7", "Rod: lv 9"));

        driveList.add(new ItemsK (R.drawable.valor, "Leaf Bracer", "Invincible when casting any form of cure", "Sword: lv 20",
                "Shield: lv 20", "Rod: lv 20"));
        driveList.add(new ItemsK (R.drawable.valor, "Fire Boost", "Fire attacks do more damage", "Sword: lv 23",
                "Shield: lv 33", "Rod: lv 15"));
        driveList.add(new ItemsK (R.drawable.valor, "Drive Boost", "Drives last longer", "Sword: lv 25",
                "Shield: lv 25", "Rod: lv 47"));
        driveList.add(new ItemsK (R.drawable.valor, "Draw", "Draw in dropped items/munny/xp", "Sword: lv 28",
                "Shield: lv 27", "Rod: lv 25"));
        driveList.add(new ItemsK (R.drawable.valor, "Combination Boost", "Limits last longer", "Sword: lv 31",
                "Shield: lv 39", "Rod: lv 59"));

        driveList.add(new ItemsK (R.drawable.valor, "Damage Drive", "Restores drive when hit", "Sword: lv 33",
                "Shield: lv 15", "Rod: lv 23"));
        driveList.add(new ItemsK (R.drawable.valor, "Air Combo Boost", "Deal more damage for longerair combos", "Sword: lv 36",
                "Shield: lv 44", "Rod: lv 73"));
        driveList.add(new ItemsK (R.drawable.valor, "Blizzard Boost", "Blizzard attacks deal more damage", "Sword: lv 41",
                "Shield: lv 59", "Rod: lv 99"));
        driveList.add(new ItemsK (R.drawable.valor, "Drive Converter", "Converts munny to drive orbs", "Sword: lv 7",
                "Shield: lv 53", "Rod: lv 17"));
        driveList.add(new ItemsK (R.drawable.valor, "Negative Combo", "Combo is 1 hit less", "Sword: lv 41",
                "Shield: lv 73", "Rod: lv 36"));

        driveList.add(new ItemsK (R.drawable.valor, "Once More", "Survive a combo if you would have\ndied to it", "Sword: lv 47",
                "Shield: lv 25", "Rod: lv 28"));
        driveList.add(new ItemsK (R.drawable.valor, "Finishing Plus", "Finishers deal more damage", "Sword: lv 47",
                "Shield: lv 65", "Rod: lv 85"));
        driveList.add(new ItemsK (R.drawable.valor, "Thunder Boost", "Thunder attacks deal more damage", "Sword: lv 7",
                "Shield: lv 99", "Rod: lv 41"));
        driveList.add(new ItemsK (R.drawable.valor, "Defender", "Boosts def when in crit HP range", "Sword: lv 59",
                "Shield: lv 31", "Rod: lv 39"));
        driveList.add(new ItemsK (R.drawable.valor, "Berserk Charge", "Deal more damage for longer combos", "Sword: lv 65",
                "Shield: lv 85", "Rod: lv 49"));

        driveList.add(new ItemsK (R.drawable.valor, "Jackpot", "Enemies drop more munny", "Sword: lv 73",
                "Shield: lv 36", "Rod: lv 44"));
        driveList.add(new ItemsK (R.drawable.valor, "Second Chance", "Survive a fatal blow", "Sword: lv 85",
                "Shield: lv 49", "Rod: lv 65"));
        driveList.add(new ItemsK (R.drawable.valor, "Damage Control", "Take 1/2 damage when at crit HP", "Sword: lv 99",
                "Shield: lv 41", "Rod: lv 153"));

        driveList.add(new ItemsK (R.drawable.valor, "Aerial Recovery", "Press O while staggered to recover", "",
                "", "Defeat Dusks at the Station of Serenity"));
        driveList.add(new ItemsK (R.drawable.valor, "Guard", "Guard against attacks", "",
                "", "Defeat Twilight Thorn"));
        driveList.add(new ItemsK (R.drawable.valor, "Scan", "See enemy health", "",
                "", "Defeat Axel at the Sandlot"));
        driveList.add(new ItemsK (R.drawable.valor, "Sliding Dash", "Slide toward an enemy and deal damage", "",
                "", "Complete the Village Cave"));
        driveList.add(new ItemsK (R.drawable.valor, "Aerial Sweep", "Leap into the air against aerial enemies", "",
                "", "Defeat Shan-Yu"));

        driveList.add(new ItemsK (R.drawable.valor, "Upper Slash", "Launch enemies into the air with []", "",
                "", "Defeat Thresholder & Possessor"));
        driveList.add(new ItemsK (R.drawable.valor, "Retaliating Slash", "Press [] while staggered to attack", "",
                "", "Defeat Dark Thorn"));
        driveList.add(new ItemsK (R.drawable.valor, "Counterguard", "Retaliate out of a guard", "",
                "", "Defeat Cerberus"));
        driveList.add(new ItemsK (R.drawable.valor, "Trinity Limit", "Unlocks the Trinity Limit", "",
                "", "Defeat Pete at the Coliseum"));
        driveList.add(new ItemsK (R.drawable.valor, "Auto Summon", "Use reaction commands to summon", "",
                "", "Escort Minnie"));

        driveList.add(new ItemsK (R.drawable.valor, "Dodge Slash", "don't use this", "",
                "", "Defeat Pete at his Steamboat"));
        driveList.add(new ItemsK (R.drawable.valor, "Aerial Finish", "A different aerial finisher", "",
                "", "Defeat Barbossa"));
        driveList.add(new ItemsK (R.drawable.valor, "Summon Boost", "Summons last longer", "",
                "", "Pass the Stone Guardians"));
        driveList.add(new ItemsK (R.drawable.valor, "Finishing Leap", "Press [] instead of a normal finisher", "",
                "", "Defeat Volcanic & Blizzard Lord"));
        driveList.add(new ItemsK (R.drawable.valor, "Flash Step", "Shorter range Sliding Dash, easy to parry attacks", "",
                "", "Defeat Prison Keeper"));

        driveList.add(new ItemsK (R.drawable.valor, "Vicinity Break", "When surrounded by enemies spin attack", "",
                "", "Defeat Hostile Program"));
        driveList.add(new ItemsK (R.drawable.valor, "Guard Break", "Stong finisher", "",
                "", "Defeat 1000 Heartless"));
        driveList.add(new ItemsK (R.drawable.valor, "Aerial Spiral", "Spiral into the air against airborne enemies", "",
                "", "Recover Medallions"));
        driveList.add(new ItemsK (R.drawable.valor, "Horizontal Slash", "Press [] during an air combo", "",
                "", "Defeat Grim Reaper on the Black Pearl"));
        driveList.add(new ItemsK (R.drawable.valor, "Magnet Burst", "Aerial finisher that draws in enemies", "",
                "", "Defeat Hades"));

        driveList.add(new ItemsK (R.drawable.valor, "Explosion", "A finisher with good range and damage", "",
                "", "Complete the Solar Sailer"));
        driveList.add(new ItemsK (R.drawable.valor, "Slapshot", "Fast starting attack", "",
                "", "Complete Betwixt and Between"));
        driveList.add(new ItemsK (R.drawable.valor, "Combo Master", "Always complete a combo", "",
                "", "Defeat Roxas"));



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
