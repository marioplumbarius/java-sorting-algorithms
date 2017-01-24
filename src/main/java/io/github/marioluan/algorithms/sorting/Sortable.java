package io.github.marioluan.algorithms.sorting;

/**
 * Abstract layer for sorting algorithms' implementation.
 * 
 * @author marioluan
 */
public abstract class Sortable {

    /**
     * Check whether {@link Comparable a} is lesser than {@link Comparable b}.
     *
     * @param a
     * @param b
     * @return returns whether a is lesser than b
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    /**
     * Swap item in position i by item in position j from array {@link a}.
     *
     * @param a
     * @param i
     * @param j
     */
    @SuppressWarnings("rawtypes")
    static void swap(Comparable[] a, int i, int j) {
        Comparable copy = a[i];
        a[i] = a[j];
        a[j] = copy;
    }
}
