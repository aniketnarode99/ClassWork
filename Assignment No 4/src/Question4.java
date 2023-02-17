/*Write a program to count the number of consonants, 
 vowels, special characters in a String.*/

import java.util.*;
public class Question4 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the String");
		String str = sc.nextLine();
		int vowels = 0;
		int consonant = 0;
		int specialChar = 0;  
	    for (int i = 0;i<str.length();i++)
	    {
	     char ch = str.charAt(i);
	     if ((ch>='a'&&ch<='z') || 
	         (ch>='A'&&ch<='Z')) 
	     {
	      ch = Character.toLowerCase(ch);
	      if(ch=='a'||ch=='e'||ch=='i'||ch =='o'||ch=='u')
	          {
	    	  vowels++;
	          }
	       else
	       {
	    	 consonant++;
	       }
	            }
	            
	            else {
	            	specialChar++;
	            }
	                
	        }  
	    
	     System.out.println("Vowels: " + vowels);
	     System.out.println("Consonant: " + consonant);
	     System.out.println("Special Character: " + specialChar);
	     sc.close();
	}

}
