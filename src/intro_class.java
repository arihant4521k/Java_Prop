import java.util.Scanner;

public class intro_class {
    int a,b;
    Scanner sc=new Scanner(System.in);
    void input(){
        System.out.println("Enter Two Numbers ");
        a= sc.nextInt();
        b= sc.nextInt();
    }
    void output(){
        System.out.println("Value Of A & B is "+(a)+" & "+b);
    }
    public static void main(String[] args) {
        intro_class dd=new intro_class();
        dd.input();
        dd.output();
    }
}
