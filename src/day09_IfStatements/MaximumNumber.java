package day09_IfStatements;

public class MaximumNumber {

    public static void main(String[] args) {

        int num1 = 50;
        int num2 = 50;

        boolean num1IsMax = num1 > num2;
        boolean num2IsMax = num2 > num1;
        boolean equal = num1 == num2;

        if (num1IsMax) {
            System.out.println(num1 + " is maximum number");
        } else if (num2IsMax) {
            System.out.println(num2 + " is maximum number");
        } else {
            System.out.println("equal");
        }

    }
}

/*

		1. Maximum number between two different numbers

 */