import java.sql.*;
import java.util.Scanner;
// 2 components: class Driver-manager  interface
public class App {
    private static String url = "jdbc:mysql://localhost:3306/college"; //database
    private static String user = "root";
    private static String password = "root";
    public static void main(String[] args) throws Exception {
        System.out.println("Code of JDBC");
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name of the staff");
            String name = sc.nextLine();
            System.out.println("Enter the designation of the staff");
            String designation = sc.nextLine();
            System.out.println("Enter the department of the staff");
            String department = sc.nextLine();
            System.out.println("Enter the vriable pay");
            int vriable_pay = sc.nextInt();
            System.out.println("Enter the salary of the staff");
            int salary = sc.nextInt();

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            String query = "insert into staff (name, subject, task, pay_variable, salary) values('"+name+"','"+designation+"','"+department+"','"+vriable_pay+"','"+salary+"')";
            System.out.println(query);
            st.executeUpdate(query);

            // while(rs.next()){
            //     System.out.println(rs.getInt(1)+ " "+rs.getString(2));
            // }

        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}


// write code to insert a staff :  Raju 	Lab Assistant	Physics lab	1200	30000