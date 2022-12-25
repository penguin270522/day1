package chuong5;

import java.util.Scanner;

// nhap vao so nguyen phan tu n va tinh tong so nguyen trong mang
public class Bai1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("nhap phan tu trong mang: ");
		int a = input.nextInt();
		int sum[] = new int[a];
		
		// nhap mang
		for (int i = 0; i < sum.length; i++) {
			System.out.print("nhap phan tu [" + i + "] = ");
			sum[i] = input.nextInt();
		}
		
		int summ = 0;
		for (int i : sum) {
			summ += i;
		}
		System.out.print("tong phan tu trong mang = " + summ);
	}
}
