package RecursionBasics;

public class SumOfElements {
    public static int sum(int i,int n,int sum) {
        if(i==n){
           sum+=i;
           return sum ;
        }
        sum+=i;
        return  sum(i+1,n,sum);
    }
    public static void main(String[] args) {
        int n=5;
      int ans=sum(1,5,0);
        System.out.print(ans);
    }
}
