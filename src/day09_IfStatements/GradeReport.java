package day09_IfStatements;

public class GradeReport {

    public static void main(String[] args) {

        int grade = 99;
        char mark;

        if (0 <= grade && grade < 50) {
            mark = 'F';
        } else if (50 <= grade && grade < 60) {
            mark = 'E';
        } else if (60 <= grade && grade < 70) {
            mark = 'D';
        } else if (70 <= grade && grade < 80) {
            mark = 'C';
        } else if (80 <= grade && grade < 90) {
            mark = 'B';
        } else {
            mark = 'A';
        }
        System.out.println("mark = " + mark);
    }
}
