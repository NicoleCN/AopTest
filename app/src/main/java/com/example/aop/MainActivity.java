package com.example.aop;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BusinessManager businessManager = new BusinessManager();
        businessManager.dealBusiness(new ABean());
        businessManager.dealBusiness(new BBean());
        businessManager.dealBusiness(new CBean());
    }
}
