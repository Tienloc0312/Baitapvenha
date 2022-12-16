/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

import Q1.Book;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class main {
     public static void main(String[] args) {
        Car car = new Car();
        SpecCar scar = new SpecCar();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter maker: ");
        String maker = sc.nextLine();
        System.out.print("Enter price: ");
        int price = sc.nextInt();
        System.out.print("Enter type: ");
        int type = sc.nextInt();
        System.out.println("1. Test toString()");
        System.out.println("2. Test setDate");
        System.out.println("2. Test getValue()");
        System.out.print("Enter TC (1, 2, 3): ");
        int choice = sc.nextInt();
        car.setMaker(maker);
        car.setPrice(price);
        scar.setMaker(maker);
        scar.setPrice(price);
        scar.setType(type);
        switch(choice){
            case 1:
                System.out.println("OUTPUT:");
                System.out.println(car.toString());
                System.out.println(scar.toString());
                break;
            case 2:
                scar.setData();
                break;
            case 3:
                System.out.println(scar.getValue());
                break;
        }
    }
}
