package stage2;

import java.util.Scanner;

public class AlarmClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int H = 0, M = 0;
        
        H = sc.nextInt();
        M = sc.nextInt();
        
        if(!(H >= 0) && !(H <= 23))
            H = 0;
        if(!(M >= 0) && !(M <= 59))
            M = 0;
        
        if(M < 45) {
            if(H == 0)
                H = 23;
            else
                H -= 1;
            M = 60 + M - 45;
        } else
            M -= 45;
        
        System.out.println(H + " " + M);
	}

}
