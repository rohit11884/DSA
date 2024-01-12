public class recursion_Q {
    // static int factorial(int n){
    //     if(n==0||n==1){
    //         return 1;
    //     }
    //     else{
    //         return n*factorial(n-1);
    //     }
    // }
    // public static void main(String[] args) {
    //     int n=5;
    //     System.out.println("Factorial of "+n+" is :"+factorial(n));
    // }

        // TAIL RECURSION :


    // static  int fun(int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     else{
    //         return n*fun(n-1);
    //     }
    // }
    // public static void main(String[] args) {
    //     int n=3;
    //     System.out.println(fun(n));
    // }

    // HEAD RECURSION :

    // static void fun(int n){
    //     if(n>0){
    //         System.out.println(n+" ");
    //         fun(n-1);
             
    //     }
        
    // }
    // public static void main(String[] args) {
    //     int x=3;
    //     fun(x);
       
    // }

        static int fun(int n)
    { 
        if (n > 100) 
            return n - 10; 
      
        // A recursive function passing parameter 
        // as a recursive call or recursion 
        // inside the recursion 
        return fun(fun(n + 11)); 
    } 
      
    // Driver code 
    public static void main(String args[]) 
    { 
        int r; 
        r = fun(95); 
        System.out.print("  "+ r); 
          
    } 
}
