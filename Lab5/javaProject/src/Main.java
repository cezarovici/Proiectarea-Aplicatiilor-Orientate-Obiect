import java.util.BitSet;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        // problem 1
        /// Vector as member
        SetAsVector vector = new SetAsVector(new Vector());
        vector.add(10);
        vector.add(20);
        vector.remove(20);
        System.out.println(vector.contains(10));

       System.out.println( vector.toString());


       // Extends the vector class

        SetAsVectorExtends vectorExtends = new SetAsVectorExtends();
        vectorExtends.add(10);
        vectorExtends.add(20);

        vectorExtends.remove((Object)20);
        vectorExtends.contains(10);


        // problem 2

        SortedVector sortedVector = new SortedVector();
        sortedVector.addElement(10);
        sortedVector.addElement(20);
        sortedVector.addElement(-5);
        sortedVector.insertElementAt(9999,0);
        System.out.println(sortedVector.toString());

        // problem 3

        IntSet bitSet = new IntSet(new BitSet());
        bitSet.set(2,false);
        bitSet.set(1,false);
        bitSet.set(0,true);

        System.out.println(bitSet.get(0));

        // problem 4

        Graph graph = new Graph();
    }
}