    public class recursion {
    //     static int count =0;
    static void fun(int i,int n){
        // Q1.

    //     if (count==6) {
    //         return ;
    //     }
    //     else{
    //         System.out.println(count);
    //         count++;
    //         fun();
    //     }

        // Q2. 

        // if(i>n){
        //     return ;
        // }
        // System.out.println("Rohit");
        // fun(i+1,n);

        // Q3. 

            if(i>n){return ;}
            System.out.println(i);
            fun(i+1,n);
    }
    public static void main(String[] args) {
        // fun(); ---->>> Q1
        //fun(1,5); ---->>>Q2
        fun(1, 5);

    }
}
