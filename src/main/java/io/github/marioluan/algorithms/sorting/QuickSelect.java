package io.github.marioluan.algorithms.sorting;

import edu.princeton.cs.algs4.StdRandom;

/**
 * Recursive in-place, non stable implementation of quick select algorithm which
 * solves the select problem. <br>
 * <strong>Time complexity:</strong> O(N) on average <br>
 * <strong>Space complexity:</strong> O(??) <br>
 * References:
 * <ul>
 * <li><a>https://www.coursera.org/learn/algorithms-part1</a>.</li>
 * <li><a>https://en.wikipedia.org/wiki/Quickselect#/media/File:Selecting_quickselect_frames.gif</a></li>
 * </ul>
 * 
 * @author marioluan
 */
@SuppressWarnings("rawtypes")
public final class QuickSelect extends Sortable {

    /**
     * Select the element on index k after sorting the array a.
     * 
     * @param a
     * @param k
     *            the index from a after being sorted
     * @return returns the value of a[k] after sort
     */
    public static Comparable select(Comparable[] a, int k) {

        /**
         * Preserves randomness, performance guarantees.
         * E.g.: If the array is already sorted, it would take ~ 1/2 N ^2 of
         * compares. Since we're shuffling the array, it is extremely unlike to
         * happen. :)
         * <br>
         * Conclusion: Best case and Average cases would happen \o/.
         */
        StdRandom.shuffle(a);

        return select(a, k, 0, a.length - 1);
    }

    /**
     * Recursively select the element on index k of array a within lo and hi
     * bounds.
     * 
     * @param a
     * @param k
     * @param lo
     * @param hi
     * @return returns the value of a[k] after sort
     */
    private static Comparable select(Comparable[] a, int k, int lo, int hi) {
        if (hi <= lo)
            return a[k];

        int j = QuickSort.partition(a, lo, hi);

        if (j < k)
            lo = j + 1;
        else if (j > k)
            hi = j - 1;
        else
            return a[k];

        return select(a, k, lo, hi);
    }
}
