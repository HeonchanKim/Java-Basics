package day10;

import java.util.Random;
import java.util.Scanner;

public class UpDownGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int num = random.nextInt(100)+1;
		int user = -1;
		while(user!=num) {
			System.out.print("���� �Է�:");
			user = sc.nextInt();
			//user==num
			if(user==num) {
				System.out.println("�����Դϴ�!");
			}
			//user>num down
			else if(user>num) {
				System.out.println("Down!");
			}
			//user<num up
			else {
				System.out.println("Up!");
			}
		}
	}
}
