package com.company;

public class rational {
    private int num;   // the numerator
    private int den;   // the denominator

    // create and initialize a new Rational object
    public rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new RuntimeException("Denominator is zero");
        }
        int g = gcd(numerator, denominator);
        num = numerator   / g;
        den = denominator / g;

    }

    // return string representation of (this)
    public String toString() {
        if (den == 1) return num + "";
        else          return num + "/" + den;
    }

    // return (this * b)
    public rational times(rational b) {
        return new rational(this.num * b.num, this.den * b.den);
    }


    // return (this + b)
    public rational plus(rational b) {
        int numerator   = (this.num * b.den) + (this.den * b.num);
        int denominator = this.den * b.den;
        return new rational(numerator, denominator);
    }

    // return (1 / this)
    public rational reciprocal() { return new rational(den, num);  }

    // return (this / b)
    public rational divides(rational b) {
        return this.times(b.reciprocal());
    }


    // return gcd(m, n)
    private static int gcd(int m, int n) {
        if (0 == n) return m;
        else return gcd(n, m % n);
    }


    public static void main(String[] args) {
        rational x, y, z;

        // 1/2 + 1/3 = 5/6
        x = new rational(1, 2);
        y = new rational(1, 3);
        z = x.plus(y);
        System.out.println(z);

        // 8/9 + 1/9 = 1
        x = new rational(8, 9);
        y = new rational(1, 9);
        z = x.plus(y);
        System.out.println(z);

        //  4/17 * 7/3 = 28/51
        x = new rational(4, 17);
        y = new rational(7,  3);
        z = x.times(y);
        System.out.println(z);

        // 203/16957 * 9299/5887 = 17/899
        x = new rational(203, 16957);
        y = new rational(9299, 5887);
        z = x.times(y);
        System.out.println(z);

        // 0/6 = 0
        x = new rational(0, 6);
        System.out.println(x);

    }

}
