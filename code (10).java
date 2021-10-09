/*package whatever //do not write package name here */

import java.util.*;

public class lol {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int d = 0;
		int t = n;
		while (t != 0){
		    t = t/10;
		    d++;
		  
		}
	
	    int div = (int)Math.pow(10, d - 1);
	    while( n != 0){
	        int q = n / div;
	        System.out.println(q);
	        
	        n = n % div;
	        div = div/10;
	    }
	}
	
}