// 4.10.2023

public class DSA_18_Recursion_Questions {

    // Q1. Sum of Digits

    public static int sumOfDigits(int n){
        if(n == 0 || n < 0){
            return 0;
        }
        return n%10 + sumOfDigits(n/10);
    }
    
    // Q2. Power

    public static int power(int base, int exp){

        if(exp < 0){
            return -1;
        }
        if(exp == 0){
            return 1;
        }
        return base*power(base, exp-1);
    }

    // Q3. GCD

    public static int gcd(int a, int b){

        if(b == 0){
            return a;
        }
         return gcd(b, a%b);
    }

    public static void main(String[] args){
        
        var result1 = sumOfDigits(111);
        System.out.println(result1);

        var result2 = power(2,2);
        System.out.println(result2);

        var result3 = gcd(8,12);
        System.out.println(result3);
    }

}
