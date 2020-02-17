import java.util.Scanner;

public class DayFinder {
    public static void main(String[] args) {
        int date;
        System.out.print("Enter a date in Feb 2020: ");
        Scanner input = new Scanner(System.in);
        
        date = input.nextInt();
        

        if (date < 1 || date > 29) {
            System.out.println("Invalid date!");
            return;
        }

        if (date%7 == 1) {
            System.out.println("Input " + date + " Output " + " Saturday");
        } else if (date % 7 == 2) {
            System.out.println("Input " + date + " Output " + " Sunday");
        } else if (date % 7 == 3) {
            System.out.println("Input " + date + " Output " + " Monday");
        } else if (date % 7 == 4) {
            System.out.println("Input " + date + " Output " + " Tuesday");
        } else if (date % 7 == 5) {
            System.out.println("Input " + date + " Output " + " Wednesday");
        } else if (date % 7 == 6) {
            System.out.println("Input " + date + " Output " + " Thursday");
        } else if (date % 7 == 0) {
            System.out.println("Input " + date + " Output " + " Friday");
        }

    }
}
