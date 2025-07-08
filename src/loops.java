import java.util.Scanner;

public record loops() {
    public static void main(String[] args) {
        //sum of n numbers without loop is n(n+1/2)
        int n1=0 , n2=1 , n3=0;
        System.out.print("Enter Ending Point : ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n1);
        System.out.println(n2);
        for(int i=0 ;i<n-2 ; i++){
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }
}
