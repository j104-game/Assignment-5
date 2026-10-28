/*
Referencing your homework from https://github.com/melissachodziutko/CMPT-220/blob/main/Assignment%203/Debug.java
Can you take problems 2, 3, and 5 and turn them into methods, and then call those methods in main?
Things that may trip you up while working on this:
1. the code works the same whether it's in a method or not, it just needs some minor variable adjustments probably
2. be wary of opening and closing brackets!! 
3. methods can't go inside methods!
4. methods go outside public static main, but inside public class main!
5. do you need to return the value? if so, make sure it isn't void

I give you two fully working method examples with and without parameters and called them for your reference :)
*/

import java.util.Scanner;
public class debug {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    System.out.println("Enter your first number to be added");
    int firstInput = sc.nextInt();
    System.out.println("Enter your second number to be added");
    int secondInput = sc.nextInt();
    //remember this method is returning, so we need to print it out
    System.out.println(add(firstInput,secondInput));

    System.out.println("im going to print out the word Dog now.");
    printDog();
      
    System.out.println("Enter a number to receive the factorial of it");
    factorial();

    System.out.println("Enter a number and I will tell you the sum of every other number: ");
    everyOther();

    System.out.println("Enter a string and I will reverse it: ");
    reverseString();
    }

  
    public static int add(int zyx, int tuv){


        return(zyx + tuv);


    }

  
    public static void printDog(){
        System.out.println("Dog");
    }

    public static int factorial(){

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int factorial = 1;
        
        for (int i = 1; i <= number; i++){
            factorial = factorial * i;
        }
        System.out.println("The factorial of " + number + " is: " + factorial);
        return factorial;
    }

    public static int everyOther(){
        
        Scanner sc = new Scanner(System.in);
        int secondNumber = sc.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= secondNumber; i += 2){
            sum = sum + i;
        }
        System.out.println("The sum of every other number is: " + sum);
        return sum;
    }

    public static String reverseString(){
        
        Scanner sc = new Scanner(System.in);
        String reverse = "";
        
        String input = sc.next();
        
        for (int i = input.length() - 1; i >= 0; i--){
            reverse += input.charAt(i);
        }
        
        System.out.println("The reversed string is: " + reverse);
        return reverse;
    }
}