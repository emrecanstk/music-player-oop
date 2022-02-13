package com.emrecanstk;

import java.util.*;

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
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0) System.out.println("This play list have no song.");
        else {
            System.out.println("Now playing "+listIterator.next().toString());
            printMenu();
        }
        while(!quit) {
            int action = sc.nextInt();
            sc.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Play list complete.");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing "+listIterator.next().toString());
                    }
                    else {
                        System.out.println("No song available, reached to the end of the list.");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing "+listIterator.previous().toString());
                    }
                    else {
                        System.out.println("This is first song.");
                        forward = false;
                    }
                    break;
                case 3:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now playing "+listIterator.previous().toString());
                            forward = false;
                        }
                        else {
                            System.out.println("We are at the start of list.");
                        }
                    }
                    else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing "+listIterator.next().toString());
                            forward = true;
                        }
                        else {
                            System.out.println("We have reached to the end of list.");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size() > 0) {
                        listIterator.remove();
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing "+listIterator.next().toString());
                        }
                        else {
                            if(listIterator.hasPrevious())
                            System.out.println("Now playing "+listIterator.previous().toString());
                        }
                    }
            }
        }
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
