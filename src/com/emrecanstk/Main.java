package com.emrecanstk;

public class Main {

    public static void main(String[] args) {

        Album album = new Album("Album1","Eray Uraz");
        album.addSong("Milimetrik Atis",3.5);
        album.addSong("Tam Kafadan",3.11);
        album.addSong("Koy",4.2);

        Album album2 = new Album("Mancoloji","Baris Manco");
        album.addSong("Hal Hal",3.7);
        album.addSong("Gul Pembe",3.4);
        album.addSong("Nazar Eyle",4.5);
        album.addSong("Donence",3.9);
        album.addSong("Halil Ibrahim Sofrasi",3.2);
    }
}
