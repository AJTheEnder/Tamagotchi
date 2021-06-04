package com.example.tamagotchijava.mvc2;

import java.util.Observable;
import java.util.Random;

public class Pnl2_model extends Observable
{
    private int ProductivitePoints;
    private int EnergiePoints;
    private int programmerState;
    private String message;
    private Random rand = new Random();

    public Pnl2_model() {
        ProductivitePoints = 100;
        EnergiePoints = 100;
        programmerState = 0;
        message = "Productif et energique : un bon esclave !";
    }

    public void Energiser()
    {
        if(rand.nextBoolean() == true)
        {
            if(EnergiePoints <= 94)
            {
                EnergiePoints += 6;
            }
            else {
                EnergiePoints = 100;
            }
            message = "Ce jeu est sponsorisé par Monster : il reçoit une Monster";
        }
        else {
            if(EnergiePoints <= 96)
            {
                EnergiePoints += 4;
            }
            else {
                EnergiePoints = 100;
            }
            message = "Le caféine est une amie précieuse : il reçoit un café";
        }
        setChanged();
        notifyObservers();
    }

    public void Pause()
    {
        if(EnergiePoints <= 90)
        {
            EnergiePoints += 10;
        }
        else {
            EnergiePoints = 100;
        }
        if(ProductivitePoints >= 10)
        {
            EnergiePoints -= 10;
        }
        else {
            ProductivitePoints = 0;
        }
        message = "Une pause ça fait toujours du bien mais l'employeur ne va pas être content";
    }

    public void Menace()
    {
        if(ProductivitePoints <= 88)
        {
            EnergiePoints += 12;
        }
        else {
            ProductivitePoints = 100;
        }
        if(EnergiePoints >= 12)
        {
            EnergiePoints += 12;
        }
        else {
            EnergiePoints = 0;
        }
        message = "L'employeur lance des menaces AU BOULOT !";
    }
}
