//Write a program to sort an array using Quick Sort Algorithm.

public class Question2 {

	
	static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static int partition(int[] arr, int low, int high)
	{

		
		int pivot = arr[high];

		
		int i = (low - 1);

		for (int j = low; j <= high - 1; j++) {

			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);
	}

	static void quickSort(int[] arr, int low, int high)
	{
		if (low < high) 
		{
			int pi = partition(arr, low, high);

			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

	public static void main(String[] args)
	{
		int[] arr = { 40,60,20,50,90,100,10,30,80,70 };

		System.out.println("Given array: ");
		for (int ele : arr)
			System.out.print(ele + " ");
		System.out.println();
		
		quickSort(arr, 0, arr.length - 1);
		System.out.println("Sorted array: ");
		for (int ele : arr)
			System.out.print(ele + " ");

	}
}

