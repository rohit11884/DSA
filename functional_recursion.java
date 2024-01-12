import java.util.*;
public class functional_recursion {
    static int fact(int n){
        
        if(n==0||n==1){
            return 1;
        }
       
        return n*fact(n-1);
    }
    static int[] reverse(int i,int arr[],int n){
        if(i<n){
                int temp;
                temp=arr[n-1];
                arr[n-1]=arr[i];
                arr[i]=temp;
                reverse(i+1, arr, n-1);
            }
        return arr;
    }
    static int fibi(int n){
        if(n<=1){
            return n;
        }
        else
        return fibi(n-1)+fibi(n-2);
    }
    public static void main(String[] args) {
        // Q.1
        System.out.println(fact(6));
        // Q.2
        int []arr={3,5,2,6,4};
        reverse(0,arr,arr.length );
        for(int j=0;j<arr.length;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        // Q.3
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(fibi(i)+" ");
        }
        
        
        
    }
}
