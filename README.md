# Basic Data Structures — Fall 2024

A collection of Java course exercises uploaded by Spencer Colety. Keep this as one browsable archive rather than many tiny repositories.

## Where to start

Read [recursive sorting](Nov08/src/nov08/SortingAlgorithm.java), [linked lists](Lab_05/src/Lab05/SinglyLinkedList.java), and [queue exercises](Oct18/src/oct18/QueueLinkedList.java). These show explicit data representations, traversal and control flow rather than framework glue. Dated lecture folders, labs and larger assignments remain separate; not every folder is a completed application.

## Run a verified example

Verified with Java 21 on November 14, 2026. From the repository root:

```sh
javac -d build/demo Nov08/src/nov08/SortingAlgorithm.java Nov08/src/nov08/SortingAlgorithmDemo.java
java -cp build/demo nov08.SortingAlgorithmDemo
```

Compilation and the sample program completed successfully. The runnable demo uses recursive bubble sort. The adjacent iterative variant has an incorrect inner-loop bound and is not endorsed as correct. Empty-array behavior is not validated.

## Contribution and reuse

The Git history records a bulk upload by `scolety1`, which establishes collection stewardship but does not distinguish student-authored methods from instructor starter code, examples or teammate work. Existing source credits remain authoritative. This archive should not be represented as wholly original or independently hand-coded without file-level confirmation.

No new assignment solutions or instructor materials were added for this documentation update. Course restrictions and third-party rights still apply; public availability is not a blanket reuse license. This README was prepared with AI assistance. The exercise source was left unchanged.
