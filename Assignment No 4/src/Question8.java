//Write a program to  find the maximum occurring character in a String.
import java.util.Scanner;
public class Question8 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the String");
		String s = sc.nextLine();
	   int [] arr=new int[256];
	   s=s.replace(" ", "");
	   for(int i=0;i<s.length();i++) 
	   {
		   arr[s.charAt(i)]++;
	   }
	   int max = -1;
	   char maxChar = ' ';

	   for (int i = 0; i <s.length(); i++) 
	   {
	    if (max < arr[s.charAt(i)]) 
	    {
	     max = arr[s.charAt(i)];
	     maxChar = s.charAt(i);
	    }
	   }
	   System.out.println("maximun occurring charecter is : " +maxChar);
	sc.close();
	}

}
