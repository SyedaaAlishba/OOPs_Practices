public class Simplify {
    public static int Gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static RationalNumber simplify(int n1, int n2){
      int no=  n1/Gcd(n1,n2);
      int de=  n2/Gcd(n1,n2);
      return new RationalNumber(no,de);
    }


}
