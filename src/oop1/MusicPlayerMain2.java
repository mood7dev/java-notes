package oop1;

public class MusicPlayerMain2 {

    public static void main(String[] args) {

        MusicPlayerData data = new MusicPlayerData();
    
    int volume = 0;
    boolean isOn = false;

//음악 플레이어 켜기
    on(data);

    // 볼륨증가
    volumeUp(data);

    // 볼륨증가
    volumeUp(data);

    // 볼륨감소
    volumeDown(data);

    // 음악 플레이어 상태
    showStatus(data);

    // 음악 플레이어 끄기
        off(data);
    }

        static void on(MusicPlayerData data) {
            data.isOn = true;
            System.out.println("시작");

    }
        static void off(MusicPlayerData data) {
            data.isOn = false;
            System.out.println("종료");
    }
    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("볼륨" + data.volume);
    }
    static void volumeDown (MusicPlayerData data) {
        data.volume--;
        System.out.println("볼륨" + data.volume);
    }
        static void showStatus(MusicPlayerData data) {
            System.out.println("상태 확인");
            if (data.isOn) {
                System.out.println("ON, 볼륨: " + data.volume);
            } else {
                System.out.println("OFF");
         }
    }
}



