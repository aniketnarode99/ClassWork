//Write a program to print Duplicates characters from the String.
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the String");
		String a = sc.nextLine();
		int count =0;
		a=a.replace(" ","");
		//To make String LowerCase
		String s ="";for(int i=0;i<a.length();i++) 
		{
			if(a.charAt(i)>='a' && a.charAt(i)<='z') 
			{
			  s=s+(char)(a.charAt(i));
			}
			else 
			{
			  s=s+(char)(a.charAt(i)+32);
			}
		}
		char[] ch=s.toCharArray();
		System.out.println("Dublicate Charecters are as follows");
		for(int i=0;i<ch.length;i++) 
		{
			for(int j=i+1;j<ch.length;j++) 
			{
				if(ch[i]==ch[j]) 
				{
					System.out.println(ch[j]);
				     count++;
				     break;
				}
			}
		}
		sc.close();

	}

}
