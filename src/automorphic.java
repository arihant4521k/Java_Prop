import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int num = sc.nextInt();
        int Square=num*num;
        int count=0;
        int temp=num;
        while(temp>0){
            count++;
            temp/=10;
        }
        int LastDigit=(int) (Square%(Math.pow(10,count)));
        if(num==LastDigit){
            System.out.println("It Is An Automorphic Number ");
        }
        else{
            System.out.println("It Is Not An Automorphic Number ");
        }

    }
}
