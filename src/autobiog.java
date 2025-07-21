import java.util.Scanner;

import static java.lang.System.exit;

public class autobiog {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number : ");
        int num=sc.nextInt();
        int count=0,temp;
        temp=num;
        while(temp>0){
            count++;
            temp/=10;
        }
        temp=num;
        int[] arr=new int[count];
        for(int i=count-1;i>-1;i--){
            arr[i]=temp%10;
            temp/=10;
        }
        for(int i=0;i< arr.length;i++){
            count=0;
            for(int j=0;j<arr.length;j++){
                if(i==arr[j]){
                    count++;
                }
            }
            if(count!=arr[i]){
                System.out.println("Not An Autobiographical Number ");
                exit(0);
            }
        }
        System.out.println("An Autobiographical Number ");
    }
}
