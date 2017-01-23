package io.github.marioluan.algorithms.sorting;

import static org.junit.Assert.*;
import static com.greghaskins.spectrum.Spectrum.*;

import java.util.Arrays;
import java.util.Random;

import org.junit.runner.RunWith;

import com.greghaskins.spectrum.Spectrum;

import io.github.marioluan.algorithms.sorting.InsertionSort;
import io.github.marioluan.algorithms.test.support.SupportHelper;

@SuppressWarnings("rawtypes")
@RunWith(Spectrum.class)
public class InsertionSortTest {

	private final Random	RANDOM	= new Random();
	private Comparable[]	array	= null;
	private Comparable[]	clone	= null;
	private int				N		= 0;

	{
		describe("InsertionSort", () -> {
			describe(".sort", () -> {

				describe("when array is small", () -> {
					beforeEach(() -> {
						N = RANDOM.nextInt(7) + 1;
						array = SupportHelper.buildRandomArray(N);
						clone = array.clone();
					});

					it("sorts it", () -> {
						Arrays.sort(clone);
						InsertionSort.sort(array, 0, array.length - 1);

						assertArrayEquals(array, clone);
					});
				});

				describe("when array is huge", () -> {
					beforeEach(() -> {
						N = RANDOM.nextInt((int) Math.pow(10, 5)) + 1;
						array = SupportHelper.buildRandomArray(N);
						clone = array.clone();
					});

					it("sorts it", () -> {
						Arrays.sort(clone);
						InsertionSort.sort(array, 0, array.length - 1);

						assertArrayEquals(array, clone);
					});
				});

				describe("when array is partially sorted", () -> {
					beforeEach(() -> {
						array = new Comparable[] { 1, 2, 3, 6, 9, 5, 10, 4, 11,
								13, 14, 15, 16, 17, 18, 19, 20 };
						clone = array.clone();
					});

					it("sorts it", () -> {
						Arrays.sort(clone);
						InsertionSort.sort(array, 0, array.length - 1);

						assertArrayEquals(array, clone);
					});
				});

			});
		});
	}
}
