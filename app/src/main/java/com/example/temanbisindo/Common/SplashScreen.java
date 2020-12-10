package com.example.temanbisindo.Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.temanbisindo.R;

public class SplashScreen extends AppCompatActivity {

    private  static  int Splash_Time= 5000;

    Animation sideAnim,bottomAnim;

    SharedPreferences onBoardingScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        ImageView background = findViewById(R.id.imageView);
        TextView logo = findViewById(R.id.textView);
        TextView slogan = findViewById(R.id.textView2);
        sideAnim = AnimationUtils.loadAnimation(this, R.anim.side_anim);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_anim);

        background.setAnimation(sideAnim);
        logo.setAnimation(bottomAnim);
        slogan.setAnimation(sideAnim);

        new Handler().postDelayed(new Runnable() {
                                      @Override
                                      public void run() {
                                          onBoardingScreen = getSharedPreferences("onBoardingScreen",MODE_PRIVATE);
                                          boolean isFirstTime = onBoardingScreen.getBoolean("firstTime",true);

                                          if (isFirstTime){
                                              SharedPreferences.Editor editor =  onBoardingScreen.edit();
                                              editor.putBoolean("firstTime",false);
                                              editor.commit();
                                              Intent intent = new Intent(SplashScreen.this, OnBoarding.class);
                                              startActivity(intent);
                                              finish();
                                          }else{
                                              Intent intent = new Intent(SplashScreen.this, HomeActivity.class);
                                              startActivity(intent);
                                              finish();
                                          }
                                      }
                                  }, //Pass time here
                Splash_Time);
    }
}