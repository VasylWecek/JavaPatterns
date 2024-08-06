package main.java.com.vasylwecek.basepatterns.structural.facade;

public class SoundSystem {
    public void powerOn(){
        System.out.println("Sound On");
    }

    public void setVolume(int volume){
        System.out.println("Sound Volume Changed");
    }
    public void powerOff(){
        System.out.println("Sound Off");
    }
}
