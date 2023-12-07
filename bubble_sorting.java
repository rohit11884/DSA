import java.util.Scanner;

public class bubble_sorting {
    public static void main(String[] args) {
         {
                 Scanner sc = new Scanner(System.in);
                System.out.println("Enter the size of array");
                int n = sc.nextInt();
                int arr[] = new int[n];
                System.out.println("Enter the element in array");
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                int counter=1;
                while (counter<n-1) {
                     for(int i=0;i<n-counter;i++){
                        if(arr[i]>arr[i+1]){
                            int temp=arr[i];
                             arr[i]=arr[i+1];
                             arr[i+1]=temp;
                        }
                        
                     }
                     counter++;
                }
                System.out.println("Sorted array is");
                for(int i=0;i<n;i++){
                    System.out.println(arr[i]);
                }
            }
        }
       
    }

