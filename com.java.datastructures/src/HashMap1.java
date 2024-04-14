import java.util.HashMap;

class MapEntry<K, V> {
    private K key;
    private V value;

    public MapEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        return result;
    }

}

class Node<K, V> {
    private MapEntry<K, V> entry;
    private Node<K, V> next;
    public MapEntry<K, V> getEntry() {
        return entry;
    }
    public void setEntry(MapEntry<K, V> entry) {
        this.entry = entry;
    }
    public Node<K, V> getNext() {
        return next;
    }
    public void setNext(Node<K, V> next) {
        this.next = next;
    }
    public Node(MapEntry<K, V> entry) {
        this.entry = entry;
        this.next = null;
    }
    
    
}

public class HashMap1<K, V> {
    private Node<K, V>[] arr;
    private int size;
    private int capacity;

    public HashMap1() {
        this.size = 0;
        this.capacity = 10;
        arr = new Node[this.capacity];
    }

    public HashMap1(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        arr = new Node[this.capacity];
    }

    private void grow() {
        
    }



}
