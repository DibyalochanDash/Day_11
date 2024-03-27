package Challenge;


public class Challenge_47_48_49_50 {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,2,1};   // Create a program to check is the array is palindrome or not.
		
		String result = ArrayPalindrome(arr);
		System.out.println(result);  // Out put  : Palindrome
		
		
		 int[] arr1 = {1, 3, 5, 7, 9};
	        int[] arr2 = {2, 4, 6, 8, 10};

	        int[] mergedArray = mergeSortedArrays(arr1, arr2);
             for (int i = 0; i < mergedArray.length; i++) {
            	 System.out.print( mergedArray[i]+" ");
			}
	        System.out.println();
             
             int[][] array = {   //Create a program to search an element in a 2-D array.
                     {1, 2, 3},
                     {4, 5, 6},
                     {7, 8, 9}
                 };

                 int target = 5;

                 int[] results = searchElementIn2DArray(array, target);

                 if (results != null) {
                     System.out.println("Element " + target + " found at position: (" + results[0] + ", " + results[1] + ")");
                 } else {
                     System.out.println("Element " + target + " not found in the array.");
                 } 
             
                 
                 System.out.println();
                 
                 
                 
                 int[][] arrays = {
                         {1, 2, 3},
                         {4, 5, 6},
                         {7, 8, 9}
                     }; //  Create a program to do sum and average of all elements in a 2-D array.
                 
                 
                 TwoDArraySumAndAverage(arrays);
                 
                 System.out.println();
                 
                 
                 
                 int[][] Array = {
                         {1, 2, 3},
                         {4, 5, 6},
                         {7, 8, 9}
                     };

                     int sums = sumOfDiagonalElements(Array);

                     System.out.println("Sum of diagonal elements: " + sums);  //Create a program to find the sum of two diagonal elements.
                 
                     
       
	}

	private static int sumOfDiagonalElements(int[][] Array) {
		    int sums = 0;
		    
		    for (int i = 0; i < Array.length; i++) {
				sums = sums + Array[i][i];
		
			sums  = sums + Array[i][Array.length - 1 - i];
			}
		    int middle = Array.length /2;
		    sums = sums - Array[middle][middle];
		return sums;
		
		
		
	}

	private static void TwoDArraySumAndAverage(int[][] arrays) {
		int sum = 0;
		int count = 0;
		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays[i].length; j++) {
				sum = sum + arrays[i][j];
				count ++;
			}
		}
		System.out.println(sum);
		System.out.println(" Average : "+ sum / count);
	}

	
	
	
	private static int[] searchElementIn2DArray(int[][] array, int target) {
		
		int row = array.length;
		int col = array[0].length;
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (array[i][j] == target) {
					return new int[] {i,j};
				}
			}
		}
		
		
		return null;
	}

	private static int[] mergeSortedArrays(int[] arr1, int[] arr2) {   // 	Create a program to merge two sorted arrays.
		
		int newArray[] = new int[arr1.length + arr2.length];
		
		int i = 0 ,j = 0, k = 0;
		
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				newArray[k++] = arr1[i++];
			}else {
				newArray[k++] = arr2[j++];
			}
		}
		
		while (i < arr1.length) {
			newArray[k++] = arr1[i++];
		}
		
		while (j < arr2.length) {
			newArray[k++] = arr2[j++];
		}
	  return newArray;
		
	}

	private static String  ArrayPalindrome(int[] arr) {
		int i = 0;
		int j = arr.length-1;
		while (i <= j) {
			if (arr[i] != arr[j]) {
				return "Not Palindrome";
			}
			i++;j--;
		}
		return "Palindrome";
	}

}
