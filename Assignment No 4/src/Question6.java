//WAP to implement Panagrame Checking with least inbuilt methods being used.
public class Question6 {

	public static void main(String[] args) {
		String s1 = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		s1=s1.replace(" ", "");
		char[]ch =s1.toCharArray();
		int []ar = new int[26];
		boolean key =false;
		for(int i=0;i<ch.length;i++) 
		{
			int index =ch[i]-65;
			ar[index]++;	
		}
		for(int i=0;i<ar.length;i++) 
		{
			if(ar[i]==0) {
				System.out.println("Given String is not panagrame");
				key=true;
			}	
		}
		if(key==false)
			System.out.println("Given String is panagrame");
		

	}

}
