package customArray;

import java.util.Arrays;

public class intArray {
    int[] array;
    int capacity;
    int size;
    boolean isDynamic;

    //for static
    public intArray(int capacity){
        this.capacity=capacity;
        this.size=0;
        this.array= new int[capacity];
        this.isDynamic=false;
    }

    //for dynamic
    public intArray(){
        this.capacity=10;
        this.size=0;
        this.array= new int[capacity];
        this.isDynamic=true;
    }

    public void add(int value){
        if(!isDynamic) {
            if (this.size < this.capacity) {
                this.array[size] = value;
                size++;
            }
        }else {
            if (size == capacity) {
                expandCapacity();
            }
            array[size]=value;
            size++;
        }
    }
    public void expandCapacity(){
        capacity= capacity*2;
        int[] newArray= new int [capacity];
        for (int i = 0; i < size; i++) {
            newArray[i]=array[i];
        }
        array=newArray;
    }

    public int get(int index){
        if(index<this.size && index>=0 ){
            return array[index];
        }
        return -1;
    }

    public void set(int index, int value) {
        if (index >= 0 && index < size) {
            array[index] = value;
        }
    }

    public int getSize() {
        return size;
    }

    public void delete(int value){
        int i= search(value);
        if (i == -1) {
            return; // not found
        }
        array[i]=-1;
        //shift every element to left
        for (int j = i; j < size-1; j++) {
            array[j]=array[j+1];
        }
        array[size-1]=-1;
        size--;
    }

    public int search (int value){
        for (int i = 0; i < size; i++) {
            if (value==array[i]) {
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