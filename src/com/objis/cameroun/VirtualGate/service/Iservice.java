package com.objis.cameroun.VirtualGate.service;

import com.objis.cameroun.VirtualGate.domaine.Fichier3D;
import com.objis.cameroun.VirtualGate.domaine.Personne;
import com.objis.cameroun.VirtualGate.domaine.Utilisateur;

/**
 *
 * Interface: contient uniquement des déclarations
 *  de methode à implémenter
 *  
 * @author BILIM TONYE Emmanuel Roussel
 *
 */
public interface Iservice {

	public int creerCompteService(Personne personne);
	public void connexionService(Utilisateur utilisateur);
	public int enregistrerFichier3DService(Fichier3D fichier3D);
	
	
}
