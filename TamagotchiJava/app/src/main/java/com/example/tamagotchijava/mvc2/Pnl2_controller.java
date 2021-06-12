package com.example.tamagotchijava.mvc2;

import android.view.View;

import com.example.tamagotchijava.Pnl_manager;
import com.example.tamagotchijava.R;

public class Pnl2_controller implements View.OnClickListener
{
    public Pnl2_model refMdl;
    public Pnl_manager refPnlManager;

    @Override
    public void onClick(View v)
    {
        if(v.getId() == R.id.btnGotoPnl1)
        {
            refPnlManager.setPnl(1);
        }
        if(v.getId() == R.id.btnGotoPnl3)
        {
            refPnlManager.setPnl(3);
        }
        if(v.getId() == R.id.btnMenacer)
        {
            refMdl.Menace();
        }
        if(v.getId() == R.id.btnEnergiser)
        {
            refMdl.Energiser();
        }
        if(v.getId() == R.id.btnPause)
        {
            refMdl.Pause();
        }
    }
}
