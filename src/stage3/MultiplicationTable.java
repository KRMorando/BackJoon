package stage3;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// N은 1보다 크거나 같고, 9보다 작거나 같다.
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        if(!(num >= 1) || !(num <= 9))
            num = 0;
        
        for(int i = 1; i < 10; i++)
            System.out.println(num + " * " + i + " = " + (num*i));
	}

}
