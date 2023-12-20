package day19_LoopPractices;

public class IndexOfFirstUniqueCharacter {

    public static void main(String[] args) {

        String str = "aabbcddefghhij";
        int indexOfFirstUnique = 0;
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char eachChar = str.charAt(i);

                if (ch == eachChar) {
                    count++;
                }
            }

            if (count == 1) {
                indexOfFirstUnique = j;
                break;
            }

        }

        System.out.println("indexOfFirstUnique = " + indexOfFirstUnique);
    }
}

/*
	4. Write a program that can return the index number of the first unique character.

 */