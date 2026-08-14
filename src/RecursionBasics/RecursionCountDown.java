package RecursionBasics;

public class RecursionCountDown {
    public static void CountDown(int n){
        if(n==0){               //Base Condition
            return;            //Stop Condition
        }
        System.out.println(n);
        CountDown(n-1);    //function called itself..
    }
    public static void main(String[] args) {
        int n=10;
        CountDown(n);
    }
}
