/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nya;

import java.util.Scanner;

/**
 *
 * @author Dazte
 */
public class NYA {
    

    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Your name ?");
        String name = sc.nextLine();
        
        System.out.println("Birth year ?");
        int yob = Integer.parseInt(sc.nextLine());
        int age = 2025 - yob;
        
        System.out.println("Hello " + name + ", You were born in: " + yob + " and currently you are " + age + " years old" );
    }
}
