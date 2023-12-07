import java.util.Scanner;

public class selection_sort {
    public static void main(String[] args) {
           try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of array");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the element in array");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n - 1; i++) {

                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[i]) {
                        int temp = 0;
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }

            }
            System.out.println("Sorted array is ");
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }
        }
        }

    }

