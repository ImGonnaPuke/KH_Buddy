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

public class kh2Partner extends AppCompatActivity {

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
        driveList.add(new ItemsK (R.drawable.valor, "Mage Staff", "Default weapon", "Strength: +1", "Magic: +1",
                ""));
        driveList.add(new ItemsK (R.drawable.valor, "Hammer Staff", "Wallace's Shop in Twilight Town",
                "Strength: +2", "Magic: +2", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Victory Bell", "Port Royal Moogle",
                "Strength: +3", "Magic: +2", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Comet Staff", "Mt Olympus Moogle",
                "Strength: +2", "Magic: +2", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Lord's Broom", "Pride Lands Moogle",
                "Strength: +3", "Magic: +3", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Meteor Staff", "Chest in Port Royal",
                "Strength: +4", "Magic: +3", ""));

        driveList.add(new ItemsK (R.drawable.valor, "Rising Dragon", "Win the Cerberus Cup",
                "Strength: +4", "Magic: +4", "Fire Boost"));
        driveList.add(new ItemsK (R.drawable.valor, "Shaman Relic", "Shaman Heartless (1%)",
                "Strength: +4", "Magic: +5", "Blizard Boost"));
        driveList.add(new ItemsK (R.drawable.valor, "Nobody Lance", "Dragoon Nobody (1%)",
                "Strength: +5", "Magic: +5", "Item Boost"));
        driveList.add(new ItemsK (R.drawable.valor, "Centurion", "Item Synth",
                "Strength: +13", "Magic: +3", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Save the Queen", "Item Synth",
                "Strength: +5", "Magic: +6", "Hyper Healing"));

        driveList.add(new ItemsK (R.drawable.valor, "Save the Queen+", "Item Synth",
                "Strength: +5", "Magic: +6", "MP Rage"));
        driveList.add(new ItemsK (R.drawable.valor, "Plain Mushroom", "Odd numbered Mushroom XIII",
                "Strength: +0", "Magic: +1", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Plain Mushroom+", "Odd numbered Mushroom XIII",
                "Strength: +0", "Magic: +3", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Precious Mushroom", "Odd numbered Mushroom XIII",
                "Strength: +1", "Magic: +5", "MP Haste"));
        driveList.add(new ItemsK (R.drawable.valor, "Precious Mushroom+", "Odd numbered Mushroom XIII",
                "Strength: +2", "Magic: +7", "MP Hastera"));
        driveList.add(new ItemsK (R.drawable.valor, "Premium Mushroom", "Odd numbered Mushroom XIII",
                "Strength: +3", "Magic: +9", "MP Hastega"));

        driveList.add(new ItemsK (R.drawable.valor, "Knight's Shield", "Default weapon",
                "Strength: +1", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Knight's Shield", "Default weapon",
                "Strength: +1", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Knight's Shield", "Default weapon",
                "Strength: +1", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Knight's Shield", "Default weapon",
                "Strength: +1", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Knight's Shield", "Default weapon",
                "Strength: +1", "Magic: +0", ""));

        driveList.add(new ItemsK (R.drawable.valor, "Knight's Shield", "Default weapon",
                "Strength: +1", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Adamant Shield", "Shop in Twilight Town",
                "Strength: +2", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Chain Gear", "Moogle shop in Port Royal",
                "Strength: +3", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Falling Star", "Moogle shop in Mt Olympus",
                "Strength: +3", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Dreamcloud", "Moogle shop in Pride Lands",
                "Strength: +4", "Magic: +0", ""));

        driveList.add(new ItemsK (R.drawable.valor, "Knight Defender", "Moogle shop in the World that Never Was",
                "Strength: +7", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Ogre Shield", "Chest in the Land of Dragons",
                "Strength: +5", "Magic: +0", "Defender"));
        driveList.add(new ItemsK (R.drawable.valor, "Akashic Record", "Bookmaster Heartless (1%)",
                "Strength: +7", "Magic: +0", "MP Haste"));
        driveList.add(new ItemsK (R.drawable.valor, "Nobody Guard", "Gambler Nobody (1%)",
                "Strength: +8", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Frozen Pride", "Item Synth",
                "Strength: +5", "Magic: +0", ""));

        driveList.add(new ItemsK (R.drawable.valor, "Frozen Pride+", "Item Synth",
                "Strength: +5", "Magic: +0", "MP Hastega"));
        driveList.add(new ItemsK (R.drawable.valor, "Save the King", "Item Synth",
                "Strength: +9", "Magic: +0", "Item Boost"));
        driveList.add(new ItemsK (R.drawable.valor, "Save the King+", "Item Synth",
                "Strength: +9", "Magic: +0", "Damage Control"));

        driveList.add(new ItemsK (R.drawable.valor, "Joyous Mushroom", "Even numbered Mushroom XIII",
                "Strength: +1", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Joyous Mushroom+", "Even numbered Mushroom XIII",
                "Strength: +3", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.valor, "Majestic Mushroom", "Even numbered Mushroom XIII",
                "Strength: +5", "Magic: +0", "Protect"));
        driveList.add(new ItemsK (R.drawable.valor, "Majestic Mushroom", "Even numbered Mushroom XIII",
                "Strength: +7", "Magic: +0", "Protectera"));
        driveList.add(new ItemsK (R.drawable.valor, "Ultimate Mushroom", "Even numbered Mushroom XIII",
                "Strength: +9", "Magic: +0", "Protectega"));
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
