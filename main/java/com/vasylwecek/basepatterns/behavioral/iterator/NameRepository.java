package main.java.com.vasylwecek.basepatterns.behavioral.iterator;

public class NameRepository implements Container{
    public String [] names = {"Java", "Cpp", "Python", "Php"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator{
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
