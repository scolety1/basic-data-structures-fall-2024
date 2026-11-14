package nov08;

import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithmDemo {
	public static void main(String[] args) {

		int[] array = getRandomArray(5);
		int n = array.length;
		
		System.out.println("Unsorted");
		System.out.println(Arrays.toString(array));
		
		SortingAlgorithm sort = new SortingAlgorithm();
		//sort.bubbleSort(array);
		sort.bubbleSortRecursive(array, n);
		
		System.out.println("Sorted:");
		System.out.println(Arrays.toString(array));
		
		
	}

	public static int[] getRandomArray(int n) {

		int [] array = new int[n];
		Random rand = new Random();
		for(int i = 0; i<array.length; i++) {
			array[i] = rand.nextInt(101);
		}
		return array;
	}

}
