/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class main {
    public static void main(String[] args) {
         Book b = new Book();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title: ");
        String title = sc.nextLine();
        System.out.print("Enter price: ");
        int price = sc.nextInt();
        System.out.println("1. Test getTitle()");
        System.out.println("2. Test setPrice()");
        System.out.print("Enter TC (1 or 2): ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("OUTPUT:");
                b.setTitle(title);
                System.out.println(b.getTitle());
                break;
            case 2:
                System.out.print("Enter new price: ");
                int newPrice = sc.nextInt();
                System.out.println("OUTPUT:");
                b.setPrice(newPrice);
                System.out.println(b.getPrice()); 
                break;
        }
    }
}
