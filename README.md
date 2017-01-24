# java-sorting-algorithms
Implementations of sorting algorithms using Java.

[![Build Status](https://travis-ci.org/marioluan/java-sorting-algorithms.svg?branch=master)](https://travis-ci.org/marioluan/java-sorting-algorithms)
[![Coverage Status](https://coveralls.io/repos/github/marioluan/java-sorting-algorithms/badge.svg?branch=master)](https://coveralls.io/github/marioluan/java-sorting-algorithms?branch=master)
[![Dependency Status](https://www.versioneye.com/user/projects/58858fedb194d4003d528a95/badge.svg?style=flat-square)](https://www.versioneye.com/user/projects/58858fedb194d4003d528a95)

--

**Pre-requisites:**
- java (v1.8)
- gradle (v3.3)

## Code style & formatter (eclipse users only)
Import the files [code-style.xml](code-style.xml) and [formatter.xml](formatter.xml) into your IDE.

## Test
Coverage report will be located at `build/reports/cobertura/index.html`.
```bash
gradle clean coberturaCheck test
```

## Code style
You may run this command to automatically detect code style issues.
```bash
gradle check
```

## Build
```bash
gradle clean assemble
```

## Available algorithms
- [Insertion Sort](https://github.com/marioluan/java-sorting-algorithms/blob/master/src/main/java/io/github/marioluan/algorithms/sorting/InsertionSort.java)
- [Selection Sort](https://github.com/marioluan/java-sorting-algorithms/blob/master/src/main/java/io/github/marioluan/algorithms/sorting/SelectionSort.java)

## References
- [https://www.coursera.org/learn/algorithms-part1](https://www.coursera.org/learn/algorithms-part1)
