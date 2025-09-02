//package task2;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class Task2 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        Random rand = new Random();
//
//        int guess = rand.nextInt(100) + 1;
//        int attempts = 5; 
//
//        System.out.println("Welcome to the Number Guessing Game!");
//        System.out.println("I have selected a number between 1 and 100. Can you guess it?");
//        System.out.println("You have " + attempts + " attempts.");
//        System.out.println();
//        
//        
//        while (attempts > 0) {
//            System.out.print("Enter your guess: ");
//            
//            if (!input.hasNextInt()) {
//                System.out.println("Invalid input! Please enter a number.");
//                System.out.println();
//                input.next();
//                continue;
//            }
//
//            int num = input.nextInt();
//            
//            
//            if (num < 1 || num > 100) {
//                System.out.println("Please enter a number between 1 and 100!");
//                System.out.println();
//                continue; 
//            }
//
//            if (num == guess) {
//                System.out.println("Congratulations! You guessed the number correctly.");
//                System.out.println();
//                return;
//            } else if (num > guess) {
//                System.out.println("Too high!");
//                System.out.println();
//            } else {
//                System.out.println("Too low!");
//                System.out.println();
//            }
//
//            
//            attempts--;
//            
//            if (attempts > 0) {
//                System.out.println("You have " + attempts + " attempts left.");
//            } else {
//                System.out.println("Game over! The correct number was " + guess + ".");
//            }
//        }
//    }
//}
