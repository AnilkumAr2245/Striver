/*
* * * *
* * * *
* * * *
* * * *
 */


import java.util.Scanner;

public class pattern_1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter no of columns: ");
        int columns=sc.nextInt();
        System.out.print("Enter any special character: ");
        String sp=sc.next();
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(sp+"");
            }
            System.out.println();
        }
    }
}
