package stage2;

import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        
        x = sc.nextInt();
        y = sc.nextInt();
        
        if(!(x >= -1000) && !(x <= 1000) && x != 0)
            x = 0;
        if(!(y >= -1000) && !(y <= 1000) && y != 0)
            y = 0;
        
        // Quadrant 1
        if(x > 0 && y > 0)
            System.out.println("1");
        // Quadrant 2
        if(x < 0 && y > 0)
            System.out.println("2");
        // Quadrant 3
        if(x < 0 && y < 0)
            System.out.println("3");
        // Quadrant 4
        if(x > 0 && y < 0)
            System.out.println("4");
	}

}
