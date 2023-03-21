public class IntSet{
    private java.util.BitSet intSet;

    public IntSet(java.util.BitSet bitSet) {
        this.intSet = bitSet;
    }


    public boolean get(int bitIndex) {
        return intSet.get(bitIndex);
    }

    public void set(int bitIndex, boolean value) {
        intSet.set(bitIndex);
    }
}
