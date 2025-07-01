import java.util.Scanner;

public class greater {
    public static void main(String[] args){
        int var , variable;
        System.out.print("Enter First Number : ");
        Scanner sc=new Scanner(System.in);
        var =sc.nextInt();
        System.out.print("Enter Second Number : ");
        variable =sc.nextInt();
        int abc=var/variable;
        if (abc!=0){
            System.out.println("The Greater Number is : "+var);
        }
        else{
            System.out.println("The Greater Number is : "+variable);
        }
    }
}
