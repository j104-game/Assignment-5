/*
for this one, if you remember, I asked you to come up with a 'reason' for a function and implement it. 
Now you get to do it! yay!!!!!
please go a little more complex than just simple math/simple printing for the function
feel free to google some inspiration though :)
*/

import java.util.Scanner;

public class functions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Character Generator!");
        System.out.println("Choose your character class:");
        System.out.println("1. Warrior");
        System.out.println("2. Mage");
        System.out.println("3. Archer");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        int health = getHealth(choice);
        int attack = getAttack(choice);

        System.out.println("");
        System.out.println("Your character has been created!");
        System.out.println("Health: " + health);
        System.out.println("Attack Power: " + attack);

        if (choice >= 1 && choice <= 3) {
            System.out.println("Good luck on your adventure!");
        } else {
            System.out.println("You didn't choose a valid class!");
        }
    }

    public static int getHealth(int choice) {

        if (choice == 1) {
            return 150;
        } else if (choice == 2) {
            return 80;
        } else if (choice == 3) {
            return 100;
        } else {
            return 0;
        }
    }

    public static int getAttack(int choice) {

        if (choice == 1) {
            return 25;
        } else if (choice == 2) {
            return 40;
        } else if (choice == 3) {
            return 30;
        } else {
            return 0;
        }
    }
}