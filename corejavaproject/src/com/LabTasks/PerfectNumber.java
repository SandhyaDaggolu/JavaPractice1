package com.LabTasks;

// Perfect Number ==> sum of the factors is equal to the given number like if i give 6 then it will become 
// factors for 6 is 1,2,3==> 1+2+3=6

public class PerfectNumber {

	public static void main(String[] args) {
		for (int n = 1; n < 100; n++) {
			int sum = 0;
			int i = 1;

			while (i < n) {
				if (n % i == 0) {
					sum = sum + i;
				}
				i++;
			}
			if (sum == n) {
				System.out.println("The perfect Number is : " + n);
			}

		}

	}
}
