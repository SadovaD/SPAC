 package com.example.space;


 import android.app.Activity;
 import android.content.Intent;
 import android.os.Bundle;
 import android.view.View;
 import android.view.animation.Animation;
 import android.view.animation.AnimationUtils;
 import android.widget.Button;
 import android.widget.TextView;


 public class Story extends Activity {
     public volatile int l = 0;
     int c = 0;

     Basic_Text text1 = new Basic_Text();
     TextView scen;
     Button butt;

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
             for (l = 0; l <= 26; l++) {
                     try {
                         Thread.sleep(1000);

                     } catch (InterruptedException e) {
                         break;
                     }
                     //while (l < 10);
                 }
           }
         }


         class InterfaceUpdater implements Runnable {
             @Override
             public void run() {
                 do {
                     update();
                     try {
                         Thread.sleep(17);
                     } catch (InterruptedException e) {
                         break;
                     }
                 } while (l < 27);
             }
         }

         void init() {
             setContentView(R.layout.story);

             TextView[] t = {scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen};
             Button[] b = {butt, butt, butt, butt, butt, butt, butt, butt, butt, butt, butt, butt, butt, butt, butt, butt, butt};

             t[0] = findViewById(R.id.textView);
             t[1] = findViewById(R.id.textView2);
             t[2] = findViewById(R.id.textView3);
             t[3] = findViewById(R.id.textView4);
             t[4] = findViewById(R.id.textView5);
             t[5] = findViewById(R.id.textView6);
             t[6] = findViewById(R.id.textView7);
             t[7] = findViewById(R.id.textView8);
             t[8] = findViewById(R.id.textView9);
             t[9] = findViewById(R.id.textView10);
             t[10] = findViewById(R.id.textView11);
             t[11] = findViewById(R.id.textView12);
             t[12] = findViewById(R.id.textView13);
             t[13] = findViewById(R.id.textView14);
             t[14] = findViewById(R.id.textView15);
             t[15] = findViewById(R.id.textView16);
             t[16] = findViewById(R.id.textView17);
             t[17] = findViewById(R.id.textView18);
             t[18] = findViewById(R.id.textView19);
             t[19] = findViewById(R.id.textView20);
             t[20] = findViewById(R.id.textView21);
             t[21] = findViewById(R.id.textView22);
             t[22] = findViewById(R.id.textView23);
             t[23] = findViewById(R.id.textView24);
             t[24] = findViewById(R.id.textView25);
             t[25] = findViewById(R.id.textView26);
             t[26] = findViewById(R.id.textView27);
             t[27] = findViewById(R.id.textView28);
             t[28] = findViewById(R.id.textView29);
             t[29] = findViewById(R.id.textView30);
             t[30] = findViewById(R.id.textView31);

             b[0] = findViewById(R.id.button);
             b[1] = findViewById(R.id.button2);
             b[2] = findViewById(R.id.button3);
             b[3] = findViewById(R.id.button4);
             b[4] = findViewById(R.id.button5);
             b[5] = findViewById(R.id.button6);
             b[6] = findViewById(R.id.button7);
             b[7] = findViewById(R.id.button8);
             b[8] = findViewById(R.id.button9);
             b[9] = findViewById(R.id.button10);
             b[10] = findViewById(R.id.button11);
             b[11] = findViewById(R.id.button12);
             b[12] = findViewById(R.id.button13);
             b[13] = findViewById(R.id.button14);
             b[14] = findViewById(R.id.button15);
             b[15] = findViewById(R.id.button16);
             b[16] = findViewById(R.id.button17);

             t[0].setText(text1.scenario[0][0]);
             t[1].setText(text1.scenario[1][0]);
             t[2].setText(text1.scenario[2][0]);
             t[3].setText(text1.scenario[3][0]);
             t[4].setText(text1.scenario[4][0]);
             t[5].setText(text1.scenario[5][0]);
             t[6].setText(text1.scenario[6][0]);
             t[7].setText(text1.scenario[7][0]);
             t[8].setText(text1.scenario[8][0]);
             t[9].setText(text1.scenario[9][0]);
             t[10].setText(text1.scenario[10][0]);
             t[11].setText(text1.scenario[11][0]);
             t[12].setText(text1.scenario[12][0]);
             t[13].setText(text1.scenario[13][0]);
             t[14].setText(text1.scenario[14][0]);
             t[15].setText(text1.scenario[15][0]);
             t[16].setText(text1.scenario[16][0]);
             t[17].setText(text1.scenario[17][0]);
             t[18].setText(text1.scenario[18][0]);
             t[19].setText(text1.scenario[19][0]);
             t[20].setText(text1.scenario[20][0]);
             t[21].setText(text1.scenario[21][0]);
             t[22].setText(text1.scenario[22][0]);
             t[23].setText(text1.scenario[23][0]);
             t[24].setText(text1.scenario[24][0]);
             t[25].setText(text1.scenario[25][0]);
             t[26].setText(text1.scenario[26][0]);
             t[27].setText(text1.scenario[27][0]);
             t[28].setText(text1.scenario[28][0]);
             t[29].setText(text1.scenario[29][0]);
             t[30].setText(text1.scenario[30][0]);

             t[0].setVisibility(View.INVISIBLE);
             t[1].setVisibility(View.INVISIBLE);
             t[2].setVisibility(View.INVISIBLE);
             t[3].setVisibility(View.INVISIBLE);
             t[4].setVisibility(View.INVISIBLE);
             t[5].setVisibility(View.INVISIBLE);
             t[6].setVisibility(View.INVISIBLE);
             t[7].setVisibility(View.INVISIBLE);
             t[8].setVisibility(View.INVISIBLE);
             t[9].setVisibility(View.INVISIBLE);
             t[10].setVisibility(View.INVISIBLE);
             t[11].setVisibility(View.INVISIBLE);
             t[12].setVisibility(View.INVISIBLE);
             t[13].setVisibility(View.INVISIBLE);
             t[14].setVisibility(View.INVISIBLE);
             t[15].setVisibility(View.INVISIBLE);
             t[16].setVisibility(View.INVISIBLE);
             t[17].setVisibility(View.INVISIBLE);
             t[18].setVisibility(View.INVISIBLE);
             t[19].setVisibility(View.INVISIBLE);
             t[20].setVisibility(View.INVISIBLE);
             t[21].setVisibility(View.INVISIBLE);
             t[22].setVisibility(View.INVISIBLE);
             t[23].setVisibility(View.INVISIBLE);
             t[24].setVisibility(View.INVISIBLE);
             t[25].setVisibility(View.INVISIBLE);
             t[26].setVisibility(View.INVISIBLE);
             t[27].setVisibility(View.INVISIBLE);
             t[28].setVisibility(View.INVISIBLE);
             t[29].setVisibility(View.INVISIBLE);

             b[0].setVisibility(View.INVISIBLE);
             b[1].setVisibility(View.INVISIBLE);
             b[2].setVisibility(View.INVISIBLE);
             b[3].setVisibility(View.INVISIBLE);
             b[4].setVisibility(View.INVISIBLE);
             b[5].setVisibility(View.INVISIBLE);
             b[6].setVisibility(View.INVISIBLE);
             b[7].setVisibility(View.INVISIBLE);
             b[8].setVisibility(View.INVISIBLE);
             b[9].setVisibility(View.INVISIBLE);
             b[10].setVisibility(View.INVISIBLE);
             b[11].setVisibility(View.INVISIBLE);
             b[12].setVisibility(View.INVISIBLE);
             b[13].setVisibility(View.INVISIBLE);
             b[14].setVisibility(View.INVISIBLE);
             b[15].setVisibility(View.INVISIBLE);
             b[16].setVisibility(View.INVISIBLE);
         }


         private void update() {
             if (c == l) return;
             c = l;
             runOnUiThread(new Runnable() {
                 @Override
                 public void run() {
                     Animation textAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                        Animation butAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                        Animation butAnim2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                     Animation textAnim2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha2);
                     Animation textAnim3 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha2);
                     Animation textAnim4 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha3);
                        Animation butAnim3 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha3);
                        Animation butAnim4 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha3);
                     Animation textAnim5 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha2);
                     Animation textAnim6 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha4);
                        Animation butAnim5 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha4);
                        Animation butAnim6 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha4);
                     Animation textAnim7 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha2);
                     Animation textAnim8 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha2);
                     Animation textAnim9 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha5);
                     Animation textAnim10 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha6);
                     Animation textAnim11 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha11);
                     Animation textAnim12 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha12);
                     Animation textAnim13 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha13);
                     Animation textAnim14 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha14);
                     Animation textAnim15 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha15);
                        Animation butAnim7 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha3);
                        Animation butAnim8 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha3);
                     Animation textAnim16 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha2);
                     Animation textAnim17 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha2);
                     Animation textAnim18 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha18);
                        Animation butAnim9 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha3);
                        Animation butAnim10 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha3);
                     Animation textAnim19 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha2);
                     Animation textAnim20 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha20);
                     Animation textAnim21 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha21);
                   Animation textAnim22 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha22);
                     Animation textAnim23 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha23);
                        Animation butAnim11 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha3);
                        Animation butAnim12 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha3);
                     Animation textAnim24 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha2);
                     Animation textAnim25 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha25);
                        Animation butAnim13 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha3);
                        Animation butAnim14 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha3);
                     Animation textAnim26 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha2);
                     Animation textAnim27 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha2);
                     Animation textAnim28 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha28);
                        Animation butAnim15 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha3);
                        Animation butAnim16 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha3);
                        Animation butAnim17 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha3);
                     Animation textAnim29 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha2);
                     Animation textAnim30 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha30);
                     Animation textAnim31 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha31);

                     TextView[] t = {scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen, scen};
                     Button[] b = {butt, butt, butt, butt, butt, butt, butt, butt, butt, butt, butt, butt, butt, butt, butt, butt, butt};

                     t[0] = findViewById(R.id.textView);
                     t[1] = findViewById(R.id.textView2);
                     t[2] = findViewById(R.id.textView3);
                     t[3] = findViewById(R.id.textView4);
                     t[4] = findViewById(R.id.textView5);
                     t[5] = findViewById(R.id.textView6);
                     t[6] = findViewById(R.id.textView7);
                     t[7] = findViewById(R.id.textView8);
                     t[8] = findViewById(R.id.textView9);
                     t[9] = findViewById(R.id.textView10);
                     t[10] = findViewById(R.id.textView11);
                     t[11] = findViewById(R.id.textView12);
                     t[12] = findViewById(R.id.textView13);
                     t[13] = findViewById(R.id.textView14);
                     t[14] = findViewById(R.id.textView15);
                     t[15] = findViewById(R.id.textView16);
                     t[16] = findViewById(R.id.textView17);
                     t[17] = findViewById(R.id.textView18);
                     t[18] = findViewById(R.id.textView19);
                     t[19] = findViewById(R.id.textView20);
                     t[20] = findViewById(R.id.textView21);
                     t[21] = findViewById(R.id.textView22);
                     t[22] = findViewById(R.id.textView23);
                     t[23] = findViewById(R.id.textView24);
                     t[24] = findViewById(R.id.textView25);
                     t[25] = findViewById(R.id.textView26);
                     t[26] = findViewById(R.id.textView27);
                     t[27] = findViewById(R.id.textView28);
                     t[28] = findViewById(R.id.textView29);
                     t[29] = findViewById(R.id.textView30);
                     t[30] = findViewById(R.id.textView31);

                     b[0] = findViewById(R.id.button);
                     b[1] = findViewById(R.id.button2);
                     b[2] = findViewById(R.id.button3);
                     b[3] = findViewById(R.id.button4);
                     b[4] = findViewById(R.id.button5);
                     b[5] = findViewById(R.id.button6);
                     b[6] = findViewById(R.id.button7);
                     b[7] = findViewById(R.id.button8);
                     b[8] = findViewById(R.id.button9);
                     b[9] = findViewById(R.id.button10);
                     b[10] = findViewById(R.id.button11);
                     b[11] = findViewById(R.id.button12);
                     b[12] = findViewById(R.id.button13);
                     b[13] = findViewById(R.id.button14);
                     b[14] = findViewById(R.id.button15);
                     b[15] = findViewById(R.id.button16);
                     b[16] = findViewById(R.id.button17);

                     switch (l) {
                         case 1:
                             t[0].setVisibility(View.VISIBLE);
                             t[0].startAnimation(textAnim);
                             break;
                         case 2:
                             b[0].setVisibility(View.VISIBLE);
                             b[0].startAnimation(butAnim);
                             b[0].setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                         try {
                                                 t[1].setVisibility(View.VISIBLE);
                                                 t[1].startAnimation(textAnim2);
                                                 t[2].setVisibility(View.GONE);
                                         } catch (Exception e) {
                                         }
                                 }
                             });
                             b[1].setVisibility(View.VISIBLE);
                             b[1].startAnimation(butAnim2);
                             b[1].setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                         try {
                                             t[2].setVisibility(View.VISIBLE);
                                             t[2].startAnimation(textAnim3);
                                             t[1].setVisibility(View.GONE);
                                         } catch (Exception e) {
                                         }
                                     }
                             });
                             break;
                         case 3:
                             t[3].setVisibility(View.VISIBLE);
                             t[3].startAnimation(textAnim4);
                             break;
                         case 4:
                             b[2].setVisibility(View.VISIBLE);
                             b[2].startAnimation(butAnim3);
                             b[3].setVisibility(View.VISIBLE);
                             b[3].startAnimation(butAnim4);
                             b[2].setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     try {
                                         t[4].setVisibility(View.VISIBLE);
                                         t[4].startAnimation(textAnim5);
                                     } catch (Exception e) {
                                     }
                                 }
                             });
                             b[3].setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     try {
                                         t[4].setVisibility(View.GONE);
                                     } catch (Exception e) {
                                     }
                                 }
                             });
                             break;
                         case 5:
                             t[5].setVisibility(View.VISIBLE);
                             t[5].startAnimation(textAnim6);
                             break;
                         case 6:
                             b[4].setVisibility(View.VISIBLE);
                             b[4].startAnimation(butAnim5);
                             b[5].setVisibility(View.VISIBLE);
                             b[5].startAnimation(butAnim6);
                             b[4].setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     try {
                                         t[6].setVisibility(View.VISIBLE);
                                         t[6].startAnimation(textAnim7);
                                         t[7].setVisibility(View.GONE);
                                     } catch (Exception e) {
                                     }
                                 }
                             });
                             b[5].setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     try {
                                         t[7].setVisibility(View.VISIBLE);
                                         t[7].startAnimation(textAnim8);
                                         t[6].setVisibility(View.GONE);
                                     } catch (Exception e) {
                                     }
                                 }
                             });
                             break;
                         case 7:
                             t[8].setVisibility(View.VISIBLE);
                             t[8].startAnimation(textAnim9);
                             break;
                         case 8:
                             t[9].setVisibility(View.VISIBLE);
                             t[9].startAnimation(textAnim10);
                             break;
                         case 9:
                             t[10].setVisibility(View.VISIBLE);
                             t[10].startAnimation(textAnim11);
                             break;
                         case 10:
                             t[11].setVisibility(View.VISIBLE);
                             t[11].startAnimation(textAnim12);
                             break;
                         case 11:
                             t[12].setVisibility(View.VISIBLE);
                             t[12].startAnimation(textAnim13);
                             break;
                         case 12:
                             t[13].setVisibility(View.VISIBLE);
                             t[13].startAnimation(textAnim14);
                             break;
                         case 13:
                             t[14].setVisibility(View.VISIBLE);
                             t[14].startAnimation(textAnim15);
                             break;
                         case 14:
                             b[6].setVisibility(View.VISIBLE);
                             b[6].startAnimation(butAnim7);
                             b[7].setVisibility(View.VISIBLE);
                             b[7].startAnimation(butAnim8);
                             b[6].setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     try {
                                         t[15].setVisibility(View.VISIBLE);
                                         t[15].startAnimation(textAnim16);
                                         t[16].setVisibility(View.GONE);
                                     } catch (Exception e) {
                                     }
                                 }
                             });
                             b[7].setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     try {
                                         t[16].setVisibility(View.VISIBLE);
                                         t[16].startAnimation(textAnim17);
                                         t[15].setVisibility(View.GONE);
                                     } catch (Exception e) {
                                     }
                                 }
                             });
                             break;
                         case 15:
                             t[17].setVisibility(View.VISIBLE);
                             t[17].startAnimation(textAnim18);
                             break;
                         case 16:
                             b[8].setVisibility(View.VISIBLE);
                             b[8].startAnimation(butAnim9);
                             b[9].setVisibility(View.VISIBLE);
                             b[9].startAnimation(butAnim10);
                             b[8].setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     try {
                                         t[18].setVisibility(View.VISIBLE);
                                         t[18].startAnimation(textAnim19);
                                         t[20].setVisibility(View.VISIBLE);
                                         t[20].startAnimation(textAnim21);
                                     } catch (Exception e) {
                                     }
                                 }
                             });
                             b[9].setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     try {
                                         t[18].setVisibility(View.GONE);
                                         t[20].setVisibility(View.GONE);
                                     } catch (Exception e) {
                                     }
                                 }
                             });
                             break;
                         case 17:
                             t[19].setVisibility(View.VISIBLE);
                             t[19].startAnimation(textAnim20);
                             break;
                         case 18:
                             t[21].setVisibility(View.VISIBLE);
                             t[21].startAnimation(textAnim22);
                             break;
                         case 19:
                             t[22].setVisibility(View.VISIBLE);
                             t[22].startAnimation(textAnim23);
                             break;
                         case 20:
                             b[10].setVisibility(View.VISIBLE);
                             b[10].startAnimation(butAnim11);
                             b[11].setVisibility(View.VISIBLE);
                             b[11].startAnimation(butAnim12);
                             b[10].setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     try {
                                         t[23].setVisibility(View.GONE);
                                     } catch (Exception e) {
                                     }
                                 }
                             });
                             b[11].setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     try {
                                         t[23].setVisibility(View.VISIBLE);
                                         t[23].startAnimation(textAnim24);
                                     } catch (Exception e) {
                                     }
                                 }
                             });
                             break;
                         case 21:
                             t[24].setVisibility(View.VISIBLE);
                             t[24].startAnimation(textAnim25);
                             break;
                         case 22:
                             b[12].setVisibility(View.VISIBLE);
                             b[12].startAnimation(butAnim13);
                             b[13].setVisibility(View.VISIBLE);
                             b[13].startAnimation(butAnim14);
                             b[12].setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     try {
                                         t[25].setVisibility(View.VISIBLE);
                                         t[25].startAnimation(textAnim26);
                                         t[26].setVisibility(View.GONE);
                                     } catch (Exception e) {
                                     }
                                 }
                             });
                             b[13].setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     try {
                                         t[26].setVisibility(View.VISIBLE);
                                         t[26].startAnimation(textAnim27);
                                         t[25].setVisibility(View.GONE);
                                     } catch (Exception e) {
                                     }
                                 }
                             });
                             break;
                         case 23:
                             t[27].setVisibility(View.VISIBLE);
                             t[27].startAnimation(textAnim28);
                             break;
                         case 24:
                             b[14].setVisibility(View.VISIBLE);
                             b[14].startAnimation(butAnim15);
                             b[15].setVisibility(View.VISIBLE);
                             b[15].startAnimation(butAnim16);
                             b[16].setVisibility(View.VISIBLE);
                             b[16].startAnimation(butAnim17);
                             b[14].setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     try {
                                         t[28].setVisibility(View.VISIBLE);
                                         t[28].startAnimation(textAnim29);
                                     } catch (Exception e) {
                                     }
                                 }
                             });
                             b[15].setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     try {
                                         t[28].setVisibility(View.VISIBLE);
                                         t[28].startAnimation(textAnim29);
                                     } catch (Exception e) {
                                     }
                                 }
                             });
                             b[16].setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     try {
                                         t[28].setVisibility(View.VISIBLE);
                                         t[28].startAnimation(textAnim29);
                                     } catch (Exception e) {
                                     }
                                 }
                             });
                             break;
                         case 25:
                             t[29].setVisibility(View.VISIBLE);
                             t[29].startAnimation(textAnim30);
                             break;
                         case 26:
                             t[30].setVisibility(View.VISIBLE);
                             t[30].startAnimation(textAnim31);
                             break;
                     }
                 }
             });
         }
     }

