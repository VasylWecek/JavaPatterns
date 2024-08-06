package main.java.com.vasylwecek.basepatterns.structural.composite;

import java.awt.*;

public class ArmyDemo {
    public static void main(String[] args) {
        Soldier soldier1 = new Soldier("Soldier 1");
        Soldier soldier2 = new Soldier("Soldier 2");
        Soldier soldier3 = new Soldier("Soldier 3");


        CompositeUnit platoon1 = new CompositeUnit("Platoon 1");
        platoon1.addUnit(soldier1);
        platoon1.addUnit(soldier2);

        CompositeUnit platoon2 = new CompositeUnit("Platoon 2");
        platoon2.addUnit(soldier3);

        CompositeUnit regiment = new CompositeUnit("Regiment 3");
        regiment.addUnit(platoon1);
        regiment.addUnit(platoon2);

        CompositeUnit army = new CompositeUnit("Army");
        army.addUnit(regiment);

        army.executeOrder("Attack");
    }
}
