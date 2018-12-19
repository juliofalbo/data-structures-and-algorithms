package datastructure.array;

/**
 * @param <T>
 * @author Julio Falbo
 */
public class DynamicArray<T> {

    private T[] data;
    private int size;
    private int initialCapacity;

    public DynamicArray(int initialCapacity) {
        data = (T[]) new Object[initialCapacity];
        size = 0;
        this.initialCapacity = initialCapacity;
    }

    public T get(int index) {
        return data[index];
    }

    public void set(int index, T object) {
        data[index] = object;
    }

    public void add(T object) {
        validateCapacityAndResizeIfNecessary();
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = object;
                size++;
                break;
            }
        }
    }

    public void insert(int index, T object) {
        validateCapacityAndResizeIfNecessary();
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        set(index, object);
        size++;
    }

    public void delete(int index) {
        for (int i = index; i < size; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(T object) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(object)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return this.size;
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(data[i]);
        }
    }

    private void resize() {
        int newInitialCapacity = initialCapacity * 2;
        T[] newData = (T[]) new Object[newInitialCapacity];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];

        }
        data = newData;
        initialCapacity = newInitialCapacity;
    }

    private void validateCapacityAndResizeIfNecessary() {
        if(size + 1 > data.length){
            resize();
        }
    }

}
