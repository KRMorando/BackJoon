package stage2;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F
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
