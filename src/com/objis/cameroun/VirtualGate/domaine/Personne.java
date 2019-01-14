package com.objis.cameroun.VirtualGate.domaine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *Création d'une classe personne qui regroupe les informations de base d'un utilisateur
 * @author BILIM TONYE Emmanuel Roussel
 */

@Entity
public class Personne {
	/*
	 *  Propriétés
	 */
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected int idPersonne;
	protected String nom;
	protected String prenom;
	protected String email;
	protected String nomUtilisateur;
	protected String motDePasse;
	
	@OneToMany(mappedBy = "personne", fetch = FetchType.LAZY)
	protected List<Fichier3D> maListFichier3D= new ArrayList<Fichier3D>();
	

	/*
	 * Getters & Setters
	 */
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	
	
	public List<Fichier3D> getMaListFichier3D() {
		return maListFichier3D;
	}

	public void setMaListFichier3D(List<Fichier3D> maListFichier3D) {
		this.maListFichier3D = maListFichier3D;
	}

	
	// Constructeurs
	/**
	 * Le constructeur sans paramètre de Personne
	 */
	public Personne() {
		super();
	}
	
	

	/**
	 * @param nomutilisateur
	 */
	public Personne(String nomutilisateur) {
		super();
		this.nomUtilisateur = nomutilisateur;
	}
	
	/**
	 * @param nom
	 * @param prenom
	 */
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * @param email
	 * @param nomutilisateur
	 * @param motdepasse
	 */
	public Personne(String email, String nomutilisateur, String motdepasse) {
		super();
		this.email = email;
		this.nomUtilisateur = nomutilisateur;
		this.motDePasse = motdepasse;
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param nomutilisateur
	 * @param motdepasse
	 */
	public Personne(String nom, String prenom, String email, String nomutilisateur, String motdepasse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.nomUtilisateur = nomutilisateur;
		this.motDePasse = motdepasse;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", nomUtilisateur=" + nomUtilisateur
				+ ", motDePasse=" + motDePasse + "]";
	}


	
}
