package RecursionBasics;

public class Factorial {
    public static int printFactorialNumb(int n){
        if(n==1||n==0){
            return 1;
        }
        int fib_nm1=printFactorialNumb(n-1);
        int fib_mul=n*fib_nm1;
        return fib_mul;
    }
    public static void main(String args[]){
        int ans=printFactorialNumb(5);
        System.out.print(ans);
    }
}
