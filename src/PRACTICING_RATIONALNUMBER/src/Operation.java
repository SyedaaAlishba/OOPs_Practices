public class Operation {
    public static RationalNumber add(RationalNumber r1, RationalNumber r2){
        // formula: a/b + c/d = (a*d + c*b) / (b*d)
        int n = r1.getNumerator() * r2.getDenominator() + r2.getNumerator() * r1.getDenominator();
        int d = r1.getDenominator() * r2.getDenominator();
        return Simplify.simplify(n,d);

    }
    public static RationalNumber multiple(RationalNumber r1, RationalNumber r2){
        // Multiplication: (a/b) * (c/d) = (a*c) / (b*d)
        int n= r1.getNumerator()*r2.getNumerator();
        int de=r1.getDenominator()*r2.getDenominator();
        return Simplify.simplify(n,de);
    }
    public static RationalNumber division(RationalNumber r1, RationalNumber r2){
        // Division: (a/b) ÷ (c/d) = (a*d) / (b*c)
        int n= r1.getNumerator()*r2.getDenominator();
        int de=r1.getDenominator()*r2.getNumerator();
        return Simplify.simplify(n,de);
    }
    public static RationalNumber subtract(RationalNumber r1, RationalNumber r2) {

        int newNumerator = (r1.getNumerator() * r2.getDenominator()) - (r1.getDenominator() * r2.getNumerator());
        int newDenominator = r1.getDenominator() * r2.getDenominator();

        return Simplify.simplify(newNumerator, newDenominator);

    }
}
