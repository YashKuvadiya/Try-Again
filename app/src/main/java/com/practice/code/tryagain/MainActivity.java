package com.practice.code.tryagain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.practice.code.imageplace.HelloWorld;
import com.practice.code.imageplace.ImageInflateLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HelloWorld.printLog("Yash","Kuvadiya");
    }
}