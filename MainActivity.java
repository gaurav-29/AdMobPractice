package com.example.admobpractice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private AdView adView, adView1, adView2, adView3, adView4;
    AdRequest adRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        }); */

       /* MobileAds.setRequestConfiguration(
                new RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList("BA8B0F03A84188B7C09FA20AF8A5BAFC"))
                        .build()); */

        adView = findViewById(R.id.adView);
        adView1 = findViewById(R.id.adView1);
        adView2 = findViewById(R.id.adView2);
        adView3 = findViewById(R.id.adView3);
        adView4 = findViewById(R.id.adView4);

        adRequest = new AdRequest.Builder().build();

        adView.loadAd(adRequest);
        adView1.loadAd(adRequest);
        adView2.loadAd(adRequest);
        adView3.loadAd(adRequest);
        adView4.loadAd(adRequest);
    }
}