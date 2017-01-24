package io.github.marioluan.algorithms.sorting;

/**
 * Iterative stable implementation of merge sort algorithm. <br>
 * <strong>Time complexity:</strong> O(N log N) <br>
 * <strong>Space complexity:</strong> O(n) <br>
 * References:
 * <ul>
 * <li><a>https://www.coursera.org/learn/algorithms-part1</a>.</li>
 * <li><a>https://upload.wikimedia.org/wikipedia/commons/c/cc/Merge-sort-example-300px.gif</a></li>
 * </ul>
 * 
 * @author marioluan
 */
public final class MergeSortIterative extends Sortable {

    private MergeSortIterative() {
    }

    /**
     * Sort items from array a.
     * 
     * @param a
     */
    @SuppressWarnings("rawtypes")
    public static void sort(Comparable[] a) {
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux);
    };

    /**
     * Iteratively sort items from array a.
     * 
     * @param a
     * @param aux
     * @param lo
     * @param hi
     */
    @SuppressWarnings("rawtypes")
    private static void sort(Comparable[] a, Comparable[] aux) {
        int n = a.length;
        for (int size = 1; size < n; size = size + size)
            for (int lo = 0; lo < n - size; lo += size + size)
                merge(a, aux, lo, lo + size - 1,
                        Math.min(lo + size + size - 1, n - 1));
    }

    /**
     * Merge sorted sub-arrays a and aux.
     * 
     * @param a
     * @param aux
     * @param lo
     * @param mid
     * @param hi
     */
    @SuppressWarnings("rawtypes")
    private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid,
            int hi) {
        copy(a, aux, lo, hi);
        int i = lo;
        int j = mid + 1;

        for (int k = lo; k <= hi; k++) {
            if (i > mid)
                a[k] = aux[j++];
            else if (j > hi)
                a[k] = aux[i++];
            else if (lessOrEqual(aux[j], aux[i]))
                a[k] = aux[j++];
            else
                a[k] = aux[i++];
        }
    }
}
