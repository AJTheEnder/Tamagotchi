package com.example.tamagotchijava.mvc3;

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

public class Pnl3_view extends LinearLayout implements Observer
{
    public Pnl3_controller refCtrl;
    public Pnl3_model refMdl;

    //Boutons pour rebbot les informations du programmeur et du créateur
    public Button btnReboot;
    //Les boutons pour aller aux écrans 1 et 2
    public Button btnGoToPnl1;
    public Button btnGoToPnl2;

    //Image du menu
    public ImageView image;

    //Le nom du programmeur et du créateur
    public TextView textProgrammerName;
    public TextView textYourName;
    //Texte du menu
    public TextView textHome;


    public Pnl3_view(Context context)
    {
        super(context);

        LayoutInflater inflater= ((Activity)context).getLayoutInflater();
        //Liaison à l'xml de l'écran 3 : layout_pnl3
        inflater.inflate(R.layout.layout_pnl3, this);

        //Liaison des boutons à ceux de l'xml
        btnReboot = findViewById(R.id.btnReboot);
        btnGoToPnl1 = findViewById(R.id.pnl3_btnGoToPnl1);
        btnGoToPnl2 = findViewById(R.id.pnl3_btnGoToPnl2);

        //Liaison des différents éléments à ceux de l'xml
        image = findViewById(R.id.imageOption);

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
        //Update de informations du programmeur et du créateur
        textProgrammerName.setText(refMdl.getProgrammerName());
        textYourName.setText(refMdl.getCreatorName());
    }
}
