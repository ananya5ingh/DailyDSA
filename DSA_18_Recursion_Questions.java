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
        if(a<0 || b<0){
            return -1;
        }
        if(b == 0){
            return a;
        }
         return gcd(b, a%b);
    }

// 5.10.2023

    public static int decimalToBinary(int n){

        if(n == 0){
            return 0;
        }
        return n%2 + 10*decimalToBinary(n/2);
    }

// 6.10.2023

/*
Question
 * recursiveRange
Write a function called recursiveRange which accepts a number and adds up all the numbers from 0 to the number passed to the function.
 */

 public static int recursiveRange(int num) {
    //  TODO
    
    if(num<0){
        return 0;
    }
    return num+recursiveRange(num-1);
   } 

/*
Question:
product of Array
Write a function called productOfArray which takes in an array of numbers and returns the product of them all.

Examples

int arr[] = { 1, 2, 3, 4, 5 }; 
productofArray(arr, arr.length); #120
 */

 public static int productofArray(int A[], int N) 
 {
     //int index = N-1;
     if(N <= 0){
         return 1;
     }
     return A[N-1]*productofArray(A, N-1);
 } 

 /*
Question:
fib
Write a recursive function called fib which accepts a number and returns the nth number in the Fibonacci sequence. Recall that the Fibonacci sequence is the sequence of whole numbers 0,1, 1, 2, 3, 5, 8, ... which starts with 0 and 1, and where every number thereafter is equal to the sum of the previous two numbers.

Examples

fib(4) # 3
fib(10) # 55
fib(28) # 317811
fib(35) # 9227465
  */

  public static int fib(int n) {
    // TODO
    
    if (n<0) {
      return -1;
    }
    if (n==0 || n==1) {
      return n;
    }
    return n + fib(n-1);

  }

// 7.10.2023

/*
Question: 
reverse
Write a recursive function called reverse which accepts a string and returns a new string in reverse.

Examples

reverse('java') # 'avaj'
reverse('appmillers') # 'srellimppa'
 */
 



/*
Question:
isPalindrome
Write a recursive function called isPalindrome which returns true if the string passed to it is a palindrome (reads the same forward and backward). Otherwise it returns false.

Examples

isPalindrome('awesome') # false
isPalindrome('foobar') # false
isPalindrome('tacocat') # true
isPalindrome('amanaplanacanalpanama') # true
isPalindrome('amanaplanacanalpandemonium') # false
 */



/*
Question:
someRecursive
Write a recursive function called someRecursive which accepts an array and a callback. The function returns true if a single value in the array returns true when passed to the callback. Otherwise it returns false.

Examples

someRecursive({1,2,3,4}, isOdd) # true
someRecursive({4,6,8,9}, isOdd) # true
someRecursive({4,6,8}, isOdd) # false
 */


    public static void main(String[] args){
        
        var result1 = sumOfDigits(111);
        System.out.println(result1);

        var result2 = power(2,2);
        System.out.println(result2);

        var result3 = gcd(8,12);
        System.out.println(result3);

        var result4 = decimalToBinary(10 );
        System.out.println(result4);
    }



}
