package com.mycompany.app;

import java.util.Scanner;

public class Invoice{

    private float price;

    public Invoice(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Invoice Total: ");
        this.price = scan.nextFloat();

    }



    


}