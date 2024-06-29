/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sms;

import java.util.Scanner;

/**
 *
 * @author Shawn Arunjith
 */
public class SMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             StudentService service = new StudentServiceImpl();
        
  
        Scanner scanner = new Scanner(System.in);
        SmsDisplay.display();
        System.out.println("Enter your Choice");
        int choice = scanner.nextInt();
        
  
        switch (choice) {
                case 1:
                    service.saveStudent();
                    break;
                 case 2:
                  System.out.println("2");
                     break;
                 case 3:
                     System.out.println("3");
                     break;
                 case 4:
                    System.out.println("4");
                     break;
                 case 5:
                    System.out.println("");
                     break;
                case 6:
                    // Exit the application.
                    System.exit(0);
                    break;
                default:
                    System.out.print("\033[H\033[2J");
                    System.out.println("Invalid option. Please enter a valid option between 1 and 6.");
                     SmsDisplay.display();
            }
    }
    
}
