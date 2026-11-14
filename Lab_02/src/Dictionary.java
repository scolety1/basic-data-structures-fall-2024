import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Dictionary {
    private String[] words;

    public Dictionary() {
        this.words = readFromFile();  // Initialize the array with the file content
    }

    private String[] readFromFile() {
        String[] words = new String[41193];  // Predefined size of the array
        
        try {
        	FileReader file = new FileReader("words.txt");  // Open the file
        	Scanner input_file = new Scanner(file);
        	int i = 0;
        	while(input_file.hasNextLine()) {
        		String line = input_file.nextLine();
        		words[i] = line;
        		i++;
        	}
            input_file.close();
        } catch (FileNotFoundException e) {
			e.printStackTrace();
        
        }
		Arrays.sort(words);

        return words;
    }

    public String firstWord() {
        return words[0];  // First word in sorted array
    }

    public String lastWord() {
        return words[words.length - 1];  // Last word in sorted array
    }

    public String longestWord() {
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public int countByLetter(char inputLetter) {
        int count = 0;
        for (String word : words) {
            if (word.charAt(0) == inputLetter) {
                count++;
            }
        }
        return count;
    }
}
