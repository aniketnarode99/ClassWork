//Write a program to check whether an array is a subset of another array.
public class Question6 {
	
	public static void main(String args[])
	{
		int arr1[] = { 11, 1, 13, 21, 3, 7 };
		int arr2[] = { 11, 3, 7};
		boolean flag = false;

		
		int i = 0;
		int j = 0;
		for (i = 0; i < arr2.length; i++) 
		{
			for (j = 0; j < arr1.length; j++) 
			{
				if (arr2[i] == arr1[j]) 
				{
				  break;
				}
				flag = true;
			}
			    if (j == arr1.length) 
			    {
				 flag = false;
			    }
		    
		}
		
		
		if(flag)
			{
			System.out.print("arr2[] is " + "subset of arr1[] ");}
		else
			{
			System.out.print("arr2[] is " + "not a subset of arr1[]");
			}
	}
}
