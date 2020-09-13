package com.blackdog;

import java.util.*;

public class FibonnaciSeries {

	private static final int SIZE = 10;

	public static int[] val = new int[SIZE];

	public static int nThfibonnaciValue(int n) {
		if (n == 0 || n == 1) return val[n];
		if (val[n] != -1) return val[n];
		return val[n] = nThfibonnaciValue(n - 1) + nThfibonnaciValue(n - 2);
	}

	// initialization
	static {
		for (int i = 0; i < SIZE; ++i) val[i] = -1;
		val[0] = val[1] = 1;
	}

	public static void main(String[] args) {
		// An+2 = An+1 + An
		// A0 = 1, A1 = 1
		for (int idx = 0; idx < FibonnaciSeries.SIZE; ++idx) {
			System.out.println(FibonnaciSeries.nThfibonnaciValue(idx));
		}
	}

}
