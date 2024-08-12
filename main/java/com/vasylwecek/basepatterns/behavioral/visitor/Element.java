package main.java.com.vasylwecek.basepatterns.behavioral.visitor;

public interface Element {
    void accept(Visitor visitor);
}
