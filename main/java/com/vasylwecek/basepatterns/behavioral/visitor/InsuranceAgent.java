package main.java.com.vasylwecek.basepatterns.behavioral.visitor;

public class InsuranceAgent implements Visitor {
    @Override
    public void visit(FamilyHouse familyHouse) {
        System.out.println("Insurance Agent is a Family House");
    }

    @Override
    public void visit(Bank bank) {
        System.out.println("Insurance Agent is a Bank");

    }

    @Override
    public void visit(Factory factory) {
        System.out.println("Insurance Agent is a Factory");

    }
}
