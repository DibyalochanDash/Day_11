package Challenge;

public class Challenge_41_42_43 {
	
	public static void main(String[] args) {
		
		int arr[] = {2,3,4,5,6,2,4,8,9,3,1,2,3};
		
		int target = 3;
		
		FindTargetCount(arr,target); //Create a program to find number of occurrences of an element in an array.
		
		MaximumElementArray(arr);
		MinimumElementArray(arr);
	}

	private static void MinimumElementArray(int[] arr) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum Value in Array is  : " + min);
	}

	private static void MaximumElementArray(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(" Maximum value in Array is  :"+ max);
		
	}

	private static void FindTargetCount(int[] arr, int target) {
		
		int count = 0;
		int i = 0;
		while (i < arr.length) {
			if(arr[i] == target) 
			{
				count++;
			}
			i++;
		}
		System.out.println("No Of Occurance are   :"  + count);
	}

}
