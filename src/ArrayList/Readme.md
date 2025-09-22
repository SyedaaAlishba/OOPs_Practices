# 📘 Dynamic Array Simulation in Java

## 📌 Overview
This program demonstrates how **ArrayList in Java** works internally.  
Since a normal array in Java has a **fixed size**, we simulate the behavior of a **resizable array**:

- Start with a small array of capacity `5`.
- If the array becomes full, create a **new larger array**.
- Copy old elements into the new array.
- Continue inserting new values.

This mimics how `ArrayList` grows automatically when more elements are added.

---

## 🛠 Features
- User enters how many numbers they want to store.
- Program starts with an array of capacity **5**.
- If the array becomes full:
  - Capacity is increased using the formula:
    ```
    newCapacity = (oldCapacity * 3 / 2) + 1
    ```
  - A new array is created with this larger size.
  - Old elements are copied into the new array.
  - The reference `arr` now points to this bigger array.
- Finally, all stored elements are printed.

---

## 📂 Code Flow
1. **Input `n`** → number of elements the user wants to insert.  
2. **Initialize capacity = 5** and create `arr`.  
3. For each element:  
   - If array is full, resize.  
   - Insert the new value.  
4. After loop, display all elements.

---

## 🖥 Example Run
Input:
7
10 20 30 40 50 60 70

Output:
Stored elements:
10 20 30 40 50 60 70

**Explanation:**
- First 5 values fit into the original array.
- At the 6th element, the array resizes from **5 → 8** capacity.
- Remaining elements are inserted safely.

---

## 🔑 Key Learning
- **Normal arrays in Java are fixed in size.**
- To make them **dynamic**, we create a bigger array when needed.
- This program shows the internal working concept of **ArrayList** in Java.
