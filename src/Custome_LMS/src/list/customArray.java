package list;

public class customArray {
    Object[] array;
    int capacity;
    int size; //how many items are currently stored
    boolean isDynamic;

    //for static
    public customArray(int capacity){
        this.capacity=capacity;
        this.size=0;
        this.array= new Object[capacity];
        this.isDynamic=false;
    }
    //for dynamic
    public customArray(){
        this.capacity=2;
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
        System.out.println("ARRAY LENGHT" + array.length);

    }

    public int getCapacity() {
        return capacity;
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
           System.out.println("Not Found");
           return; // not found
       }
       //shift every element to left
       for (int j = i; j < size-1; j++) {
           array[j]=array[j+1];
       }
       array[size-1]=null;
       size--;
    }

    //insert
    public void add(int index, Object object) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if (size == capacity) {
            expandCapacity();
        }

        // shift elements to the right
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }

        array[index] = object;
        size++;
    }

    public int search (Object object){
        for (int i = 0; i < size; i++) {
            if (object.equals(array[i])) {
                return i;
            }
        }
        System.out.println("Not Found");
        return -1; // not found
    }
    public Object search(int index) {
        if (isExist(index)) {
            return array[index];   // return the object stored at that index
        } else {
            System.out.println("Invalid index");
            return null;
        }
    }
    public boolean isExist(int index) {
        if( index >= 0 && index < size){
            return true;
        }
       return false;
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);  // calls Student.toString()
            if (i < size - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
