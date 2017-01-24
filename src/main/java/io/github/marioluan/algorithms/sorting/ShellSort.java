package io.github.marioluan.algorithms.sorting;

/**
 * In-place, non-stable implementation of shellsort algorithm. <br>
 * <strong>Time complexity:</strong> O(N^1.5) <br>
 * <strong>Space complexity:</strong> O(1) <br>
 * References:
 * <ul>
 * <li><a>https://www.coursera.org/learn/algorithms-part1</a>.</li>
 * <li><a>https://upload.wikimedia.org/wikipedia/commons/d/d8/Sorting_shellsort_anim.gif</a></li>
 * </ul>
 * 
 * @author marioluan
 */
public class ShellSort extends Sortable {

    private static final int C = 3;

    /**
     * Sort the items from array a.
     * 
     * @param a
     */
    @SuppressWarnings("rawtypes")
    public static void sort(Comparable[] a) {
        int n = a.length;
        int h = 1;

        // 3x+1 increment sequence
        while (h < n / C)
            h = (C * h) + 1; // 1, 4, 13, 40, 121, 363, ...

        while (h >= 1) {
            // h-sort the array
            // insertion sort
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j = j - h)
                    swap(a, j, j - h);

            }

            h = h / C;
        }

    }
}
