package baitappp;

import java.util.Scanner;

public class baibon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n);
		boolean kt = false;
		if(n<2) {
			kt = true;
		}
			for(int i=2; i<=n/2; i++){
			if(n%i==0){
				kt = true;
				break;
			}
		kt = false;
	}
	if (!kt)
	      System.out.println(n + " la so nguyen to"); 
	    else
	      System.out.println(n + " khong phai la so nguyen to");
	}
}