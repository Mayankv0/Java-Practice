/*package whatever //do not write package name here */

import java.util.*;

class abc {
	public static void main (String[] args) {
    	Scanner scn = new Scanner(System.in);
		int l = scn.nextInt();
		int h = scn.nextInt();
        for(int z=l; z<=h ; z++){
            int c= 0;
            
            for(int d=2 ; d*d <=z ; d++){
                if(z % d == 0 ){
                    c++;
                    break;
                }
            }
            if(c==0){
                System.out.println(z);
            }
        }
        System.out.println("lol");
	}
}