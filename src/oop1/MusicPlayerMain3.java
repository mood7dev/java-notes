package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.on();
        player.volumeUp();
        player.volumeUp();
        player.showStatus();
        player.volumeDown();
        player.showStatus();
        player.off();
        player.showStatus();
    }
}

