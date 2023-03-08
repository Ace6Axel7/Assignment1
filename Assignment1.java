/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment1;

/**
 *
 * @author Absalom
 */
import java.util.Scanner;
public class Assignment1 {

    public static void main(String[] args)
    {
      Scanner scanner = new Scanner(System.in);
      Scanner myObj = new Scanner(System.in);// Create a Scanner object
      System.out.println("Enter your Array max size:");//Asking the user to enter max array size
      int maxSize = myObj.nextInt(); //Making user input Equals to maxSize
      ClassDataArray arr = new ClassDataArray(maxSize);  //reference to array and create the array
      
      boolean open = false;
      while(!open)
      {
          System.out.println("\nChoose an option to do?"); // Asking a user to choose an option to do
          System.out.println("1. Insert a Person");
          System.out.println("2. Display the array");
          System.out.println("3. Serarch for a person");
          System.out.println("4. Dlelete a person");
          System.out.println("5. Quit");
          int choice =scanner.nextInt();
          switch(choice)
              
          {   case 1:
              System.out.println("Enter last name");
              String lastName=scanner.next();
              System.out.println("Enter first name");// Prompting a user to enter persorn detailsz
              String firstName=scanner.next();
              System.out.println("Enter age");
              int age=scanner.nextInt();
              arr.insert(lastName, firstName, age);
              break;
              
              case 2:
                  System.out.println("\nDisplaying array contents:");
              arr.displayA(); 
              break;
              
              case 3:  
              Scanner mySearch = new Scanner(System.in);
              System.out.println("\nEnter a name to Search:");  //Asking a user to search for item
              String searchKey =mySearch.nextLine();  
              Person found;
              found=arr.find(searchKey);
              if(found != null)
             {
              System.out.print("Found ");
              found.displayPerson();
             }
              else
              System.out.println("Can't find " + searchKey);
               break;
              case 4:
                   Scanner myDelete = new Scanner(System.in);
                   System.out.println("\nEnter a name to Delete:"); //Asking a user to enter a name to delete
                   String deleteKey=myDelete.nextLine();
                   arr.delete(deleteKey);
      
                 System.out.println("\nDisplaying array contents after deletion:");
                 arr.displayA();     
               break;
              case 5:
                  open=true;
               break;
              default:
                  System.out.println("Please enter a valid choice");
                  break;
                }
            }
            scanner.close();
        }
    }
}