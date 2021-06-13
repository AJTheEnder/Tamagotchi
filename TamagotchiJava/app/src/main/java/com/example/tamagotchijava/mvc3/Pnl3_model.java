package com.example.tamagotchijava.mvc3;

import java.util.Observable;

public class Pnl3_model extends Observable
{
    //Informations du programmeur et du créateur
    private String programmerName;
    private String creatorName;

    //Constructor
    public Pnl3_model() {
        programmerName = "Random";
        creatorName = "God";
    }

    public void Reboot()
    {
        //Réinitiallisé les données
        programmerName = "Random";
        creatorName = "God";
        //Notifier les observers
        setChanged();
        notifyObservers();
    }

    //Accesseurs des données
    public String getProgrammerName()
    {
        return programmerName;
    }

    public String getCreatorName()
    {
        return creatorName;
    }

}
