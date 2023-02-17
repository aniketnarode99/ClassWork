//Write a program to implement Anagram Checking least inbuilt methods being used.
import java.util.Arrays;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the First String");
		String s1 = sc.nextLine();
		System.out.println("Please Enter the Second String");
		String s2 = sc.nextLine();
		String s11 ="";
		String s21 ="";
		//TO lower the String
		for(int i=0;i<s1.length();i++) 
		{
			if(s1.charAt(i)>='a' && s1.charAt(i)<='z') 
			{
			  s11=s11+(char)(s1.charAt(i));
			}
			else 
			{
			  s11=s11+(char)(s1.charAt(i)+32);
			}
		}
		for(int i=0;i<s2.length();i++) {
			if(s2.charAt(i)>='a' && s2.charAt(i)<='z') 
				{
				  s21=s21+(char)(s2.charAt(i));
				}
				else 
				{
				  s21=s21+(char)(s2.charAt(i)+32);
				}
		}
	
		
		//Store the String into Array
		char [] ch1 =s11.toCharArray();
		char [] ch2 =s21.toCharArray();
		
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		
		if(Arrays.equals(ch1, ch2)) 
		{
			System.out.println("Given Strings are Anagram");
		}
		else 
		{
			System.out.println("Given Strings are not Anagram");
		}
		sc.close();
	}
}

