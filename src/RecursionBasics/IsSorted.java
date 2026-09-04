package RecursionBasics;

public class IsSorted {
    public static boolean isSorted(int n[],int index){
        if(index==n.length-1){
            return true;
        }
        if(n[index]>=n[index+1]){
           return false;
        }else{
         return isSorted(n,index+1);
        }
    }
    public static void main(String args[]){
        int n[]={1,2,3,4,4,5};
        System.out.println(isSorted(n,0));
    }
}
