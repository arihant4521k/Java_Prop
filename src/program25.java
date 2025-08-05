import java.util.Scanner;
import static java.lang.System.exit;
public class program25 {
    public class op{
        int price,p_id;
        char[] name;
    }
    public static void main(String[] args) {
        op[] arr=new op[10];
        int ch=0;
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("\nEnter 0 To Exit ");
            System.out.println("Enter 1 To Add Item ");
            System.out.println("Enter 2 To Display Items ");
            System.out.println("Enter 3 To Print Total Price ");
            System.out.println("Enter 4 To Remove Item ");
            System.out.print("Enter Your Choice ");
            ch=sc.nextInt();
            if(ch==0){
                System.out.println("Thank You For Using Our Service  !! ");
                exit(0);
            }
            else if(ch==1){

            }
            else if(ch==2){
                //Display
            }
            else if(ch==3){
                //Total Price
            }
            else if(ch==4){
                //Remove
            }
            else{
                System.out.println("Wrong Choice !!! ");
            }
        }
    }
}
