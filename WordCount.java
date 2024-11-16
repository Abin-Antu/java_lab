import java.util.*;
import java.io.*;
public class WordCount
{
public static void main(String[] args) throws IOException
{
 Scanner s = new Scanner(System.in);
 System.out.println("enter a string:");
 String S = s.nextLine();
 StringTokenizer st = new StringTokenizer(S," ");
 int count=0;
 while(st.hasMoreTokens())
 {
 st.nextToken();
 count++;
 }
 FileWriter f=new FileWriter("WordCount.txt");
 f.write("Word Count: " + count);
 f.close();
}
}

