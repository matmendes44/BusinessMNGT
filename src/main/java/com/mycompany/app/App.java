package com.mycompany.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //Creating object that will be used later
        Scanner scan = new Scanner(System.in);
        DbAccess DbObject = new DbAccess();
        
        //Welome Page
        System.out.println("========================================");
        System.out.println("  WELCOME! WHAT WOULD YOU LIKE TO DO?\n");
        System.out.println("""
                           1: Create a customer
                           2: Create an Invoice
                           3: View Invoice List
                           4: View Customer List""");
        System.out.println("========================================\n");

        int menuChoice = scan.nextInt();

       if (menuChoice == 1){    //Option for adding a new client into the Database
            Customer newCustomer = new Customer();
            DbObject.createCustomer(newCustomer);   
       }
       else if(menuChoice == 2){
        
       }


    
    }
        
    }

