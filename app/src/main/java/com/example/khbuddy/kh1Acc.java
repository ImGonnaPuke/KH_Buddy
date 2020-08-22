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

public class kh1Acc extends AppCompatActivity {

    private RecyclerView rView;
    private KH2keybladeAdapter mAdapter;
    private ArrayList<ItemsK> driveList;
    private RecyclerView.LayoutManager myLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kh1_acc);
        genList();
        buildRecycle();



    }

    public void genList(){
        driveList = new ArrayList<>();
        driveList.add(new ItemsK (R.drawable.valor, "Ability Stud", "Accessory Shop in Traverse Town", "AP: +2 \t\t\t\tHP: +0\t\t\t\tDef: +0",
                "Str: +0", "MP: +0  \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Angel Bangle", "Item Synth, chest at Gate to the Darkness", "AP: +0 \t\t\t\tHP: +6\t\t\t\tDef: +2",
                "Str: +0", "MP: +0  \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Atlas Armlet", "Item Synth", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +2",
                "Str: +0", "MP: +2  \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Blizzard Ring", "Equipped to Beast", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +1",
                "Str: +0", "MP: +0 \t\t\tIce Res: 20%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Blizzard Ring", "Equipped to Beast", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +1",
                "Str: +0", "MP: +0 \t\t\tIce Res: 20%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Blizzard Ring", "Equipped to Beast", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +1",
                "Str: +0", "MP: +0 \t\t\tIce Res: 20%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Blizzara Ring", "Blue Rhapsody .5%, chest at Rising Falls", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +2",
                "Str: +0", "MP: +0 \t\t\tIce Res: 20%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Blizzaga Ring", "Sea Neon .2% and Sheltering Zone 1%, chest at Rising Falls", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +3",
                "Str: +0", "MP: +0 \t\t\tIce Res: 20%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Blizzagun Band", "Accessory Shop", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +2",
                "Str: +2", "MP: +0 \t\t\tIce Res: 20%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));

        driveList.add(new ItemsK (R.drawable.valor, "Brave Warrior", "Defeat Guard Armor, chest at World Terminus", "AP: +0 \t\t\t\tHP: +3\t\t\t\tDef: +0",
                "Str: +1", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Chaos Ring", "Accessory Shop", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +0",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Cosmic Arts", "Item Synth", "AP: +2 \t\t\t\tHP: +9\t\t\t\tDef: +0",
                "Str: +0", "MP: +2 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Crystal Crown", "Item Synth", "AP: +3 \t\t\t\tHP: +6\t\t\t\tDef: +2",
                "Str: +2", "MP: +1 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Dark Ring", "Item Synth", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +3",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 20%"));

        driveList.add(new ItemsK (R.drawable.valor, "Element Ring", "Accessory Shop, Battleship (2%)", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +2",
                "Str: +0", "MP: +0 \t\t\tIce Res: 20%\t\t\tFire Res: 20%\nElec Res: 20%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Energy Bangle", "Item Synth", "AP: +0 \t\t\t\tHP: +3\t\t\t\tDef: +1",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "EXP Bracelet", "Item Synth", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: -2",
                "Str: -2", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%\t\t\tEXP: +30%"));
        driveList.add(new ItemsK (R.drawable.valor, "EXP Earring", "Item Synth", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +0",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%\t\t\tEXP: +20%"));
        driveList.add(new ItemsK (R.drawable.valor, "EXP Necklace", "Defeat Unknown, start with on Beginner", "AP: +2 \t\t\t\tHP: +0\t\t\t\tDef: +0",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%\t\t\tEXP: +30%"));

        driveList.add(new ItemsK (R.drawable.valor, "EXP Ring", "Finish 100 Acre Wood", "AP: +1 \t\t\t\tHP: +0\t\t\t\tDef: +0",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%\t\t\tEXP: +20%"));
        driveList.add(new ItemsK (R.drawable.valor, "Fire Ring", "Accessory Shop, chest in Agrabah, on Alladin and Jack", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +1",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 20%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Fira Ring", "Accessory Shop, chest in Hollow Bastion, Red Nocturne (.5%)", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +2",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 20%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Firaga Ring", "Accessory Shop, Fat Bandit (1%)", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +3",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 20%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Firagun Ring", "Accessory Shop", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +2",
                "Str: +2", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 20%\nElec Res: 0%\t\t\tDark Res: 0%"));

        driveList.add(new ItemsK (R.drawable.valor, "Gaia Bangle", "Item Synth", "AP: +0 \t\t\t\tHP: +9\t\t\t\tDef: +3",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Golem Chain", "Item Synth", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +1",
                "Str: +3", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Guard Earring", "Item Synth", "AP: +3 \t\t\t\tHP: +0\t\t\t\tDef: +1",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Heartguard", "Item Synth", "AP: +0 \t\t\t\tHP: +3\t\t\t\tDef: +4",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Holy Circlet", "Halloween Town", "AP: +3 \t\t\t\tHP: +0\t\t\t\tDef: +0",
                "Str: +0", "MP: +0 \t\t\tIce Res: 20%\t\t\tFire Res: 20%\nElec Res: 20%\t\t\tDark Res: 0%"));

        driveList.add(new ItemsK (R.drawable.valor, "Ifrit Belt", "White Trinity in Agrabah", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +0",
                "Str: +3", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 40%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Ifrit's Horn", "Wonderland", "AP: +1 \t\t\t\tHP: +0\t\t\t\tDef: +1",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 20%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Inferno Band", "Defeat Cerberus in the Prelims", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +2",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 20%\nElec Res: 0%\t\t\tDark Res: 20%"));
        driveList.add(new ItemsK (R.drawable.valor, "Magic Armlet", "Item Synth", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +0",
                "Str: +0", "MP: +1 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Master Earring", "Item Synth", "AP: +4 \t\t\t\tHP: +0\t\t\t\tDef: +2",
                "Str: +0", "MP: +1 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));


        driveList.add(new ItemsK (R.drawable.valor, "Moogle Band", "Item Synth", "AP: +2 \t\t\t\tHP: +6\t\t\t\tDef: +0",
                "Str: +0", "MP: +1 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Obsidian Ring", "Accessory Shop", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +0",
                "Str: +1", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 20%"));
        driveList.add(new ItemsK (R.drawable.valor, "Omega Arts", "Behemoth, chest at Gate to The Dark", "AP: +0 \t\t\t\tHP: +3\t\t\t\tDef: +3",
                "Str: +3", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Power Chain", "Item Synth", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +0",
                "Str: +2", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Protect Chain", "Accessory Shop, chest at Destiny Islands, Deep Jungle\nSoldier(1%), Alladin, Jack, Ariel and Peter", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +1",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));

        driveList.add(new ItemsK (R.drawable.valor, "Protectera Chain", "Accessory Shop, chests in Agrabah and Neverland, \n Bandit (.5%), Bouncywild (1%), Green Reqiem (.5%), Large Body(1%),\nPowerwild(.5%) ", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +3",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Protectega Chain", "Acessory Shop", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +3",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Ramuh Belt", "Chest in Hollow Bastion", "AP: +2 \t\t\t\tHP: +0\t\t\t\tDef: +0",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 20%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Raven's Claw", "Neverland - AntiSora", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +2",
                "Str: +2", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 20%"));
        driveList.add(new ItemsK (R.drawable.valor, "Ray of Light", "Agrabah - Pot Centipede", "AP: +0 \t\t\t\tHP: +3\t\t\t\tDef: +0",
                "Str: +0", "MP: +1 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));

        driveList.add(new ItemsK (R.drawable.valor, "Ribbon", "Item Synth, 90 Dalmations, default in Beginner", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +3",
                "Str: +0", "MP: +0 \t\t\tIce Res: 20%\t\t\tFire Res: 20%\nElec Res: 20%\t\t\tDark Res: 20%"));
        driveList.add(new ItemsK (R.drawable.valor, "Royal Crown", "Chest in Hollow Bastion", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +0",
                "Str: -2", "MP: +2 \t\t\tIce Res: 20%\t\t\tFire Res: 20%\nElec Res: 20%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Rune Armlet", "Item Synth", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +2",
                "Str: +0", "MP: +1 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Shiva Belt", "Chest in Olympus Colisseum", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +0",
                "Str: +0", "MP: +2 \t\t\tIce Res: 40%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Three Stars", "Item Synth", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +2",
                "Str: +0", "MP: +0 \t\t\tIce Res: 20%\t\t\tFire Res: 20%\nElec Res: 20%\t\t\tDark Res: 0%"));



        driveList.add(new ItemsK (R.drawable.valor, "Thunder Ring", "Accessory Shop, chest in Agrabah, Ariel", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +1",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 20%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Thundara Ring", "Accessory Shop, chest in Hollow Bastion, Yellow Opera (.5%)", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +2",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 20%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Thundaga Ring", "Accessory Shop, Aquatank(1%), Screwdriver(.2%),", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +3",
                "Str: +0", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 20%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "Thundagun Ring", "Accessory Shop", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +2",
                "Str: +2", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 20%\t\t\tDark Res: 0%"));

        driveList.add(new ItemsK (R.drawable.valor, "Titan Chain", "Item Synth", "AP: +0 \t\t\t\tHP: +0\t\t\t\tDef: +2",
                "Str: +4", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));
        driveList.add(new ItemsK (R.drawable.valor, "White Fang", "Deep Jungle - Kill Sabor", "AP: +1 \t\t\t\tHP: +0\t\t\t\tDef: +1",
                "Str: +1", "MP: +0 \t\t\tIce Res: 0%\t\t\tFire Res: 0%\nElec Res: 0%\t\t\tDark Res: 0%"));

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
