package day09_IfStatements;

public class EligibleToVote {

    public static void main(String[] args) {

        int age = 18;
        boolean isUsCitizen = false;

        if (age >= 18 && isUsCitizen) {
            System.out.println("Is eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

    }
}
