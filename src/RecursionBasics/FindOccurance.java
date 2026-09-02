package RecursionBasics;

public class FindOccurance {
    static int first=-1;
    static int last=-1;
    public static void findOccurance(String str,int indx,char elements){
        if(indx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
            char currentChar=str.charAt(indx);
            if(currentChar==elements){
                if(first==-1){
                    first=indx;
                }else{
                    last=indx;
                }
            }
            findOccurance(str,indx+1,elements);
    }
    public static void main(String[] args) {
        String str="abaacdacfaah";
        findOccurance(str,0,'a');
    }
    }

