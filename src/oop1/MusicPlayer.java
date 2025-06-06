package oop1;

public class MusicPlayer {

    int volume = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("시작");
    }

    void off() {
        isOn = false;
        System.out.println("종료");
    }

    void volumeUp() {
        volume++;
        System.out.println("볼륨: " + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("볼륨: " + volume);
    }

    void showStatus() {
        System.out.println("상태 확인");
        if (isOn) {
            System.out.println("ON, 볼륨: " + volume);
        } else {
            System.out.println("OFF");
        }
    }
}