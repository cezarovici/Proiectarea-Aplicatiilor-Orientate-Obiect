import java.util.Vector;
import java.util.Collections;
public class SortedVector extends Vector {
    @Override
    public void addElement(Object obj) {
        super.addElement(obj);
        Collections.sort(this);
    }

    @Override
    public void insertElementAt(Object obj, int poz){
        super.insertElementAt(obj,poz);
        Collections.sort(this);
    }
}
