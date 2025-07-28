import java.util.Scanner;

public class oops {
    int a,b,sum;
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        //programming languages generation
        //pop oop edp(event driven program)
        int[] arr={1,1,0,2,4,5,6,7,8,9,2};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){ max=arr[i]; }
        }
        int[] freqarr=new int[max+1];
        for(int i=0 ; i<arr.length;i++){
            freqarr[arr[i]]++;
        }
        max=0;
        for(int i=0;i<freqarr.length;i++){
            if(freqarr[i]>0){
                max++;
            }
        }
//        int[] final=new int[max];
//        for()
    }
}
