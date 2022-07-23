import com.mysql.cj.jdbc.CallableStatement;
import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Data {

    // theese are the variables used to access data base for this project
    private String data = "jdbc:mysql://localhost:3306/profile";
    private String username = "root";
    private String code = "Miljomins0014";


    //this methode is for inserting data
    public void Insert() {
        try {
            Connection con = DriverManager.getConnection(data, username, code);
            Statement st = con).createStatement();

            String text1 = "INSERT INTO user (name, surname, email) VALUES ('linda', 'balode', 'linda@balode.lv')";
            st.executeUpdate(text1);
            System.out.println("Data has been inserted");



        } catch (SQLException a) {
            a.printStackTrace();

        }

    }

    // to update the inserted data, use this method
    public void  update () {
        try {
            Connection con = DriverManager.getConnection(data, username, code);
            Statement st = con).createStatement();

            String text1 = "UPDATE user SET email = '1@123.lv'";
            st.executeUpdate(text1);
            System.out.println("Data has been updated");



        } catch (SQLException a) {
            a.printStackTrace();

        }

    }

    //to delete data, use this method
    public void delete () {
        try {
            Connection con = DriverManager.getConnection(data, username, code);
            Statement st = con).createStatement();

            String text1 = "DELETE FROM user WHERE id = 1";
            st.executeUpdate(text1);
            System.out.println("Data has been deleted");



        } catch (SQLException a) {
            a.printStackTrace();

        }

    }
}

