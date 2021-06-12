package com.example.tamagotchijava.mvc2;

import android.graphics.Bitmap;
import android.media.Image;

import java.util.Observable;
import java.util.Random;

public class Pnl2_model extends Observable
{
    private int ProductivitePoints;
    private int EnergiePoints;
    private String message;
    private Bitmap image;
    private Random rand = new Random();

    public Pnl2_model() {
        ProductivitePoints = 100;
        EnergiePoints = 100;
        message = "Productif et energique : un bon esclave !";
        image = ;
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
        whatIsProgrammerState();
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
        whatIsProgrammerState();
        setChanged();
        notifyObservers();
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
        whatIsProgrammerState();
        setChanged();
        notifyObservers();
    }

    public void whatIsProgrammerState()
    {
        if(ProductivitePoints >= 100 && EnergiePoints >= 100)
        {
            message = "Productif et energique : un bon esclave !";
            image = ;
        }
        if(ProductivitePoints < 50 && EnergiePoints >= 100)
        {
            message = "La sous productivité est dangereux";
            image = ;
        }
        if(ProductivitePoints >= 100 && EnergiePoints < 50)
        {
            message = "Manque d'énergie quel dommage";
            image = ;
        }
        if(ProductivitePoints < 50 && EnergiePoints < 50)
        {
            message = "Attention le licenciement est proche";
            image = ;
        }
        if(ProductivitePoints == 0 && EnergiePoints == 0)
        {
            message = "A LA PORTE";
            image = ;
        }
        setChanged();
        notifyObservers();
    }

    public int getEnergiePoints()
    {
        return EnergiePoints;
    }

    public int getProductivitePoints()
    {
        return ProductivitePoints;
    }

    public String getMessage()
    {
        return message;
    }

    public Bitmap getImage()
    {
        return image;
    }
}
