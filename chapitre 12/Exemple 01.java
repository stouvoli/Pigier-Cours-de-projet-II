String sql = "INSERT INTO employes (nom, prenom) VALUES (?, ?)";
try (PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
    stmt.setString(1, "KADIO");
    stmt.setString(2, "Jean");    stmt.executeUpdate();
    try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
        if (generatedKeys.next()) {
            int id = generatedKeys.getInt(1); // Récupérer l'ID généré
            System.out.println("Employé ajouté avec l'ID : " + id);
        }
    }
} 