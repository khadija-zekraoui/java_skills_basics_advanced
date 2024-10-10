package dev.lpa;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    //ADD A SONG
    public boolean addSong(String title, double duration) {

        if (findSong(title) == null) {
            songs.add(new Song(title, duration));
            return true;
        }

        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {

        int index = trackNumber - 1;
        if ((index >= 0) && (index <= songs.size())) {
            playList.add(songs.get(index));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playListSongs) {

        if (findSong(title) != null) {
            playListSongs.add(findSong(title));
            return true;
        }

        return false;
    }

    //FIND A SONG
    private Song findSong(String title) {
        Song song = null;
        for (Song listSong: songs) {
            if (listSong.getTitle().equals(title)) {
                song = listSong;
            }
        }
        return song;
    }
}
