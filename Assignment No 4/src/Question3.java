//WAP to check if “2552” is palindrome or not.
public class Question3 {

	public static void main(String[] args) {
		String s1 ="2552";
		String s2 ="";
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		System.out.println("Given String : " +s1);
		System.out.println("Reversed String : "+s2);
		if(s1.equals(s2)) {
			System.out.println("Given String is palindrome");
			
		}
		else {
			System.out.println("Given String is not palindrome");
		}

	}

}
