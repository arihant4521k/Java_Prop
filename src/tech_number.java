import java.util.Scanner;

public class tech_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number : ");
        int num=sc.nextInt();
        int count=0;
        int temp=num;
        while(temp>0){
            count++;
            temp/=10;
        }
        int rhs=(int) (num%(Math.pow(10,count/2)));
        int lhs=(int) (num/(Math.pow(10,count/2)));
        int sum=lhs+rhs;
        int sqre=sum*sum;
        if(sqre==num){
            System.out.println("It Is A Tech Number ");
        }
        else{
            System.out.println("It Is Not A Tech Number ");
        }
    }
}
