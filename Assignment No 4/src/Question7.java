//Write a program to find if String contains all unique character
import java.util.Scanner;
public class Question7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the String");
		String str1 = sc.nextLine();
		String str ="";
		str1.replace(" ","");
		boolean flag = false;
		//to make string lowerCase
		for(int i=0;i<str1.length();i++) 
		{
			if(str1.charAt(i)>='a' && str1.charAt(i)<='z') 
			{
			  str=str+(char)(str1.charAt(i));
			}
			else 
			{
			  str=str+(char)(str1.charAt(i)+32);
			}
		}
		
		for (int i = 0; i < str.length(); i++) 
		{
			for (int j = i + 1; j < str.length(); j++) 
			{
				if (str.charAt(i) == str.charAt(j)) {
					flag=true;
				}
			}		
		}	
         if(flag) {
           System.out.println( "Given String has duplicate characters ");
         }
		 else {
		   System.out.println(" Given String has all unique characters ");
		 }
			sc.close();
		

	}

}
