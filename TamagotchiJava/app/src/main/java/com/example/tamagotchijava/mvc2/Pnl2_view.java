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

    //Les boutons d'actions sur le programmeur menacer, faire une pause et energiser
    public Button btnMenacer;
    public Button btnPause;
    public Button btnEnergiser;
    //Les boutons pour aller aux écrans 1 et 3
    public Button btnGoToPnl1;
    public Button btnGoToPnl3;

    //Image du programmeur (change en fonction de son état ?)
    public ImageView imageProgrammer;

    //Texte du menu
    public TextView textHome;
    //Texte du message, change en fonction de l'état et des actions effectuées
    public TextView textMessage;
    //Texte d'affichage du nombre de points de productivité et d'energie
    public TextView textProductivite;
    public TextView textEnergie;

    public Pnl2_view(Context context)
    {
        super(context);

        LayoutInflater inflater= ((Activity)context).getLayoutInflater();
        //Liaison à l'xml de l'écran 2 : layout_pnl2
        inflater.inflate(R.layout.layout_pnl2, this);

        //Liaison des boutons à ceux de l'xml
        btnMenacer = findViewById(R.id.btnMenacer);
        btnPause = findViewById(R.id.btnPause);
        btnEnergiser = findViewById(R.id.btnEnergiser);

        btnGoToPnl1 = findViewById(R.id.pnl2_btnGoToPnl1);
        btnGoToPnl3 = findViewById(R.id.pnl2_btnGoToPnl3);

        //Liaison des différents éléments à ceux de l'xml
        imageProgrammer = findViewById(R.id.imageProgrammer);

        textHome = findViewById(R.id.textHome);
        textMessage = findViewById(R.id.textMessage);
        textProductivite = findViewById(R.id.textProductivite);
        textEnergie = findViewById(R.id.textEnergie);
    }

    public void setRefCtrl(Pnl2_controller c)
    {
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
        //Update de l'affichage du message, des points (et de l'image ?) quand le modèle est modifié
        textMessage.setText(refMdl.getMessage());
        textEnergie.setText(Integer.toString(refMdl.getEnergiePoints()));
        textProductivite.setText(Integer.toString(refMdl.getProductivitePoints()));
        imageProgrammer.setImageBitmap(refMdl.getImage());
    }
}
