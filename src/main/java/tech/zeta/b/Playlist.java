package tech.zeta.b;
import java.util.LinkedList;

class Playlist {
    private LinkedList<String> songs;

    public Playlist() {
        songs = new LinkedList<>();
    }

    public void addSongToEnd(String song) {
        songs.addLast(song);
        System.out.println(song + " added to the end of the playlist.");
    }

    public void addSongToBeginning(String song) {
        songs.addFirst(song);
        System.out.println(song + " added to the beginning of the playlist.");
    }

    public void removeSong(String song) {
        if (songs.remove(song)) {
            System.out.println(song + " removed from the playlist.");
        } else {
            System.out.println(song + " not found in the playlist.");
        }
    }

    public void displayPlaylist() {
        System.out.println("\nCurrent Playlist:");
        for (String song : songs) {
            System.out.println("- " + song);
        }
    }
}

