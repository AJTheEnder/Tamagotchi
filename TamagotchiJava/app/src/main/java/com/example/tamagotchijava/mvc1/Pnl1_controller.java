package com.example.tamagotchijava.mvc1;

import android.view.View;

import com.example.tamagotchijava.Pnl_manager;
import com.example.tamagotchijava.R;

public class Pnl1_controller implements View.OnClickListener
{
    public Pnl_manager refPnlManager;

    @Override
    public void onClick(View v)
    {
        if(v.getId() == R.id.btnGotoPnl2)
        {
            refPnlManager.setPnl(2);
        }
        if(v.getId() == R.id.btnGotoPnl3)
        {
            refPnlManager.setPnl(3);
        }
    }
}
