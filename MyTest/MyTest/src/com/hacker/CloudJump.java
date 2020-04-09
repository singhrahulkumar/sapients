package com.hacker;

public class CloudJump {

	public static void main(String[] args) {
		int ar[] = { 0, 0, 1, 0, 0, 1, 0 };
		// int ar[] = {0,0,0,0,1,0};
		// int ar[] = { 0, 0, 0, 1, 0, 0 };
		int n = cloudJump(ar);
		System.out.println(n);
	}

	private static int cloudJump(int[] ar) {

		int i = 0;
		int j = 0;
		while (i < (ar.length - 2)) {

			if (ar[i + 2] == 0)
				i = i + 2;
			else
				i = i + 1;
			j = j + 1;

		}
		if (i != ar.length - 1) {
			j = j + 1;
		}
		return j;
	}

}
