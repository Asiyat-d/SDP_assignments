package SDP_4;

public class Main {
    public static void main(String[] args) {
        States.MediaPlayer player = new States.MediaPlayer();
        player.pressPlay();  // "Запуск плеера."
        player.pressPause(); // "Приостановка плеера."
        player.pressPlay();  // "Возобновление плеера."
        player.pressStop();  // "Остановка плеера."
    }
}
