package com.objis.cameroun.VirtualGate.presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.objis.cameroun.VirtualGate.service.Service;
import com.objis.cameroun.VirtualGate.domaine.Personne;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class CreationDeCompte extends JFrame {

	private JPanel contentPane;
	private JTextField nomTextField;
	private JTextField prenomTextField;
	private JTextField nomUtilisateurTextField;
	private JTextField emailTextField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreationDeCompte frame = new CreationDeCompte();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public CreationDeCompte() {
		setTitle("Cr\u00E9ation d'un compte VG");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCreezVotreCompte = new JLabel("CREEZ VOTRE COMPTE VG");
		lblCreezVotreCompte.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreezVotreCompte.setBounds(0, 28, 434, 14);
		contentPane.add(lblCreezVotreCompte);
		
		JLabel lblNom = new JLabel("NOM :");
		lblNom.setBounds(24, 72, 46, 14);
		contentPane.add(lblNom);
		
		JLabel lblPrenom = new JLabel("PRENOM :");
		lblPrenom.setBounds(24, 97, 59, 14);
		contentPane.add(lblPrenom);
		
		JLabel lblEmail = new JLabel("EMAIL :");
		lblEmail.setBounds(24, 122, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblNomUtilisateur = new JLabel("NOM UTILISATEUR :");
		lblNomUtilisateur.setBounds(24, 147, 131, 14);
		contentPane.add(lblNomUtilisateur);
		
		JLabel lblMotDePasse = new JLabel("MOT DE PASSE :");
		lblMotDePasse.setBounds(24, 172, 97, 14);
		contentPane.add(lblMotDePasse);
		
		nomTextField = new JTextField();
		nomTextField.setBounds(153, 69, 242, 20);
		contentPane.add(nomTextField);
		nomTextField.setColumns(10);
		
		prenomTextField = new JTextField();
		prenomTextField.setBounds(153, 94, 242, 20);
		contentPane.add(prenomTextField);
		prenomTextField.setColumns(10);
		
		nomUtilisateurTextField = new JTextField();
		nomUtilisateurTextField.setBounds(153, 144, 242, 20);
		contentPane.add(nomUtilisateurTextField);
		nomUtilisateurTextField.setColumns(10);
		
		emailTextField = new JTextField();
		emailTextField.setBounds(153, 119, 242, 20);
		contentPane.add(emailTextField);
		emailTextField.setColumns(10);
		
		JButton btnEnregistrer = new JButton("Enregistrer");
		btnEnregistrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
// récupération des valeurs saisies dans le formulaire (créer des variables qui vont contenenir)	
				
				String nom, prenom, email, nomUtlisateur, motDePasse; //déclaration des variables
				
				// affectation saisie dans le formulaire
				nom = nomTextField.getText();
				prenom = prenomTextField.getText();
				email = emailTextField.getText();
				nomUtlisateur = nomUtilisateurTextField.getText();
				motDePasse = passwordField.getText();
				
				// Création d'un objet personne
				Personne personne = new Personne ();
				
				personne.setNom(nom);
				personne.setPrenom(prenom);
				personne.setEmail(email);
				personne.setNomUtilisateur(nomUtlisateur);
				personne.setMotDePasse(motDePasse);
				
				Service service = new Service();
				int etat;
				etat = service.creerCompteService(personne);
				if (etat == 1) {
					
					// clean up  des champs
					nomTextField.setText("");
					prenomTextField.setText("");
					emailTextField.setText("");
					nomUtilisateurTextField.setText("");
					passwordField.getText();
					
					// Affichage du dialogue
					JOptionPane.showMessageDialog( null, prenomTextField.getText()+ " votre comptea ete enregistre avec succes");
				}else {
					JOptionPane.showMessageDialog(null, "une erreur c'est produite pendant l'enregistrement");
				}
			}
		});
		btnEnregistrer.setBounds(283, 203, 110, 23);
		contentPane.add(btnEnregistrer);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(153, 169, 242, 20);
		contentPane.add(passwordField);
	}
}
