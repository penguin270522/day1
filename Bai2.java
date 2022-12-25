package chuong5;
//kiem tra so n dau tien
import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		display();
	}
	public static boolean kiemtrasnt(int a) {
		if(a < 2) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(a);i++) {	
			if( a % i == 0) {
				return false;
			}
		}
		return true;
	}
	static void display() {
		
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();	
		int i = 2;
		int count = 0;
		while(count < num) {
			if(kiemtrasnt(i)) {
				System.out.println(" " + i	);
				count++;
			}
			i++;
		}
	}
}
