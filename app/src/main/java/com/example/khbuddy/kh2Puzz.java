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

public class kh2Puzz extends AppCompatActivity {


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

        driveList.add(new ItemsK (R.drawable.crown, "Hollow Bastion 1/23 -\nAwakening 1/12", "", "Merlin's House, above bed", "",
                ""));
        driveList.add(new ItemsK (R.drawable.crown, "Hollow Bastion 2/23 -\nAwakening 2/12", "", "Marketplace, near the shops", "",
                ""));
        driveList.add(new ItemsK (R.drawable.crown, "Hollow Bastion 3/23 -\nAwakening 3/12", "", "Borough, near the Bailey", "",
                ""));
        driveList.add(new ItemsK (R.drawable.crown, "Hollow Bastion 4/23 -\nHeart 6/12", "", "Marketplace, above Moogle Shop", "",
                ""));
        driveList.add(new ItemsK (R.drawable.crown, "Hollow Bastion 5/23 -\nDuality 7/12", "", "Bailey, stairs to Restoration Site", "",
                ""));
        driveList.add(new ItemsK (R.drawable.crown, "Hollow Bastion 6/23 -\nFrontier 4/12", "", "Postern, above doorway to Corridors", "",
                ""));
        driveList.add(new ItemsK (R.drawable.crown, "Hollow Bastion 7/23 -\nDaylight 5/48", "", "Postern, stairs leading to central area", "",
                ""));
        driveList.add(new ItemsK (R.drawable.crown, "Hollow Bastion 8/23 -\nDaylight 24/48", "", "Heartless Manufactory, ground", "",
                ""));

        driveList.add(new ItemsK (R.drawable.crown, "Hollow Bastion 9/23 -\nSunset 1/48", "", "Cavern of Remembrance: Mineshaft,\narea with yellow orbs", "",
                ""));
        driveList.add(new ItemsK (R.drawable.crown, "Hollow Bastion 10/23 -\nSunset 4/48", "", "Borough, buildings across from Merlin's\nHouse", "",
                ""));
        driveList.add(new ItemsK (R.drawable.crown, "Hollow Bastion 11/23 -\nSunset 6/48", "", "Cavern of Remembrance: Depths, ledge\nunder the entrance", "",
                ""));
        driveList.add(new ItemsK (R.drawable.crown, "Hollow Bastion 12/23 -\nSunset 9/48", "", "Cavern of Remembrance: Depths, top of\ncenter column", "",
                ""));
        driveList.add(new ItemsK (R.drawable.crown, "Hollow Bastion 13/23 -\nSunset 12/48", "", "Bailey, above the area", "",
                ""));
        driveList.add(new ItemsK (R.drawable.crown, "Hollow Bastion 14/23 -\nSunset 14/48", "", "Cavern of Remembrance: Mining Area,\ncenter of the mining drill", "",
                ""));
        driveList.add(new ItemsK (R.drawable.crown, "Hollow Bastion 15/23 -\nSunset 16/48", "", "Cavern of Remembrance: Mining Area,\non a higher platform, use a vent", "",
                ""));
        driveList.add(new ItemsK (R.drawable.crown, "Hollow Bastion 16/23 -\nSunset 19/48", "", "Cavern of Remembrance: Mining Area,\nunder ledge with the area map chest", "",
                ""));
        driveList.add(new ItemsK (R.drawable.crown, "Hollow Bastion 17/23 -\nSunset 27/48", "", "Cavern of Remembrance: Mining Area,\nhighest drill", "",
                ""));
        driveList.add(new ItemsK (R.drawable.crown, "Hollow Bastion 18/23 -\nSunset 30/48", "", "Cavern of Remembrance: Mineshaft,\narea with blue orbs", "",
                ""));
        driveList.add(new ItemsK (R.drawable.crown, "Hollow Bastion 19/23 -\nSunset 32/48", "", "Cavern of Remembrance: Mineshaft,\narea with white orbs", "",
                ""));
        driveList.add(new ItemsK (R.drawable.crown, "Hollow Bastion 20/23 -\nSunset 36/48", "", "Cavern of Remembrance: Mineshaft,\narea with white orbs, use glide", "",
                ""));
        driveList.add(new ItemsK (R.drawable.crown, "Hollow Bastion 21/23 -\nSunset 40/48", "", "Cavern of Remembrance: Mineshaft,\narea with white orbs, use glide", "",
                ""));
        driveList.add(new ItemsK (R.drawable.crown, "Hollow Bastion 22/23 -\nSunset 47/48", "", "Corridors, use high jump", "",
                ""));
        driveList.add(new ItemsK (R.drawable.crown, "Hollow Bastion 23/23 -\nSunset 48/48", "", "Ansem's Study behind the closed door\nto Heartless Manufactory", "",
                ""));


