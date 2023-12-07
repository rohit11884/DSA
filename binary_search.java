import java.util.Scanner;

public class binary_search {
    static int search(int arr[], int n, int x) {
        int start_idx = 0;
        int end_idx = n;

        while (start_idx <= end_idx) {
            int mid_idx = start_idx + (end_idx - start_idx) / 2;
            if (arr[mid_idx] == x) {
                return mid_idx;
            }
            else if (arr[mid_idx] > x) {
                end_idx = mid_idx - 1;
            } else {
                start_idx = mid_idx + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 23, 34, 56, 78, 88, 99 };
        Scanner sc = new Scanner(System.in);
        int n = arr.length - 1;
        System.out.println("Enter the element you want to find");
        int x = sc.nextInt();
        int index = search(arr, n, x);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found and index is : " + index);
        }
    }
}
