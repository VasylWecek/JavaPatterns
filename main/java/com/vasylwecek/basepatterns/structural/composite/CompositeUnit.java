package main.java.com.vasylwecek.basepatterns.structural.composite;
import java.util.List;
import java.util.ArrayList;
public class CompositeUnit implements MilitaryUnit {
    private String name;
    private List<MilitaryUnit> units = new ArrayList<>();

    public CompositeUnit(String name) {
        this.name = name;
    }

    public void addUnit(MilitaryUnit unit) {
        units.add(unit);
    }

    public void removeUnit(MilitaryUnit unit) {
        units.remove(unit);
    }

    @Override
    public void executeOrder(String order) {
        System.out.println(name + " execute order: " + order);
        for (MilitaryUnit unit : units) {
            unit.executeOrder(order);
        }
    }
}
