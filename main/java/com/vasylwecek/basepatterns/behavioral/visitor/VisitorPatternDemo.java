package main.java.com.vasylwecek.basepatterns.behavioral.visitor;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        Element familyHouse = new FamilyHouse();
        Element bank = new Bank();
        Element factory = new Factory();

        Visitor insuranceAgent = new InsuranceAgent();

        familyHouse.accept(insuranceAgent);
        bank.accept(insuranceAgent);
        factory.accept(insuranceAgent);
    }
}
