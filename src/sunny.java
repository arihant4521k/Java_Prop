import java.util.Scanner;

public class sunny {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number : ");
        int num=sc.nextInt();
        double temp=++num;
        double sroot=Math.sqrt(temp);
        if(sroot-Math.floor(sroot)==0){
            System.out.println("It Is A Sunny Number ");
        }
        else{
            System.out.println("It Is Not A Sunny Number ");
        }
    }
}
