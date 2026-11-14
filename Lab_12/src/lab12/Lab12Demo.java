package lab12;

import java.util.Arrays;

public class Lab12Demo {

    public static void main(String[] args) {
        System.out.println("Dictionary Word Search");
        String[] dictionary = {"Abstruse", "Benevolent", "Cacophony", "Conundrum", "Cynical", "Dichotomy", "Elucidate", "Facetious", "Ineffable", "Juxtaposition", "Mellifluous", "Obfuscate", "Serendipity", "Tenacious", "Ubiquitous"};
        String word;
        int index;

        System.out.println(Arrays.toString(dictionary));
        System.out.println("----------------------------------------------------------------");

        word = "Conundrum";
        index = binary_search(dictionary, word);
        System.out.println("\"" + word + "\" is located at index: " + index);

        word = "Ubiquitous";
        index = binary_search(dictionary, word);
        System.out.println("\"" + word + "\" is located at index: " + index);

        word = "Juxtaposition";
        index = binary_search(dictionary, word);
        System.out.println("\"" + word + "\" is located at index: " + index);

        word = "Paradigm";
        index = binary_search(dictionary, word);
        System.out.println("\"" + word + "\" is located at index: " + index);
    }

	public static int binary_search(String[] array, String n) {
		int low = 0;
		int high = array.length-1;
		while (low <= high) {
			int mid = (low + high)/2;
			int comparision = n.compareTo(array[mid]);
			
			if(comparision == 0) {
				return mid;
				}
			
			else if (comparision > 0) {  // discard the left section
				low = mid+1;
			}
			
			else {
				high = mid -1;
			}
	
		}
		return -1;
	}

}