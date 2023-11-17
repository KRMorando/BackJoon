package stage1;

import java.util.Scanner;

public class Remainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0, c = 0;
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        // (A+B)%C
        System.out.println((a + b) % c);
        // ((A%C) + (B%C))%C
        System.out.println(((a % c) + (b + c)) % c);
        // (A¡¿B)%C
        System.out.println((a * b) % c);
        // ((A%C) ¡¿ (B%C))%C
        System.out.println(((a % c) * (b % c)) % c);
	}

}
