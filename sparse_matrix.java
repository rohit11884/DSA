import java.util.Scanner;

public class sparse_matrix {
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
        int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(arr[i][j]==0){
                    ++count;
                }
            }
        }
        
        if(count>(row*column)/2)

            System.out.println("Yes,It is sparse matrix");
        else
        System.out.println("not ");
       
    }
}
