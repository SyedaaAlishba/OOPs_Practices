public class RationalNumber {
    private int numerator;
    private  int denominator;

    RationalNumber(int n, int d){
        if (d == 0) {
            throw new IllegalArgumentException("Denominator can't be zero!");
        }
        // normalize: keep denominator positive
        if (d < 0) {
            n = -n;
            d = -d;
        }
        this.numerator=n;
        this.denominator=d;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    @Override
    public String toString() {
        if(getDenominator()==1){
            return " "+getNumerator();
        }
        return " "+getNumerator()+" / "+getDenominator();
    }
}
