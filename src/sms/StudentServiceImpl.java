
package sms;
import java.util.Scanner;
import java.sql.*;

public class StudentServiceImpl implements StudentService {
  private static DbConfig dbconfig= DbConfig.getInstance();
    Scanner input = new Scanner(System.in);
    
    @Override
    public void saveStudent() {
        System.out.print("\033[H\033[2J");
        System.out.println("\t--------- * ---------");
        System.out.println("\t     Add Student      ");
        System.out.println("\t--------- * ---------");
        
        System.out.print("Enter Your name : ");
        String name = input.nextLine();
       
        System.out.print("\nEnter Your Department : ");
        String department = input.nextLine();
        
        System.out.print("\nEnter Your District : ");
        String district = input.nextLine();
        
        System.out.print("\nEnter Your Nic : ");
        String nic = input.nextLine();
        
        System.out.print("\nEnter Your Gender : ");
        String gender = input.nextLine();
        
        System.out.print("\nEnter Your Performance : ");
        int performance = input.nextInt();
        
        System.out.print("\nEnter Your Age : ");
        int age = input.nextInt();

        
        System.out.println(name+" "+age+" "+department+" "+district+" "+nic);
        
        String sql="INSERT INTO student (name,age,department,district,nic,gender,performance)"
                + " VALUES (?,?,?,?,?,?,?)";
             
        try (Connection con = dbconfig.dbConnction()) {
            
            PreparedStatement ps=con.prepareStatement(sql);
            
                ps.setString(1, name);
                ps.setInt(2, age);
                ps.setString(3, department);
                ps.setString(4, district);
                ps.setString(5, nic);
                ps.setString(6, gender);
                ps.setInt(7, performance);
                
           int row= ps.executeUpdate();
            System.out.println(row);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    
   
    
}
