import java.util.Scanner;

public class adding_aaray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of first matrix ");
        int row1 = sc.nextInt();
        System.out.println("Enter the no. of column of first matrix");
        int column1 = sc.nextInt();
        System.out.println("Enter the number of rows of second matrix ");
        int row2 = sc.nextInt();
        System.out.println("Enter the no. of column of second matrix");
        int column2 = sc.nextInt();
        if (row1 == row2 && column1 == column2) {
            int arr1[][] = new int[row1][column1];
            System.out.println("Enter the element in first matrix");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column1; j++) {
                    arr1[i][j] = sc.nextInt();
                }
            }

            int arr2[][] = new int[row2][column2];
            System.out.println("Enter the element in second matrix");
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < column2; j++) {
                    arr2[i][j] = sc.nextInt();
                }
            }
            int add[][] = new int[row2][column2];
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < column2; j++) {
                    add[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
            System.out.println("Matrix after addition is : ");
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < column2; j++) {
                    System.out.print(add[i][j] + " ");
                }
                System.out.println();
            }

        } else {
            System.out.println("Addition not possible");
        }

    }
}
