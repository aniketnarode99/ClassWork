//Write a program to find the duplicates present in an array.
public class Question1 {

	public static void main(String[] args) {
		int arr[]= {12,34,45,32,34,67,12,56,67,90};
		boolean flag = false;
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]==arr[j]) 
				{
					System.out.println(arr[i]);
					flag =true;
				}	
			}
		}
		if(flag==false)
		 System.out.println("Given Array doen not contain any Duplicates");
	}
}
