//Write a program to remove Duplicates from a String.(Take any String ex with duplicates character)
import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the String");
		String s = sc.nextLine();
		   int [] arr=new int[256];
		   for(int i=0;i<s.length();i++) 
		   {
			   arr[s.charAt(i)]++;
		   }
		   int max = -1;
		   String s1="";
		    for (int i = 0; i <s.length(); i++) 
		   {
		    if (max < arr[s.charAt(i)]) 
		    {
		     max = arr[s.charAt(i)];
		     s1=s.replace(s.charAt(i),' ');
		    }
		   }
		   System.out.println("Given String is :"+ s);
		   System.out.println("Dublicates removed String is :"+ s1);
	sc.close();
	}

}
