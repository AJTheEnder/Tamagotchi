package com.example.tamagotchijava.mvc3;

import java.util.Observable;

public class Pnl3_model extends Observable
{
    //Informations du programmeur et du créateur
    private String programmerName;
    private String creatorName;

    //Constructor
    public Pnl3_model() {
        programmerName = " ";
        creatorName = " ";

        setChanged();
        notifyObservers();
    }

    public void Reboot()
    {
        //Réinitiallisé les données
        programmerName = " ";
        creatorName = " ";
        //Notifier les observers
        setChanged();
        notifyObservers();
    }

    public void setCreatorName(String creatorName)
    {
        this.creatorName = creatorName;
        setChanged();
        notifyObservers();
    }

    public void setProgrammerName(String programmerName)
    {
        this.programmerName = programmerName;
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
