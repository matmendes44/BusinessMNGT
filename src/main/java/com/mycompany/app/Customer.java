package com.mycompany.app;

import java.util.Scanner;

public class Customer{

    private String first_name;
    private String last_name;
    private String phone_number;
    private String email;
    private String address;


    public Customer(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the First Name:    ");
        this.first_name = scan.nextLine();

        System.out.println("Enter the Last Name:    ");
        this.last_name = scan.nextLine();

        System.out.println("Enter the Phone Number:     ");
        this.phone_number = scan.nextLine();

        System.out.println("Enter a Valid Email address:    ");
        this.email = scan.nextLine();

        System.out.println("Enter a vaild Address:  ");
        this.address = scan.nextLine();

    }

    public void displayInfo(){
        System.out.println(first_name + "first name");
        System.out.println(last_name + "last name");
        System.out.println(phone_number + "phone");
        System.out.println(email + "email");
        System.out.println(address + "address");
    }

    //Getters for the five variables 
    public String getFirstName(){
        return this.first_name;
    }
    public String getLastName(){
        return this.last_name;
    }
    public String getPhoneNumber(){
        return this.phone_number;
    }
    public String getEmail(){
        return this.email;
    }
    public String getAddress(){
        return this.address;
    }

    

}