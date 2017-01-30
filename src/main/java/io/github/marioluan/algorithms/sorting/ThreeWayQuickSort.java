package io.github.marioluan.algorithms.sorting;

import edu.princeton.cs.algs4.StdRandom;

/**
 * Recursive in-place, non stable implementation of quick sort with 3-way
 * partitioning. <br>
 * <strong>Time complexity:</strong> O(N log N) <br>
 * <strong>Space complexity:</strong> O(??) <br>
 * References:
 * <ul>
 * <li><a>https://www.coursera.org/learn/algorithms-part1</a>.</li>
 * <li><a>http://algs4.cs.princeton.edu/23quicksort/images/partitioning3.png</a></li>
 * </ul>
 * 
 * @author marioluan
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public final class ThreeWayQuickSort extends Sortable {

    /**
     * Sort the array a.
     * 
     * @param a
     *            the array to be sorted
     */
    public static void sort(Comparable[] a) {

        /**
         * Preserves randomness, performance guarantees.
         * E.g.: If the array is already sorted, it would take ~ 1/2 N ^2 of
         * compares. Since we're shuffling the array, it is extremely unlike to
         * happen. :)
         * <br>
         * Conclusion: Best case and Average cases would happen \o/.
         */
        StdRandom.shuffle(a);

        sort(a, 0, a.length - 1);
    }

    /**
     * Recursively sort the array a within lo and hi bounds.
     * 
     * @param a
     *            the array to be sorted
     * @param lo
     *            lower bound
     * @param hi
     *            upper bound
     */
    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo)
            return;

        int lt = lo;
        int gt = hi;
        Comparable v = a[lo];
        int i = lo;

        // moving keys
        while (i <= gt) {
            int cmp = a[i].compareTo(v);
            if (cmp < 0)
                swap(a, lt++, i++);
            else if (cmp > 0)
                swap(a, i, gt--);
            else
                i++; // this happens when we found duplicate keys. E.g.: first round a[i] == v.
            
        }

        sort(a, lo, lt - 1);
        sort(a, gt + 1, hi);
    }
}
