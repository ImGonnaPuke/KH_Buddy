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

public class kh1Spells extends AppCompatActivity {


    private RecyclerView rView;
    private RecAdapter mAdapter;
    private ArrayList<Items> driveList;
    private RecyclerView.LayoutManager myLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kh1_spells);


        genList();
        buildRecycle();



    }

    public void genList(){
        driveList = new ArrayList<>();
        driveList.add(new Items (R.drawable.valor, "Fire", "Defeat Guard Armor"));
        driveList.add(new Items (R.drawable.wisdom, "Fira", "Defeat Genie Jafar"));
        driveList.add(new Items (R.drawable.master, "Firaga", "Speak to the Princesses in Hollow Bastion"));

        driveList.add(new Items (R.drawable.valor, "Blizzard", "Find all evidence in Wonderland"));
        driveList.add(new Items (R.drawable.valor, "Blizzara", "Defeat Jafar"));
        driveList.add(new Items (R.drawable.valor, "Blizzaga", "Defeat Behemoth"));

        driveList.add(new Items (R.drawable.valor, "Thunder", "Complete Phil's training"));
        driveList.add(new Items (R.drawable.valor, "Thundara", "Defeat Ursula 2"));
        driveList.add(new Items (R.drawable.valor, "Thundaga", "Defeat Cerberus in the Hades Cup"));

        driveList.add(new Items (R.drawable.valor, "Cure", "Defeat Stealth Sneak"));
        driveList.add(new Items (R.drawable.valor, "Cura", "Confront Hook in Neverland"));
        driveList.add(new Items (R.drawable.valor, "Curaga", "Speak to Aerith 3 times in Hollow Bastion"));

        driveList.add(new Items (R.drawable.valor, "Gravity", "Win the Phil Cup"));
        driveList.add(new Items (R.drawable.valor, "Gravira", "Defeat Oogie Boogie II"));
        driveList.add(new Items (R.drawable.valor, "Gravega", "Complete the Hades Cup"));

        driveList.add(new Items (R.drawable.valor, "Stop", "Defeat Parasite Cage"));
        driveList.add(new Items (R.drawable.valor, "Stropra", "Page 3 of 100 Acre Wood"));
        driveList.add(new Items (R.drawable.valor, "Stopga", "Defeat Phantom"));

        driveList.add(new Items (R.drawable.valor, "Aero", "Defeat Opposite Armor"));
        driveList.add(new Items (R.drawable.valor, "Aerora", "Yellow Trinity in Neverland"));
        driveList.add(new Items (R.drawable.valor, "Aeroga", "All 99 puppies"));






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
