package day19_LoopPractices;

public class IndexOfFirstDublicatedCharacter {

    public static void main(String[] args) {

        String str = "abcdeefghhij";
        int indexOfFirstDublicated = 0;

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
                indexOfFirstDublicated = j;
                break;
            }

        }

        System.out.println("indexOfFirstDublicated = " + indexOfFirstDublicated);
    }
}

/*
	2. Write a program that cna return the index number of the first duplicated character from a string

 */