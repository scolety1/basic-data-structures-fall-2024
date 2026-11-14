package program_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class CircularLinkedList {

    public Node head;
    public Node tail;
    private int size;
    private ArrayList<Node> allSongs;
    private Clip currentClip;  
    
    public CircularLinkedList(int playlistSize) {
        this.head = null;
        this.tail = null;
        this.size = 0;
        this.allSongs = new ArrayList<>();
        loadSongs();
        createPlaylist(playlistSize);
    }

    private void loadSongs() {
        try (Scanner input = new Scanner(new FileReader("songs.txt"))) {
            while (input.hasNext()) {
                String line = input.nextLine();
                String[] value = line.split(",");
                
                String title = value[0];
                String composer = value[1];
                String musicPath = value[2];

                Node newNode = new Node(title, composer, musicPath);
                allSongs.add(newNode);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void createPlaylist(int playlistSize) {
        Collections.shuffle(allSongs);

        for (int i = 0; i < playlistSize; i++) {
            Node current = allSongs.get(i);
            if (head == null) {
                head = current;
                tail = current;
                head.setNext(head);
                head.setPrev(tail);
            } else {
                tail.setNext(current);
                current.setPrev(tail);
                tail = current;
                tail.setNext(head);
                head.setPrev(tail);
            }
        }
    }

    public void printLinkedList() {
        int counter = 1;
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        Node current = head;

        do {
            System.out.println(counter + ". " + current.getData());
            current = current.getNext();
            counter += 1;
        } while (current != head);
    }

    public String currentSong() {
        return head.getData();
    }

    private void stopCurrentClip() {
        if (currentClip != null && currentClip.isRunning()) {
            currentClip.stop();
        }
    }

    public void playCurrentSong() {
        if (head == null) {
            System.out.println("No songs in the playlist");
            return;
        }

        stopCurrentClip();

        File input = new File(head.getMusicPath());

        try {
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(input);
            currentClip = AudioSystem.getClip();
            currentClip.open(audioInput);
            currentClip.start();

            Scanner s = new Scanner(System.in);
            System.out.println("Press 1 to stop the song.");
            int response = s.nextInt();
            if (response == 1) {
                currentClip.stop();
            }

        } catch (Exception e) {
            System.out.println("Error playing music...");
        }
    }

    public String nextSong() {
        if (head == null) {
            return "No songs in the playlist";
        }

        stopCurrentClip();

        head = head.getNext();
        System.out.println("Now playing: " + head.getData());
        playCurrentSong();
        return head.getData();
    }

    public String prevSong() {
        if (head == null) {
            return "No songs in the playlist";
        }

        
        stopCurrentClip();

        head = head.getPrev();
        System.out.println("Now playing: " + head.getData());
        playCurrentSong();
        return head.getData();
    }

    public void removeSong() {
        if (head == null) {
            System.out.println("No songs to remove.");
            return;
        }

        if (head == tail) { 
            System.out.println("Last song removed. Playlist is empty.");
            head = null;
            tail = null;
            currentClip = null;
            size = 0;
            return;
        } else {
           
            Node nextSong = head.getNext();
            tail.setNext(nextSong);
            nextSong.setPrev(tail);
            head = nextSong; 
        }

        size--;
        System.out.println("Song removed. Now playing: " + head.getData());
    }


    public void printMenu() {
        System.out.println("-------------------");
        System.out.println("1: Play current song");
        System.out.println("2: Next Song: ");
        System.out.println("3: Previous song");
        System.out.println("4: Remove current song");
        System.out.println("5: Quit playlist");
    }
}
