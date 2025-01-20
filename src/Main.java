import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.ResultSet;



public class Main {
        static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {

            while (true){
            System.out.println("Odaberi jednu opciju");
            System.out.println("Unesi 1 ako želiš unijeti novi grad");
            System.out.println("Unesi 2 ako želiš izmijeniti postojeći grad");
            System.out.println("Unesi 3 ako želiš ukloniti postojeći grad");
            System.out.println("Unesi 4 ako želiš prikaz svih gradova sortiranih po nazivu");
            System.out.println("Unesi 5 ako želiš izaći iz programa");
            System.out.println("------------------------------------");

            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                scanner.nextLine();

                switch (num) {
                    case 1 -> dodajNoviGrad();
                    case 2 -> izmijeniPostojeciGrad();
                    case 3 -> brisanjePostojecegGrada();
                    case 4 -> sviGradoviSortiraniPoNazivuASC();
                    case 5 -> {
                        System.out.println("Izlaz");
                        return;
                    }
                    default -> System.out.println("Krivi unos pokušaj ponovo");
                }

            } else {
                System.out.println("Molimo unesite valjani broj.");
                scanner.nextLine();
            }
            System.out.println("-------------------------------------");
            }

        }

        private static void dodajNoviGrad() {
        System.out.println("Unesite ime grada koji želite dodati");

        String noviGrad = scanner.nextLine();
        ispisSvihDrzava();
        System.out.println("Unesite ID Drzave kojoj pripada taj grad");
        int idDrzave = scanner.nextInt();

        String query = "INSERT INTO Grad (Naziv, DrzavaId) VALUES (?,?)";

        try (Connection connection = DBConnection.getConnection()) {

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, noviGrad);
            preparedStatement.setInt(2, idDrzave);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Unjeli ste: " + noviGrad);
                sviGradoviSortiraniPoNazivuASC();
            } else {
                System.out.println("Dodavanje grada nije usojelo");
            }

            } catch (SQLException e) {
            System.out.println("Exception: " + e.getMessage());

            }
        }
        private static void izmijeniPostojeciGrad() {

                //moguća nadogradnja na postojeći kod:
                //switch (num) {
                //case 1 -> izmijeniNaziv();
                //case 2 -> izmijeniDrzavuId();
                //case 3 -> izmijeniSve();
                //}

           sviGradoviSortiraniPoNazivuASC();
           System.out.println("Unesite ID grada kojem želite izmijeniti ime");
           int idGrada = scanner.nextInt();

           ispisSvihDrzava();

           System.out.println("Unesite ID Drzave kojoj pripada taj grad");
           int idDrzave = scanner.nextInt();
           scanner.nextLine();
           System.out.println("Unesite novo ime grada");

           String noviGrad = scanner.next();

           String query = "UPDATE Grad SET Naziv = ?, SET IDDrzava WHERE IDGrad = ?";


           try (Connection connection = DBConnection.getConnection()) {

               PreparedStatement preparedStatement = connection.prepareStatement(query);

               preparedStatement.setString(1, noviGrad);
               preparedStatement.setInt(2, idGrada);
               preparedStatement.setInt(3, idDrzave);

               int rowsAffected = preparedStatement.executeUpdate();

               if (rowsAffected > 0) {
                   System.out.println("Izmjenili ste grad s ID-om :  " + idGrada + " novo ime grada je : " + noviGrad);
                   sviGradoviSortiraniPoNazivuASC();
               } else {
                   System.out.println("Izmjena grada nije usojela");
               }
           } catch (SQLException e) {
                    System.out.println("Exception: " + e.getMessage());
           }
        }

        private static void brisanjePostojecegGrada() {
            System.out.println("Unesite ID grada koji želite ukloniti s liste");

            int idGrada = scanner.nextInt();

            String query = "DELETE FROM Grad WHERE IDGrad = ?";

             try (Connection connection = DBConnection.getConnection()) {
             PreparedStatement preparedStatement = connection.prepareStatement(query);
             preparedStatement.setInt(1, idGrada);

             int rowsAffected = preparedStatement.executeUpdate();

             if (rowsAffected > 0) {
                 System.out.println("Uklonili ste: "  + idGrada);
                 sviGradoviSortiraniPoNazivuASC();
             } else {
                 System.out.println("Brisanje grada nije usojelo");
             }

            } catch (SQLException e){
             System.out.println("Exception: " + e.getMessage());

            }
        }

        private static void sviGradoviSortiraniPoNazivuASC() {
             String query = "SELECT * FROM Grad ORDER BY NAziv ASC";

             try (Connection connection = DBConnection.getConnection()) {
                 PreparedStatement preparedStatement = connection.prepareStatement(query);

                 ResultSet rs = preparedStatement.executeQuery();

                 while (rs.next()) {
                     System.out.println("ID : " + rs.getInt("IDGrad") + " , NAziv Grada : " + rs.getString("Naziv") + " , ID Drzave : " + rs.getInt("Naziv"));
                 }
             } catch (SQLException e) {
                 System.out.println("Exception: " + e.getMessage());
             }
        }

        private static void ispisSvihDrzava() {
             String query = "SELECT * FROM Drzava";

             try (Connection connection = DBConnection.getConnection()) {
                 PreparedStatement preparedStatement = connection.prepareStatement(query);

                 ResultSet rs = preparedStatement.executeQuery();

                 while (rs.next()) {
                     System.out.println("ID Drzave : " + rs.getInt("IDGrad") + " , Naziv : " + rs.getString("Naziv"));
                 }

             } catch (SQLException e) {
                 System.out.println("Exception: " + e.getMessage());
             }
        }
}
