package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;



public class GestionBD {

	private Connection conexion;

	public GestionBD() {
		iniciarConexion();
	}

	public void iniciarConexion() {
		System.out.println("Conectando........");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/reto4_grupo3_tarde", "root", "");
		} catch (ClassNotFoundException e) {
			System.out.println("Libreria no encontrada");
		} catch (SQLException e) {
			System.out.println("BBDD no encontrada");
		}
		System.out.println("Conexion establecida");
	}

	public void cerrarConexion() {
		System.out.println("Conectando......");
		try {
			if (!conexion.isClosed()) {
				conexion.close();
			}
		} catch (SQLException e) {
			System.out.println("No hay conexion con la BD");
		}
		System.out.println("Conexion cerrada");
	}
}
