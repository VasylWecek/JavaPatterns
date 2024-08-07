package main.java.com.vasylwecek.basepatterns.behavioral.iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext(); ) {
            String name = (String) iterator.next();
            System.out.println(name);
        }
    }
}
