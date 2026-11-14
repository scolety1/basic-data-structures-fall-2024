package passwordguesser;

import java.util.ArrayList;
import java.util.List;

public class PasswordGuesser {

	public static void guessPassword(String password) {
		String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        List<String> permutations = new ArrayList<>();	
        int size = password.length();
        generate_permutations(alphabet, "", permutations, password, size);
        System.out.println("it found that from looking at words from " + permutations.getFirst() + " all the way to " + (permutations.getLast()));
	}
	
	public static boolean generate_permutations(String[] characters, String perm, List<String> list, String password, int size) {
		if(perm.length() == size) {
			list.add(perm);
			if(perm.equals(password)) {
				System.out.println("Your password is: " + password);
				return true;
			}
			return false;
		}
		for (int i = 0; i < characters.length; i++) {
            if (generate_permutations(characters, perm + characters[i], list, password, size)) {
                return true;
            }
        }
		return false;
	}

}
