package main.java.com.github.raffoulricardo;

import main.java.com.github.raffoulricardo.entities.ConstructorEntity;

import java.util.Locale;
import java.util.Scanner;

public class Constructor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ConstructorEntity p = new ConstructorEntity();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        ConstructorEntity constructorEntity = new ConstructorEntity(name, price);

        System.out.println();
        System.out.println("Product data: " + constructorEntity);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        constructorEntity.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + constructorEntity);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        constructorEntity.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + constructorEntity);

        sc.close();
    }
}
