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

public class kh2Partner extends AppCompatActivity {

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
        driveList.add(new ItemsK (R.drawable.magesstaff, "Mage Staff", "Default weapon", "Strength: +1", "Magic: +1",
                ""));
        driveList.add(new ItemsK (R.drawable.hammerkh2, "Hammer Staff", "Wallace's Shop in Twilight Town",
                "Strength: +2", "Magic: +2", ""));
        driveList.add(new ItemsK (R.drawable.victorybell, "Victory Bell", "Port Royal Moogle",
                "Strength: +3", "Magic: +2", ""));
        driveList.add(new ItemsK (R.drawable.cometstaffkh2, "Comet Staff", "Olympus Coliseum Moogle",
                "Strength: +2", "Magic: +2", ""));
        driveList.add(new ItemsK (R.drawable.lordsbroom, "Lord's Broom", "Pride Lands Moogle",
                "Strength: +3", "Magic: +3", ""));
        driveList.add(new ItemsK (R.drawable.meteorkh2, "Meteor Staff", "Chest in Port Royal",
                "Strength: +4", "Magic: +3", ""));

        driveList.add(new ItemsK (R.drawable.risingdragon, "Rising Dragon", "Win the Cerberus Cup",
                "Strength: +4", "Magic: +4", "Fire Boost"));
        driveList.add(new ItemsK (R.drawable.shamansrelic, "Shaman Relic", "Shaman Heartless (1%)",
                "Strength: +4", "Magic: +5", "Blizzard Boost"));
        driveList.add(new ItemsK (R.drawable.nobodylance, "Nobody Lance", "Dragoon Nobody (1%)",
                "Strength: +5", "Magic: +5", "Item Boost"));
        driveList.add(new ItemsK (R.drawable.centurion, "Centurion", "Item Synth",
                "Strength: +13", "Magic: +3", ""));
        driveList.add(new ItemsK (R.drawable.savethequeenkh2, "Save the Queen", "Item Synth",
                "Strength: +5", "Magic: +6", "Hyper Healing"));

        driveList.add(new ItemsK (R.drawable.savethequeenplus, "Save the Queen+", "Item Synth",
                "Strength: +5", "Magic: +6", "MP Rage"));
        driveList.add(new ItemsK (R.drawable.plainmushroom, "Plain Mushroom", "Odd numbered Mushroom XIII",
                "Strength: +0", "Magic: +1", ""));
        driveList.add(new ItemsK (R.drawable.plainmushroomplus, "Plain Mushroom+", "Odd numbered Mushroom XIII",
                "Strength: +0", "Magic: +3", ""));
        driveList.add(new ItemsK (R.drawable.preciousmushroom, "Precious Mushroom", "Odd numbered Mushroom XIII",
                "Strength: +1", "Magic: +5", "MP Haste"));
        driveList.add(new ItemsK (R.drawable.preciousmushroomplus, "Precious Mushroom+", "Odd numbered Mushroom XIII",
                "Strength: +2", "Magic: +7", "MP Hastera"));
        driveList.add(new ItemsK (R.drawable.premiummushroom, "Premium Mushroom", "Odd numbered Mushroom XIII",
                "Strength: +3", "Magic: +9", "MP Hastega"));

        driveList.add(new ItemsK (R.drawable.knightsshield, "Knight's Shield", "Default weapon",
                "Strength: +1", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.adamantshieldkh2, "Adamant Shield", "Shop in Twilight Town",
                "Strength: +2", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.chaingearkh2, "Chain Gear", "Moogle shop in Port Royal",
                "Strength: +3", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.fallingstar, "Falling Star", "Moogle shop in Olympus Coliseum",
                "Strength: +3", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.dreamcloud, "Dreamcloud", "Moogle shop in Pride Lands",
                "Strength: +4", "Magic: +0", ""));

        driveList.add(new ItemsK (R.drawable.knightdefenderkh2, "Knight Defender", "Moogle shop in the World that Never Was",
                "Strength: +7", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.ogreshieldkh2, "Ogre Shield", "Chest in the Land of Dragons",
                "Strength: +5", "Magic: +0", "Defender"));
        driveList.add(new ItemsK (R.drawable.akashicrecord, "Akashic Record", "Bookmaster Heartless (1%)",
                "Strength: +7", "Magic: +0", "MP Haste"));
        driveList.add(new ItemsK (R.drawable.nobodyguard, "Nobody Guard", "Gambler Nobody (1%)",
                "Strength: +8", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.frozenpride, "Frozen Pride", "Item Synth",
                "Strength: +5", "Magic: +0", ""));

        driveList.add(new ItemsK (R.drawable.frozenprideplus, "Frozen Pride+", "Item Synth",
                "Strength: +5", "Magic: +0", "MP Hastega"));
        driveList.add(new ItemsK (R.drawable.savethekingkh2, "Save the King", "Item Synth",
                "Strength: +9", "Magic: +0", "Item Boost"));
        driveList.add(new ItemsK (R.drawable.savethekingplus, "Save the King+", "Item Synth",
                "Strength: +9", "Magic: +0", "Damage Control"));

        driveList.add(new ItemsK (R.drawable.joyousmushroom, "Joyous Mushroom", "Even numbered Mushroom XIII",
                "Strength: +1", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.joyousmushroomplus, "Joyous Mushroom+", "Even numbered Mushroom XIII",
                "Strength: +3", "Magic: +0", ""));
        driveList.add(new ItemsK (R.drawable.majesticmushroom, "Majestic Mushroom", "Even numbered Mushroom XIII",
                "Strength: +5", "Magic: +0", "Protect"));
        driveList.add(new ItemsK (R.drawable.majesticmushroomplus, "Majestic Mushroom+", "Even numbered Mushroom XIII",
                "Strength: +7", "Magic: +0", "Protectera"));
        driveList.add(new ItemsK (R.drawable.ultimatemushroom, "Ultimate Mushroom", "Even numbered Mushroom XIII",
                "Strength: +9", "Magic: +0", "Protectega"));


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
