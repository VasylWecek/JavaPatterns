package main.java.com.vasylwecek.basepatterns.structural.facade;

public class DVDPlayer {
    public void powerOn(){
        System.out.println("DVDPlayer on");
    }
    public void playDVD() {
        System.out.println("Playing DVD");
    }
    public void powerOff(){
        System.out.println("DVDPlayer off");
    }

}
