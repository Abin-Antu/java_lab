import java.util.*;

class Date {
    int dd;
    int mm;
    int  yy;

    // Default constructor
    Date() {
        dd = 2;
        mm = 11;
        yy = 2024;
        System.out.println("Today's date is: " + dd + "/" + mm + "/" + yy);
    }

    // Parameterized constructor
    Date(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }

    // Method to print the date
    void printdata() {
        System.out.println("Entered date is: " + dd + "/" + mm + "/" + yy);
    }

    // Method to check if the year is a leap year
    void isLeap() {
        if ((yy % 4 == 0 && yy % 100 != 0) || yy % 400 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}

public class Calender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating and displaying default date
        Date dat = new Date();

        // Taking user input for custom date
        System.out.print("Enter the day: ");
        int a = sc.nextInt();
        System.out.print("Enter the month: ");
        int b = sc.nextInt();
        System.out.print("Enter the year: ");
        int c = sc.nextInt();

        // Closing the scanner to prevent resource leaks
        sc.close();

        // Creating a date object with user input and checking leap year
        Date dat1 = new Date(a, b, c);
        dat1.printdata();
        dat1.isLeap();
    }
}
