package io.github.marioluan.algorithms.sorting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static com.greghaskins.spectrum.Spectrum.describe;
import static com.greghaskins.spectrum.Spectrum.beforeEach;
import static com.greghaskins.spectrum.Spectrum.it;

import java.util.Arrays;
import java.util.Random;

import org.junit.runner.RunWith;

import com.greghaskins.spectrum.Spectrum;

import io.github.marioluan.algorithms.test.support.SupportHelper;

@SuppressWarnings("rawtypes")
@RunWith(Spectrum.class)
public class QuiSelectTest {

    private static final Random RANDOM = new Random();
    private Comparable[]        array  = null;
    private Comparable[]        clone  = null;
    private int                 n      = 0;
    private int                 k      = -1;

    {
        describe("MergeSortRecursive", () -> {
            describe(".select", () -> {

                describe("when array is small", () -> {
                    beforeEach(() -> {
                        n = RANDOM.nextInt(7) + 1;
                        array = SupportHelper.buildRandomArray(n);
                        clone = array.clone();
                        k = RANDOM.nextInt(n);
                    });

                    it("sorts it", () -> {
                        assertTrue(n >= 0);

                        Arrays.sort(clone);

                        assertEquals(clone[k], QuickSelect.select(array, k));
                    });
                });

                describe("when array is huge", () -> {
                    beforeEach(() -> {
                        n = RANDOM.nextInt((int) Math.pow(10, 6)) + 1;
                        array = SupportHelper.buildRandomArray(n);
                        clone = array.clone();
                        k = RANDOM.nextInt(n);
                    });

                    it("sorts it", () -> {
                        assertTrue(n >= 0);

                        Arrays.sort(clone);

                        assertEquals(clone[k], QuickSelect.select(array, k));
                    });
                });

                describe("when array is partially sorted", () -> {
                    beforeEach(() -> {
                        array = new Comparable[] { 1, 2, 3, 6, 9, 5, 10, 4, 11,
                                13, 14, 15, 16, 17, 18, 19, 20 };
                        clone = array.clone();
                        k = RANDOM.nextInt(array.length);
                    });

                    it("sorts it", () -> {
                        assertTrue(n >= 0);

                        Arrays.sort(clone);

                        assertEquals(clone[k], QuickSelect.select(array, k));
                    });
                });

            });
        });
    }
}
