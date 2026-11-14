package nov08;

public class SortingAlgorithm {
	// O(n^2)  where n = length of array
	public void bubbleSort(int[] array) {
		
		int n = array.length;
		
		for(int i = 0; i < n - 1; i ++) { 
			
			for(int j = 0; j < n - 1 - 1; j++) {
				
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
				
				
			}
		}
	}
	
	public void bubbleSortRecursive(int[] array, int n) {
		//base case
		if(n==1) {
			return;
		}
		
		//recursive case
		for(int i = 0; i< n - 1; i++) {
			if(array[i] > array[i+1]) {
				int temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;
						
			}
		}
		bubbleSortRecursive(array, n - 1);
	}
}
