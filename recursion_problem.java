
public class recursion_problem {
    // Q1. Sum of n natural number using recursion 

    static void sumof_n_number(int n,int sum){
        if(n<1){
            System.out.println(sum);
            return ;
        }
        else{
            sumof_n_number(n-1,sum+n);
        }
    }
    
    public static void main(String[] args) {
        sumof_n_number(5, 0);
    }
}
