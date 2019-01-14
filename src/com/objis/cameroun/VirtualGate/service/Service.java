package com.objis.cameroun.VirtualGate.service;

import java.util.Scanner;

import com.objis.cameroun.VirtualGate.dao.Dao;
import com.objis.cameroun.VirtualGate.domaine.Fichier3D;
import com.objis.cameroun.VirtualGate.domaine.Personne;
import com.objis.cameroun.VirtualGate.domaine.Utilisateur;


/**
 * @author BILIM TONYE Emmanuel Roussel
 *
 */
public class Service implements Iservice {
	
	Dao dao = new Dao();
	
	public int creerCompteService(Personne personne) {
		
		return dao.creerCompteDao(personne);
	}
	
	public void connexionService(Utilisateur utilisateur) {
		dao.connexionDao(utilisateur);
		
	}
	
	public int enregistrerFichier3DService(Fichier3D fichier3D) {
		return dao.enregistrerFichier3Dao(fichier3D);
		
	}

}
