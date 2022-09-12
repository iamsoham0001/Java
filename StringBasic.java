//In this program we done many operations on String

import java.util.*;
public class StringBasic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Declearations of a String
        String s1 = "Java";
              //or
        String s = new String("Java");
            //or
        String str = new String(sc.next());  //input by user

       //String Methods

        System.out.println("---length();---");
        int n = str.length();
        System.out.println(n);

        System.out.println("---toLowerCase();---");
        String s2 = str.toLowerCase();
        System.out.println(s2);

        System.out.println("---toUpperCase();---");
        String s3 = str.toUpperCase();
        System.out.println(s3);
        
        System.out.println("---replace();---");
        String s4 = str.replace('a','#');
        System.out.println(s4);

        System.out.println("---trim();---");
        String s5 = str.trim();
        System.out.println(s5);

        System.out.println("---equals();---");
        if(s2.equals(s3)) {
            System.out.println("Yes, s2 and s3 are equal");
        } else {
            System.out.println("No, s2 and s3 are not equal");
        }

        System.out.println("---equalIgnoreCase();---");
        if(s2.equalsIgnoreCase(s3)) {
            System.out.println("Yes, s2 and s3 are equal");
        } else {
            System.out.println("No, s2 and s3 are not equal");
        }

        System.out.println("---charAt(n);---");
        System.out.println(str.charAt(2));

        System.out.println("---compareTo();---");
        String st = "Garhbeta";
        if(str.compareTo(st)>0) {
            System.out.println(str+ "is big");
        } 
        else if (str.compareTo(st)<0) {
            System.out.println(st+ "is big");
        }
        else if(str.compareTo(st) == 0) {
            System.out.println("Two are equal");
        }

        System.out.println("---concat();---");
        System.out.println(s2.concat(s3));

        System.out.println("---subString(n);---");
        System.out.println(str.substring(4));

        System.out.println("---subString(n,m);---");
        System.out.println(str.substring(5,8));

        System.out.println("---indexof('x');---");
        System.out.println(str.indexOf('t'));

        System.out.println("---indexof('x',n);---");
        System.out.println(str.indexOf('a',2));


    }
}