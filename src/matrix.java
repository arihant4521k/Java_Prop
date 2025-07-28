import java.util.Scanner;

import static java.lang.System.exit;

public class matrix {
    public static void main(String[] args) {
        int [][] arr=new int[3][3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Enter Element"+(i)+(j));
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j] != arr[j][i]){
                    System.out.println("Matrix Is Not Symmetric ");
                    exit(0);
                }
            }
        }
        System.out.println("Matrix Is Symmetric ");
    }
}
