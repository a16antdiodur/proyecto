package com.example.ausias.intercibus;

import java.util.Date;

/* Classe per identificar una Empresa */
public class Empresa extends Usuari {

	String nif;
	
	public Empresa(String nif, String nom, String username, String password, Date dataCreacio, String telefon, String email) {
		super (nom, username, password, dataCreacio, telefon, email);
		this.nif = nif;
	}
}
