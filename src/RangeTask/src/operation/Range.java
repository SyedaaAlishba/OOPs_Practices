package operation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Range implements  Iterable<Integer>{
    private int start;
    private int stop;
    private int step;

    private List<Integer> range = new ArrayList<>();

    public Range(int str, int step, int stp){
        this.start= str;
        this.step=step;
        this.stop= stp;
        buildRange();
    }
    public Range(){
        this(0,1,5);

    }
    
    private void buildRange(){
        range.clear(); //clear previous values
       if(step>0){
           for (int i = start; i < stop; i+=step) {
               range.add(i);
           }
       }else if (step < 0) {
           for (int i = start; i > stop; i += step) {
               range.add(i);
           }
       } else {
           System.out.println("error: step cannot be 0");
       }
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
        buildRange();
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
        buildRange();
    }

    public int getStop() {
        return stop;
    }

    public void setStop(int stop) {
        this.stop = stop;
        buildRange();
    }

 
    @Override
    public Iterator<Integer> iterator() {
        return range.iterator();
    }

    @Override
    public String toString() {
        return range.toString();
    }
}
