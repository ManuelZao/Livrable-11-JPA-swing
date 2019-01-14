package com.objis.cameroun.VirtualGate.presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.objis.cameroun.VirtualGate.domaine.Personne;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Connexion extends JFrame {

	private JPanel contentPane;
	private JTextField nomUtilisateurTextField;
	public JPasswordField passwordField;
	Personne personne = new Personne ();
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Connexion frame = new Connexion();
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
	public Connexion() {
		setTitle("Connexion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomDutilisateur = new JLabel("Nom d'utilisateur :");
		lblNomDutilisateur.setBounds(36, 91, 112, 14);
		contentPane.add(lblNomDutilisateur);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe :");
		lblMotDePasse.setBounds(40, 164, 120, 19);
		contentPane.add(lblMotDePasse);
		
		setNomUtilisateurTextField(new JTextField());
		getNomUtilisateurTextField().setBounds(158, 88, 225, 20);
		contentPane.add(getNomUtilisateurTextField());
		getNomUtilisateurTextField().setColumns(10);
		
		JButton btnConnexion = new JButton("CONNEXION");
		btnConnexion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				// Création d'un objet personne
				
		// récupération des valeurs saisies dans le formulaire (créer des variables qui vont contenenir)	
				

				String nomUtilisateur, motDePasse; //déclaration des variables
				
				nomUtilisateur = getNomUtilisateurTextField().getText();
				motDePasse = passwordField.getText();
				
				if (!motDePasse.equals(personne.getMotDePasse()))
				JOptionPane.showMessageDialog( null, " mot de passe incorrect, veuillez reessayer");
				else
					JOptionPane.showMessageDialog( null, " Bienvenue dans votre compte");
				
			}
		});
		btnConnexion.setBounds(305, 213, 103, 23);
		contentPane.add(btnConnexion);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(158, 163, 225, 20);
		contentPane.add(passwordField);
	}
	public JTextField getNomUtilisateurTextField() {
		return nomUtilisateurTextField;
	}
	public void setNomUtilisateurTextField(JTextField nomUtilisateurTextField) {
		this.nomUtilisateurTextField = nomUtilisateurTextField;
	}
}
