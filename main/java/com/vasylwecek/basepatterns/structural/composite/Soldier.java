package main.java.com.vasylwecek.basepatterns.structural.composite;

public class Soldier implements MilitaryUnit{
    private String name;

    public Soldier(String name) {
        this.name = name;
    }

    @Override
    public void executeOrder(String order) {
        System.out.println("Soldier " + name + " executes order " + order);
    }
}
