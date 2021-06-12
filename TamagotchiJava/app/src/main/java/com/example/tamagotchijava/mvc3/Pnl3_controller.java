package com.example.tamagotchijava.mvc3;

import android.view.View;

import com.example.tamagotchijava.Pnl_manager;
import com.example.tamagotchijava.R;
import com.example.tamagotchijava.mvc2.Pnl2_model;

public class Pnl3_controller implements View.OnClickListener
{
    public Pnl3_model refMdl;
    public Pnl_manager refPnlManager;

    @Override
    public void onClick(View v)
    {
        if(v.getId() == R.id.btnGotoPnl1)
        {
            refPnlManager.setPnl(1);
        }
        if(v.getId() == R.id.btnGotoPnl2)
        {
            refPnlManager.setPnl(2);
        }
        if(v.getId() == R.id.btnReboot)
        {
            refMdl.Reboot();
        }
    }
}
