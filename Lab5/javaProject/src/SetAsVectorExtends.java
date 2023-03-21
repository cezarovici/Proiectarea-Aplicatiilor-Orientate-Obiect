import java.util.Vector;

public class SetAsVectorExtends extends Vector {
    @Override
    public synchronized boolean add(Object o) {
        return super.add(o);
    }

    @Override
    public boolean remove(Object o) {
        return super.remove(o);
    }

    @Override
    public boolean contains(Object o) {
        return super.contains(o);
    }

    @Override
    public synchronized String toString() {
        return super.toString();
    }
}
