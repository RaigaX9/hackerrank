import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SongOfPi {
	   public static void main(String[] args){
		    int i;
		    int k;
		    int s;
		    int z;
		    String pi = "31415926535897932384626433833";
		    String[] pispl = pi.split("");
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        in.nextLine();
	        for(int j = 1; j <= n; j++)
	        {
	        	
	        	String phrase = in.nextLine();
		        String[] words = phrase.split(" ");
		        int[] song1 = new int[words.length];
	        	int[] song2 = new int[words.length];
	
		        for(i = 0; i < words.length; i++)
		        {	
		        	//System.out.print(words[i].length());
		        	song1[i] = words[i].length();
		        	
		        	song2[i] = Integer.parseInt(pispl[i]);
		        	
		        }

		        if(Arrays.toString(song1).equals(Arrays.toString(song2))){
	        		System.out.println("It's a pi song.");
	        	}
	        	else{
	        		System.out.println("It's not a pi song.");
	        	}
	        }
	   }
}
