/*
//check prime or not normally
import java.util.*;
public class PrimeCheck {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in); 

        int n = sc.nextInt();
        boolean isPrime = true;

        if(n == 2 ) {
            System.out.println("Its a Prime");
        } else {
                for(int i=2; i<=Math.sqrt(n); i++) {    //same as for(int i=2; i<=n-1; i++) but more optimized
                    if(n%i == 0) {
                    isPrime = false ;
                    }
                }
                if(isPrime == true) {
                System.out.println("Prime");
                } else {
                System.out.println("Not Prime");
                }
             }       
         }
}
*/

//check prime or not using function
import java.util.*;

public class PrimeCheck {

    public static boolean isPrime(int n) {
        
        if(n==1 || n==0 ) {
            return false;
        } else {
            for(int i=2; i<=Math.sqrt(n); i++) {
                if(n%i == 0) {
                    return false;
                } 
            }
            return true;
        }
    }
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println(isPrime(5)); //check prime or not
        
        //print prime numbers---

        System.out.println("Enter 1 to n prime numbers are ");
        int N = sc.nextInt();

        for(int i=1; i<=N; i++) {
            if(isPrime(i)) {
                System.out.print(i +" ");
            }
        }
    }
}