package com.example.tempconverter3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//        private Button mButton;
        EditText degreeC, degreeF, distanceKM, distanceMI, weightKG, weightLB, volumeL, volumeG;

        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  mButton = findViewById(R.id.button);
      //  mButton.setOnClickListener(this);

        degreeC = findViewById(R.id.editText);
        degreeF = findViewById(R.id.editText2);
        distanceKM = findViewById(R.id.editText3);
        distanceMI = findViewById(R.id.editText4);
        weightKG = findViewById(R.id.editText5);
        weightLB = findViewById(R.id.editText6);
        volumeL = findViewById(R.id.editText7);
        volumeG = findViewById(R.id.editText8);

        degreeC.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String strC = s.toString();
                Log.i("UnitConverter","Value in C = " + strC);
                if (!degreeC.isFocused()) {
                    return;
                }
                EditText f;
                EditText c;
                c = findViewById(R.id.editText2);
                f = findViewById(R.id.editText);
                if (!degreeC.isFocused()) {
                    return;
                }
                //if (c.getText().toString().matches("")) {
                    double fc;
                    String fs = f.getText().toString();
                    if (!fs.isEmpty()) {
                        try {
                            fc = Double.parseDouble(fs);
                            fc = ((fc - 32) * 5) / 9;
                            c.setText(Double.toString(fc));
                            //grabbed the double value from C field
                        } catch (Exception e1) {
                            // no double in C field
                            e1.printStackTrace();
                        }


                    }
                //}
            }
        });

            degreeF.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    String strF = s.toString();
                    Log.i("UnitConverter","Value in F = " + strF);
                    if (!degreeF.isFocused()) {
                        return;
                    }
                    EditText f;
                    EditText c;
                    c = findViewById(R.id.editText2);
                    f = findViewById(R.id.editText);
                    //if F is empty convert c to f and store in f
                    //if (f.getText().toString().matches("")) {
                    double dc;
                    String sc = c.getText().toString();
                    if (!sc.isEmpty()) {
                        try {
                            dc = Double.parseDouble(sc);
                            dc = dc * 1.8 + 32;
                            f.setText(Double.toString(dc));
                            //grabbed the double value from C field
                        } catch (Exception e1) {
                            // no double in C field
                            e1.printStackTrace();
                        }

                    }
                    //}
                }
            });


            distanceMI.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    String strMI = s.toString();
                    Log.i("UnitConverter","Value in MI = " + strMI);
                    if (!distanceMI.isFocused()) {
                        return;
                    }
                    EditText km;
                    EditText mile;
                    km = findViewById(R.id.editText3);
                    mile = findViewById(R.id.editText4);
                    //if (km.getText().toString().matches("")) {
                        double miled;
                        String miles = mile.getText().toString();
                        if(!miles.isEmpty()) {
                            try {
                                miled = Double.parseDouble(miles);
                                miled = (miled/0.62137);
                                km.setText(Double.toString(miled));
                            } catch (Exception e1) {
                                e1.printStackTrace();
                            }

                        }
                    //}
                }
            });

            distanceKM.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    String strKM = s.toString();
                    Log.i("UnitConverter","Value in KM = " + strKM);
                    if (!distanceKM.isFocused()) {
                        return;
                    }
                    EditText km;
                    EditText mile;
                    km = findViewById(R.id.editText3);
                    mile = findViewById(R.id.editText4);
                    //if mile is empty convert km to mile and store in mile
                    //if (mile.getText().toString().matches("")) {
                        double kmd;
                        String kms = km.getText().toString();
                        if(!kms.isEmpty()) {
                            try {
                                kmd = Double.parseDouble(kms);
                                kmd = (kmd*.62137);
                                mile.setText(Double.toString(kmd));
                            } catch (Exception e1) {
                                e1.printStackTrace();
                            }

                        }
                    //}
                }
            });
            weightKG.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    String strKG = s.toString();
                    Log.i("UnitConverter","Value in KG = " + strKG);
                    if (!weightKG.isFocused()) {
                        return;
                    }
                    EditText kg;
                    EditText lb;
                    kg = findViewById(R.id.editText5);
                    lb = findViewById(R.id.editText6);
                    //if (lb.getText().toString().matches("")) {
                        double kgd;
                        String kgs = kg.getText().toString();
                        if(!kgs.isEmpty()) {
                            try {
                                kgd = Double.parseDouble(kgs);
                                kgd = (kgd/.45359237);
                                lb.setText(Double.toString(kgd));
                            } catch (Exception e1) {
                                e1.printStackTrace();
                            }

                        }
                    //}
                }
            });

            weightLB.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    String strLB = s.toString();
                    Log.i("UnitConverter","Value in LB = " + strLB);
                    if (!weightLB.isFocused()) {
                        return;
                    }
                    EditText kg;
                    EditText lb;
                    kg = findViewById(R.id.editText5);
                    lb = findViewById(R.id.editText6);
                    //if kg is empty convert lb to kg and store in kg
                    //if (kg.getText().toString().matches("")) {
                        double lbd;
                        String lbs = lb.getText().toString();
                        if(!lbs.isEmpty()) {
                            try {
                                lbd = Double.parseDouble(lbs);
                                lbd = (lbd*.45359237);
                                kg.setText(Double.toString(lbd));
                            } catch (Exception e1) {
                                e1.printStackTrace();
                            }

                        }
                    //}
                }
            });

            volumeL.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    String strL = s.toString();
                    Log.i("UnitConverter","Value in L = " + strL);
                    if (!volumeL.isFocused()) {
                        return;
                    }
                    EditText L;
                    EditText G;
                    L = findViewById(R.id.editText7);
                    G = findViewById(R.id.editText8);
                    //if G is empty convert L to G and store in G
                    //if (G.getText().toString().matches("")) {
                        double Ld;
                        String Ls = L.getText().toString();
                        if(!Ls.isEmpty()) {
                            try {
                                Ld = Double.parseDouble(Ls);
                                Ld = (Ld/3.78541);
                                G.setText(Double.toString(Ld));
                            } catch (Exception e1) {
                                e1.printStackTrace();
                            }

                        }
                    //}
                }
            });

            volumeG.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    String strG = s.toString();
                    Log.i("UnitConverter","Value in G = " + strG);
                    if (!volumeG.isFocused()) {
                        return;
                    }
                    EditText L;
                    EditText G;
                    L = findViewById(R.id.editText7);
                    G = findViewById(R.id.editText8);
                    //if L is empty convert G to L and store in L
                    //if (L.getText().toString().matches("")) {
                        double Gd;
                        String Gs = G.getText().toString();
                        if(!Gs.isEmpty()) {
                            try {
                                Gd = Double.parseDouble(Gs);
                                Gd = (Gd*3.78541);
                                L.setText(Double.toString(Gd));
                            } catch (Exception e1) {
                                e1.printStackTrace();
                            }

                        }
                    //}
                }
            });
    }


