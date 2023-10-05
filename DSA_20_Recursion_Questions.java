public class DSA_20_Recursion_Questions {
    
    // 6.10.2023
    public static int factorial(int num) {
        // TODO
        if(num == 0){
            return 1;
        }
        return num*factorial(num-1);
      }


    public static void main(String[] args){
        System.out.println(factorial(4));
    }
}
