package com.example.tamagotchijava.mvc3;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.tamagotchijava.R;
import com.example.tamagotchijava.mvc2.Pnl2_controller;

import java.util.Observable;
import java.util.Observer;

public class Pnl3_view extends LinearLayout implements Observer
{
    public Pnl3_controller refCtrl;
    public Pnl3_model refMdl;

    public Button btnReboot;
    public Button btnGoToPnl1;
    public Button btnGoToPnl2;

    public ImageView image;

    public TextView textProgrammerName;
    public TextView textYourName;
    public TextView textHome;

    public Pnl3_view(Context context)
    {
        super(context);

        LayoutInflater inflater= ((Activity)context).getLayoutInflater();
        inflater.inflate(R.layout.layout_pnl3, this);

        btnReboot = findViewById(R.id.btnReboot);
        btnGoToPnl1 = findViewById(R.id.btnGoToPnl1);
        btnGoToPnl2 = findViewById(R.id.btnGoToPnl2);

        image = findViewById(R.id.imageOption);

        textHome = findViewById(R.id.textHome);
        textProgrammerName = findViewById(R.id.textTamagotchiName);
        textYourName = findViewById(R.id.textYourName);
    }

    public void setRefCtrl(Pnl3_controller c) {
        refCtrl= c;
        btnReboot.setOnClickListener(refCtrl);
        btnGoToPnl1.setOnClickListener(refCtrl);
        btnGoToPnl2.setOnClickListener(refCtrl);
    }

    @Override
    public void update(Observable o, Object arg)
    {
        textProgrammerName.setText(refMdl.getProgrammerName());
        textYourName.setText(refMdl.getCreatorName());
    }
}
