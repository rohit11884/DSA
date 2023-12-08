public class reving_array {
   static void reverse(int arr[],int n){
        int start_idx=0;
        int end_idx=n-1;

        while (start_idx<=end_idx) {
            int temp=arr[end_idx];
            arr[end_idx]=arr[start_idx];
            arr[start_idx]=temp;

            start_idx++;
            end_idx--;
        }


    }

    public static void main(String[] args) {
        int arr[]={11,43,23,55,33};
        int n=arr.length;
        reverse(arr, n);
        for(int i=0;i<n;i++){

            System.out.println(arr[i]);
        }

    }
}
