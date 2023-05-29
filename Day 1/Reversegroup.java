import java.util.*;
class Reversegroup
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int n= s.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the elements of array");
		for(int i=0; i<n; i++)
		{
			arr[i] = s.nextInt();
		}
		System.out.println("Array: ");
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+ " ");
		}

		System.out.println("\nenter the group of array:");
		int group = s.nextInt();
		for(int i=0; i<n; i=i+group)
		{
			int left = i;
			int right = Math.min(i+group-1, n-1);
			
			while(left<right)
			{
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;

				left++;
				right--; 
			}
		}
		System.out.println("Reverse array in group: ");
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
	}
}
