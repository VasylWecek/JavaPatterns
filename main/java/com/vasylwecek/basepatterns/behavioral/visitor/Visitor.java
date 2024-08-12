package main.java.com.vasylwecek.basepatterns.behavioral.visitor;

public interface Visitor {
    void visit(FamilyHouse familyHouse);
    void visit(Bank bank);
    void visit(Factory factory);
}
