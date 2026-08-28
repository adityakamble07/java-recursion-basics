package RecursionBasics;

public class FibbonacciSeries {
    public static int printFibbonacciNumb(int n){
       if(n==0 || n==1){
           return n;
       }
       return printFibbonacciNumb(n-1)+printFibbonacciNumb(n-2);
    }
    public static void main(String[] args) {
        int ans=printFibbonacciNumb(7);
        System.out.print(ans);
    }
}
