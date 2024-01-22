import java.util.*;
public class quick_sort {
    public static int partition(int [] arr,int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivot&&i<=high-1){
                i++;
            }
            while(arr[j]>pivot&&j>=low+1){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp1=arr[j];
        arr[j]=arr[low];
        arr[low]=temp1;
        return j;
    }
    static void qs(int [] arr,int low,int high){
        if(low<high){
            int pindex=partition(arr,low,high);
            qs(arr,low,pindex-1);
            qs(arr,pindex+1 ,high);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the element in array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

       qs(arr,0,n-1);

        System.out.println("Sorted array is");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
