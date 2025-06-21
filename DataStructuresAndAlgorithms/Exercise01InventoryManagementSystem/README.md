# Inventory Management System

## Why Data Structures and Algorithms are Essential

Efficient handling of inventory data requires optimal storage, quick retrieval, and scalable operations. 
Data Structures like HashMap allow constant time operations like add, update, and delete, which are crucial for real-time inventory management.

---

## Data Structures Used

- `HashMap<Integer, Product>`: Used for fast access via `productId`.

---

## Features

- Add new products
- Update product quantity and price
- Delete products
- Display full inventory

---

##  Time Complexity Analysis

| Operation | Time Complexity | Explanation |
|----------|-----------------|-------------|
| Add      | O(1)            | Uses HashMap key insertion |
| Update   | O(1)            | Direct access using productId |
| Delete   | O(1)            | HashMap removal is constant time |

---

##  Sample Output

Product added.
Product added.
ID: 101, Name: Laptop, Quantity: 10, Price: $75000.0
ID: 102, Name: Mouse, Quantity: 50, Price: $500.0
Product updated.
Product deleted.
ID: 101, Name: Laptop, Quantity: 8, Price: $72000.0
 

