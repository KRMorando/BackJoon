package stage2;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.
        Scanner sc = new Scanner(System.in);
        int year = 0;
        
        year = sc.nextInt();
        if(!(year >= 1) && !(year <= 4000))
            year = 0;
        
        if((year % 4) == 0) {
            if((year % 100) != 0 || (year % 400) == 0)
                System.out.println("1");
            else
                System.out.println("0");
        }
        else
            System.out.println("0");
	}

}
