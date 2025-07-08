import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        n=sc.nextInt();
        for(int i=2; i<Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println("Not A Prime");
                return ;
            }
        }
        System.out.println("Prime Number");
    }
}
