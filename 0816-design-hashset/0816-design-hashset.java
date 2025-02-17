class MyHashSet {
    private BitSet bitSet;

    public MyHashSet() {
        bitSet = new BitSet(1000001);
    }
    
    public void add(int key) {
        bitSet.set(key);
    }
    
    public void remove(int key) {
        bitSet.clear(key);
    }
    
    public boolean contains(int key) {
        return bitSet.get(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */