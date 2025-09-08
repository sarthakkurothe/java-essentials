package tech.zeta.b;

public class PlaylistDemo {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.addSongToEnd("Shape of You");
        playlist.addSongToEnd("Believer");
        playlist.addSongToBeginning("Perfect");
        playlist.addSongToEnd("Blinding Lights");
        playlist.addSongToBeginning("Photograph");

        playlist.displayPlaylist();

        playlist.removeSong("Believer");
        playlist.displayPlaylist();
    }
}