package com.example.ausias.intercibus;

import java.util.Date;

/* Classe per identificar a un Particular */
public class Particular extends Usuari {

	String cognom1;
	String cognom2;
	
	public Particular(String nom, String cognom1, String cognom2,
					                    String username, String password, Date dataCreacio, String telefon, String email) {

		super(nom, username, password, dataCreacio, telefon, email);
		this.cognom1 = cognom1;
		this.cognom2 = cognom2;
	}
}
