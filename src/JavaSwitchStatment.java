import java.util.Scanner;

public class JavaSwitchStatment {
    public static void main(String[] args) {

//        Enter a number 1-12 for finding months name;
        Scanner input = new Scanner(System.in);

//        Store the user input number in any variable
        System.out.println("Enter a number 1-12 for finding months name;");

        int userNumber = input.nextInt();

//        So, lets start switch statement for finding a months name

        switch (userNumber) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sept");
                break;
            case 10:
                System.out.println("oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("Invaild Number " + userNumber + " Plz enter 1-12 number.");
        }
    }
}
