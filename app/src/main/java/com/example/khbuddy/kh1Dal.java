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

public class kh1Dal extends AppCompatActivity {


    private RecyclerView rView;
    private RecAdapter mAdapter;
    private ArrayList<Items> driveList;
    private RecyclerView.LayoutManager myLayout;
    //public static AdView mAdView;


    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kh1_dal);


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
        driveList.add(new Items (R.drawable.dalmations, "Traverse Town 1/4", "Island across from Merlin's house"));
        driveList.add(new Items (R.drawable.dalmations, "Traverse Town 2/4", "Red Trinity in the alleyway "));
        driveList.add(new Items (R.drawable.dalmations, "Traverse Town 3/4", "Green Trinity in the item shop"));
        driveList.add(new Items (R.drawable.dalmations, "Traverse Town 4/4", "Red Trinity in the Secret Waterway"));

        driveList.add(new Items (R.drawable.dalmations, "Wonderland 1/4", "Queen's Castle on the right ledge"));
        driveList.add(new Items (R.drawable.dalmations, "Wonderland 2/4", "Lotus Forest on one of the raised\nlilly pads"));
        driveList.add(new Items (R.drawable.dalmations, "Wonderland 3/4", "Tea Party Garden, enter via door in the\nLotus Forest"));
        driveList.add(new Items (R.drawable.dalmations, "Wonderland 4/4", "Lotus Forest, use the entrance to the\nTea Party Garden"));

        driveList.add(new Items (R.drawable.dalmations, "Olympus Coliseum 1/1", "Blue Trinity under the right statue"));

        driveList.add(new Items (R.drawable.dalmations, "Deep Jungle 1/4", "Last piece of land in Hippos' Lagoon"));
        driveList.add(new Items (R.drawable.dalmations, "Deep Jungle 2/4", "In the Vines 2 area"));
        driveList.add(new Items (R.drawable.dalmations, "Deep Jungle 3/4", "Chest in the Waterfall Cavern"));
        driveList.add(new Items (R.drawable.dalmations, "Deep Jungle 4/4", "Blue Trinity in the Camp Area"));

        driveList.add(new Items (R.drawable.dalmations, "Agrabah 1/4", "Chest in Treasure Room"));
        driveList.add(new Items (R.drawable.dalmations, "Agrabah 2/4", "Yellow Trinity in the Hidden Room"));
        driveList.add(new Items (R.drawable.dalmations, "Agrabah 3/4", "Chest at Cave: Entrance"));
        driveList.add(new Items (R.drawable.dalmations, "Agrabah 4/4", "Chest at Palace Gates"));

        driveList.add(new Items (R.drawable.dalmations, "Halloween Town 1/4", "Oogie's Manor, Evil Playroom"));
        driveList.add(new Items (R.drawable.dalmations, "Halloween Town 2/4", "After defeating Oogie Boogie, secret\ndoorway on Moonlight Hill"));
        driveList.add(new Items (R.drawable.dalmations, "Halloween Town 3/4", "White Trinity at Moonlight Hill"));
        driveList.add(new Items (R.drawable.dalmations, "Halloween Town 4/4", "Guillotine Square"));

        driveList.add(new Items (R.drawable.dalmations, "Monstro 1/4", "Chamber 3, reached by using barrels"));
        driveList.add(new Items (R.drawable.dalmations, "Monstro 2/4", "Mouth, on top of debris"));
        driveList.add(new Items (R.drawable.dalmations, "Monstro 3/4", "Chamber 6"));
        driveList.add(new Items (R.drawable.dalmations, "Monstro 4/4", "Chamber 5 on a barrel on one of the\nhigher platforms"));

        driveList.add(new Items (R.drawable.dalmations, "Neverland 1/4", "White Trinity on the Deck"));
        driveList.add(new Items (R.drawable.dalmations, "Neverland 2/4", "On a beam in the ship's Hold"));
        driveList.add(new Items (R.drawable.dalmations, "Neverland 3/4", "Yellow Trinity in the ship's Hold"));
        driveList.add(new Items (R.drawable.dalmations, "Neverland 4/4", "Chest in Captain's Cabin after Anti Sora"));

        driveList.add(new Items (R.drawable.dalmations, "Hollow Bastion 1/4", "In the Grand Hall near the Keyholes\nduring the 2nd visit"));
        driveList.add(new Items (R.drawable.dalmations, "Hollow Bastion 2/4", "Bottom of Rising Falls"));
        driveList.add(new Items (R.drawable.dalmations, "Hollow Bastion 3/4", "Cast Gravity on a floating platform in\nCastle Gates"));
        driveList.add(new Items (R.drawable.dalmations, "Hollow Bastion 4/4", "Cast Gravity on a floating platform in\nHigh Tower"));








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
