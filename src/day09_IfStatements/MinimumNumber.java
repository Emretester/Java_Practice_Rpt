package day09_IfStatements;

public class MinimumNumber {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        boolean num1IsMin = num1 < num2;
        boolean num2IsMin = num2 < num1;
        boolean equal = num1 == num2;

        if (num1IsMin) {
            System.out.println(num1 + " is minimum number");
        } else if (num2IsMin) {
            System.out.println(num2 + " is minimum number");
        } else {
            System.out.println("equal");
        }

    }
}

/*

		1. Maximum number between two different numbers

 */