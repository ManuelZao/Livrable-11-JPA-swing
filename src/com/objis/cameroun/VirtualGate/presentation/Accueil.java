package com.objis.cameroun.VirtualGate.presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Accueil {

	private JFrame frmVgAccueil;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Accueil window = new Accueil();
					window.frmVgAccueil.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Accueil() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVgAccueil = new JFrame();
		frmVgAccueil.setFont(new Font("Vivaldi", Font.PLAIN, 16));
		frmVgAccueil.setTitle("VG Accueil");
		frmVgAccueil.setBounds(100, 100, 450, 300);
		frmVgAccueil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVgAccueil.getContentPane().setLayout(null);
		
		JLabel lblVirtualGate = new JLabel("Virtual Gate");
		lblVirtualGate.setForeground(Color.RED);
		lblVirtualGate.setFont(new Font("Vivaldi", Font.PLAIN, 34));
		lblVirtualGate.setBounds(46, 62, 194, 52);
		frmVgAccueil.getContentPane().add(lblVirtualGate);
		
		JLabel lblEntreRveRel = new JLabel("entre r\u00EAve, r\u00E9el et virtuel ...");
		lblEntreRveRel.setForeground(Color.RED);
		lblEntreRveRel.setFont(new Font("Vivaldi", Font.PLAIN, 18));
		lblEntreRveRel.setBounds(195, 116, 160, 23);
		frmVgAccueil.getContentPane().add(lblEntreRveRel);
		
		JMenuBar menuBar = new JMenuBar();
		frmVgAccueil.setJMenuBar(menuBar);
		
		JMenu mnComp = new JMenu("Utilisateur");
		mnComp.setFont(new Font("Footlight MT Light", Font.PLAIN, 14));
		menuBar.add(mnComp);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Connexion");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Connexion frame = new Connexion();
				frame.setVisible(true);
			}
		});
		mntmNewMenuItem.setBackground(new Color(240, 240, 240));
		mntmNewMenuItem.setFont(new Font("Footlight MT Light", Font.PLAIN, 14));
		mnComp.add(mntmNewMenuItem);
		
		JMenuItem mntmCrerUnCompte = new JMenuItem("Cr\u00E9er un compte");
		mntmCrerUnCompte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CreationDeCompte frame = new CreationDeCompte();
				frame.setVisible(true);
			}
		});
		mntmCrerUnCompte.setFont(new Font("Footlight MT Light", Font.PLAIN, 14));
		mnComp.add(mntmCrerUnCompte);
		
		JMenu mnMesDocuments = new JMenu("Mes documents");
		mnMesDocuments.setFont(new Font("Footlight MT Light", Font.PLAIN, 14));
		menuBar.add(mnMesDocuments);
		
		JMenuItem mntmPrivs = new JMenuItem("enregistrer fichier");
		mntmPrivs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				EnregistrementFichier3D frame = new EnregistrementFichier3D();
				frame.setVisible(true);
			}
		});
		mntmPrivs.setFont(new Font("Footlight MT Light", Font.PLAIN, 14));
		mnMesDocuments.add(mntmPrivs);
		
		JMenuItem mntmPublics = new JMenuItem("Publics");
		mntmPublics.setFont(new Font("Footlight MT Light", Font.PLAIN, 14));
		mnMesDocuments.add(mntmPublics);
		
		JMenu mnVgOpenworld = new JMenu("VG OpenWorld");
		mnVgOpenworld.setFont(new Font("Footlight MT Light", Font.PLAIN, 14));
		menuBar.add(mnVgOpenworld);
	}
}
