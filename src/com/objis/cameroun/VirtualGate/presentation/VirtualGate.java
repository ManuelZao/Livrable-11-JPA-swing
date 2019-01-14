package com.objis.cameroun.VirtualGate.presentation;
import java.util.Scanner;

import com.objis.cameroun.VirtualGate.domaine.Fichier3D;
import com.objis.cameroun.VirtualGate.domaine.Personne;
import com.objis.cameroun.VirtualGate.domaine.Utilisateur;
import com.objis.cameroun.VirtualGate.service.Service;
/**
 * @author BILIM TONYE Emmanuel Roussel
 *
 */
public class VirtualGate {	
	

	public static void main (String arg[]) {
	
		
		Personne personne = null;
		Utilisateur utilisateur = null;
		Fichier3D fichier3D = null;
		
		 // Message de bienvenue
		System.out.println("--------------------------------------------------------------------------------------------------"
				+ '\n' + "                             " +"<<    VIRTUAL GATE : ACCES AUTORISE   >>" + '\n'
				+ "--------------------------------------------------------------------------------------------------");
		System.out.println (" ");
		
		 // Instanciation des objets.
		 
		
		Service service = new Service ();
		Scanner sc = new Scanner(System.in);
		
		
		 // Afficher les informations suivantes
		 
		
		
		  System.out.println("				    Merci de choisir une option    " + '\n'
				+ "                                                            " + '\n'
				+ "                  		##################################" + '\n'
				+ "                  		##                              ##" + '\n'
				+ "                  		##    a - CREER UN COMPTE       ##" + '\n'
				+ "                  		##    b - SE CONNECTER          ##" + '\n'
				+ "                  		##    c - ENREGISTRER FICHIER   ##" + '\n'
				+ "                 		##    d - CONTINUER LA VISITE   ##" + '\n'
				+ "                 		##                              ##" + '\n'
				+ "                  		##################################" + '\n'
		        + "                                     " + " Entrer a, b, c ou d " );

		 
	// Création d'une boucle While
		
		char reponse = sc.nextLine().charAt(0);
		
		while (reponse == 'a' || reponse == 'b' || reponse == 'c' )
		{
			
			 // Pour chaque choix effectué on fera appel à la méthode correspondante
			 

				switch (reponse)
					{
					case 'a':
					
					service.creerCompteService(personne);
						break;
					  case 'b':
					
					service.connexionService(utilisateur);;
						break;
					  case 'c':
					
					
					service.enregistrerFichier3DService(fichier3D);
						break;
					  default:
						System.out.println("BONNE VISITE VIRTUELLE.");
					}
					
					 // On demande si la personne veut effectuer une autre opération
				System.out.println("  ");
					 
			    System.out.println("Voulez-vous effectuer une autre operation ? Entrer a, b, c ou d. ou N pour continuer la visite: ");
			    System.out.println("  ");
			    
				  System.out.println("				    Merci de choisir une option    " + '\n'
							+ "                                                            " + '\n'
							+ "                  		##################################" + '\n'
							+ "                  		##                              ##" + '\n'
							+ "                  		##    a - CREER UN COMPTE       ##" + '\n'
							+ "                  		##    b - SE CONNECTER          ##" + '\n'
							+ "                  		##    c - ENREGISTRER FICHIER   ##" + '\n'
							+ "                 		##    d - CONTINUER LA VISITE   ##" + '\n'
							+ "                 		##                              ##" + '\n'
							+ "                  		##################################" + '\n'
					        + "                                     " + " Entrer a, b, c ou d " );

			   //On récupère la réponse de l'utilisateur
			   
			  reponse = sc.nextLine().charAt(0);
		}
		
		 //Message de fin de programme
		 
		System.out.println("MERCI DE VOTRE VISITE.");
	
	}
			
}		
		