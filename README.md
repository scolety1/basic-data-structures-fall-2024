# Basic Data Structures — Fall 2024

My Java coursework from Fall 2024, covering linked lists, queues, recursion and sorting.

## Where to start

Read [recursive sorting](Nov08/src/nov08/SortingAlgorithm.java), [linked lists](Lab_05/src/Lab05/SinglyLinkedList.java), and [queue exercises](Oct18/src/oct18/QueueLinkedList.java). These show explicit data representations, traversal and control flow rather than framework glue. Dated lecture folders, labs and larger assignments remain separate; not every folder is a completed application.

## Run a verified example

Verified with Java 21 on November 14, 2026. From the repository root:

```sh
javac -d build/demo Nov08/src/nov08/SortingAlgorithm.java Nov08/src/nov08/SortingAlgorithmDemo.java
java -cp build/demo nov08.SortingAlgorithmDemo
```

Compilation and the sample program completed successfully. The runnable demo uses recursive bubble sort. The adjacent iterative variant has an incorrect inner-loop bound and is not endorsed as correct. Empty-array behavior is not validated.

## About this archive

My early Java coursework, developed primarily by writing and debugging code directly. Course examples and starter code retain their original attribution.

These exercises were originally developed and kept on my computer, then uploaded together in November 2026. The recent Git history reflects that upload, not when I wrote the coursework. Original lab and project folders are retained as separate exercises.

README presentation was updated with AI assistance; exercise source is unchanged.
