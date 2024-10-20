package dev.lpa.model;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    public static class SongList {

        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(Song song) {

            if (findSong(song.getTitle()) == null) {
                songs.add(song);
                return true;
            }
            return false;
        }

        private Song findSong(String title) {
            for (Song song : songs) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            for (Song song : songs) {
                if (index <= songs.size() && song.equals(songs.get(index))) {
                    return song;
                }
            }

            System.out.printf("This album does not have a track %d%n", trackNumber);
            return null;
        }

    }

    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    //ADD A SONG
    public boolean addSong(String title, double duration) {

        return songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {

        Song song = songs.findSong(trackNumber);
        if (song != null) {
            playList.add(song);
            return true;
        }

        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playListSongs) {

        Song song = songs.findSong(title);
        if (song != null) {
            playListSongs.add(song);
            return true;
        }
        System.out.printf("The song %s is not in this album%n", title);
        return false;
    }
}
