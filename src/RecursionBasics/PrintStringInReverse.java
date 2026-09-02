package RecursionBasics;

public class PrintStringInReverse {
    public static void stringReverse(String str,int indx){
        if(indx==0){
            System.out.println(str.charAt(indx));
            return;
        }
        System.out.print(str.charAt(indx));
        stringReverse(str,indx-1);
    }
    public static void main(String[] args) {
        String str="abcd";
        stringReverse(str,str.length()-1);
    }
}
