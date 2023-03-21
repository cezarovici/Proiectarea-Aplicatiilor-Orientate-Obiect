import java.util.Vector;
// With Vector member
public class SetAsVector {
    private Vector<Object> vector;

    public SetAsVector(Vector<Object> objects) {
        vector = objects;
    }

    public boolean add(Object o) {
        if (vector.contains(o)){
            return false;
        }

        vector.add(o);
        return true;
    }

    public boolean remove(Object o) {
       if (vector.contains(o)){
           vector.remove(o);
           return true;
        }

       return false;
    }

    public boolean contains(Object o){
        return vector.contains(o);
    }

    public String toString(){
        return vector.toString();
    }
}

