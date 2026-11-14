package data;

import java.io.*;
import java.util.ArrayList;

public class DataHandler {

	public static final String FILE_NAME = "users.txt";
	
	public static void loadUsers(User user) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
			writer.write(user.toString());
			writer.newLine();
			writer.write("---");
			writer.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void saveUser()
}
