package com.example.tempconverter3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
        private Button mButton;

        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.button);
        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.button:
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
            //c.setText("wowies");
        }
    }
}
