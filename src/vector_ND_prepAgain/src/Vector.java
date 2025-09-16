

import java.util.ArrayList;
import java.util.Iterator;

public class Vector implements Cloneable, Iterable<Double>  {

 private ArrayList<Double> cords = new ArrayList<>();
    // default constructor (empty vector)
    public Vector() {}

    // constructor to create vector with n dimensions initialized to 0
    public Vector(int n) {
        for (int i = 0; i < n; i++) {
            cords.add(0.0);
        }
    }
 public void addCords(double cord){
    cords.add(cord);
 }
 //to get all the co-ords
    public ArrayList<Double> getCords() {
        return cords;
    }

//to find co-ords at any given index
 public double getCordAt(int i){
     return cords.get(i);
 }

 //set coordinate at given index
    public void setCordAt(int i, double val){
      cords.set(i,val);
    }

 //to get how many dimensions are there
    public int length(){
      return cords.size();
    }
//add two vectors

    public Vector add(Vector other) {
        if (this.length() != other.length()) {
            throw new IllegalArgumentException("Vectors must be of the same length");
        }

        Vector result = new Vector(this.length());
        for (int i = 0; i < this.length(); i++) {
            double sum = this.getCordAt(i) + other.getCordAt(i);
            result.addCords(sum);
        }

        return result;
    }

    @Override
    public Vector clone() {
        try {
            Vector clone = (Vector) super.clone();
            for (double val : this.cords) {
                clone.addCords(val);
            }
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Vector" + cords.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(this ==  obj){
            return  true;
        }
        if(!(obj instanceof Vector)){
            return false;
        }
        Vector other= (Vector) obj;
        return this.cords.equals(other.cords);
    }

    @Override
    public Iterator<Double> iterator() {
        return cords.iterator();
    }
    //copy constructor +copy method+ cloanning

}
