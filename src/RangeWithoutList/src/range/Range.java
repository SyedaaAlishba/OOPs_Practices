package range;

import java.util.Iterator;


public class Range implements Iterable<Integer> {

    private   final int  start, stop,step;
    private final int length;

    public Range(int start,int stop,int step){
        this.start= start;
        this.step= step;
        this.stop= stop;
        this.length = calculateLength(start, stop, step);
    }


    private static int calculateLength(int start, int stop, int step) {
        if (step > 0) {
            return Math.max(0, (stop - start + step - 1) / step);
        } else if (step<0){
            int posStep = -step;
            return Math.max(0, (start - stop + posStep - 1) / posStep);
        }else{
            throw new IllegalArgumentException("Step cannot be 0");
        }
    }

    // getters
    public int getStart() { return start; }
    public int getStop()  { return stop; }
    public int getStep()  { return step; }
    public int getLength(){ return length; }



    public int getValue(int k) {
        if (k < 0 || k >= length) {
            throw new IndexOutOfBoundsException("Index " + k + " out of range");
        }
        return start + k * step;
    }


    @Override
    public Iterator<Integer> iterator() {
        return  new Iterator<>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < length;
            }

            @Override
            public Integer next() {
                int value = start + index * step;
                index++;
                return value;

            }
        };
    }
    public String toString(){
        return  "Start :"+ getStart() +"\nStop :" +getStop()+ "\nStep :" + getStep();
    }

}
