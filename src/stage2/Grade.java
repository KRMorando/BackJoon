package stage2;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F
        Scanner sc = new Scanner(System.in);
        int grade = 0;
        
        grade = sc.nextInt();
        if(!(grade >= 0) && !(grade <= 100))
            grade = 0;
        
        if(grade >= 90)
            System.out.println("A");
        else if(grade >= 80)
            System.out.println("B");
        else if(grade >= 70)
            System.out.println("C");
        else if(grade >= 60)
            System.out.println("D");
        else
            System.out.println("F");
	}

}
