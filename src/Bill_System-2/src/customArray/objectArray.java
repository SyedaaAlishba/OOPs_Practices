package customArray;


import java.util.Arrays;

public class objectArray {
    Object[] array;
    int capacity;
    int size; //how many items are currently stored
    boolean isDynamic;

    //for static
    public objectArray(int capacity){
        this.capacity=capacity;
        this.size=0;
        this.array= new Object[capacity];
        this.isDynamic=false;
    }
    //for dynamic
    public objectArray(){
        this.capacity=10;
        this.size=0;
        this.array= new Object[capacity];
        this.isDynamic=true;
    }

    public void add(Object object){
        if(!isDynamic) {
            if (this.size < this.capacity) {
                this.array[size] = object;
                size++;
            }
        }else {
            if (size == capacity) {
                expandCapacity();
            }
            array[size]=object;
            size++;
        }
    }
    public void expandCapacity(){
        capacity= capacity*2;
        Object[] newArray= new Object[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i]=array[i];
        }
        array=newArray;
    }

    public Object get(int index){
        if(index<this.size && index>=0 ){
            return array[index];
        }
        return null;
    }

    public void set(int index, Object value) {
        if (index >= 0 && index < size) {
            array[index] = value;
        }
    }

    public int getSize() {
        return size;
    }

    public void delete(Object object){
        int i= search(object);
        if (i == -1) {
            return; // not found
        }
        array[i]=null;
        //shift every element to left
        for (int j = i; j < size-1; j++) {
            array[j]=array[j+1];
        }
        array[size-1]=null;
        size--;
    }

    public int search (Object object){
        for (int i = 0; i < size; i++) {
            if (object.equals(array[i])) {
                return i;
            }
        }
        return -1; // not found
    }

    @Override
    public String toString() {
        return "customArray{" +
                "array=" + Arrays.toString(array) +
                ", capacity=" + capacity +
                ", size=" + size +
                '}';
    }
}