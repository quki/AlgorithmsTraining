package quki.algorithm.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ11399 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i =0; i<n;i++){
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		int d[] = new int[n];
		d[0] = a[0];
		int ans = d[0];
		for(int i =1; i<n;i++){
			d[i] = d[i-1] + a[i];
			ans += d[i];
		}
		System.out.println(ans);
	}

}
