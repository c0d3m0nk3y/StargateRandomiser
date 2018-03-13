package com.monkeypantsstudio.stargaterandomiser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class StargateRandomiser extends AppCompatActivity {
    private ArrayList<String> episodes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stargate_randomiser);

        episodes.add("Season One\nEpisode One\nChildren of the Gods (1)");
    }
}
