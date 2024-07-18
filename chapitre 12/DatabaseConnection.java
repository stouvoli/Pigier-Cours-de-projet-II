package ci.pigier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static Connection getConnection() { 
        String url = "jdbc:mysql://localhost:3306/sakila";
        String user = "sakila";
        String password = "p_ssW0rd";
    	
//        String url = "jdbc:mysql://ls-0f19f4268096a452a869b6f8467bc299c51da519.cz6cgwgke8xd.eu-west-3.rds.amazonaws.com:3306";
//        String user = "dbmasteruser";
//        String password = "oA*.b.1;U.gW>3YW91GGwft6h5l(|Z12";

        Connection connection = null; // Initialisation à null en cas d'erreur
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connexion à la base de données établie avec succès.");
        } catch (SQLException e) {
            System.err.println("Erreur lors de la connexion à la base de données : " + e.getMessage());
            // Autres actions de gestion d'erreur (log, notification, etc.)
        }
        return connection; // Retourne la connexion (éventuellement null en cas d'erreur)
    }
}

