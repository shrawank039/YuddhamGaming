package com.matrixdeveloper.yuddhamgaming;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.matrixdeveloper.yuddhamgaming.ui.main.SectionsPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomePageActivity extends AppCompatActivity {

    private ViewPager productImagesViewPager;
    private TabLayout productImageIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tab_layout);
        tabs.setupWithViewPager(viewPager);

        findViewById(R.id.btn_me_bottom).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
            }
        });
        findViewById(R.id.ll_discover).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
        findViewById(R.id.ll_watch).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), TopPlayer.class));
            }
        });


        productImagesViewPager = findViewById(R.id.productimage_viewpager);
        productImageIndicator = findViewById(R.id.viewpager_indicate);

        List<Integer> productImages = new ArrayList<>();

        productImages.add(R.drawable.banner1);
        productImages.add(R.drawable.banner2);
        productImages.add(R.drawable.banner3);
//        productImages.add(R.drawable.banner4);
//        productImages.add(R.drawable.banner5);
//        productImages.add(R.drawable.banner6);

        ProductImageAdapter productImageAdapter = new ProductImageAdapter(productImages);
        productImagesViewPager.setAdapter(productImageAdapter);
        productImageIndicator.setupWithViewPager(productImagesViewPager);




    }
}