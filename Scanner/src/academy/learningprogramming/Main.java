package academy.learningprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scanner.nextInt(); scanner.nextLine();
        if (age < 0) {
            System.out.println("invalid age: " + age);
            return ;
        }
        System.out.println("Enter your Name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name + " and your age is " + age);

        scanner.close();
    }
}
