/*package whatever //do not write package name here */

import java.util.*;

class abc {
	public static void main (String[] args) {
    	Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
	    for (int i=0; i<t ; i++ ){ 
            int n = scn.nextInt();
            int c = 0;
            for(int d=2; d*d <=n;d++){
                if(n%d==0){
                    c++;
                    break;
                }
            }
        if(c==0){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
	    }
	}
}