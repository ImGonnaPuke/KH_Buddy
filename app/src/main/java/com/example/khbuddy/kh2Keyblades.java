package com.example.khbuddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
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

public class kh2Keyblades extends AppCompatActivity {


    private RecyclerView rView;
    private KH2keybladeAdapter mAdapter;
    private ArrayList<ItemsK> driveList;
    private RecyclerView.LayoutManager myLayout;


    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kh2_puzz);
        genList();
        buildRecycle();

        int currentOrientation = getResources().getConfiguration().orientation;
        if (currentOrientation == Configuration.ORIENTATION_PORTRAIT) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }else {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }

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
        driveList.add(new ItemsK (R.drawable.kingdomkey, "Kingdom Key", "Default Keyblade", "Strength: +3", "Magic: +1",
                "Damage Control"));
        driveList.add(new ItemsK (R.drawable.stars, "Star Seeker", "Finish Mysterious Tower", "Strength: +3", "Magic: +1",
                "Air Combo Plus"));
        driveList.add(new ItemsK (R.drawable.hdrag, "Hidden Dragon", "Finish Land of Dragons", "Strength: +2", "Magic: +2",
                "MP Rage"));
        driveList.add(new ItemsK (R.drawable.hcrest, "Hero's Crest", "Finish Olympus Coliseum", "Strength: +4", "Magic: +0",
                "Air Combo Boost"));

        driveList.add(new ItemsK (R.drawable.oath, "Oathkeeper", "Unlock the gate in Twilight Town (2nd visit)", "Strength: +3", "Magic: +1",
                "Form Boost"));
        driveList.add(new ItemsK (R.drawable.mono, "Monochrome", "Finish Timeless River", "Strength: +3", "Magic: +2",
                "Item Boost"));
        driveList.add(new ItemsK (R.drawable.fwind, "Follow the Wind", "Finish Port Royal 1", "Strength: +3", "Magic: +1",
                "Draw"));
        driveList.add(new ItemsK (R.drawable.wlamp, "Wishing Lamp", "Finish Agrabah 1", "Strength: +4", "Magic: +3",
                "Jackpot"));

        driveList.add(new ItemsK (R.drawable.clife, "Circle of Life", "Talk to Simba in the Oasis of Pride Lands", "Strength: +4", "Magic: +1",
                "MP Haste"));
        driveList.add(new ItemsK (R.drawable.pdebug, "Photon Debugger", "Finish Space Paranoids 1", "Strength: +3", "Magic: +2",
                "Thunder Boost"));
        driveList.add(new ItemsK (R.drawable.gwing, "Gull Wing", "Talk to the Gullwings after the battle of\n1000 Heartless", "Strength: +3", "Magic: +0",
                "Experience Boost"));
        driveList.add(new ItemsK (R.drawable.smem, "Sweet Memories", "Complete the Expotition mini-game in\n100-acre wood", "Strength: +0", "Magic: +4",
                "Drive Converter"));
        driveList.add(new ItemsK (R.drawable.gsoul, "Guardian Soul", "Finish Olympus Coliseum 2", "Strength: +5", "Magic: +1",
                "Reaction Boost"));
        driveList.add(new ItemsK (R.drawable.rrose, "Rumbling Rose", "Finish Beast's Castle 2", "Strength: +5", "Magic: +0",
                "Finishing Plus"));
        driveList.add(new ItemsK (R.drawable.dpumpkin, "Decisive Pumpkin", "Finish Halloween Town 2", "Strength: +6", "Magic: +1",
                "Combo Boost"));
        driveList.add(new ItemsK (R.drawable.mabyss, "Mysterious Abyss", "Finish Atlantica", "Strength: +3", "Magic: +3",
                "Blizzard Boost"));
        driveList.add(new ItemsK (R.drawable.slion, "Sleeping Lion", "Speak to Leon after Space Paranoids 2\nis unlocked", "Strength: +3", "Magic: +1",
                "Combo Plus"));
        driveList.add(new ItemsK (R.drawable.cloud, "Fenrir", "Speak to Cloud after fighting Sephiroth", "Strength: +7", "Magic: +1",
                "Combo Minus"));
        driveList.add(new ItemsK (R.drawable.bond, "Bond of Flame", "Defeat the Nobodies in the Betwixt\nand Between", "Strength: +4", "Magic: +4",
                "Fire Boost"));
        driveList.add(new ItemsK (R.drawable.roxas, "Two Become One", "Defeat Roxas", "Strength: +5", "Magic: +4",
                "Light & Dark"));
        driveList.add(new ItemsK (R.drawable.oblivion, "Oblivion", "Reunite with Riku", "Strength: +6", "Magic: +2",
                "Drive Boost"));
        driveList.add(new ItemsK (R.drawable.fatalc, "Fatal Crest", "Finish the Goddess of Fate Cup", "Strength: +3", "Magic: +5",
                "Berserk Charge"));
        driveList.add(new ItemsK (R.drawable.wproof, "Winner's Proof", "Finish the Mushroom XIII sidequest", "Strength: +5", "Magic: +7",
                "EXP Zero"));
        driveList.add(new ItemsK (R.drawable.ultimakh2, "Ultima Weapon", "Item Synthesis", "Strength: +6", "Magic: +4",
                "MP Hastega"));



    }

    public void showItem (int position) {


        String toToast = driveList.get(position).getText2();
        //Toast toast = Toast. makeText(getApplicationContext(), toToast + "", Toast. LENGTH_SHORT);
        //toast.show();

        if(toToast.equals("Valor Form")) {
            //startActivity(new Intent(Drives.this, kh2Menu.class));
        }
        else{
            Toast toast = Toast. makeText(getApplicationContext(), toToast + "", Toast. LENGTH_SHORT);
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