        driveList.add(new ItemsK (R.drawable.crown, "Beast's Castle 1/9 -\nAwakening 4/12",
                "", "Undercroft, southwest corner, above\nfurniture", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Beast's Castle 2/9 -\nAwakening 6/12",
                "", "Beast's Room, on the ground", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Beast's Castle 3/9 -\nAwakening 7/12",
                "", "Underground Passage, highest \nplatforms", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Beast's Castle 4/9 -\nAwakening 9/12",
                "", "Underground Passage, from the\nentrance from Undercroft", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Beast's Castle 5/9 -\nAwakening 10/12",
                "", "Undercroft, southwest corner, above\nfurniture", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Beast's Castle 6/9 -\nHeart 12/12",
                "", "West Wing, short staicase", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Beast's Castle 7/9 -\nDaylight 43/48",
                "", "West Hall, in front of the stairs, use\nmobility skill", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Beast's Castle 8/9 -\nSunset 28/48",
                "", "Bridge, end of the bridge", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Beast's Castle 9/9 -\nSunset 37/48",
                "", "Enterance Hall, center of the hall, use\nmobility skill", "", ""));

        driveList.add(new ItemsK (R.drawable.crown, "Twilight Town 1/20 -\nAwakening 5/12",
                "", "Tower: Wardrobe, get automatically", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Twilight Town 2/20 -\nFrontier 1/12",
                "", "Station Plaza, northeast corner", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Twilight Town 3/20 -\nFrontier 5/12",
                "", "Tram Common, on nortner buildings'\n rooftop", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Twilight Town 4/20 -\nDaylight 22/48",
                "", "Mansion: Foyer, use glide", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Twilight Town 5/20 -\nDaylight 23/48",
                "", "Mansion: Computer Room, on the\nground", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Twilight Town 6/20 -\nDaylight 27/48",
                "", "Tram Common, above synth shop", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Twilight Town 7/20 -\nDaylight 28/48",
                "", "Market Stree, use mobility skills", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Twilight Town 8/20 -\nDaylight 31/48",
                "", "Mansion: Pod Room, on ground", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Twilight Town 9/20 -\nDaylight 32/48",
                "", "Mansion: Foyer, on ground", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Twilight Town 10/20 -\nSunset 2/48",
                "", "Sunset Hill, jump from top of the hill", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Twilight Town 11/20 -\nSunset 7/48",
                "", "Sunset Terrace, top of lone building", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Twilight Town 12/20 -\nSunset 8/48",
                "", "Sunset Terrace, top of waterfall, use\nmobility skills", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Twilight Town 13/20 -\nSunset 10/48",
                "", "Old Mansion, on top of a column, use\nmobility skills", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Twilight Town 14/20 -\nSunset 13/48",
                "", "Sunset Hill, on bench near clock tower", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Twilight Town 15/20 -\nSunset 15/48",
                "", "Tower, jump off staircase toward tower", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Twilight Town 16/20 -\nSunset 22/48",
                "", "Tower: Wardrobe, on ground", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Twilight Town 17/20 -\nSunset 24/48",
                "", "Mansion: White Room, on ground", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Twilight Town 18/20 -\nSunset 431/48",
                "", "Tunnelway, near waterfall", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Twilight Town 19/20 -\nSunset 38/48",
                "", "Underground Concourse, near ground", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Twilight Town 20/20 -\nSunset 45/48",
                "", "Underground Concourse, above pit", "", ""));

