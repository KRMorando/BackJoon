package stage3;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// N�� 1���� ũ�ų� ����, 9���� �۰ų� ����.
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        if(!(num >= 1) || !(num <= 9))
            num = 0;
        
        for(int i = 1; i < 10; i++)
            System.out.println(num + " * " + i + " = " + (num*i));
	}

}
