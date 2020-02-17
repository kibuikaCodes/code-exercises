// Simple Hello World program
// public class HelloWorld {
//     public static void main (String [] args) {
//         System.out.println("Hello World");
//     }
// };

import java.util.Scanner;
// The same program with scanner
public class HelloWorld {
    public static void main (String [] args)
    // void is a return type
    // main is the name of the method and it must be in small letters
    // the main method accepts some parameters
    
    {
        System.out.println("Enter name");
        Scanner input = new Scanner(System.in);
        // The scanner scans for inputs
        String name = input.nextLine();
        // after pressing enter, the input is collected and stored in the variable 'name'
        input.close();

        System.out.println("Hello: " + name);
    };
};