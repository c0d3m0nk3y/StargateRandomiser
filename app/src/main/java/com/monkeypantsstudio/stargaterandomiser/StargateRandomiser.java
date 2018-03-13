package com.monkeypantsstudio.stargaterandomiser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class StargateRandomiser extends AppCompatActivity {
    private ArrayList<String> episodes;
    private TextView lblEpisode;
    private Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stargate_randomiser);

        random = new Random();
        episodes = new ArrayList<>();
        episodes.add("Season One\nEpisode One\nChildren of the Gods (1)");
        episodes.add("Season One\nEpisode Two\nChildren of the Gods (2)");
        episodes.add("Season One\nEpisode Three\nThe Enemy Within");
        episodes.add("Season One\nEpisode Four\nEmancipation");
        episodes.add("Season One\nEpisode Five\nThe Broca Divide");
        episodes.add("Season One\nEpisode Six\nThe First Commandment");
        episodes.add("Season One\nEpisode Seven\nCold Lazarus");
        episodes.add("Season One\nEpisode Eight\nThe Nox");
        episodes.add("Season One\nEpisode Nine\nBrief Candle");
        episodes.add("Season One\nEpisode Ten\nThor's Hammer");
        episodes.add("Season One\nEpisode Eleven\nThe Torment of Tantalus");
        episodes.add("Season One\nEpisode Twelve\nBloodlines");
        episodes.add("Season One\nEpisode Thirteen\nFire and Water");
        episodes.add("Season One\nEpisode Fourteen\nHathor");
        episodes.add("Season One\nEpisode Fifteen\nSingularity");
        episodes.add("Season One\nEpisode Sixteen\nCor-Ai");
        episodes.add("Season One\nEpisode Seventeen\nEnigma");
        episodes.add("Season One\nEpisode Eighteen\nSolitudes");
        episodes.add("Season One\nEpisode Nineteen\nTin Man");
        episodes.add("Season One\nEpisode Twenty\nThere But for the Grace of God");
        episodes.add("Season One\nEpisode Twenty One\nPolitics (1)");
        episodes.add("Season One\nEpisode Twenty Two\nPolitics (2)");

        lblEpisode = findViewById(R.id.lblEpisode);
        pickRandom();

        findViewById(R.id.btnReroll).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pickRandom();
            }
        });
    }

    private void pickRandom() {
        lblEpisode.setText(episodes.get(random.nextInt(episodes.size())));
    }
}
