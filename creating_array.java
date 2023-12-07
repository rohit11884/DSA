import java.util.Scanner;

class sort{
    public void code(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of array");
            int n=sc.nextInt();
            int arr[]=new int [n];
            System.out.println("Enter the element in array");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("Elements in the array is ");
            for(int i=0;i<n;i++){
                System.out.println(arr[i]);
            }
        }
    }
}

public class creating_array{
    public static void main(String[] args) {
        sort so=new sort();
        so.code();
    }
}