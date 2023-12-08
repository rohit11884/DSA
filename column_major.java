import java.util.Scanner;

public class column_major {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of first matrix ");
        int row1 = sc.nextInt();
        System.out.println("Enter the no. of column of first matrix");
        int column1 = sc.nextInt();
        int arr1[][] = new int[row1][column1];
            System.out.println("Enter the element in first matrix");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column1; j++) {
                    arr1[j][i] = sc.nextInt();
                }
            }
            
        System.out.println("Array is : ");
        for(int i=0;i<row1;i++){
            for(int j=0;j<column1;j++){
                System.out.print(arr1[j][i]+" ");
            }
            System.out.println();
        }
    }
}
