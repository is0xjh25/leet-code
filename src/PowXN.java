/*
50.Pow(x, n)
Implement pow(x, n), which calculates x raised to the power n (i.e., x^n).

 Yun-Chi Hsiao
Jul.30th.2021
 */

public class PowXN {

    public double myPow(double x, int n) {

        if(n == 0) return 1;

        //if n is minimum
        if(n == Integer.MIN_VALUE) {
            return myPow(x*x,n/2);
        }

        //if n is negative
        if(n < 0) {
            x = 1/x;
            n = -n;
        }

        //if n is even
        if(n%2 == 0) {
            return myPow(x*x,n/2);
        } else {
            return x * myPow(x*x,n/2);
        }
    }
}
