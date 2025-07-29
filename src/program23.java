import java.util.Scanner;

class demo{
    int num,fact;
    Scanner sc= new Scanner(System.in);
    void input(){
        System.out.println("Enter A Number ");
        num=sc.nextInt();
    }
    void output(){
        fact=1;
        for(int i=1; i<=num; i++){
            fact*=i;
        }
        System.out.println("Factorial Of Number Is "+fact);
    }
}
public class program23 {
    public static void main(String[] args) {
        demo dd=new demo();
        dd.input();
        dd.output();
    }
}
