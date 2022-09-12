package com.luigii.testmod;
// First ever java program :D
import java.util.Scanner;

public class testmod {

    public static void main(String[] args){

        int points = 0;
        int answer1 = 64;
        String answer2 = "creeper";
        boolean answer3 = true;

        Scanner scanner = new Scanner(System.in); // input for user

        System.out.print("How much items fits in a stack: ");
        int question1 = scanner.nextInt();

        if (question1 == answer1){
            System.out.println("The answer is correct! the answer was "+ answer1);
            points++; // adds 1 point
            System.out.println("You`re points: "+points);
        }
        else {
            System.out.println("Saik! that`s the wrong answer! the right answer is: "+answer1);
            System.out.println("You`re points: "+points);
        }


        System.out.print("What entity is green and explodes when u are too close: ");
        String question2 = scanner.next().toLowerCase();

        if (question2.equals(answer2)) {
            System.out.println("The answer is correct! the answer was "+answer2);
            points++;
            System.out.println("You`re points: "+points);
        }
        else {
            System.out.println("Saik! that`s the wrong answer! the right answer is: "+answer2);
            System.out.println("You`re points: "+points);
        }

        System.out.print("Is java hard to learn? True/False: ");
        boolean question3 = scanner.nextBoolean();

        if (question3 == answer3){
            System.out.println("The answer is correct! the answer was "+answer3);
            points++;
            System.out.println("You`re points: "+points);
        }
        else {
            System.out.println("U fucking nerd ");
            points++;
            System.out.println("You`re points: "+points);
        }

    }
}

