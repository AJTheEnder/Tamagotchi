package com.example.tamagotchijava.mvc2;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.tamagotchijava.R;

import java.util.Observable;
import java.util.Observer;

public class Pnl2_view extends LinearLayout implements Observer
{
    public Pnl2_controller refCtrl;
    public Pnl2_model refMdl;

    public Button btnMenacer;
    public Button btnPause;
    public Button btnEnergiser;
    public Button btnGoToPnl1;
    public Button btnGoToPnl3;

    public ImageView imageProgrammer;

    public TextView textHome;
    public TextView textMessage;
    public TextView textProductivite;
    public TextView textEnergie;

    public Pnl2_view(Context context)
    {
        super(context);

        LayoutInflater inflater= ((Activity)context).getLayoutInflater();
        inflater.inflate(R.layout.layout_pnl2, this);

        btnMenacer = findViewById(R.id.btnMenacer);
        btnPause = findViewById(R.id.btnPause);
        btnEnergiser = findViewById(R.id.btnEnergiser);

        btnGoToPnl1 = findViewById(R.id.btnGoToPnl1);
        btnGoToPnl3 = findViewById(R.id.btnGoToPnl2);

        imageProgrammer = findViewById(R.id.imageProgrammer);

        textHome = findViewById(R.id.textHome);
        textMessage = findViewById(R.id.textMessage);
        textProductivite = findViewById(R.id.textProductivite);
        textEnergie = findViewById(R.id.textEnergie);
    }

    public void setRefCtrl(Pnl2_controller c) {
        refCtrl= c;
        btnMenacer.setOnClickListener(refCtrl);
        btnPause.setOnClickListener(refCtrl);
        btnEnergiser.setOnClickListener(refCtrl);
        btnGoToPnl1.setOnClickListener(refCtrl);
        btnGoToPnl3.setOnClickListener(refCtrl);
    }

    @Override
    public void update(Observable observable, Object o)
    {
        textMessage.setText(refMdl.getMessage());
        textEnergie.setText(Integer.toString(refMdl.getEnergiePoints()));
        textProductivite.setText(Integer.toString(refMdl.getProductivitePoints()));
        imageProgrammer.setImageBitmap(refMdl.getImage());
    }
}
