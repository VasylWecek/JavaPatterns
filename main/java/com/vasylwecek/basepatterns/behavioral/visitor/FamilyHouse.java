package main.java.com.vasylwecek.basepatterns.behavioral.visitor;

import javax.print.FlavorException;

public class FamilyHouse implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
