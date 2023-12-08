import java.util.Scanner;

public class twod_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row=sc.nextInt();
        System.out.println("Enter the no. of column");
        int column=sc.nextInt();
        int arr[][]=new int[row][column];
        System.out.println("Enter the element in array");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Array is : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
