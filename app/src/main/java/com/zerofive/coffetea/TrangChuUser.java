package com.zerofive.coffetea;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.EditText;

import com.zerofive.coffetea.adapter.PagerAdapter_ThongBao;

import java.util.Timer;
import java.util.TimerTask;

public class TrangChuUser extends AppCompatActivity {


    private ViewPager2 viewPager2;
    int[] images = {R.drawable.cofe,R.drawable.cofe,R.drawable.mhc6, R.drawable.b,R.drawable.b2,R.drawable.b3,R.drawable.b4,R.drawable.mhc6};

    private PagerAdapter_ThongBao pagerAdapterThongBao;

    private Timer timer;
    private EditText edt_searchfood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_chu_user);

        edt_searchfood = findViewById(R.id.edt_searchfood);
        edt_searchfood.setFocusable(false);
        edt_searchfood.setOnClickListener(v->{
            Intent intent = new Intent(this, TimKiemUser.class);
            Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
            startActivity(intent, bundle);
        });


        viewPager2 = findViewById(R.id.viewpager2_thongbao);
        pagerAdapterThongBao = new PagerAdapter_ThongBao(images );
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.getChildAt(0).setOverScrollMode(View.OVER_SCROLL_NEVER);
        viewPager2.setAdapter(pagerAdapterThongBao);

        CompositePageTransformer transformer = new CompositePageTransformer();
        transformer.addTransformer(new MarginPageTransformer(8));
        transformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float v = 1-Math.abs(position);

                page.setScaleY(0.8f+v*0.2f);
            }
        });



        viewPager2.setPageTransformer(transformer);
        autoSile();


        findViewById(R.id.img_trangchu).setOnClickListener(v ->{
            Intent intent = new Intent(this, TrangChuUser.class);
            Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
            startActivity(intent, bundle);
        });

        findViewById(R.id.img_giohang).setOnClickListener(v ->{
            Intent intent = new Intent(this, GioHangUser.class);
            Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
            startActivity(intent, bundle);
        });
        findViewById(R.id.img_thongtin).setOnClickListener(v ->{
            Intent intent = new Intent(this, ThongTinUser.class);
            Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
            startActivity(intent, bundle);
        });


    }

    private void autoSile() {
        if (timer == null) {
            timer = new Timer();
        }

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    @Override
                    public void run() {
                        int currentItem = viewPager2.getCurrentItem();
                        int totalItem = 5;
                        if (currentItem <totalItem) {
                            currentItem++;
                            viewPager2.setCurrentItem(currentItem);

                        }
                        if (currentItem >= 5) {
                            viewPager2.setCurrentItem(0);
                        }
                    }
                });
            }
        },6000, 6000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (timer != null) {
            timer.cancel();
            timer = null;
        }
    }
}