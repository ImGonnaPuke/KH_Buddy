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

public class kh2Spells extends AppCompatActivity {


    private RecyclerView rView;
    private RecAdapter mAdapter;
    private ArrayList<Items> driveList;
    private RecyclerView.LayoutManager myLayout;

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kh2_puzz);

        int currentOrientation = getResources().getConfiguration().orientation;
        if (currentOrientation == Configuration.ORIENTATION_PORTRAIT) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }else {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }


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
        driveList.add(new Items (R.drawable.fire, "Fire", "Defend the Bailey in Hollow Bastion"));
        driveList.add(new Items (R.drawable.fire, "Fira", "Upon defeating Scar in the Pride Lands"));
        driveList.add(new Items (R.drawable.fire, "Firaga", "Upon defeating Jafar in Agrabah"));

        driveList.add(new Items (R.drawable.ice, "Blizzard", "Defend the Bailey in Hollow Bastion"));
        driveList.add(new Items (R.drawable.ice, "Blizzara", "Upon defeating Demyx before the\nbattle of 1000 heartless"));
        driveList.add(new Items (R.drawable.ice, "Blizzaga", "Finish Atlantica"));

        driveList.add(new Items (R.drawable.thun, "Thunder", "Upon defeating the Hydra in\nOlympus Coliseum"));
        driveList.add(new Items (R.drawable.thun, "Thundara", "Upon defeating Storm Rider\nin the Land of Dragons"));
        driveList.add(new Items (R.drawable.thun, "Thundaga", "Upon defeating Groundshaker\nin the Pride Lands"));

        driveList.add(new Items (R.drawable.cure, "Cure", "Upon defeating Dark Thorn"));
        driveList.add(new Items (R.drawable.cure, "Cura", "Right before the battle of\n1000 heartless"));
        driveList.add(new Items (R.drawable.cure, "Curaga", "Complete 100 Acre Wood"));

        driveList.add(new Items (R.drawable.reflect, "Reflect", "Upon defeating Pete in\nOlympus Coliseum"));
        driveList.add(new Items (R.drawable.reflect, "Reflera", "Upon defeating Xaldin at Beast's\nCastle"));
        driveList.add(new Items (R.drawable.reflect, "Reflectaga", "Upon defeating the MCP"));

        driveList.add(new Items (R.drawable.magnet, "Magnet", "Upon defeating Oogie Boogie"));
        driveList.add(new Items (R.drawable.magnet, "Magnera", "Upon defeating the Grim Reaper in\nPort Royal"));
        driveList.add(new Items (R.drawable.magnet, "Magnega", "Upon defeating Xigbar in the World\nthat Never Was"));


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
