package chuong5;
// kiem t ra  doi xung
import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("nhap SL mang: ");
		int a = input.nextInt();
		int arrays[] = nhap(a,input);
		xuatMang(arrays);
		if(kiemTraDX(arrays, a)==-1) {
			System.out.println("k doi xung");
		}else {
			System.out.println("doi xung");
		}
	}

	private static int[] nhap(int a, Scanner input) {
		int  b[] = new int[a];
		for (int i = 0; i < b.length; i++) {
			System.out.println("nhap [" + i + " ]= ");
			b[i]=input.nextInt();
		}
		return b;
	}
	
	private static void xuatMang(int a[]) {
		for (int i : a) {
			System.out.println(i);
		}
	}
	
	private static  int  kiemTraDX(int a[],int  n) {
		for(int i = 0; i < n/2; i++)
		{
			if(a[i] != a[n - i - 1])
			{
				return -1;
				
			}
		}
		return 1;
	}
}
