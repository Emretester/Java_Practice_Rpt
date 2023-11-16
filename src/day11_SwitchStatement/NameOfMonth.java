package day11_SwitchStatement;

public class NameOfMonth {

    public static void main(String[] args) {

        int number = 13;
        String name = "";

        if (number >= 1 && number <= 12) {

            switch (number) {

                case 1:
                    name = "January";
                    break;

                case 2:
                    name = "February";
                    break;

                case 3:
                    name = "March";
                    break;

                case 4:
                    name = "April";
                    break;

                case 5:
                    name = "May";
                    break;

                case 6:
                    name = "June";
                    break;

                case 7:
                    name = "July";
                    break;

                case 8:
                    name = "August";
                    break;

                case 9:
                    name = "September";
                    break;

                case 10:
                    name = "November";
                    break;

                case 11:
                    name = "October";
                    break;

                default:
                    name = "December";


            }
        } else {
            name = "invalid";
        }

        System.out.println(name);
    }
}

/*

1. NameOfMonth  (1~12)

 */