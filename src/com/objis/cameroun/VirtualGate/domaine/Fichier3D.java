package com.objis.cameroun.VirtualGate.domaine;
import java.util.Date;
import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * Cration d'une classe fichier3D qui comporte les differentes methodes 
 * necessaires a la gestion de ses fichiers 3D
 * 
 * @author BILIM TONYE Emmanuel Roussel
 *
 */
@Entity
public class Fichier3D {								
	/*
	 *  Propriétés
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected int idFichier;
	protected String fichier;
	protected String description;
	protected String categorie;
	protected String auteur;
	
	@Temporal(TemporalType.TIMESTAMP)
	protected Date dateDeCreation;
	
	@ManyToOne(fetch = FetchType.LAZY)
	protected Personne personne;
		
		
	//Getters  Setters
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	public Date getDateDeCreation() {
		return dateDeCreation;
	}

	public void setDateDeCreation(Date dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}
	
	
	public Personne getPerson() {
		return personne;
	}
	
	public void setPerson(Personne person) {
		this.personne = person;
	}

	public void setFichier(String fichier) {
		this.fichier = fichier;
	}

	public String getFichier() {
		return fichier;
	}


	// Constructeurs

	/**
	 * Le constructeur sans paramètre de Fichier3D
	 */
	public Fichier3D() {
		super();
	}


	/**
	 * @param fichier
	 * @param description
	 * @param categorie
	 * @param auteur
	 */
	public Fichier3D(String fichier, String description, String categorie, String auteur) {
		super();
		this.fichier = fichier;
		this.description = description;
		this.categorie = categorie;
		this.auteur = auteur;
	}

	@Override
	public String toString() {
		return "Fichier3D [fichier=" + fichier + ", description=" + description + ", categorie=" + categorie
				+ ", auteur=" + auteur + ", dateDeCreation=" + dateDeCreation + ", personne=" + personne + "]";
	}
	
	
	
}