package com.objis.cameroun.VirtualGate.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.objis.cameroun.VirtualGate.dao.ConnectionMYSQL;
import com.objis.cameroun.VirtualGate.domaine.Fichier3D;
import com.objis.cameroun.VirtualGate.domaine.Personne;
import com.objis.cameroun.VirtualGate.domaine.Utilisateur;
import com.objis.cameroun.VirtualGate.presentation.Connexion;
import com.objis.cameroun.VirtualGate.dao.GenerateManagerEntity;

public class Dao implements IDao {
	
	//Création d'un objet 'sc' de type Scanner.
	 Scanner sc = new Scanner(System.in);
	Personne personne = new Personne ();
	Utilisateur utilisateur = new Utilisateur ();
	Fichier3D fichier3D = new Fichier3D () ;

	/* Méthode qui permet de créer un compte utilisateur
	 * @see com.objis.cameroun.VirtualGate.service.Iservice#créerCompte()
	 */
	public int creerCompteDao(Personne personne) {
		
		
		try {

			
			// 1 : Obtention d'un EntityManager
			
			EntityManager em = GenerateManagerEntity.getEntityManagerInstance();
						
			// 2 : Ouverture transaction 
		EntityTransaction tx = em.getTransaction();
		tx.begin();
						
			// 3 : Persistence objet creation
			em.persist(personne);
						
						
			// 4 : Fermeture transaction 
			tx.commit();		
			
			/*
			// Etape 1 : récupération de la connexion
			Connection cn = ConnectionMYSQL.getInstance();

			// Etape 2 : Création d'un objet  statement et prépa de la requête
			

			String sql = "insert into `personne`(`nom`,`prenom`,`email`,`nomUtilisateur`,`motDePasse`)" 
					+"values (?,?,?,?,?)";
		
			
			PreparedStatement ps=  cn.prepareStatement(sql);
			
		
			ps.setString(1, personne.getNom());
			ps.setString(2, personne.getPrenom());
			ps.setString(3, personne.getEmail());
			ps.setString(4, personne.getNomutilisateur());  
			ps.setString(5, personne.getMotdepasse());
			
			// Etape 3 : exécution requête
			ps.executeUpdate();
			
			
			*/
			
			// Etape 4 : gestion des exceptions et libération 'automatique' des ressources
		} catch (Exception e) {
			e.printStackTrace();
			
			return 0;
		} 
		
		return 1;
	
	}

	
	/* Méthode qui permet de se connecter à son compte utilisateur
	 * @see com.objis.cameroun.VirtualGate.service.Iservice#connexion()
	 */
	public void connexionDao(Utilisateur utilisateur) {
		
		try {
			// 1 : Obtention d'un EntityManager
			EntityManager em = GenerateManagerEntity.getEntityManagerInstance();
			
			// 2 : Ouverture transaction 
			EntityTransaction tx = em.getTransaction();
					tx.begin();
					
			// 3 : Obtention des info utilisateur
			Personne person = new Personne();
			personne.getNomUtilisateur();
			personne.getMotDePasse();

			
			
			String u = personne.getNomUtilisateur();
			String p = personne.getMotDePasse();
				
			Connexion connexion = new Connexion();
				
				
				/*
				 *  La variable 'u' reçoit la chaine de caractères saisis par l'utilisateur.
				 */
			String u2 = sc.nextLine();
				
				
				/*
				 *  Création d'une boucle WHILE qui doit redemander
				 */
				
			while (!u2.equals(u))
				{
					System.out.println("Nom d'utilisateur incorrect, veuillez reessayer:");
					System.out.println("Entrez votre nom d'utilisateur:");
					// La variable 'u' reçoit la chaine de caractères saisis par l'utilisateur.
					u = connexion.getNomUtilisateurTextField().getText();		
				}
				
				
				/*
				 * On affiche les instructions 
				 */
						System.out.println("Entrez votre mot de passe:");
						// La variable 'p' reçoit la chaine de caractères saisis par l'utilisateur.
						String p2 = sc.nextLine(); 
									
				while (!p2.equals(p))
				{
					System.out.println(" mot de passe incorrect, veuillez reessayer:");
					
					System.out.println("Entrez votre mot de passe:");
					/*
					 *  La variable 'p' reçoit la chaine de caractères saisis par l'utilisateur.
					 */
					p2 = sc.nextLine();   
					
				}
				/*
				 * On affiche les instructions 
				 */
				System.out.println(u + " " + "Bienvenue dans votre compte"); 

	
			
			// Etape 5 : gestion des exceptions et libération 'automatique' des ressources d'une tupple (ligne) 
		} catch (Exception e) {
			e.printStackTrace();
				
		} 
	} 
		
	
	

	
	/* Méthode qui permet d'enregistrer un fichier 3D
	 * @see com.objis.cameroun.VirtualGate.service.Iservice#enregistrerFichier3D()
	 */
	public int enregistrerFichier3Dao(Fichier3D fichier3D) {
		
		try {
			
			
			
			// 1 : Obtention d'un EntityManager
			
			EntityManager em = GenerateManagerEntity.getEntityManagerInstance();
						
			// 2 : Ouverture transaction 
			EntityTransaction tx = em.getTransaction();
						tx.begin();
						
			// 3 : Persistence objet creation
			em.persist(fichier3D);
						
						
			// 4 : Fermeture transaction 
			tx.commit();	
/*
		
		 // Etape 1 : récupération de la connexion
			Connection cn = ConnectionMYSQL.getInstance();

			// Etape 2 : Création d'un objet  statement et prépa de la requête
			

			String sql = "insert into `fichier 3d`(`fichier`,`description`,`categorie`,`auteur`)" 
					+"values (?,?,?,?)";
		
			
			PreparedStatement ps=  cn.prepareStatement(sql);
			
		
			ps.setString(1, fichier3D.getFichier());
			ps.setString(2, fichier3D.getDescription());
			ps.setString(3, fichier3D.getCategorie());
			ps.setString(4, fichier3D.getAuteur());  
			
			
			// Etape 3 : exécution requête
			ps.executeUpdate();
			
*/
			
			// Etape 4 : gestion des exceptions et libération 'automatique' des ressources
			 
		} catch (Exception e) {
			e.printStackTrace();
			
			return 0;
		} 
		
		return 1;
		 
		
		}
	
	public List<Fichier3D> getAllFichier3Dao(){
		   //création d'une collection d'eleves
				List<Fichier3D> maListFichier3D= new ArrayList<Fichier3D>();
			
				
				try {
					
					// 1 : Obtention d'un EntityManager
					
						EntityManager em = GenerateManagerEntity.getEntityManagerInstance();
								
						// 2 : Ouverture transaction 
						EntityTransaction tx =  em.getTransaction();
								tx.begin();
								
						// 3 : Obtention de la liste des eleves via EntityManager
						
								
						maListFichier3D = em.createQuery("from Fichier3D", Fichier3D.class).getResultList();
								
						/*
						maListFichier3D = em.createQuery("from Fichier3D e where e.classe = :cl", Fichier3D.class) //permet de trouver des info specifique
								.setParameter("cl", "PA2")
								.getResultList();		
						*/		
						// 4 : Fermeture transaction 
						 tx.commit();
								 
				
				} catch (Exception e) {
					e.printStackTrace();
					
				} 
			
				
				return maListFichier3D;
				
	}


}
