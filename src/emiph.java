import java.util.Scanner;

public class emiph {
    public static int palindrome(int num){
        int rem,s=0;
        while(num>0){
            rem=num%10;
            s=s*10+rem;
            num/=10;
        }
//        System.out.println(s);
        return s;
    }
    public static boolean prime(int n){
        for(int i=2; i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number ");
        int num=sc.nextInt();
        if(palindrome(num)==num){
            System.out.println("Not An Emirph Number ");
        }
        else {
//            System.out.println(prime(num));
//            System.out.println(prime(palindrome(num)));
            if (prime(num) && prime(palindrome(num))) {
                System.out.println("It Is An Emirph Number ");
            }
            else
            System.out.println("Not An Emirph Number ");
        }
    }
}
