package com.objis.cameroun.VirtualGate.presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import com.objis.cameroun.VirtualGate.domaine.Fichier3D;
import com.objis.cameroun.VirtualGate.domaine.Personne;
import com.objis.cameroun.VirtualGate.service.Service;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EnregistrementFichier3D extends JFrame {

	private JPanel contentPane;
	private JTextField nomFichierTextField;
	private JTextField descriptionTextField;
	private JTextField categorieTextField;
	private JTextField auteurTextField;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EnregistrementFichier3D frame = new EnregistrementFichier3D();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the frame.
	 */
	public EnregistrementFichier3D() {
		setTitle("enregistrement Fichier 3D");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomDuFichhier = new JLabel("Nom du fichhier :");
		lblNomDuFichhier.setBounds(31, 42, 88, 24);
		contentPane.add(lblNomDuFichhier);
		
		JLabel lblDescription = new JLabel("Description :");
		lblDescription.setBounds(31, 77, 63, 14);
		contentPane.add(lblDescription);
		
		JLabel lblCatgorie = new JLabel("Cat\u00E9gorie :");
		lblCatgorie.setBounds(31, 152, 63, 14);
		contentPane.add(lblCatgorie);
		
		JLabel lblAuteur = new JLabel("Auteur :");
		lblAuteur.setBounds(31, 177, 46, 14);
		contentPane.add(lblAuteur);
		
		nomFichierTextField = new JTextField();
		nomFichierTextField.setBounds(136, 44, 248, 20);
		contentPane.add(nomFichierTextField);
		nomFichierTextField.setColumns(10);
		
		descriptionTextField = new JTextField();
		descriptionTextField.setBounds(136, 74, 248, 57);
		contentPane.add(descriptionTextField);
		descriptionTextField.setColumns(10);
		
		categorieTextField = new JTextField();
		categorieTextField.setBounds(136, 149, 248, 20);
		contentPane.add(categorieTextField);
		categorieTextField.setColumns(10);
		
		auteurTextField = new JTextField();
		auteurTextField.setBounds(136, 174, 248, 20);
		contentPane.add(auteurTextField);
		auteurTextField.setColumns(10);
		
		
		JButton btnEnregistrer = new JButton("Enregistrer");
		btnEnregistrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
// récupération des valeurs saisies dans le formulaire (créer des variables qui vont contenenir)	
				
				String fichier, description, categorie, auteur; //déclaration des variables
				
				// affectation saisie dans le formulaire
				fichier = nomFichierTextField.getText();
				description = descriptionTextField.getText();
				categorie = categorieTextField.getText();
				auteur = auteurTextField.getText();
				
				// Création d'un objet fichier3D
				Fichier3D fichier3D = new Fichier3D () ;	
				
				fichier3D.setFichier(fichier);
				fichier3D.setDescription(description);
				fichier3D.setCategorie(categorie);
				fichier3D.setAuteur(auteur);
				Service service = new Service();
				int etat;
				etat = service.enregistrerFichier3DService(fichier3D);
				if (etat == 1) {
					
					// clean up  des champs
					nomFichierTextField.setText("");
					descriptionTextField.setText("");
					categorieTextField.setText("");
					auteurTextField.setText("");
					
					// Affichage du dialogue
					JOptionPane.showMessageDialog( null, " votre fichier a ete enregistre avec succes");
				}else {
					JOptionPane.showMessageDialog(null, "une erreur c'est produite pendant l'enregistrement");
				}
			}
		});
		btnEnregistrer.setBounds(283, 203, 110, 23);
		contentPane.add(btnEnregistrer);
		
	}
}
