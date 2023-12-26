import java.util.*;

public class Basic_maths {
    public static void main(String[] args) {

        // Q1. Number of digits

        // int n=12345;
        // int count =0;
        // while(n>0){
        // n=n/10;
        // count=count+1;

        // }
        // System.out.println("number of digit is : "+count);

        // Q2. Reverse an number

        // int n=2340021;
        // int rev=0;
        // while(n>0){
        // int lastdigit=n%10;
        // n=n/10;
        // rev=(rev*10)+lastdigit;

        // }
        // System.out.println(rev);

        // Q3.Armstrong number

        // int n=153;
        // int dup=n;
        // int sum=0;
        // int ld;
        // while (n>0){
        // ld=n%10;
        // sum=sum+(ld*ld*ld);
        // n=n/10;

        // }
        // if(sum==dup){
        // System.out.println("Armstrong number");
        // }
        // else{
        // System.out.println("Not an armstrong number");
        // }

        // Q4.print all divisors

        // int n=36;
        // for(int i=1;i<=n;i++){
        // if(n%i==0){
        // System.out.println(i);
        // }
        // }

        // Another way to find number of divisor of an number ----->> Time complexcity
        // will be minimum in this methord---->>>

        // int n=36;
        // // double sq;
        // // sq=Math.sqrt(n); --->>> time complexcity will be more for this.
        // for(int i=1;i*i<=n;i++){ // time complexcity will be O(sqrt(n))
        // if(n%i==0){
        // System.out.println(i);
        // if(n/i!=i){
        // System.out.println(n/i);
        // }
        // }
        // }

        // Q5. Prime number

        // int n=13;
        // int count=0;
        // for(int i=1;i<=n;i++){
        // if(n%i==0){
        // count++;

        // }
        // }
        // if(count==2){

        // System.out.println("Prime number");
        // }
        // else
        // System.out.println("Not a prime number");

        // Q6. HCF

        // int n = 10;
        // int m = 18;

        // for (int i = Math.min(n, m); i >= 1; i--) {  // Time complexcity will be O(min(n,m))
        //     if (n % i == 0 && m % i == 0) {
        //         System.out.println(i);
        //         break;
        //     }
        // }

    }

}
