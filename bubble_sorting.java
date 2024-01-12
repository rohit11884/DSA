import java.util.Scanner;

public class bubble_sorting {
    public static void main(String[] args) {
        {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter the size of array");
                int n = sc.nextInt();
                int arr[] = new int[n];
                System.out.println("Enter the element in array");
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }

                for (int i = n - 1; i >= 0; i--) {
                    int didswap = 0;
                    for (int j = 0; j <= i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            int temp = arr[j + 1];
                            arr[j + 1] = arr[j];
                            arr[j] = temp;
                            didswap = 1;
                        }
                    }
                    if (didswap == 0) {
                        break;
                    }
                }
                System.out.println("Sorted array is");
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

}
