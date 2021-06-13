package com.example.tamagotchijava;

import android.app.Activity;
import android.content.Context;

import com.example.tamagotchijava.mvc1.Pnl1_controller;
import com.example.tamagotchijava.mvc1.Pnl1_model;
import com.example.tamagotchijava.mvc1.Pnl1_view;
import com.example.tamagotchijava.mvc2.Pnl2_controller;
import com.example.tamagotchijava.mvc2.Pnl2_model;
import com.example.tamagotchijava.mvc2.Pnl2_view;
import com.example.tamagotchijava.mvc3.Pnl3_controller;
import com.example.tamagotchijava.mvc3.Pnl3_model;
import com.example.tamagotchijava.mvc3.Pnl3_view;

public class Pnl_manager
{
    //Singleton
    private static Pnl_manager instance = null;

    //Entier symbolisant la view devant être affiché
    private int pnl;

    //Création de chaque éléments des mvc
    private Pnl1_controller ctrl1;
    private Pnl1_view view1;
    private Pnl1_model mdl1;
    private Pnl2_controller ctrl2;
    private Pnl2_view view2;
    private Pnl2_model mdl2;
    private Pnl3_controller ctrl3;
    private Pnl3_view view3;
    private Pnl3_model mdl3;

    public Activity refAct;

    private Pnl_manager(Context context)
    {
        //Layout de base
        pnl = -1;

        //Instanciation de tous les éléments
        ctrl1 = new Pnl1_controller();
        view1 = new Pnl1_view(context);
        mdl1 = new Pnl1_model();
        ctrl2 = new Pnl2_controller();
        view2 = new Pnl2_view(context);
        mdl2 = new Pnl2_model();
        ctrl3 = new Pnl3_controller();
        view3 = new Pnl3_view(context);
        mdl3 = new Pnl3_model();

        view1.setRefCtrl(ctrl1);
        ctrl1.refPnlManager = this;

        refAct = (Activity)context;
    }

    public static Pnl_manager getInstance(Context context)
    {
        if (instance == null)
        {
            instance = new Pnl_manager(context);
        }
        return instance;
    }

    public void setPnl(int p)
    {
        //Affichage de l'écran 1
        if (p == 1 && pnl != 1)
        {
            refAct.setContentView(view1);
            pnl= 1;
        }
        //Affichage de l'écran 2
        if (p == 2 && pnl != 2)
        {
            refAct.setContentView(view2);
            pnl= 2;
        }
        //Affichage de l'écran 3
        if (p == 3 && pnl != 3)
        {
            refAct.setContentView(view3);
            pnl= 3;
        }
    }
}
