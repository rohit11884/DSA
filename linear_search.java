import java.util.Scanner;

public class linear_search {

    static int search(int arr[],int n,int x){
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={23,55,44,33,22,11,};
        int n=arr.length;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element you want to find ");
        int x=sc.nextInt();
        int index=search(arr, n, x);

        if(index==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found and index is : "+index);
        }
    }
}
