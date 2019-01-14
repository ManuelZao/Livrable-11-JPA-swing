package com.objis.cameroun.VirtualGate.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMYSQL {
	
	// Information d'acc�s � la base de donn�es
	public static String url = "jdbc:mysql://localhost/bdvirtualgate";
	//public static String url = "jdbc:mysql://::1/bdvirtualgate";
	public static String login = "root";//nom d'utilisateur de la base des donn�es
	public static String passwd = "Volcan32";//mot de pass
	public static Connection connection;
	
	/**
	 * Methode connection
	 * Elle ne prend rien en parametre
	 * @return Connection
	 */
	public static Connection getInstance() {
		
		if (connection==null) {
			
			try {
				
				connection = DriverManager.getConnection(url,login,passwd);
				
			}catch (SQLException e) {
				
				System.out.println("Probleme de connection");
				
			}
			
		}
		
		return connection;
		
	}

}
