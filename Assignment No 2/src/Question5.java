//Write a program to sort an array using Selection Sort Algorithm
public class Question5{
	
	public static void main(String args[])
	{
		int arr[] = {22,55,33,44,11,88,77};

		for (int i = 0; i < arr.length-1; i++)
		{
			int min = i;
			for (int j = i+1; j < arr.length; j++)
				if (arr[j] < arr[min])
					min = j;

			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		
		
		System.out.print("Sorted array : "+ arr.length);
		for (int ele : arr)
			System.out.print(ele+" ");
	}
}



