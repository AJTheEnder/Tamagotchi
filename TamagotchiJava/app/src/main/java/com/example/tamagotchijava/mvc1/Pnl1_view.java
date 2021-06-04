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

    public Button btnGotoPnl2;
    public Button btnGotoPnl3;

    public ImageView imageHome;

    public TextView textHome;

    public Pnl1_view(Context context)
    {
        super(context);

        LayoutInflater inflater= ((Activity)context).getLayoutInflater();
        inflater.inflate(R.layout.layout_pnl1, this);

        btnGotoPnl2 = (Button)findViewById(R.id.btnGotoPnl2);
        btnGotoPnl3 = (Button)findViewById(R.id.btnGotoPnl3);
    }

    public void setRefCtrl(Pnl1_controller c) {
        refCtrl = c;
        btnGotoPnl2.setOnClickListener(refCtrl);
    }
}
