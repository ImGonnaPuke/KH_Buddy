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

public class kh1Skill extends AppCompatActivity {


    private RecyclerView rView;
    private KH2keybladeAdapter mAdapter;
    private ArrayList<ItemsK> driveList;
    private RecyclerView.LayoutManager myLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kh1_skill);
        genList();
        buildRecycle();



    }

    public void genList(){
        driveList = new ArrayList<>();

        driveList.add(new ItemsK (R.drawable.valor, "EXP Zero",
                "Gain no EXP", "Sword: lv 0",
                "Shield: lv 0", "Rod: lv 0"));
        driveList.add(new ItemsK (R.drawable.valor, "Sliding Dash",
                "Slide toward an enemy", "Sword: lv 6",
                "Shield: lv 39", "Rod: lv 51"));
        driveList.add(new ItemsK (R.drawable.valor, "Scan",
                "See enemy HP", "Sword: lv 9",
                "Shield: lv 21", "Rod: lv 15"));
        driveList.add(new ItemsK (R.drawable.valor, "Slapshot",
                "Quick opening move", "Sword: lv 12",
                "Shield: lv 6", "Rod: lv 69"));
        driveList.add(new ItemsK (R.drawable.valor, "Counterattack",
                "Attack right after a guard or parry", "Sword: lv 15",
                "Shield: lv 45", "Rod: lv 57"));
        driveList.add(new ItemsK (R.drawable.valor, "Tech Up 1",
                "Gain more EXP from techs", "Sword: lv 18",
                "Shield: lv 12", "Rod: lv 27"));

        driveList.add(new ItemsK (R.drawable.valor, "Combo Plus 1",
                "Gain an extra ground combo hit", "Sword: lv 21",
                "Shield: lv 63", "Rod: lv 87"));
        driveList.add(new ItemsK (R.drawable.valor, "Guard",
                "Guard against an attack", "Sword: lv 24",
                "Shield: lv 15", "Rod: lv 33"));
        driveList.add(new ItemsK (R.drawable.valor, "Hurricane Blitz",
                "New air combo finisher", "Sword: lv 27",
                "Shield: lv 51", "Rod: lv 18"));

        driveList.add(new ItemsK (R.drawable.valor, "Blitz",
                "Leap toward the enemy and attack", "Sword: lv 33",
                "Shield: lv 60", "Rod: lv 78"));
        driveList.add(new ItemsK (R.drawable.valor, "Treasure Magnet 1",
                "Dropped items will be magnetized toward \nyou", "Sword: lv 36",
                "Shield: lv 30", "Rod: lv 9"));
        driveList.add(new ItemsK (R.drawable.valor, "Ripple Drive",
                "Finishing move, good against large groups", "Sword: lv 39",
                "Shield: lv 69", "Rod: lv 12"));
        driveList.add(new ItemsK (R.drawable.valor, "MP Haste",
                "Gain MP back faster", "Sword: lv 45",
                "Shield: lv 72", "Rod: lv 21"));
        driveList.add(new ItemsK (R.drawable.valor, "Second Chance",
                "Survive a fatal hit", "Sword: lv 48",
                "Shield: lv 36", "Rod: lv 90"));
        driveList.add(new ItemsK (R.drawable.valor, "Combo Master",
                "Combos will always finish", "Sword: lv 50",
                "Shield: lv 54", "Rod: lv 54"));
        driveList.add(new ItemsK (R.drawable.valor, "Stun Impact",
                "Stuns enemies", "Sword: lv 51",
                "Shield: lv 18", "Rod: lv 6"));

        driveList.add(new ItemsK (R.drawable.valor, "Vortex",
                "Midrange attack that lunges toward an \nenemy", "Sword: lv 0",
                "Shield: lv 78", "Rod: lv 84"));
        driveList.add(new ItemsK (R.drawable.valor, "Aerial Sweep",
                "Spiral toward an airborne enemy", "Sword: lv 60",
                "Shield: lv 84", "Rod: lv 36"));
        driveList.add(new ItemsK (R.drawable.valor, "MP Rage 1",
                "Gain MP by getting hit", "Sword: lv 63",
                "Shield: lv 90", "Rod: lv 42"));
        driveList.add(new ItemsK (R.drawable.valor, "Combo Plus 2",
                "Gain an extra ground combo hit", "Sword: lv 66",
                "Shield: lv 87", "Rod: lv 93"));
        driveList.add(new ItemsK (R.drawable.valor, "Leaf Bracer",
                "Invincible while casting Cure", "Sword: lv 69",
                "Shield: lv 27", "Rod: lv 39"));
        driveList.add(new ItemsK (R.drawable.valor, "Air Combo Plus 1",
                "Gain an extra air combo hit", "Sword: lv 72",
                "Shield: lv 93", "Rod: lv 24"));

        driveList.add(new ItemsK (R.drawable.valor, "Treasure Magnet 2",
                "Dropped items will be magnetized toward \nyou", "Sword: lv 75",
                "Shield: lv 57", "Rod: lv 72"));

        driveList.add(new ItemsK (R.drawable.valor, "Berserk",
                "Boosts attack when HP is low", "Sword: lv 78",
                "Shield: lv 9", "Rod: lv 60"));
        driveList.add(new ItemsK (R.drawable.valor, "Tech Up 2",
                "Gain more EXP from techs", "Sword: lv 81",
                "Shield: lv 81", "Rod: lv 81"));
        driveList.add(new ItemsK (R.drawable.valor, "Critical Plus 1",
                "Boosts crit rate factor", "Sword: lv 84",
                "Shield: lv 48", "Rod: lv 96"));
        driveList.add(new ItemsK (R.drawable.valor, "MP Rage 2",
                "Gain MP when attacked", "Sword: lv 87",
                "Shield: lv 100", "Rod: lv 75"));
        driveList.add(new ItemsK (R.drawable.valor, "Lucky Strike",
                "Increases dop rates on items", "Sword: lv 90",
                "Shield: lv 24", "Rod: lv 48"));
        driveList.add(new ItemsK (R.drawable.valor, "Combo Plus 3",
                "Gain an extra ground combo hit", "Sword: lv 93",
                "Shield: lv 96", "Rod: lv 99"));

        driveList.add(new ItemsK (R.drawable.valor, "Air Combo Plus 2",
                "Gain an extra air combo hit", "Sword: lv 96",
                "Shield: lv 99", "Rod: lv 45"));
        driveList.add(new ItemsK (R.drawable.valor, "Critical Plus 2",
                "Boosts crit rate factor", "Sword: lv 99",
                "Shield: lv 76", "Rod: lv 100"));
        driveList.add(new ItemsK (R.drawable.valor, "Jackpot",
                "Enemies drop more stuff", "Sword: lv 100",
                "Shield: lv 42", "Rod: lv 63"));

        driveList.add(new ItemsK (R.drawable.valor, "Dodge Roll",
                "Roll out of the way", "Defeat Guard Armor",
                "", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Sonic Blade",
                "Charge toward the enemy 7 times", "Defeat Cerberus",
                "", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Combo Plus 4",
                "Gain an extra ground combo hit", "Solo Phil Cup",
                "", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Tech Up 3",
                "Gain more EXP from techs", "Phil Cup time trial",
                "", ""));

        driveList.add(new ItemsK (R.drawable.valor, "Strike Raid",
                "Throw your keyblade", "Complete the Pegasus Cup",
                "", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Ars Arcanum",
                "13 hit combo", "Defeat Captain Hook",
                "", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Critical Plus 3",
                "Boosts crit rate factor", "Solo Hercules Cup",
                "", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Ragnarok",
                "Powerful aerial combo", "Defeat Riku-Ansem",
                "", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Trinity Limit",
                "Attack that scales off current MP", "Complete Hades Cup",
                "", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Gravity Break",
                "Chance an attack will reduce foe's HP\nby half", "Time Trial Hades Cup",
                "", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Zantesuken",
                "Deals gravity damage according to 250%\nof enemy's HP", "Defeat Kurt Zisa",
                "", ""));

        driveList.add(new ItemsK (R.drawable.valor, "Encounter Up",
                "Encounter rates are increased", "Defeat Guard Armor",
                "", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Tech Up 4",
                "Gain more EXP from techs", "Find 90 dalmations",
                "", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Cheer",
                "Increases Summon MP Gauge", "Complete 100 Acre Wood",
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
