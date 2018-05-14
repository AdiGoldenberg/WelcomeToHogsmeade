package com.example.adi.welcometohogsmeade;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the ViewPager object
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        // Create a AttractionFragmentAdapter object
        AttractionFragmentAdapter adapter = new AttractionFragmentAdapter(getSupportFragmentManager(), this);

        // Associate the adapter and the ViewPager
        viewPager.setAdapter(adapter);

        // Get the TabLayout object
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        // Associate the tabLayout to the ViewPager
        tabLayout.setupWithViewPager(viewPager);

        // Set an onClickListener on the credits TextView
        TextView creditsTextView = (TextView) findViewById(R.id.credits);
        creditsTextView.setOnClickListener(new View.OnClickListener(){
            // In case the credits TextView is clicked, open the webpage of harry potter wiki
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Intent.ACTION_VIEW);
                intent.setData(Uri.parse(getResources().getString(R.string.credits_link)));
                if (intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }
            }
        });


    }
}
