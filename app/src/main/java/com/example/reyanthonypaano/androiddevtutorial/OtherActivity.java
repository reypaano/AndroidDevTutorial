package com.example.reyanthonypaano.androiddevtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        //Toast Message
        Toast.makeText(this, "Intent Success!", Toast.LENGTH_LONG).show();
    }
}
