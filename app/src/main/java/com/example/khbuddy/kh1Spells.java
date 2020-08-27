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

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;

public class kh1Spells extends AppCompatActivity {


    private RecyclerView rView;
    private RecAdapter mAdapter;
    private ArrayList<Items> driveList;
    private RecyclerView.LayoutManager myLayout;
    //public static AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kh1_spells);


        genList();
        buildRecycle();

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
        driveList.add(new Items (R.drawable.fire, "Fire", "Defeat Guard Armor"));
        driveList.add(new Items (R.drawable.fire, "Fira", "Defeat Genie Jafar"));
        driveList.add(new Items (R.drawable.fire, "Firaga", "Speak to the Princesses in Hollow Bastion"));

        driveList.add(new Items (R.drawable.ice, "Blizzard", "Find all evidence in Wonderland"));
        driveList.add(new Items (R.drawable.ice, "Blizzara", "Defeat Jafar"));
        driveList.add(new Items (R.drawable.ice, "Blizzaga", "Defeat Behemoth"));

        driveList.add(new Items (R.drawable.thun, "Thunder", "Complete Phil's training"));
        driveList.add(new Items (R.drawable.thun, "Thundara", "Defeat Ursula 2"));
        driveList.add(new Items (R.drawable.thun, "Thundaga", "Defeat Cerberus in the Hades Cup"));

        driveList.add(new Items (R.drawable.cure, "Cure", "Defeat Stealth Sneak"));
        driveList.add(new Items (R.drawable.cure, "Cura", "Confront Hook in Neverland"));
        driveList.add(new Items (R.drawable.cure, "Curaga", "Speak to Aerith 3 times in Hollow Bastion"));

        driveList.add(new Items (R.drawable.grav, "Gravity", "Win the Phil Cup"));
        driveList.add(new Items (R.drawable.grav, "Gravira", "Defeat Oogie Boogie II"));
        driveList.add(new Items (R.drawable.grav, "Gravega", "Complete the Hades Cup"));

        driveList.add(new Items (R.drawable.stop, "Stop", "Defeat Parasite Cage"));
        driveList.add(new Items (R.drawable.stop, "Stropra", "Page 3 of 100 Acre Wood"));
        driveList.add(new Items (R.drawable.stop, "Stopga", "Defeat Phantom"));

        driveList.add(new Items (R.drawable.aero, "Aero", "Defeat Opposite Armor"));
        driveList.add(new Items (R.drawable.aero, "Aerora", "Yellow Trinity in Neverland"));
        driveList.add(new Items (R.drawable.aero, "Aeroga", "All 99 puppies"));

        driveList.add(new Items (R.drawable.emptykh1, "", ""));





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
        mAdapter = new RecAdapter(driveList);
        rView.setLayoutManager(myLayout);
        rView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new RecAdapter.OnItemClickListener() {
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
