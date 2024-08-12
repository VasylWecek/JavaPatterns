package main.java.com.vasylwecek.basepatterns.behavioral.visitor;

public class Factory implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