        driveList.add(new ItemsK (R.drawable.crown, "Land of Dragons 1/10 -\nAwakening 8/12",
                "", "Ridge, use air currents", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Land of Dragons 2/10 -\nAwakening 11/12",
                "", "Ridge, behind fireworks", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Land of Dragons 3/10 -\nAwakening 12/12",
                "", "Village, haystack behind a house", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Land of Dragons 4/10 -\nHeart 10/12",
                "", "Encampment, near captain's tent", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Land of Dragons 5/10 -\nHeart 11/12",
                "", "Village, on rooftops, use high jump", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Land of Dragons 6/10 -\nFrontier 8/12",
                "", "Mountain Trail, above large boulder, use\nlimits or mobility", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Land of Dragons 7/10 -\nDaylight 8/48",
                "", "Village, above Moogle, use mobility\nskills", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Land of Dragons 8/10 -\nDaylight 9/48",
                "", "Throne Room, west side, use mobility\nskills", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Land of Dragons 9/10-\nDaylight 15/48",
                "", "Throne Room, east side, use mobility\nskills", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Land of Dragons 10/10 -\nSunset 43/48",
                "", "Encampment, use mobility skills", "", ""));

        driveList.add(new ItemsK (R.drawable.crown, "Disney Castle 1/5 -\nHeart 1/12",
                "", "Courtyard, above trumpet players", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Disney Castle 2/5 -\nHeart 2/12",
                "", "Courtyard, atop the castle hedge", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Disney Castle 3/5 -\nDuality 3/12",
                "", "Gummi Hangar, use high jump", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Disney Castle 4/5 -\nDuality 12/12",
                "", "Courtyard, on a tall hedge", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Disney Castle 5/5 -\nDaylight 16/48",
                "", "Colonnade, above entrance to the\ncourtyard, use mobility skills", "", ""));

        driveList.add(new ItemsK (R.drawable.crown, "Olympus Coliseum 1/9 -\nHeart 3/12",
                "", "Cave of the Dead: Entrance, on\nground", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Olympus Coliseum 2/9 -\nHeart 4/12",
                "", "Underworld Caverns: Atrium,\nnear entrance", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Olympus Coliseum 3/9 -\nHeart 9/12",
                "", "Underworld Caverns: Entrance, on\n ground", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Olympus Coliseum 4/9 -\nDuality 6/12",
                "", "Underworld Caverns: Lost Road,\nnear the exit to Atrium", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Olympus Coliseum 5/9 -\nDuality 10/12",
                "", "Underworld Caverns: Lock, behind\nthe lock", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Olympus Coliseum 6/9 -\nDaylight 25/48",
                "", "Cave of the Dead: Passage, above\nthe center of the area", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Olympus Coliseum 7/9 -\nDaylight 34/48",
                "", "Underworld Caverns: Entrance, behind\nthe pillar", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Olympus Coliseum 8/9 -\nDaylight 40/48",
                "", "Underworld Caverns: Lost Road, above\nthe second column, use mobility skills", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Olympus Coliseum 9/9 -\nDaylight 46/48",
                "", "Underworld Caverns: Lost Road, above\nthe first column, use mobility skills", "", ""));


        driveList.add(new ItemsK (R.drawable.crown, "Port Royal 1/13 -\nHeart 5/12",
                "", "Isla de Muerta: Powder Store, behind\ngun powder crates", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Port Royal 2/13 -\nHeart 7/12",
                "", "Rampart, opposite end of the area from\nthe save point", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Port Royal 3/13 -\nDuality 4/12",
                "", "Isla de Muerta: Powder Store, behind\ngun powder crates", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Port Royal 4/13 -\nDuality 11/12",
                "", "Town, near the first pile of exploding\ncrates", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Port Royal 5/13 -\nFrontier 7/12",
                "", "Townm above explosive crates, use\nhigh jump", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Port Royal 6/13 -\nDaylight 33/48",
                "", "Ship Graveyard: Jetsam Keep, in the\nwreckage that has a hole through it", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Port Royal 7/13 -\nDaylight 33/48",
                "", "Black Pearl: Captain's Storeroom, on\nthe ground", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Port Royal 8/13 -\nDaylight 39/48",
                "", "Black Pearl, above the mast, use\nmobility skills", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Port Royal 9/13 -\nDaylight 45/48",
                "", "Black Pearl, above the stern", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Port Royal 10/13 -\nSunset 5/48",
                "", "Ship Graveyard: Interceptor's Hold,\non ground", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Port Royal 11/13 -\nSunset 33/48",
                "", "Ship Graveyard: Jetsam Keep, hit\nthe anchor", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Port Royal 12/13 -\nSunset 39/48",
                "", "Ship Graveyard: Seadrift Row, in the\nbroken crow's nest", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Port Royal 13/13 -\nSunset 42/48",
                "", "Harbor, use mobility skills", "", ""));

