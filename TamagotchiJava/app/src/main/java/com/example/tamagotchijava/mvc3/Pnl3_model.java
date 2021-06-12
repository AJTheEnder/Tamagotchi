package com.example.tamagotchijava.mvc3;

import java.util.Observable;

public class Pnl3_model extends Observable
{
    private String programmerName;
    private String creatorName;

    public Pnl3_model() {
        programmerName = "Random";
        creatorName = "God";
    }

    public void Reboot()
    {
        programmerName = "Random";
        creatorName = "God";
        setChanged();
        notifyObservers();
    }

    public String getProgrammerName()
    {
        return programmerName;
    }

    public String getCreatorName()
    {
        return creatorName;
    }

}
