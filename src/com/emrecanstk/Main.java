package com.emrecanstk;

import java.util.ArrayList;
import java.util.Iterator;
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

    private static void play(LinkedList<Song> playList) {

    }

    private static void printMenu() {
        System.out.println("Available options\n press");
        System.out.println("0 for quit\n"+
                "1. play next song\n"+
                "2. play previous song\n"+
                "3. replay the current song\n"+
                "4. list of all songs\n"+
                "5. print all available options\n"+
                "6. delete current song");
    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("-------------------------");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-------------------------");
    }

}
