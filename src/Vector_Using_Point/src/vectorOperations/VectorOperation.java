package vectorOperations;

import Vector.Vector;

public class VectorOperation {
    public static float magnitude(Vector v){
        float dx = v.getEnd().getX() - v.getStart().getX();
        float dy = v.getEnd().getY() - v.getStart().getY();

        return (float) Math.sqrt(dx * dx + dy * dy);
    }
    public static float angle(Vector v1, Vector v2){
        float dot= Product.dotProduct(v1,v2);
        float magV1 = magnitude(v1);
        float magV2 = magnitude(v2);

        float angle = (float) Math.toDegrees(Math.acos(dot / (magV1 * magV2)));

        return angle;
    }


}
