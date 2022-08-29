 package com.example.space;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.view.SurfaceView;
import android.view.WindowManager;
import android.widget.TextView;
// Сделать выплываюшее название. если не подойдет то убрать +
 // В основом тексте есть отрыок, переместить его на другой экран или ограничить от основного текста
 // Просмотреть и отформатировать текст

 public class MainActivity extends AppCompatActivity {
     TextView logo;
     Button button1, button2;
     SurfaceView surface;
     Engine engine;
     private Animation logoAnim;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
         getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

         surface = findViewById(R.id.surface);
         engine = new Engine(surface);

         button1 = findViewById(R.id.button1);
         button2 = findViewById(R.id.button2);
         button1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 try {
                     Intent intent = new Intent(MainActivity.this, Beginning.class);
                     startActivity(intent);
                 } catch (Exception e) {
                     e.printStackTrace();
                 }

             }
         });
         button2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 try {
                     Intent intent = new Intent(MainActivity.this, Registration.class);
                     startActivity(intent);
                 } catch (Exception e) {
                     e.printStackTrace();
                 }

             }
         });
       init();
     }
     private void init(){
         logoAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.logo_anim);
         logo = findViewById(R.id.logo);
         logo.startAnimation(logoAnim);
     }

     @Override
     protected void onDestroy() {
         engine.stop();
         super.onDestroy();
     }
 }