        driveList.add(new ItemsK (R.drawable.crown, "Timeless River 1/3 -\nHeart 8/12",
                "", "Waterway, on the western end", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Timeless River 2/3 -\nDuality 9/12",
                "", "Pier, above a tree, use mobility skills", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Timeless River 3/3 -\nFrontier 6/12",
                "", "Pier, on the pier", "", ""));

        driveList.add(new ItemsK (R.drawable.crown, "Atlantica 1/3 -\nDuality 1/12",
                "", "Undersea Courtyard, under a ledge", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Atlantica 2/3 -\nFrontier 11/12",
                "", "Triton's Throne, left side", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Atlantica 3/3 -\nFrontier 12/12",
                "", "Triton's Throne, right side", "", ""));

        driveList.add(new ItemsK (R.drawable.crown, "Halloween Town 1/8 -\nDuality 2/12",
                "", "Hinterlands, behind the tree leading\nto Christmas Town", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Halloween Town 2/8 -\nDuality 8/12",
                "", "Town Square, above a metal grate", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Halloween Town 3/8 -\nFrontier 2/12",
                "", "Santa's House, above the dresser", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Halloween Town 4/8 -\nDaylight 12/48",
                "", "Yuletide Hill, behind tree leading\nto Halloween Town", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Halloween Town 5/8 -\nDaylight 21/48",
                "", "Santa's House, on the counter-top", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Halloween Town 6/8 -\nDaylight 44/48",
                "", "Shipping and Receiving, above the\nentrance", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Halloween Town 7/8 -\nSunset 21/48",
                "", "Curly Hill, use glide", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Halloween Town 8/8 -\nSunset 25/48",
                "", "Shipping and Receiving, use\nskateboard", "", ""));

        driveList.add(new ItemsK (R.drawable.crown, "Agrabah 1/14 -\nDuality 5/12",
                "", "Above a store stand, near Palace Gates", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Agrabah 2/14 -\nFrontier 3/12",
                "", "Behind a store stand, near the\nBazaar exit", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Agrabah 3/14 -\nFrontier 9/12",
                "", "Bazaar, behind a store stand, in\nthe center entrance", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Agrabah 4/14 -\nFrontier 10/12",
                "", "Cave of Wonders: Valley of Stone\n1st chamber", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Agrabah 5/14 -\nDaylight 6/48",
                "", "Cave of Wonders: Treasure Room,\nwest of entrance, behind treasure", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Agrabah 6/14 -\nDaylight 10/48",
                "", "Cave of Wonders: Chasm of\nChallenges, between levels", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Agrabah 7/14 -\nDaylight 11/48",
                "", "Cave of Wonders: Chasm of\nChallenges, between levels", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Agrabah 8/14 -\nDaylight 29/48",
                "", "Cave of Wonders: Entrance, behind\ncave of wonders", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Agrabah 9/14 -\nDaylight 35/48",
                "", "Sandswept Ruins, under the 2nd arch", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Agrabah 10/14 -\nDaylight 37/48",
                "", "Cave of Wonders: Chasm of\nChallenges, between levels", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Agrabah 11/14 -\nDaylight 41/48",
                "", "Sandswept Ruins, above the broken\nbridge connect to the tower", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Agrabah 12/14 -\nSunset 18/48",
                "", "Sandswept Ruins, under the 1st arch", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Agrabah 13/14 -\nSunset 23/48",
                "", "Cave of Wonders: Treasure Room, \nabove the pile of gold, use high\njump", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Agrabah 14/14 -\nSunset 48/48",
                "", "Bazaar, jump from one of the store\nstands using high jump", "", ""));

