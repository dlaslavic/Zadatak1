import database.DatabaseService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class Main {
    public static void main(String[] args) {

        //Ne znam kako bih ubacio u switch case:
        insertExample();
        updateExample();
        deleteExample();
        selectExample();

    }
    private static void insertExample() {
        Connection connection = DatabaseService.createConnection();

        try {
            // Izvršavanje SQL upita
            String query = "INSERT INTO Grad VALUES (?)";
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, "Karlovac");

            Integer result = statement.executeUpdate();

            // Ispis rezultata

            System.out.println("Rezultat je " + result);
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    private static void updateExample() {
        Connection connection = DatabaseService.createConnection();

        try {
            // Izvršavanje SQL upita
            String query = "UPDATE Grad SET Naziv = ? WHERE IDDrzava = ?";
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, "Karlovac");
            statement.setString(2, "1");

            Integer result = statement.executeUpdate();

            // Ispis rezultata
            System.out.println("Rezultat je " + result);
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    private static void deleteExample() {
        Connection connection = DatabaseService.createConnection();

        try {
            // Izvršavanje SQL upita
            String query = "DELETE FROM Grad WHERE IDDrzava = ?";
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(17, "1");

            Integer result = statement.executeUpdate();

            // Ispis rezultata
            System.out.println("Rezultat je " + result);
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    private static void selectExample() {
        Connection connection = DatabaseService.createConnection();

        try {
            // Izvršavanje SQL upita
            String query = "SELECT * FROM Grad ORDER BY Naziv";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            // Ispis rezultata
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("IDGrad"));
                System.out.println("Naziv: " + resultSet.getString("Naziv"));
            }

            // Zatvaranje resursa
            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();


            }
        }
    }

}