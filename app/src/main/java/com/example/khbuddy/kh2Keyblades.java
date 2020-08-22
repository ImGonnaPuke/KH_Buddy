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

public class kh2Keyblades extends AppCompatActivity {


    private RecyclerView rView;
    private KH2keybladeAdapter mAdapter;
    private ArrayList<ItemsK> driveList;
    private RecyclerView.LayoutManager myLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kh2_keyblades);
        genList();
        buildRecycle();



    }

    public void genList(){
        driveList = new ArrayList<>();
        driveList.add(new ItemsK (R.drawable.valor, "Kingdom Key", "Default Keyblade", "Strength: +3", "Magic: +1",
                "Damage Control"));
        driveList.add(new ItemsK (R.drawable.valor, "Star Seeker", "Finish Mysterious Tower", "Strength: +3", "Magic: +1",
                "Air Combo Plus"));
        driveList.add(new ItemsK (R.drawable.valor, "Hidden Dragon", "Finish Land of Dragons", "Strength: +2", "Magic: +2",
                "MP Rage"));
        driveList.add(new ItemsK (R.drawable.valor, "Hero's Crest", "Finish Mt. Olympus", "Strength: +4", "Magic: +0",
                "Air Combo Boost"));
        driveList.add(new ItemsK (R.drawable.valor, "Star Seeker", "Finish Mysterious Tower", "Strength: +3", "Magic: +1",
                "Air Combo Plus"));
        driveList.add(new ItemsK (R.drawable.valor, "Oathkeeper", "Unlock the gate in Twilight Town (2nd visit)", "Strength: +3", "Magic: +1",
                "Form Boost"));
        driveList.add(new ItemsK (R.drawable.valor, "Monochrome", "Finish Timeless River", "Strength: +3", "Magic: +2",
                "Item Boost"));
        driveList.add(new ItemsK (R.drawable.valor, "Oathkeeper", "Unlock the gate in Twilight Town (2nd visit)", "Strength: +3", "Magic: +1",
                "Form Boost"));
        driveList.add(new ItemsK (R.drawable.valor, "Follow the Wind", "Finish Port Royal 1", "Strength: +3", "Magic: +1",
                "Draw"));
        driveList.add(new ItemsK (R.drawable.valor, "Wishing Lamp", "Finish Agrabah 1", "Strength: +4", "Magic: +3",
                "Jackpot"));
        driveList.add(new ItemsK (R.drawable.valor, "Oathkeeper", "Unlock the gate in Twilight Town (2nd visit)", "Strength: +3", "Magic: +1",
                "Form Boost"));
        driveList.add(new ItemsK (R.drawable.valor, "Circle of Life", "Talk to Simba in the Oasis of Pride Lands", "Strength: +4", "Magic: +1",
                "MP Haste"));
        driveList.add(new ItemsK (R.drawable.valor, "Photon Debugger", "Finish Space Paranoids 1", "Strength: +3", "Magic: +2",
                "Thunder Boost"));
        driveList.add(new ItemsK (R.drawable.valor, "Gull Wing", "Talk to the Gullwings after the battle of\n1000 Heartless", "Strength: +3", "Magic: +0",
                "Experience Boost"));
        driveList.add(new ItemsK (R.drawable.valor, "Sweet Memories", "Complete the Expotition mini-game in\n100-acre wood", "Strength: +0", "Magic: +4",
                "Drive Converter"));
        driveList.add(new ItemsK (R.drawable.valor, "Guardian Soul", "Finish Mt. Olympus 2", "Strength: +5", "Magic: +1",
                "Reaction Boost"));
        driveList.add(new ItemsK (R.drawable.valor, "Rumbling Rose", "Finish Beast's Castle 2", "Strength: +5", "Magic: +0",
                "Finishing Plus"));
        driveList.add(new ItemsK (R.drawable.valor, "Decisive Pumpkin", "Finish Halloween Town 2", "Strength: +6", "Magic: +1",
                "Combo Boost"));
        driveList.add(new ItemsK (R.drawable.valor, "Mysterious Abyss", "Finish Atlantica", "Strength: +3", "Magic: +3",
                "Blizzard Boost"));
        driveList.add(new ItemsK (R.drawable.valor, "Sleeping Lion", "Speak to Leon after Space Paranoids 2\nis unlocked", "Strength: +3", "Magic: +1",
                "Combo Plus"));
        driveList.add(new ItemsK (R.drawable.valor, "Fenrir", "Speak to Cloud after fighting Sephiroth", "Strength: +7", "Magic: +1",
                "Combo Minus"));
        driveList.add(new ItemsK (R.drawable.valor, "Bond of Flame", "Defeat the Nobodies in the Betwixt\nand Between", "Strength: +4", "Magic: +4",
                "Fire Boost"));
        driveList.add(new ItemsK (R.drawable.valor, "Two Become One", "Defeat Roxas", "Strength: +5", "Magic: +4",
                "Light & Dark"));
        driveList.add(new ItemsK (R.drawable.valor, "Oblivion", "Reunite with Riku", "Strength: +6", "Magic: +2",
                "Drive Boost"));
        driveList.add(new ItemsK (R.drawable.valor, "Fatal Crest", "Finish the Goddess of Fate Cup", "Strength: +3", "Magic: +5",
                "Berserk Charge"));
        driveList.add(new ItemsK (R.drawable.valor, "Winner's Proof", "Finish the Musroom XIII sidequest", "Strength: +5", "Magic: +7",
                "EXP Zero"));
        driveList.add(new ItemsK (R.drawable.valor, "Ultima Weapon", "Item Synthesis", "Strength: +6", "Magic: +4",
                "MP Hastega"));


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
