package com.example.ausias.intercibus;

import java.util.Date;

/**
 * Created by ausias on 16/03/18.
 */

/* Classe abstracta de la que hereden la resta d'usuaris de l'aplicació */
public abstract class Usuari {

    String nom;
    String username;
    String password;
    Date dataCreacio;
    String telefon;
    String email;

    boolean alta;

    public Usuari (String nom, String username, String password, Date dataCreacio, String telefon, String email) {
        this.nom = nom;
        this.username = username;
        this.password = password;
        this.dataCreacio = dataCreacio;
        this.telefon = telefon;
        this.email = email;
    }

}
