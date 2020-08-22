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

public class kh1Partner extends AppCompatActivity {


    private RecyclerView rView;
    private KH2keybladeAdapter mAdapter;
    private ArrayList<ItemsK> driveList;
    private RecyclerView.LayoutManager myLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kh1_partner);
        genList();
        buildRecycle();



    }

    public void genList(){
        driveList = new ArrayList<>();
        driveList.add(new ItemsK (R.drawable.valor, "Mage's Staff", "Default weapon", "Strength: +0",
                "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Morning Star", "Item Shop", "Strength: +1",
                "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Shooting Star", "Item Shop",
                "Strength: +3", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Magus Staff", "Item Shop",
                "Strength: +2", "Magic: +1", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Wisdom Staff", "Item Shop",
                "Strength: +4", "Magic: +1", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Warhammer", "Item Shop",
                "Strength: +3", "Magic: -1", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Silver Mallet", "Item Shop",
                "Strength: +6", "Magic: -1", ""));

        driveList.add(new ItemsK (R.drawable.valor, "Grand Mallet", "Item Shop",
                "Strength: +8", "Magic: -1", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Lord Fortune", "Fairy Godmother after getting all summons",
                "Strength: +5", "Magic: +1", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Violetta", "White Trinity in Olymmpus Coliseum",
                "Strength: +8", "Magic: -1", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Wizard's Relic", "Wizard (.2%)",
                "Strength: +4", "Magic: +2", ""));

        driveList.add(new ItemsK (R.drawable.valor, "Dream Rod", "Merlin after getting all tier 3 spells",
                "Strength: +7", "Magic: +2", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Save the Queen", "Win the solo Hades Cup",
                "Strength: +8", "Magic: +2", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Fantasia", "Item Synth",
                "Strength: +3", "Magic: +3", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Meteor Strike", "Chest in the End of the World Crevasse",
                "Strength: +13", "Magic: +0", ""));

        driveList.add(new ItemsK (R.drawable.valor, "Knight's Shield", "Default",
                "Strength: +0", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Stout Shield", "Item Shop",
                "Strength: +1", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Smasher", "Item Shop",
                "Strength: +2", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Golem Shield", "Item Shop",
                "Strength: +3", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Mythril Shield", "Item Shop",
                "Strength: +4", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Adamant Shield", "Item Shop",
                "Strength: +5", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Onyx Shield", "Item Shop",
                "Strength: +6", "Magic: +0", ""));

        driveList.add(new ItemsK (R.drawable.valor, "Dream Shield", "Get all 7 White Mushroom Arts",
                "Strength: +6", "Magic: +2", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Genji Shield", "Defeat Yuffie in the Hades Cup",
                "Strength: +8", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Gigas Fist", "Item Shop",
                "Strength: +7", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Herc's Shield", "Defeat Hercules in the Hercules Cup",
                "Strength: +9", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Save the King", "Hades Cup time trial",
                "Strength: +11", "Magic: +2", ""));

        driveList.add(new ItemsK (R.drawable.valor, "Defender", "Defender (.2%)",
                "Strength: +13", "Magic: +1", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Seven Elements", "Item Synth",
                "Strength: +4", "Magic: +3", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Mighty Shield", "End of the World World Terminus",
                "Strength: +15", "Magic: +0", ""));

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
