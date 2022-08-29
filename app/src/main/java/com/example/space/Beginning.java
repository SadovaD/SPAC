 package com.example.space;

 import android.app.Activity;
 import android.content.Intent;
 import android.os.Bundle;
 import android.view.View;
 import android.view.animation.Animation;
 import android.view.animation.AnimationUtils;
 import android.widget.Button;
 import android.widget.TextView;

 // Space 002
 public class Beginning extends Activity {
     public int l = 0;
     int c = 0;

     Background text1 = new Background();
     TextView scen;
     Button button;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);

         init();

         Thread threadInterface = new Thread(new InterfaceUpdater());
         threadInterface.start();

         Thread threadTime = new Thread(new TextProgress());
         threadTime.start();

     }

     class TextProgress implements Runnable {
         @Override
         public void run() {
             for (l = 0; l <= 10; l++) {
                 try {
                     Thread.sleep(100);// 1000
                 } catch (InterruptedException e) {
                     break;
                 }
             }

         }
     }

     class InterfaceUpdater implements Runnable {
         @Override
         public void run() {
             do {
                 update();
                 try {
                     Thread.sleep(18);
                 } catch (InterruptedException e) {
                     break;
                 }
             } while (l < 10);
         }
     }

     void init() {
         setContentView(R.layout.beginning);
         TextView[] t = {scen, scen, scen, scen, scen, scen, scen, scen, scen, scen};
         t[0] = (TextView) findViewById(R.id.textView);
         t[1] = (TextView) findViewById(R.id.textView2);
         t[2] = (TextView) findViewById(R.id.textView3);
         t[3] = (TextView) findViewById(R.id.textView4);
         t[4] = (TextView) findViewById(R.id.textView5);
         t[5] = (TextView) findViewById(R.id.textView6);
         t[6] = (TextView) findViewById(R.id.textView7);
         t[7] = (TextView) findViewById(R.id.textView8);
         button = findViewById(R.id.button);

         t[0].setText(text1.text_s[0][0]);
         t[1].setText(text1.text_s[1][0]);
         t[2].setText(text1.text_s[2][0]);
         t[3].setText(text1.text_s[3][0]);
         t[4].setText(text1.text_s[4][0]);
         t[5].setText(text1.text_s[5][0]);
         t[6].setText(text1.text_s[6][0]);
         t[7].setText(text1.text_s[7][0]);

         t[0].setVisibility(View.INVISIBLE);
         t[1].setVisibility(View.INVISIBLE);
         t[2].setVisibility(View.INVISIBLE);
         t[3].setVisibility(View.INVISIBLE);
         t[4].setVisibility(View.INVISIBLE);
         t[5].setVisibility(View.INVISIBLE);
         t[6].setVisibility(View.INVISIBLE);
         t[7].setVisibility(View.INVISIBLE);
         button.setVisibility(View.INVISIBLE);
     }
         private void update () {
             if (c == l) return;
             c = l;
             runOnUiThread(new Runnable() {
                 @Override
                 public void run() {
                     Animation textAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                     TextView[] t = {scen, scen, scen, scen, scen, scen, scen, scen, scen, scen};
                     t[0]= (TextView) findViewById(R.id.textView);
                     t[1]= (TextView) findViewById(R.id.textView2);
                     t[2]= (TextView) findViewById(R.id.textView3);
                     t[3]= (TextView) findViewById(R.id.textView4);
                     t[4]= (TextView) findViewById(R.id.textView5);
                     t[5]= (TextView) findViewById(R.id.textView6);
                     t[6]= (TextView) findViewById(R.id.textView7);
                     t[7]= (TextView) findViewById(R.id.textView8);
                     switch (l) {
                         case 1:
                             t[0].setVisibility(View.VISIBLE);
                             t[0].startAnimation(textAnim);
                             break;
                         case 2:
                             t[1].setVisibility(View.VISIBLE);
                             t[1].startAnimation(textAnim);
                             break;
                         case 3:
                             t[2].setVisibility(View.VISIBLE);
                             t[2].startAnimation(textAnim);
                             break;
                         case 4:
                             t[3].setVisibility(View.VISIBLE);
                             t[3].startAnimation(textAnim);
                             break;
                         case 5:
                             t[4].setVisibility(View.VISIBLE);
                             t[4].startAnimation(textAnim);
                             break;
                         case 6:
                             t[5].setVisibility(View.VISIBLE);
                             t[5].startAnimation(textAnim);
                             break;
                         case 7:
                             t[6].setVisibility(View.VISIBLE);
                             t[6].startAnimation(textAnim);
                             break;
                         case 8:
                             t[7].setVisibility(View.VISIBLE);
                             t[7].startAnimation(textAnim);
                             break;
                         case 9:
                             button.setVisibility(View.VISIBLE);
                             button.startAnimation(textAnim);
                             button.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View view) {
                                     try {
                                         Intent intent = new Intent(Beginning.this, Story.class);
                                         startActivity(intent);
                                     } catch (Exception e) {
                                         e.printStackTrace();
                                     }

                                 }
                             });

                         default:
                             break;
                     }
                 }
             });
         }
 }

