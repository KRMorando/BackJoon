package stage2;

import java.util.Scanner;

public class dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int[] dice = new int[3];
        int high = 0, stack = 0, same = 0;
        
        dice[0] = sc.nextInt();
        dice[1] = sc.nextInt();
        dice[2] = sc.nextInt();
        
        for(int i = 0; i < dice.length; i++) {
            if(dice[i] > high)
                high = dice[i];
            for(int j = i; j < dice.length; j++)
            	if(i != 2 && j != i && dice[i] == dice[j]) {
            		same = dice[i];
                    stack++;
            	}
        }
        
        switch(stack) {
            case 0:
                System.out.println(high * 100);
                break;
                
            case 1:
                System.out.println(1000 + same * 100);
                break;
                
            case 3:
                System.out.println(10000 + same * 1000);
                break;
        }
	}

}
