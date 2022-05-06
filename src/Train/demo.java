package Train;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		demo demo = new demo();
		int arr[] = { 1, 2, 3, 4, 5 };
		demo.rotate(arr, 5);

		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int x = sc.nextInt();
			// Complete this line
		}
		System.out.println("================================");

	}

	public void rotate(int arr[], int n) {
		int x = arr[n - 1];
		for (int i = n - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = x;
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		//checking abc
	}
}
