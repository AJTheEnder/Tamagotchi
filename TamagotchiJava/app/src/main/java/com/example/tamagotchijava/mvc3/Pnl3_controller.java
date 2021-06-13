package com.example.tamagotchijava.mvc3;

import android.view.View;

import com.example.tamagotchijava.Pnl_manager;
import com.example.tamagotchijava.R;

public class Pnl3_controller implements View.OnClickListener
{
    public Pnl3_model refMdl;
    //Référence au panel manager pour pouvoir appeller le changement d'écran
    public Pnl_manager refPnlManager;

    @Override
    public void onClick(View v)
    {
        //Quand les boutons sont pressés changer d'écran
        if(v.getId() == R.id.btnGotoPnl1)
        {
            refPnlManager.setPnl(1);
        }
        if(v.getId() == R.id.pnl1_btnGotoPnl2)
        {
            refPnlManager.setPnl(2);
        }
        //Quand ce bouton est pressé reboot les informations du programmeur et du créateur
        if(v.getId() == R.id.btnReboot)
        {
            refMdl.Reboot();
        }
    }
}
