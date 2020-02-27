import java.util.Scanner;

public class ReverseProgram {

    String str1;

    void print(String str) {
        System.out.println(str);
    }

    public static void main(String args[]) {
        ReverseProgram reverseProg = new ReverseProgram();
        Scanner keyBoard = new Scanner(System.in);
        reverseProg.print("Enter a string input: ");
        String str1 = keyBoard.nextLine();
        reverseProg.print("This is your string: " + str1);
        keyBoard.close();
        String parts[] = str1.split(" ", 3);
        String ans = ""; 
        for (int i = parts.length - 1; i >= 0; i--) { 
             ans += parts[i] + " "; 
         } 
         System.out.println("String Output:"); 
         System.out.println(ans.substring(0, ans.length() - 1)); 

        // String part1 = parts[0];
        // String part2 = parts[1];
        // String part3 = parts[2];
        // reverseProg.print(part3 +" "+ part2 +" "+ part1);
        
    }

    

   
}

// public class ReverseProgram { 
  
//     public static void main(String[] args) 
//     { 
//         String s[] = "i like this program very much".split(" "); 
//         String ans = ""; 
//         for (int i = s.length - 1; i >= 0; i--) { 
//             ans += s[i] + " "; 
//         } 
//         System.out.println("Reversed String:"); 
//         System.out.println(ans.substring(0, ans.length() - 1)); 
//     } 
// } 