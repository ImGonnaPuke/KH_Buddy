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



    }

    public void genList(){
        driveList = new ArrayList<>();
        driveList.add(new ItemsK (R.drawable.valor, "Ability Ring", "Jesse's Accessory Shop", "AP: +1", "Str: +0",
                "Mag: + 0"));
        driveList.add(new ItemsK (R.drawable.valor, "Aquamarine Ring", "Gumo's and Artemicion's Moogle Shops", "AP: +3", "Str: +1",
                "Mag: + 0"));
        driveList.add(new ItemsK (R.drawable.valor, "Cosmic Arts", "Chest at the Central Computer Mesa", "AP: +7", "Str: +2",
                "Mag: + 2"));

        driveList.add(new ItemsK (R.drawable.valor, "Cosmic Ring", "Chest at the Starry Hill", "AP: +8", "Str: +0",
                "Mag: + 0"));
        driveList.add(new ItemsK (R.drawable.valor, "Diamond Ring", "Item synthesis", "AP: +5", "Str: +1",
                "Mag: + 0"));
        driveList.add(new ItemsK (R.drawable.valor, "Draw Ring", "Chest at Rabbit's House", "AP: +7", "Str: +0",
                "Mag: + 0\t\t\t\t\t\t\t\t\t\t\t\tGrants Draw"));
        driveList.add(new ItemsK (R.drawable.valor, "Engineer's Ring", "Can be bought at Mogatro's and Gumo's\nMoogle Shops", "AP: +2", "Str: +0",
                "Mag: + 0"));
        driveList.add(new ItemsK (R.drawable.valor, "Expert's Ring", "Item synth", "AP: +6", "Str: +0",
                "Mag: + 0"));
        driveList.add(new ItemsK (R.drawable.valor, "Fencer's Earring", "Item synth", "AP: +5", "Str: +2",
                "Mag: + 1"));

        driveList.add(new ItemsK (R.drawable.valor, "Garnet Ring", "Item synth", "AP: +4", "Str: +1",
                "Mag: + 0"));
        driveList.add(new ItemsK (R.drawable.valor, "Gold Ring", "Can be bought from Mogtaro's\nMoogle Shop", "AP: +2", "Str: +0",
                "Mag: + 1"));
        driveList.add(new ItemsK (R.drawable.valor, "Lucky Ring", "Complete the Pain and Panic Cup", "AP: +0", "Str: +0",
                "Mag: + 0\t\t\t\t\t\t\t\t\t\t\t\tGrants Lucky Lucky"));
        driveList.add(new ItemsK (R.drawable.valor, "Mage Earring", "Item synth", "AP: +4", "Str: + 0",
                "Mag: + 2"));
        driveList.add(new ItemsK (R.drawable.valor, "Executive's Ring", "Complete the Dawn Puzzle", "AP: + 30", "Str: + 0",
                "Mag: + 0"));

        driveList.add(new ItemsK (R.drawable.valor, "Medal", "Lose to Setzer", "AP: +0", "Str: + 1",
                "Mag: + 0"));
        driveList.add(new ItemsK (R.drawable.valor, "Moon Amulet", "Item Synth", "AP: + 3", "Str: + 2",
                "Mag: + 2"));
        driveList.add(new ItemsK (R.drawable.valor, "Mythril Ring", "Item Synth", "AP: + 4", "Str: + 0",
                "Mag: + 1"));
        driveList.add(new ItemsK (R.drawable.valor, "Orichalcum Ring", "Item Synth", "AP: + 5", "Str: + 0",
                "Mag: + 1"));
        driveList.add(new ItemsK (R.drawable.valor, "Platinum Ring", "Can be bought from Gumo's and\nArtemicion's Moogle Shops", "AP: + 1", "Str: + 1",
                "Mag: + 1"));

        driveList.add(new ItemsK (R.drawable.valor, "Sardonyx Ring", "Can be bought from Monty's Moogle Shop", "AP: + 0", "Str: + 0",
                "Mag: + 0"));
        driveList.add(new ItemsK (R.drawable.valor, "Silver Ring", "Can be bought from Monty's Moogle Shop", "AP: + 1", "Str: + 0",
                "Mag: + 1"));
        driveList.add(new ItemsK (R.drawable.valor, "Star Charm", "Item Synth", "AP: + 5", "Str: + 2",
                "Mag: + 2"));
        driveList.add(new ItemsK (R.drawable.valor, "Skill Ring", "Can be obtained from a chest at the\nPalace Walls", "AP: + 4", "Str: + 0",
                "Mag: + 0"));
        driveList.add(new ItemsK (R.drawable.valor, "Skillful Ring", "Can be obtained by completing the\nTitan Cup", "AP: + 5", "Str: + 0",
                "Mag: + 0"));

        driveList.add(new ItemsK (R.drawable.valor, "Slayer Earring", "Item Synth", "AP: + 5", "Str: + 1",
                "Mag: + 2"));
        driveList.add(new ItemsK (R.drawable.valor, "Soldier Earring", "Item Synth", "AP: + 4", "Str: + 2",
                "Mag: + 0"));
        driveList.add(new ItemsK (R.drawable.valor, "Technician's Ring", "Item Synth", "AP: + 3", "Str: + 0",
                "Mag: + 0"));
        driveList.add(new ItemsK (R.drawable.valor, "Tourmaline Ring", "Item Synth", "AP: + 2", "Str: + 1",
                "Mag: + 0"));
        driveList.add(new ItemsK (R.drawable.valor, "Full Bloom", "Item Synth", "AP: + 5", "Str: + 0",
                "Mag: + 3"));

        driveList.add(new ItemsK (R.drawable.valor, "Full Bloom+", "Item Synth", "AP: + 5", "Str: + 0",
                "Mag: + 3\t\t\t\t\t\t\t\t\t\t\t\t Grants MP Haste"));
        driveList.add(new ItemsK (R.drawable.valor, "Shadow Archive", "Item Synth", "AP: + 5", "Str: + 0",
                "Mag: + 3"));
        driveList.add(new ItemsK (R.drawable.valor, "Shadow Archive+", "Item Synth", "AP: + 5", "Str: + 0",
                "Mag: + 3\t\t\t\t\t\t\t\t\t\t\t\tGrants MP Rage"));


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
