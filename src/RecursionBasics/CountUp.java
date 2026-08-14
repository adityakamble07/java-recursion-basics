package RecursionBasics;

public class CountUp {
    public static void CountUp(int n){
        if(n==11){            //Base Condition
            return;           // Stop Condition
        }
        System.out.println(n);
        CountUp(n+1);      //Function called itself
    }
    public static void main(String args[]){
        int n=1;
        CountUp(n);
    }
}
