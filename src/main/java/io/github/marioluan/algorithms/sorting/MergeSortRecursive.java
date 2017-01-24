package io.github.marioluan.algorithms.sorting;

/**
 * Recursive stable implementation of merge sort algorithm. <br>
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
public final class MergeSortRecursive extends Sortable {

    private MergeSortRecursive() {
    }

    // cutoff to define small sub-arrays to be sorted by insertion sort
    private static final int CUTOFF = 7;

    /**
     * Sort items from array a.
     * 
     * @param a
     */
    @SuppressWarnings("rawtypes")
    public static void sort(Comparable[] a) {
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux, 0, a.length - 1);
    }

    /**
     * Recursively sort items from array a within lo and hi bounds.
     * 
     * @param a
     * @param aux
     * @param lo
     * @param hi
     */
    @SuppressWarnings("rawtypes")
    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
        // use insertion sort for small sub-arrays
        // ~ 20% faster
        if (hi <= lo + CUTOFF - 1) {
            InsertionSort.sort(a, lo, hi);
            return;
        }

        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);

        // helps for partially-ordered arrays
        // stop if first biggest item in first half <= smallest item in second
        // half
        if (!lessOrEqual(a[mid + 1], a[mid]))
            return;

        merge(a, aux, lo, mid, hi);
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
