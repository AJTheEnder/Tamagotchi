package com.example.tamagotchijava.mvc2;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.Handler;

import java.util.Observable;
import java.util.Random;
import java.io.*;

public class Pnl2_model extends Observable
{
    //Les données des différents points, du message (et de l'image ?)
    private int ProductivitePoints;
    private int EnergiePoints;
    private String message;
    //private Bitmap image;
    //Un donnée random pour le choix de l'élément energisant
    private Random rand = new Random();

    private Thread thread;
    private Handler m_Handler = new Handler();

    public Pnl2_model()
    {
        //Valeurs de base
        ProductivitePoints = 100;
        EnergiePoints = 100;
        message = "Productif et energique : un bon esclave !";
        //image = ;

        setChanged();
        notifyObservers();

        m_Handler.postDelayed(mToastRunnable, 2000);
    }

    public void Energiser() {
        //Soit monster pour energiser
        if(rand.nextBoolean() == true)
        {
            //Augmentation de l'énergie de 6
            if(EnergiePoints <= 94)
            {
                EnergiePoints += 6;
            }
            else {
                EnergiePoints = 100;
            }
            //Changement du message
            message = "Ce jeu est sponsorisé par Monster : il reçoit une Monster";
        }
        //Soit café pour energiser
        else {
            if(EnergiePoints <= 96)
            {
                EnergiePoints += 4;
            }
            else {
                EnergiePoints = 100;
            }
            //Changement du message
            message = "Le caféine est une amie précieuse : il reçoit un café";
        }
        //Notifier les observers, atendre 3 secondes et afficher l'état du programmeur
        setChanged();
        notifyObservers();
        //Thread.sleep(30000);
        whatIsProgrammerState();
    }

    public void Pause() {
        //Ajoute 10 à l'énergie
        if(EnergiePoints <= 90)
        {
            EnergiePoints += 10;
        }
        else {
            EnergiePoints = 100;
        }
        //Enlève 10 à la productivité
        if(ProductivitePoints >= 10)
        {
            ProductivitePoints -= 10;
        }
        else {
            ProductivitePoints = 0;
        }
        //Changement du message
        message = "Une pause ça fait toujours du bien mais l'employeur ne va pas être content";
        //Notifier les observers, atendre 3 secondes et afficher l'état du programmeur
        setChanged();
        notifyObservers();
        //Thread.sleep(30000);
        whatIsProgrammerState();
    }

    public void Menace() {
        //Ajoute 12 à la productivité
        if(ProductivitePoints <= 88)
        {
            ProductivitePoints += 12;
        }
        else {
            ProductivitePoints = 100;
        }
        //Enlève 12 à l'énergie
        if(EnergiePoints >= 12)
        {
            EnergiePoints -= 12;
        }
        else {
            EnergiePoints = 0;
        }
        //Changement du message
        message = "L'employeur lance des menaces AU BOULOT !";
        //Notifier les observers, atendre 3 secondes et afficher l'état du programmeur
        setChanged();
        notifyObservers();
        //Thread.sleep(30000);
        whatIsProgrammerState();
    }

    public void whatIsProgrammerState()
    {
        if(ProductivitePoints >= 100 && EnergiePoints >= 100)
        {
            message = "Productif et energique : un bon esclave !";
            //image = ;
        }
        if(ProductivitePoints < 50 && EnergiePoints >= 100)
        {
            message = "La sous productivité est dangereux";
            //image = ;
        }
        if(ProductivitePoints >= 100 && EnergiePoints < 50)
        {
            message = "Manque d'énergie quel dommage";
            //image = ;
        }
        if(ProductivitePoints < 50 && EnergiePoints < 50)
        {
            message = "Attention le licenciement est proche";
            //image = ;
        }
        if(ProductivitePoints == 0 && EnergiePoints == 0)
        {
            message = "A LA PORTE";
            //image = ;
        }
        //Notifier les observers
        setChanged();
        notifyObservers();
    }

    private Runnable mToastRunnable = new Runnable()
    {
        @Override
        public void run()
        {
            if(ProductivitePoints != 0 && EnergiePoints != 0)
            {
                if(ProductivitePoints > 0)
                {
                    ProductivitePoints -= 1;
                }
                if(EnergiePoints > 0)
                {
                    EnergiePoints -= 1;
                }
            }
            whatIsProgrammerState();
            setChanged();
            notifyObservers();

            m_Handler.postDelayed(this, 2000);
        }
    };

    //Les accesseurs aux données
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

    //public Bitmap getImage()
    //{
    //    return image;
    //}
}
