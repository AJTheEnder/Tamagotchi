package com.example.tamagotchijava.mvc1;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.tamagotchijava.R;

import org.w3c.dom.Text;

public class Pnl1_view extends LinearLayout
{
    public Pnl1_controller refCtrl;

    //Les boutons pour aller aux écrans 1 et 2
    public Button btnGotoPnl2;
    public Button btnGotoPnl3;

    //Image et le texte du menu
    public ImageView imageHome;
    public TextView textHome;

    //Constructor
    public Pnl1_view(Context context)
    {
        super(context);

        LayoutInflater inflater = ((Activity)context).getLayoutInflater();
        //Liaison à l'xml de l'écran 1 : layout_pnl1
        inflater.inflate(R.layout.layout_pnl1, this);

        //Liaisons des boutons à ceux de l'xml
        btnGotoPnl2 = (Button)findViewById(R.id.pnl1_btnGotoPnl2);
        btnGotoPnl3 = (Button)findViewById(R.id.pnl1_btnGotoPnl3);
    }

    public void setRefCtrl(Pnl1_controller c)
    {
        refCtrl = c;
        btnGotoPnl2.setOnClickListener(refCtrl);
        btnGotoPnl3.setOnClickListener(refCtrl);
    }
}