        driveList.add(new ItemsK (R.drawable.crown, "Pride Land 1/10 -\nDaylight 1/48",
                "", "Wastelands, along the trail", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Pride Land 2/10 -\nDaylight 2/48",
                "", "Wildebeest Valley, behind a rock\ncolumn", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Pride Land 3/10 -\nDaylight 3/48",
                "", "Wastelands, along the trail", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Pride Land 4/10 -\nDaylight 4/48",
                "", "Oasis, above the waterfall basin", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Pride Land 5/10 -\nDaylight 18/48",
                "", "King's Den, above a small rock", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Pride Land 6/10 -\nDaylight 30/48",
                "", "Elephant Graveyard, center of the area", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Pride Land 7/10 -\nDaylight 42/48",
                "", "Elephant Graveyard, in a small alcove", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Pride Land 8/10 -\nDaylight 47/48",
                "", "Jungle, near the center of the area", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Pride Land 9/10 -\nDaylight 48/48",
                "", "Wildebeest Valley, under a tree, near\nthe entrance to Wastelands", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Pride Land 10/10 -\nSunset 29/48",
                "", "Pride Rock, jump off toward the\nwestern edge", "", ""));

        driveList.add(new ItemsK (R.drawable.crown, "100 Acre Wood 1/6 -\nDaylight 7/48",
                "", "Pooh's House, above his house, use\nhigh jump", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "100 Acre Wood 2/6 -\nDaylight 13/48",
                "", "Kanga's House, above the boxes", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "100 Acre Wood 3/6 -\nDaylight 14/48",
                "", "Starry Hill, behind the hill, use\nmobility skills", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "100 Acre Wood 4/6 -\nDaylight 19/48",
                "", "Rabbit's House, above the cabbages", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "100 Acre Wood 5/6 -\nDaylight 20/48",
                "", "Spooky Cave, across from the\n1st chest", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "100 Acre Wood 6/6 -\nDaylight 26/48",
                "", "Piglet's House, on a tree stump", "", ""));

        driveList.add(new ItemsK (R.drawable.crown, "Space Paranoids 1/4 -\nDaylight 38/48",
                "", "Canyon, on the highest ledge in the\ncenter", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Space Paranoids 2/4 -\nSunset 3/48",
                "", "Solar Sailer, on the ground", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Space Paranoids 3/4 -\nSunset 44/48",
                "", "Canyon, use glide", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "Space Paranoids 4/4 -\nSunset 46/48",
                "", "Central Core, on the opposite side\nof the entrance", "", ""));

        driveList.add(new ItemsK (R.drawable.crown, "World That Never Was\n1/7 - Daylight 17/48",
                "", "Naught's Skyway, above the area,\nuse glide", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "World That Never Was\n2/7 - Sunset 11/48",
                "", "Ruin and Creation's Passage, above\nthe entrance, use glide", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "World That Never Was\n3/7 - Sunset  17/48",
                "", "Ruin and Creation's Passage, above\nthe 2nd to last platform", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "World That Never Was\n4/7 - Sunset  20/48",
                "", "Twilight's View, use guide", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "World That Never Was\n5/7 - Sunset  26/48",
                "", "Crooked Ascension, on the ground", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "World That Never Was\n6/7 - Sunset  34/48",
                "", "Proof of Existence, on the ground", "", ""));
        driveList.add(new ItemsK (R.drawable.crown, "World That Never Was\n7/7 - Sunset  35/48",
                "", "Memory's Skyscraper, on the ground", "", ""));


    }

    public void showItem (int position) {


        String toToast = driveList.get(position).getText3();
        //Toast toast = Toast. makeText(getApplicationContext(), toToast + " selected", Toast. LENGTH_SHORT);
        //toast.show();

        if(toToast.equals("")) {
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
