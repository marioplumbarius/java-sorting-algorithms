package io.github.marioluan.algorithms.sorting;

/**
 * In-place, non stable implementation of heap sort algorithm.<br>
 * The only sorting algorithm which is both in-place and O(n log n) in<br>
 * worst-case.
 * <strong>Time complexity:</strong> O(n log n)
 * <strong>Space complexity:</strong> O(1)
 * 
 * @author marioluan
 */
public final class HeapSort {
    private HeapSort() {
    }

    /**
     * Sort the array in ascending order.
     * 
     * @param a
     */
    @SuppressWarnings("rawtypes")
    public static void sort(Comparable[] a) {
        int n = a.length;
        buildMaxHeap(a, n);
        sortDown(a, n);
    }

    /**
     * Build a max-heap from the array a and size n.
     * 
     * @param a
     * @param n
     */
    @SuppressWarnings("rawtypes")
    private static void buildMaxHeap(Comparable[] a, int n) {
        for (int k = n / 2; k >= 1; k--)
            sink(a, k, n);
    }

    /**
     * Sort the array a with size n.
     * 
     * @param a
     * @param n
     */
    @SuppressWarnings("rawtypes")
    private static void sortDown(Comparable[] a, int n) {
        while (n > 1) {
            swap(a, 1, n--);
            sink(a, 1, n);
        }
    }

    /**
     * Perform a top-down heapify on array a.
     * 
     * @param a
     *            the array to be sank
     * @param k
     *            the parent key to be used as the starting point for the sink
     *            operation
     * @param n
     *            the size of the array
     */
    @SuppressWarnings("rawtypes")
    private static void sink(Comparable[] a, int k, int n) {
        while (2 * k <= n) {
            int j = 2 * k;

            // is right key greater than left key?
            if (j < n && less(a, j, j + 1))
                j++;

            // when both right and left child are not greater than parent
            if (!less(a, k, j))
                break;

            // moves the greater key up
            swap(a, k, j);

            k = j;
        }
    }

    /**
     * Is value at index i lesser than at index j from array a?
     * 
     * @param a
     * @param i
     * @param j
     * @return whether the value of a[i] is lesser than a[j]
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    private static boolean less(Comparable[] a, int i, int j) {
        return a[i - 1].compareTo(a[j - 1]) < 0;
    }

    /**
     * Exchange value at index i by value at index j from array a.
     * 
     * @param a
     * @param i
     * @param j
     */
    private static void swap(Object[] a, int i, int j) {
        Object tmp = a[i - 1];
        a[i - 1] = a[j - 1];
        a[j - 1] = tmp;
    }
}
