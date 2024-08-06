package main.java.com.vasylwecek.basepatterns.structural.facade;

public class HomeTheaterFacade {
    private TV tv;
    private DVDPlayer dvdPlayer;
    private SoundSystem soundSystem;

    public HomeTheaterFacade(TV tv, DVDPlayer dvdPlayer, SoundSystem soundSystem) {
        this.tv = tv;
        this.dvdPlayer = dvdPlayer;
        this.soundSystem = soundSystem;

    }

    public void watchMovie(String movie) {
        System.out.println("Preparing to watch movie...");
        tv.powerOn();
        dvdPlayer.powerOn();
        soundSystem.powerOn();
        soundSystem.setVolume(5);
        dvdPlayer.playDVD();
    }

    public void endMovie(){
        System.out.println("Preparing to end movie...");
        dvdPlayer.powerOff();
        soundSystem.powerOff();
        tv.powerOff();
    }
}
