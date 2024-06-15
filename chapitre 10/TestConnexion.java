package ci.pigier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnexion {
	static Connection connexion;

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/sakila"; // URL de connexion
		String utilisateur = "sakila"; // Remplacez par votre nom d'utilisateur
		String motDePasse = "p_ssW0rd"; // Remplacez par votre mot de passe

		try {
			connexion = DriverManager.getConnection(url, utilisateur, motDePasse);
			if (connexion != null) {
                System.out.println("Connexion à la base de données sakila réussie !");
            } else {
                System.out.println("Échec de la connexion.");
            }
		} catch (SQLException e) {
			System.err.println("Erreur de connexion : " + e.getMessage());
		}

	}
}
