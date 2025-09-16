package vectorOperations;

import Vector.Vector;

public class Product {
   public static float dotProduct(Vector v1, Vector v2){
       // find components of v1
       float dxV1= v1.getEnd().getX()- v1.getStart().getX();
       float dxV2= v2.getEnd().getX()- v2.getStart().getX();
       // find components of v2
       float dyV1= v1.getEnd().getY()- v1.getStart().getY();
       float dyV2= v2.getEnd().getY()- v2.getStart().getY();
       // dot product formula: (x1*x2 + y1*y2)
       return (dxV1*dxV2+dyV1*dyV2);
   }
    public static float crossProduct(Vector v1, Vector v2){
        float dxV1 = v1.getEnd().getX() - v1.getStart().getX();
        float dyV1 = v1.getEnd().getY() - v1.getStart().getY();

        float dxV2 = v2.getEnd().getX() - v2.getStart().getX();
        float dyV2 = v2.getEnd().getY() - v2.getStart().getY();

        return (dxV1 * dyV2 - dyV1 * dxV2);
    }

}
