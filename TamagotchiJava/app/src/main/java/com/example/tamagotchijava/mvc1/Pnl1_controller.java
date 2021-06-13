package com.example.tamagotchijava.mvc1;

import android.view.View;

import com.example.tamagotchijava.Pnl_manager;
import com.example.tamagotchijava.R;

public class Pnl1_controller implements View.OnClickListener
{
    //Référence au panel manager pour pouvoir appeller le changement d'écran
    public Pnl_manager refPnlManager;

    @Override
    public void onClick(View v)
    {
        //Quand les boutons sont pressés changer d'écran
        if(v.getId() == R.id.pnl1_btnGotoPnl2)
        {
            refPnlManager.setPnl(2);
        }
        if(v.getId() == R.id.pnl1_btnGotoPnl3)
        {
            refPnlManager.setPnl(3);
        }
    }
}
