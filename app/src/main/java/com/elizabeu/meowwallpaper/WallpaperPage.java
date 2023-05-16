package com.elizabeu.meowwallpaper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;

public class WallpaperPage extends AppCompatActivity {

    int pos;
    ArrayList<String> arrayList = new ArrayList<>();
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper_page);
        getWindow().setStatusBarColor(getColor(R.color.status));

        pos = getIntent().getIntExtra("pos",0);
        arrayList = getIntent().getStringArrayListExtra("list");
        viewPager = findViewById(R.id.viewpager);

        PagerAdapter pagerAdapter = new PagerAdapter(WallpaperPage.this,arrayList);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setCurrentItem(pos);


    }
}