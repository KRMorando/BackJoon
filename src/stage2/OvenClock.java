package stage2;

import java.util.Scanner;

public class OvenClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Hour = 0, Min = 0, needTime = 0;
        
        Hour = sc.nextInt();
        Min = sc.nextInt();
        needTime = sc.nextInt();
        
        Hour += (needTime / 60);
        Min += (needTime % 60);
        
        if(Min >= 60) {
            Hour += (Min / 60);
            Min -= 60;
        }
        
        if(Hour >= 24)
            Hour -= 24;
        
        System.out.println(Hour + " " + Min);
	}

}
