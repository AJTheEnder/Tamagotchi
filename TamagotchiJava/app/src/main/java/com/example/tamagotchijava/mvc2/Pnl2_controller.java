package com.example.tamagotchijava.mvc2;

import android.view.View;

import com.example.tamagotchijava.Pnl_manager;
import com.example.tamagotchijava.R;

public class Pnl2_controller implements View.OnClickListener
{
    public Pnl2_model refMdl;
    //Référence au panel manager pour pouvoir appeller le changement d'écran
    public Pnl_manager refPnlManager;

    @Override
    public void onClick(View v)
    {
        //Quand les boutons sont pressés changer d'écran
        if(v.getId() == R.id.pnl2_btnGoToPnl1)
        {
            refPnlManager.setPnl(1);
        }
        if(v.getId() == R.id.pnl2_btnGoToPnl3)
        {
            refPnlManager.setPnl(3);
        }
        //Quand les boutons sont pressés activer l'action choisie
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
