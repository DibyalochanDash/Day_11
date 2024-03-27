package Challenge;


public class Challenge_44_45_46 {

	public static void main(String[] args) {
		 int[] sortedArray = {1, 2, 3, 4, 5};
	        int[] unsortedArray = {15, 12, 8, 3, 1};

          boolean res = CheckSortedArrayOrNot(sortedArray);
          System.out.println(res);
          boolean ress = CheckSortedArrayOrNots(unsortedArray); // 	Create a program to check if the given array is sorted.
          System.out.println(ress);
          
          int arrs[] = {1,2,4,5,3,6};
          int target = 3;
          
        int newArray[] =  DeleteElementINArray(arrs,target);
        
        for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i]+" "); //  Create a program to return a new array deleting a specific element.
		}
        System.out.println();
        int array[] = {7,6,5,4,3,2,1}; // Create a program to reverse an array.
       
         for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
        System.out.println();
         int arrays [] = ReverseArraySwapMethod(array);
       for (int i = 0; i < arrays.length; i++) {
		System.out.print(arrays[i]+" ");
	}
        
	}

	private static int[] ReverseArraySwapMethod(int[] array) {
		int i = 0;
		int j = array.length-1;
		
		while (i <= j) {
			Swap(array,i,j);
			i++;
			j--;
		}
		
		return array;
	}

	private static void Swap(int[] array ,int i,int j) {
		int temp = array[i];
		 array[i] = array[j];
		 array[j] = temp;
		
		
	}

	private static int[] DeleteElementINArray(int[] arrs,int target) {
		int count = 0;
		for (int i = 0; i < arrs.length; i++) {
			if (arrs[i] == target) {
				count++;
			}
		}
		
		int[] newArray = new int[arrs.length - count];
        int newIndex = 0;
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i] != target) {
                newArray[newIndex++] = arrs[i];
            }
        }

        return newArray;
    }
		
		
	

	private static boolean CheckSortedArrayOrNots(int[] unsortedArray) {
		for (int i = 1; i < unsortedArray.length; i++) {
			if (unsortedArray[i] > unsortedArray[i - 1]) {
				return false;
			}
		}
		return true;
	}

	
	private static boolean CheckSortedArrayOrNot(int[] sortedArray) {
		  for (int i = 1; i < sortedArray.length; i++) {
			if (sortedArray[i]< sortedArray[i - 1]) {
				return false;
			}
		}
		return true;
	}

}
