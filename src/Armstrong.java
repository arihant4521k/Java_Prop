import java.util.Scanner;
import static java.lang.Math.pow;
public class Armstrong {
    public static void main(String[] args) {
        int num,count=0,temp,temp1,rem;
        System.out.print("Enter A Number : ");
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        temp=num;
        while(temp!=0){
            count++;
            temp/=10;
        }
        System.out.println(count);
        temp1=num;
        while(num!=0){
            rem=num%10;
            temp+=pow(rem,count);
            num/=10;
        }
        if(temp==temp1){
            System.out.println("NUmber Is Armstrong ");
        }
        else{
            System.out.println("Number Is Not Armstrong ");
        }
    }
}
