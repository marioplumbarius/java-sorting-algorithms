package io.github.marioluan.algorithms.sorting;

/**
 * In-place, non-stable implementation of selection sort algorithm. <br>
 * <strong>Time complexity:</strong> O(N^2) <br>
 * <strong>Space complexity:</strong> O(1) <br>
 * References:
 * <ul>
 * <li><a>https://www.coursera.org/learn/algorithms-part1</a>.</li>
 * <li><a>https://upload.wikimedia.org/wikipedia/commons/b/b0/Selection_sort_animation.gif</a></li>
 * </ul>
 * 
 * @author marioluan
 */
public final class SelectionSort extends Sortable {

    private SelectionSort() {
    }

    /**
     * Sort the elements from array a.
     * 
     * @param a
     */
    @SuppressWarnings("rawtypes")
    public static void sort(Comparable[] a) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            int min = findMin(a, i, n);
            swap(a, i, min);
        }
    }
}
