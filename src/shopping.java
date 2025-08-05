import java.util.Scanner;

import static java.lang.System.exit;

class item {
    int[]  ItemCode,ItemPrice;
    static int count;
    String[] ItemName;
    Scanner sc=new Scanner(System.in);

    void AddItem()
    {
        ItemCode[count]=new int[];
        System.out.println("Enter item Code : ");
        ItemCode[count]= sc.nextInt();
        System.out.println("Enter Item Name : ");
        ItemName[count]=sc.nextLine();
        System.out.println("Enter Item Price : ");
        ItemPrice[count]=sc.nextInt();
        count++;
    }

    void display()
    {
        int i;
        System.out.println("ITEMOCDE          ITEMNAME          ITEMPRICE");
        for(i=0;i<count;i++)
            System.out.println(ItemCode[i]+"     "+ItemName[i]+"    "+ItemPrice[i]);
    }
}
public class shopping {
    public static void main(String[] args) {
        item d1=new item();
        int ch;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("\nEnter 0 To Exit ");
            System.out.println("Enter 1 To Add Item ");
            System.out.println("Enter 2 To Display Items ");
            System.out.println("Enter 3 To Print Total Price ");
            System.out.println("Enter 4 To Remove Item ");
            System.out.print("Enter Your Choice ");
            ch=sc.nextInt();
            switch(ch){
                case 0:
                    System.out.println("Thanks For Using Our Services ");
                    exit(0);
                case 1:
                    d1.AddItem();
                    break;
                case 2:
                    d1.display();
                    break;
                /*case 3:
                    d1.PrintItem();
                    break;
                case 4:
                    d1.RemoveItem();
                    break; */
                default:
                    System.out.println("Wrong Choice !!! ");
                    break;
            }
        }
    }
}
