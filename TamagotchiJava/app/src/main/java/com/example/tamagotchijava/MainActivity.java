package com.example.tamagotchijava;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Pnl_manager manager = Pnl_manager.getInstance(this);
        //View de base
        manager.setPnl(1);
    }
}