package baitappp;

import java.util.Scanner;

public class baiba {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
        long gt = 1;
        for(int i = 1; i <= n; i++){
            gt = gt * i;
        }
        System.out.println(gt);
	}
}
