package com.objis.cameroun.VirtualGate.dao;

import java.util.List;

import com.objis.cameroun.VirtualGate.domaine.Fichier3D;
import com.objis.cameroun.VirtualGate.domaine.Personne;
import com.objis.cameroun.VirtualGate.domaine.Utilisateur;


public interface IDao {

	public int creerCompteDao(Personne personne);
	public void connexionDao(Utilisateur utilisateur);
	public int enregistrerFichier3Dao(Fichier3D fichier3D);
	public List<Fichier3D> getAllFichier3Dao();
	// public List<Fichier3D> getAllFichier3Dao();
}
