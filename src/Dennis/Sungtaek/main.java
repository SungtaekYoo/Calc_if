package Dennis.Sungtaek;

import java.util.Scanner;

public class main {
	public static int sum(int x, int y) {
		return x+y;
	}
	public static int minus(int x, int y) {
		return x-y;
	}
	public static int multiple(int x, int y) {
		return x*y;
	}
	public static int divide(int x, int y) {
		return x/y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice, a, b;
		
		System.out.println("1. ����");
		System.out.println("2. ����");
		System.out.println("3. ����");
		System.out.println("4. ����");
		
		choice = sc.nextInt();
		if(choice == 1) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(sum(a, b));
		}
		
		else if(choice == 2) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(minus(a, b));
		}
		
		else if(choice == 3) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(multiple(a, b));
		}
		
		else if(choice == 4) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(divide(a, b)); //�� ����
		}
		
		else
			System.out.println("��ȣ���� �߸���");
	}

}
