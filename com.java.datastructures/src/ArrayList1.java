import java.util.Arrays;

public class ArrayList1<T> {
    private Object[] arr;
    private int capacity;
    private int size;

    public ArrayList1() {
        this.capacity = 10;
        this.size = 0;
        this.arr = new Object[this.capacity];
    }

    public ArrayList1(int size) {
        this.capacity = this.size;
        this.size = 0;
        this.arr = new Object[this.capacity];
    }

    private void grow() {
        this.capacity = 2*this.capacity;
        this.arr = Arrays.copyOf(this.arr, capacity);
    }

    public void add (T element) {
        if(this.size == this.capacity) {
            this.grow();
        }
        this.arr[this.size++] = element;
    }

    public T get(int index) throws ArrayIndexOutOfBoundsException{
        if(index >= size) throw new ArrayIndexOutOfBoundsException();
        return (T)this.arr[index];
    }

    public void set(int index, T element) throws ArrayIndexOutOfBoundsException {
        if(index >= size) throw new ArrayIndexOutOfBoundsException();
        this.arr[index] = element;
    }

    public void remove(int index) throws ArrayIndexOutOfBoundsException {
        int j = index + 1;
        while(j < this.size) {
            this.set(index, this.get(j));
            index++;
            j++;
        }
        size--;
    }

    public String toString() {
        String s = "[";
        for(int i = 0; i < size; i++) {
            s += this.get(i).toString();
            s += (i == (size - 1))? "": ", ";
        }
        s += "]";
        return s;
    }

    public int size() {
        return this.size;
    }

}
