package com.example.testgithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void testUpload () {
        int i = 1 + 1;
        int beta = 2 + 2;
        int gamma = i + beta;
        int delta = 2;
    }

}
