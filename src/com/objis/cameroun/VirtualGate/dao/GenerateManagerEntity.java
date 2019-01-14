package com.objis.cameroun.VirtualGate.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GenerateManagerEntity {
	
	public static EntityManager em;
	
	/**
	 * Methode EntityManager
	 * Elle ne prend rien en parametre
	 * @return Connection
	 */
	public static EntityManager getEntityManagerInstance() {
		
		if (em==null) {
			
			try {
				
				// 1 : Ouverture unité de travail JPA
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("virtualgate1-pu");
				em = emf.createEntityManager();
				
				
			}catch (Exception e) {
				
				e.printStackTrace();
				System.out.println("Probleme de creation de l'objet EntityManager ");
				
			}
			
		}
		
		return em;
		
	}

}
