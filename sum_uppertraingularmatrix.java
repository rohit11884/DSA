import java.util.Scanner;

public class sum_uppertraingularmatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int r=sc.nextInt();
        System.out.println("Enter the no. of column");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Fill the elements in the array");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int upper_sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i<=j){
                    upper_sum+=arr[i][j];
                }
            }
        }
        System.out.println(upper_sum);
    }
    
}
