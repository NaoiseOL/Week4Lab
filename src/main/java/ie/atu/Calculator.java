package ie.atu;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        multiply();
        add();
        divide();
        subtract();
    }

    public static void add() {
        System.out.println("Adding Function\n");

        System.out.println("Please enter your first number");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please enter your second Number");
        int secondNumber = inputs.nextInt();

        int total = firstNumber + secondNumber;
        System.out.println("The total is "+total);

    }
    public static void multiply() {
        System.out.println("Multiplying function\n");

        System.out.println("Please enter your first number");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please enter your second Number");
        int secondNumber = inputs.nextInt();

        int total = firstNumber * secondNumber;
        System.out.println("The total is "+total);

    }

    public static void divide(){
        System.out.println("Division Function\n");

        System.out.println("Please enter your first number");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please enter your second Number");
        int secondNumber = inputs.nextInt();

        int total = firstNumber / secondNumber;
        System.out.println("The total is "+ total);
    }

    public static void subtract(){
        System.out.println("Subtracting Function\n");

        System.out.println("Please enter your first number");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please enter your second number");
        int secondNumber = inputs.nextInt();

        int total = firstNumber - secondNumber;
        System.out.println("The total is "+ total);
    }

    public static void delete(){

    }

}
