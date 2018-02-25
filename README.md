# java-sorting-algorithms
Sorting algorithms written in Java.

[![Build Status](https://travis-ci.org/marioluan/java-sorting-algorithms.svg?branch=master)](https://travis-ci.org/marioluan/java-sorting-algorithms)
[![Coverage Status](https://coveralls.io/repos/github/marioluan/java-sorting-algorithms/badge.svg?branch=master)](https://coveralls.io/github/marioluan/java-sorting-algorithms?branch=master)
[![Dependency Status](https://www.versioneye.com/user/projects/58858fedb194d4003d528a95/badge.svg?style=flat-square)](https://www.versioneye.com/user/projects/58858fedb194d4003d528a95)
[![codebeat badge](https://codebeat.co/badges/382c573f-2c4e-4827-8b9d-6849394414f0)](https://codebeat.co/projects/github-com-marioluan-java-sorting-algorithms)

**Pre-requisites:**
- docker (17.12.0-ce, build c97c6d6)
- docker-compose (1.19.0)

## Test
```bash
docker-compose run gradle gradle clean test check
# Test summary will be located at `build/reports/tests/test/index.html`
# Coverage report will be located at `build/reports/jacoco/test/html/index.html`
# Code style issues report will be located at `build/reports/checkstyle/main.html`
```

## How to contribute
Head over [CONTRIBUTING.md](CONTRIBUTING.md).

## Available algorithms
- [Insertion Sort](https://github.com/marioluan/java-sorting-algorithms/blob/master/src/main/java/io/github/marioluan/algorithms/sorting/InsertionSort.java)
- [Selection Sort](https://github.com/marioluan/java-sorting-algorithms/blob/master/src/main/java/io/github/marioluan/algorithms/sorting/SelectionSort.java)
- [Shellsort](https://github.com/marioluan/java-sorting-algorithms/blob/master/src/main/java/io/github/marioluan/algorithms/sorting/ShellSort.java)
- Merge Sort
  - [Recursive](https://github.com/marioluan/java-sorting-algorithms/blob/master/src/main/java/io/github/marioluan/algorithms/sorting/MergeSortRecursive.java)
  - [Iterative](https://github.com/marioluan/java-sorting-algorithms/blob/master/src/main/java/io/github/marioluan/algorithms/sorting/MergeSortIterative.java)
- Quick Sort
  - [Quick Sort](https://github.com/marioluan/java-sorting-algorithms/blob/master/src/main/java/io/github/marioluan/algorithms/sorting/QuickSort.java)
  - [Quick Select](https://github.com/marioluan/java-sorting-algorithms/blob/master/src/main/java/io/github/marioluan/algorithms/sorting/QuickSelect.java)
  - [3-way Partitioning](https://github.com/marioluan/java-sorting-algorithms/blob/master/src/main/java/io/github/marioluan/algorithms/sorting/ThreeWayQuickSort.java)
- [Heap Sort](https://github.com/marioluan/java-sorting-algorithms/blob/master/src/main/java/io/github/marioluan/algorithms/sorting/HeapSort.java)

## References
- [https://www.coursera.org/learn/algorithms-part1](https://www.coursera.org/learn/algorithms-part1)
- [https://www.coursera.org/learn/algorithms-part2](https://www.coursera.org/learn/algorithms-part2)
