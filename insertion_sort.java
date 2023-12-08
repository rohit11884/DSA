import java.util.Scanner;
public class insertion_sort {
    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of array");
                int n = sc.nextInt();
                int arr[] = new int[n];
                System.out.println("Enter the element in array");
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }

                for(int i=1;i<n;i++){
                    int current=arr[i];
                    int j=i-1;
                    while (arr[j]>current && j>=0) {

                        arr[j+1]=arr[j];
                        j--;
                    }
                    arr[j+1]=current;
                }

                System.out.println("Sorted array is");
                    for(int i=0;i<n;i++){
                        System.out.println(arr[i]);
                    }
        }
    }
}


