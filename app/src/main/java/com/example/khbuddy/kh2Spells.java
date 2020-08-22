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

public class kh2Spells extends AppCompatActivity {


    private RecyclerView rView;
    private RecAdapter mAdapter;
    private ArrayList<Items> driveList;
    private RecyclerView.LayoutManager myLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kh2_spells);


        genList();
        buildRecycle();



    }

    public void genList(){
        driveList = new ArrayList<>();
        driveList.add(new Items (R.drawable.valor, "Fire", "Defend the Bailey in Hollow Bastion"));
        driveList.add(new Items (R.drawable.wisdom, "Fira", "Upon defeating Scar in the Pride Lands"));
        driveList.add(new Items (R.drawable.master, "Firaga", "Upon defeating Jafar in Agrabah"));

        driveList.add(new Items (R.drawable.valor, "Blizzard", "Defend the Bailey in Hollow Bastion"));
        driveList.add(new Items (R.drawable.valor, "Blizzara", "Upon defeating Demyx before the\nbattle of 1000 heartless"));
        driveList.add(new Items (R.drawable.valor, "Blizzaga", "Finish Atlantica"));

        driveList.add(new Items (R.drawable.valor, "Thunder", "Upon defeating the Hydra in\nMount Olympus"));
        driveList.add(new Items (R.drawable.valor, "Thundara", "Upon defeating Storm Rider\nin the Land of Dragons"));
        driveList.add(new Items (R.drawable.valor, "Thundaga", "Upon defeating Groundshaker\nin the Pride Lands"));

        driveList.add(new Items (R.drawable.valor, "Cure", "Upon defeating Dark Thorn"));
        driveList.add(new Items (R.drawable.valor, "Cura", "Right before the battle of\n1000 heartless"));
        driveList.add(new Items (R.drawable.valor, "Curaga", "Complete 100 Acre Wood"));

        driveList.add(new Items (R.drawable.valor, "Reflect", "Upon defeating Pete in Mount\nOlympus"));
        driveList.add(new Items (R.drawable.valor, "Reflera", "Upon defeating Xaldin at Beast's\nCastle"));
        driveList.add(new Items (R.drawable.valor, "Reflectaga", "Upon defeating the MCP"));

        driveList.add(new Items (R.drawable.valor, "Magnet", "Upon defeating Oogie Boogie"));
        driveList.add(new Items (R.drawable.valor, "Magnera", "Upon defeating the Grim Reaper in\nPort Royal"));
        driveList.add(new Items (R.drawable.valor, "Magnega", "Upon defeating Xigbar in the World\nthat Never Was"));




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
