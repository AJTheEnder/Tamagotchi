package com.example.tamagotchijava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Pnl_manager manager= Pnl_manager.getInstance(this);
        manager.setPnl(1);
    }
}