package org.example;
import java.util.Scanner;

public class RoleChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter role: ");
        String role = input.nextLine();
        role = role.toLowerCase();
        if (role.equals("admin")) {
            System.out.println("Welcome Admin");
        }else if (role.equals("superuser")) {
            System.out.println("welcome Superuser");
        }else  if (role.equals("user")) {
            System.out.println("welcome User");
        }

    }
}