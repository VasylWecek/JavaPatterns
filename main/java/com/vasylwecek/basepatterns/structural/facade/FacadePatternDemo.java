package main.java.com.vasylwecek.basepatterns.structural.facade;

public class FacadePatternDemo {
    public static void main(String[] args) {
        TV tv = new TV();
        DVDPlayer dvdPlayer = new DVDPlayer();
        SoundSystem soundSystem = new SoundSystem();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(tv, dvdPlayer, soundSystem);


        homeTheaterFacade.watchMovie("Ghoost");
    }
}
