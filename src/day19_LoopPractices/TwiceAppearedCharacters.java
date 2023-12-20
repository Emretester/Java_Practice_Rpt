package day19_LoopPractices;

public class TwiceAppearedCharacters {

    public static void main(String[] args) {

        String str = "abcddeefghhij";
        String twiceAppeared = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char eachChar = str.charAt(i);

                if (ch == eachChar) {
                    count++;
                }
            }

            if (count > 1 && !twiceAppeared.contains(ch + "")) {
                twiceAppeared += ch;
            }

        }

        System.out.println("twiceAppeared = " + twiceAppeared);
    }
}

/*
	3. Write a program that can display all the characters that appeared twice in the string.

 */