package baitappp;

import java.util.Scanner;

public class baihai {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		float s = sc.nextFloat();
		s = 0;
		System.out.println(n);
		for( int i=1; i<=n ;i++) {
			s = s + (float)1/i;
		}
		System.out.println(s);
	}
}
