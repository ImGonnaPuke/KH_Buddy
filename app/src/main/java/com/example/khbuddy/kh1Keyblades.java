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

public class kh1Keyblades extends AppCompatActivity {


    private RecyclerView rView;
    private KH2keybladeAdapter mAdapter;
    private ArrayList<ItemsK> driveList;
    private RecyclerView.LayoutManager myLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kh1_keyblades);
        genList();
        buildRecycle();



    }

    public void genList(){
        driveList = new ArrayList<>();
        driveList.add(new ItemsK (R.drawable.valor, "Kingdom Key", "Default Keyblade", "Strength: +3", "Magic: +0",
                "Crit bonus: 20%"));
        driveList.add(new ItemsK (R.drawable.valor, "Jungle King", "Complete Deep Jungle", "Strength: +5", "Magic: +0",
                "Crit bonus: 10%"));
        driveList.add(new ItemsK (R.drawable.valor, "Three Wishes", "Complete Agrabah", "Strength: +6", "Magic: +0",
                "Crit bonus: 20%"));
        driveList.add(new ItemsK (R.drawable.valor, "Wishing Star", "Chest in Geppetto's House", "Strength: +3", "Magic: +0",
                "Crit bonus: 100%"));
        driveList.add(new ItemsK (R.drawable.valor, "Spellbinder", "Speak to Merlin after obtaining all 7 spells", "Strength: +4", "Magic: +2",
                "Crit bonus: 20%"));

        driveList.add(new ItemsK (R.drawable.valor, "Crabclaw", "Complete Atlantica", "Strength: +6", "Magic: +1",
                "Crit bonus: 20%"));
        driveList.add(new ItemsK (R.drawable.valor, "Pumpkinhead", "Complete Halloween Town", "Strength: +7", "Magic: +0",
                "Crit bonus: 40%"));
        driveList.add(new ItemsK (R.drawable.valor, "Fairy Harp", "Complete Neverland", "Strength: +8", "Magic: +1",
                "Crit bonus: 20%"));
        driveList.add(new ItemsK (R.drawable.valor, "Metal Chocobo", "Defeat Cloud in the Hercules Cup", "Strength: +10", "Magic: -1",
                "Crit bonus: 2%"));
        driveList.add(new ItemsK (R.drawable.valor, "Olympia", "Complete the Phil, Pegasus and\nHercules Cups", "Strength: +9", "Magic: +0",
                "Crit bonus: 30%"));

        driveList.add(new ItemsK (R.drawable.valor, "Lady Luck", "White Trinity in Wonderland", "Strength: +8", "Magic: +2",
                "Crit bonus: 20%"));
        driveList.add(new ItemsK (R.drawable.valor, "Oblivion", "Chest in Hollow Bastion Grand Hall", "Strength: +11", "Magic: -1",
                "Crit bonus: 20%"));
        driveList.add(new ItemsK (R.drawable.valor, "Divine Rose", "Seal Hollow Bastion's Keyhole", "Strength: +10", "Magic: +0",
                "Crit bonus: 40%"));
        driveList.add(new ItemsK (R.drawable.valor, "Oathkeeper", "Speak to Kairi after rescuing her", "Strength: +9", "Magic: +1",
                "Crit bonus: 40%"));
        driveList.add(new ItemsK (R.drawable.valor, "Lionheart", "Defeat Leon and Cloud in the Hades Cup", "Strength: +10", "Magic: +1",
                "Crit bonus: 20%"));

        driveList.add(new ItemsK (R.drawable.valor, "Diamond Dust", "Gold Match", "Strength: +3", "Magic: +3",
                "Crit bonus: 20%"));
        driveList.add(new ItemsK (R.drawable.valor, "One-Winged Angel", "Platinum Match", "Strength: +8", "Magic: -2",
                "Crit bonus: 10%"));
        driveList.add(new ItemsK (R.drawable.valor, "Ultima Weapon", "Item Synth", "Strength: +12", "Magic: +2",
                "Crit bonus: 40%"));


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
