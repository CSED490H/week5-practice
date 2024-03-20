import java.util.ArrayList;

public class CustomStack<E> implements Stack<E> {
    private ArrayList<E> list;
    private int capacity;
    //@ invariant: ???

    public CustomStack() {
        list = new ArrayList();
    }
    
    //@ requires: element != null
    //@ ensures: size < capacity, old(size) + 1 = size
    public boolean add(E element) {
        // ???
    }

    //@ requires: o != null
    //@ ensures: true
    public boolean contains(Object o) {
        // ???
    }

    //@ requires: ???
    //@ ensures: ???
    public boolean isEmpty() {
        return list.size() == 0;
    }
    
    //@ requires: o != null
    //@ ensures: ???
    public boolean remove(Object o) {
        return list.remove(o);
    }
}