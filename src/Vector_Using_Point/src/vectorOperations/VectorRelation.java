package vectorOperations;

import Vector.Vector;

public class VectorRelation {

public boolean isParallel( Vector v1, Vector v2){
    float cross= Product.crossProduct(v1,v2);
    if(cross==0){
        return true;
    }
    return false;
}
public  boolean isObtuse(Vector v1, Vector v2){
    float dot = Product.dotProduct(v1, v2);

    if(dot<0){
        return true;
    }
    return false;
}

    public boolean isPerpendicular(Vector v1, Vector v2) {
        float dot = Product.dotProduct(v1, v2);
        if (dot==0){
            return true;
        }
        return false;
    }

    public boolean isAcute(Vector v1, Vector v2) {
        float dot = Product.dotProduct(v1, v2);
        return dot > 0;  // angle < 90
    }
}
