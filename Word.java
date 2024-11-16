import java.util.*;
import java.io.*;

public class Word {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string:");
        String S = s.nextLine();
        
        // Correctly create StringTokenizer
        StringTokenizer st = new StringTokenizer(S, " ");
        
        int count = 0;
        while (st.hasMoreTokens()) {
            st.nextToken();
            count++;  // Added missing semicolon
        }

        // FileWriter should include parentheses for close()
        FileWriter f = new FileWriter("Count.txt");
        f.write("Word count: " + count);
        f.close();  // Added missing parentheses
        s.close();  // Close the scanner to avoid resource leak
    }
}
