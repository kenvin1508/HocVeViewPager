package vn.edu.vtn.hocveviewpager;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import vn.edu.vtn.adapter.PagerAdapter;

import android.util.Log;

public class MainActivity extends AppCompatActivity {
    TabLayout tlTab;
    ViewPager vpView;
    PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
    }

    private void addControls() {
        tlTab = findViewById(R.id.tlTab);
        vpView = findViewById(R.id.vpView);

        FragmentManager manager = getSupportFragmentManager();
        pagerAdapter = new PagerAdapter(manager);
        vpView.setAdapter(pagerAdapter);
        tlTab.setupWithViewPager(vpView);

    }

}
