package io.github.marioluan.algorithms.test.support;

import java.util.Random;

/**
 * Helper utilities to work with tests.
 * 
 * @author marioluan
 *
 */
public final class SupportHelper {
	private static final Random RANDOM = new Random();

	/**
	 * Builds a random array.
	 * 
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static Comparable[] buildRandomArray(int size) {
		Comparable[] a = new Comparable[size];

		for (int i = 0; i < size; i++)
			a[i] = RANDOM.nextInt();

		return a;
	}
}
