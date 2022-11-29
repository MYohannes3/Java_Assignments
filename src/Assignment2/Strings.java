package Assignment2;


import java.io.*;
import java.util.*;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        System.out.println(A.length() + B.length());
        int c = A.compareTo(B);
        if(c>0){
             System.out.println("Yes");
        } else{
             System.out.println("No");
        }
        String aa = A.substring(0,1).toUpperCase()+A.substring(1);
        String bb = B.substring(0,1).toUpperCase()+B.substring(1);;
        System.out.println(aa+" "+bb);
        
    }
}