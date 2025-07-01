import java.util.Scanner;

public class bill {
    public static void main(String[] args) {
        int unit, amt;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Unit  : ");
        unit = sc.nextInt();
        if (unit <= 100)
            amt = 500;
        else if (unit <= 200)
            amt = 500 + (unit - 100) * 2;
        else if (unit <= 300)
            amt = 700 + (unit - 200) * 3;
        else if (unit <= 400)
            amt = 1000 + (unit - 300) * 4;
        else if (unit <= 500)
            amt = 1400 + (unit - 400) * 5;
        else
            amt=1900+(unit-500)*6;
        System.out.print("Amount is "+amt);
    }
}