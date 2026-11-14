package program_2;

import java.util.Scanner;


public class Program2Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter playlist size:");
        int playlistSize = scanner.nextInt();

        CircularLinkedList playlist = new CircularLinkedList(playlistSize);

        System.out.println("Here is your playlist:");
        playlist.printLinkedList();

        System.out.println("-------------------");
        System.out.println("Current Song:");
        System.out.println(playlist.currentSong());

        int input;
        do {
            playlist.printMenu();
            input = scanner.nextInt();

            if (input == 1) {
                playlist.playCurrentSong();
            } else if (input == 2) {
                playlist.nextSong();
            } else if (input == 3) {
                playlist.prevSong();
            } else if (input == 4) {
                playlist.removeSong();
            } else if (input == 5) {
                System.out.println("Thanks for listening!");
            } else {
                System.out.println("Invalid option. Please try again.");
            }

            if (input != 5) {
                System.out.println("Current Song: ");
                System.out.println(playlist.currentSong());
            }

        } while (input != 5);

        scanner.close();
    }
}
