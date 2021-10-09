/*package whatever //do not write package name here */

import java.util.*;

class abc {
	public static void main (String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int a = 0;
    int b = 1;
    System.out.println("0");
    for(int i=0; n>=b ; i++ ){
        b = b + a;
        a = b - a;
            System.out.println(a);

    }
	}
}