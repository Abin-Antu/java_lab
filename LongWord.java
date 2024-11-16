
import java.util.*;


public class LongWord {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		String inp = s.nextLine();
		StringTokenizer st =new StringTokenizer(inp," ");
		String longest ="";
		while(st.hasMoreTokens()){
			String word =st.nextToken();
			if(word.length()>longest.length())
			longest =word;
			
		}
		System.out.println("longest woed is "+longest);
	}
}

