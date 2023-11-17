package stage1;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int seat_1 = b % 100 % 10;
		int seat_10 = b % 100 - seat_1;
		int seat_100 = b - (seat_1 + seat_10);
		
		System.out.println(a * seat_1);
		System.out.println((a * seat_10) / 10);
		System.out.println((a * seat_100) / 100);
		System.out.println(a * b);
	}

}
