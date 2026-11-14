package nov18;

public class BinarySearch {
	public static void main(String [] args) {
		int[] array = {2, 7, 9, 12, 13, 16, 17, 21 , 25};
		
		int num, answer;
		num = 7;
		answer = binary_search(array, num);
		System.out.println("Iterative binary search " + answer);
		
		answer = binary_search_recursive(array, num, 0, array.length-1);
		System.out.println("Recursive binary search " + answer);
		}

	public static int binary_search(int[] array, int n) {
		int low = 0;
		int high = array.length-1;
		while (low <+ high) {
			int mid = (low + high)/2;
			System.out.println("one loop");
			if(array[mid] == n) {
				return mid;
				}
			
			else if (n > array[mid]) {  // discard the left section
				low = mid+1;
			}
			
			else {
				high = mid -1;
			}
	
		}
		return -1;
	}
	
	private static int binary_search_recursive(int[] array, int n, int low, int high) {
		if (low > high) {
			return -1;
		}
		
		int mid = (low + high)/2;
		
		if (array[mid] ==n) {
			return mid;
		}
		
		else if (n > array[mid]) {
			return binary_search_recursive(array, n, mid + 1, high);
		}
		else {
			return binary_search_recursive(array, n, low, mid - 1);
		}
	}
}
