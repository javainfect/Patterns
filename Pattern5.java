package Patterns;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		
		//pyramid
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for ( int r = 1; r <= n; r++){
			
			for ( int c = 1; c <= n-r+1; c++){
				System.out.print(" ");
			}
			
			for ( int c = 1; c <= r; c++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
