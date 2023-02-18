//Write a program to sort an array using Bubble Sort Algorithm.
public class Question3 {

	public static void main(String[] args) {
		int [] arr= {12,34,45,32,34,67,12,56,67,90};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length;j++)
			{
				if(arr[j]<arr[j-1])
				{
					int temp= arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		for(int ele : arr)
		{
			System.out.println(ele);
		}

	}

}
