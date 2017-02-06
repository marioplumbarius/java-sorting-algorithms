package io.github.marioluan.algorithms.sorting;

import edu.princeton.cs.algs4.StdRandom;

/**
 * Recursive in-place, non stable implementation of quick sort algorithm. <br>
 * <strong>Time complexity:</strong> O(N log N) on average<br>
 * <strong>Space complexity:</strong> O(log n) on average<br>
 * References:
 * <ul>
 * <li><a>https://www.coursera.org/learn/algorithms-part1</a>.</li>
 * <li><a>https://upload.wikimedia.org/wikipedia/commons/6/6a/Sorting_quicksort_anim.gif</a></li>
 * </ul>
 * 
 * @author marioluan
 */
@SuppressWarnings("rawtypes")
public final class QuickSort extends Sortable {

    private static final int CUTOFF = 10;

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
        // Improves the running time by ~ 20% for tiny subarrays.
        if (hi <= lo + CUTOFF - 1) {
            InsertionSort.sort(a, lo, hi);
            return;
        }

        /**
         * TODO: compute a random medium of 3 numbers from the array a, so that
         * we can improve the running time of the algorithm by 10%.
         * E.g.:
         * int m = medianOf3(a, lo, lo + (hi - lo) / 2, hi);
         * swap(a, lo, m); // place the m into the first position of the array,
         * so the partition function chooses it
         */
        int j = partition(a, lo, hi);

        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    /**
     * Partition the array a within its lo and hi bounds.
     * 
     * @param a
     * @param lo
     * @param hi
     * @return returns the index of the element in place after the partition
     */
    protected static int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;

        while (true) {
            // move the cursor from left -> right
            while (less(a[++i], a[lo]))
                if (i == hi)
                    break;

            // move the cursor from right -> left
            while (less(a[lo], a[--j])) {
                // redundant, 'cause when a[lo] == a[--j], it automatically
                // breaks the loop :)
                if (j == lo)
                    break;
            }

            // stop when i and j pointers cross
            if (i >= j)
                break;

            /**
             * When we got here, a[i] is greater than a[j] so we need to
             * exchange them, so that
             * all elements from left of a[lo] are lower than a[lo] and all
             * elements to the right of a[lo] are greater than a[lo]
             */
            swap(a, i, j);
        }

        // when pointers cross, puts the pivot element in place
        swap(a, lo, j);

        // returns the index of item now known to be in place
        return j;
    }
}