/*    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.textView:
            EditText f;
            EditText c;
            c = findViewById(R.id.editText2);
            f = findViewById(R.id.editText);
            //if F is empty convert c to f and store in f
            if (f.getText().toString().matches("")) {
                double dc;
                String sc = c.getText().toString();
                if(!sc.isEmpty()) {
                    try {
                        dc = Double.parseDouble(sc);
                        dc = dc*1.8 + 32;
                        f.setText(Double.toString(dc));
                        //grabbed the double value from C field
                    } catch (Exception e1) {
                        // no double in C field
                        e1.printStackTrace();
                    }

                }
            }
            if (c.getText().toString().matches("")) {
                double fc;
                String fs = f.getText().toString();
                if(!fs.isEmpty()) {
                    try {
                        fc = Double.parseDouble(fs);
                        fc = ((fc-32)*5)/9;
                        c.setText(Double.toString(fc));
                        //grabbed the double value from C field
                    } catch (Exception e1) {
                        // no double in C field
                        e1.printStackTrace();
                    }

                }
            }
            EditText km;
            EditText mile;
            km = findViewById(R.id.editText3);
            mile = findViewById(R.id.editText4);
            //if mile is empty convert km to mile and store in mile
            if (mile.getText().toString().matches("")) {
                double kmd;
                String kms = km.getText().toString();
                if(!kms.isEmpty()) {
                    try {
                        kmd = Double.parseDouble(kms);
                        kmd = (kmd*.62137);
                        mile.setText(Double.toString(kmd));
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }

                }
            }
            //if km is empty convert mile to km and store in km
                if (km.getText().toString().matches("")) {
                double miled;
                String miles = mile.getText().toString();
                if(!miles.isEmpty()) {
                    try {
                        miled = Double.parseDouble(miles);
                        miled = (miled/0.62137);
                        km.setText(Double.toString(miled));
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }

                }
            }
            EditText kg;
            EditText lb;
            kg = findViewById(R.id.editText5);
            lb = findViewById(R.id.editText6);
            //if kg is empty convert lb to kg and store in kg
            if (kg.getText().toString().matches("")) {
                double lbd;
                String lbs = lb.getText().toString();
                if(!lbs.isEmpty()) {
                    try {
                        lbd = Double.parseDouble(lbs);
                        lbd = (lbd*.45359237);
                        kg.setText(Double.toString(lbd));
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }

                }
            }
            //if lb is empty convert kg to lb and store in lb
            if (lb.getText().toString().matches("")) {
                double kgd;
                String kgs = kg.getText().toString();
                if(!kgs.isEmpty()) {
                    try {
                        kgd = Double.parseDouble(kgs);
                        kgd = (kgd/.45359237);
                        lb.setText(Double.toString(kgd));
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }

                }
            }
            EditText L;
            EditText G;
            L = findViewById(R.id.editText7);
            G = findViewById(R.id.editText8);
            //if L is empty convert G to L and store in L
            if (L.getText().toString().matches("")) {
                double Gd;
                String Gs = G.getText().toString();
                if(!Gs.isEmpty()) {
                    try {
                        Gd = Double.parseDouble(Gs);
                        Gd = (Gd*3.78541);
                        L.setText(Double.toString(Gd));
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }

                }
            }
            //if G is empty convert L to G and store in G
            if (G.getText().toString().matches("")) {
                double Ld;
                String Ls = L.getText().toString();
                if(!Ls.isEmpty()) {
                    try {
                        Ld = Double.parseDouble(Ls);
                        Ld = (Ld/3.78541);
                        G.setText(Double.toString(Ld));
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }

                }
            }*/
        //}
    //}
}
