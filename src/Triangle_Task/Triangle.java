package Triangle_Task;

    public class Triangle {
        private final double sideA;
        private final double sideB;
        private final double sideC;
        private static int currentCount;
        //final means once fixed values
        public Triangle(){
            currentCount++;
            this.sideA=1.0;
            this.sideB=1.0;
            this.sideC=1.0;
        }
        public Triangle(double x){
            currentCount++;
            this.sideA=x;
            this.sideB=x;
            this.sideC=x;
        }
        public Triangle(double x, double y){
            this.sideA=x;
            this.sideB=y;
            this.sideC=x;
            currentCount++;
        }
        public Triangle(double x, double y,double z){
            currentCount++;
            this.sideA=x;
            this.sideB=y;
            this.sideC=z;
        }
        public Triangle(Triangle other){
            currentCount++;
            this.sideA=other.sideA;
            this.sideB=other.sideB;
            this.sideC=other.sideC;
        }
//can use this
//    public void setSideA(double sideA) {
//        this.sideA = sideA;
//    }

        public double getSideA() {
            return sideA;
        }
//can use this
//    public void setSideB(double sideB) {
//        this.sideB = sideB;
//    }

        public double getSideB() {
            return sideB;
        }

        //can use this
//    public void setSideC(double sideC) {
//        this.sideC = sideC;
//    }

        public double getSideC() {
            return sideC;
        }
        public static int objectCount(){
            return currentCount;
        }
        public double perimeters(){
            return this.getSideA()+this.getSideB()+this.getSideC();
        }
        public static boolean isRightAngled(int longSide ,int other1,int other2){
            if(longSide*longSide== (other1*other1)+(other2*other2)){
                return true;
            }
            return false;
        }

        @Override
        public String toString() {
            return "Side A "+getSideA()+" Side B "+getSideB()+" Side C "+getSideC();
        }
    }

