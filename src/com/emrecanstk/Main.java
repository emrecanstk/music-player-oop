package com.emrecanstk;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album album = new Album("Album1","Eray Uraz");
        album.addSong("Milimetrik Atis",3.5);
        album.addSong("Tam Kafadan",3.11);
        album.addSong("Koy",4.2);
        albums.add(album);

        album = new Album("Mancoloji","Baris Manco");
        album.addSong("Hal Hal",3.7);
        album.addSong("Gul Pembe",3.4);
        album.addSong("Nazar Eyle",4.5);
        album.addSong("Donence",3.9);
        album.addSong("Halil Ibrahim Sofrasi",3.2);
        albums.add(album);

        LinkedList<Song> playList_1 = new LinkedList<>();
        albums.get(0).addToPlayList("Milimetrik Atis",playList_1);
        albums.get(0).addToPlayList("Koy",playList_1);
        albums.get(1).addToPlayList("Donence",playList_1);
        albums.get(1).addToPlayList("Hal Hal",playList_1);

        play(playList_1);

    }



}
