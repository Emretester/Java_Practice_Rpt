package day19_LoopPractices;

public class FirstDuplicatedCharacter {

    public static void main(String[] args) {

        String str = "abcddefghhij";
        char firstDublicated = ' ';

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char eachChar = str.charAt(i);

                if (ch == eachChar) {
                    count++;
                }
            }

            if (count > 1) {
                firstDublicated = ch;
                break;
            }

        }

        System.out.println("first = " + firstDublicated);
    }

}

/*
	1. Write a program that can return the first duplicated character from a string

 */