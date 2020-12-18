package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int i = 1;
		long factor = 1;
		for (i=1; i<=n; i++) {
			factor*=i;
		}
		System.out.println(factor);
	}
	
}