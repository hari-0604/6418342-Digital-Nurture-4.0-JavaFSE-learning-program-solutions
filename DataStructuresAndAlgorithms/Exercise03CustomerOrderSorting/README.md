# Customer Order Sorting - Java

## Objective

Sort customer orders by total price using two different sorting algorithms: Bubble Sort and Quick Sort.

---

## Sorting Algorithms Overview

| Algorithm      | Time Complexity (Avg) | Space | Notes |
|----------------|------------------------|--------|-------|
| Bubble Sort    | O(n²)                 | O(1)   | Simple, but inefficient for large data |
| Quick Sort     | O(n log n)            | O(log n)| Fast and preferred for most real-world cases |

---

## Data Structure Used

- `Order[]`: An array of custom objects

---

##  Features

- Sorts orders based on `totalPrice`
- Implements Bubble Sort and Quick Sort
- Prints sorted results

---

## How to Run

```bash
javac src/*.java
java src.MainTest
