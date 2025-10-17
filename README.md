# Loops-java

# 🔁 Java Loops Demonstration

This program `l.java` shows **all basic looping techniques in Java** — including `while`, `do-while`, `for`, infinite loops, and nested loops — with clear examples and explanations.

---

## 🧠 Concepts Covered

### 1️⃣ `do-while` Loop
- Executes **at least once**, even if the condition is false.
- Condition is checked **after** the loop body.

```java
int i = 1;
do {
    System.out.println("hii");
    i++;
} while (i > 5);
```
```infinte loop
int p = 1;
while (true) {
    System.out.println("nani");
    p++;
    if (p > 3) break;
}
```
```for loop
for (int o = 1; o < 5; o++) {
    System.out.println("DAY " + o);
    for (int h = 9; h < 18; h++) {
        System.out.println(" " + h + "-" + (h + 1));
    }
}
```
**based on given condition it takes how many times to loop the data , if you know exactly how many times to loop use **FOR** loop or for unstandard loop which you dont know exactly how many times to loop use   **WHILE** loop and use **DO WHILE** loop when you want to execute the loop once even the condition is false 

# 🔁 Nested Loops in Java

## 🧩 What Are Nested Loops?

A **nested loop** means one loop is **inside another loop**.  
For every single iteration of the **outer loop**, the **inner loop** runs completely.

🧠 Common use cases:
- Pattern printing (stars, numbers)
- Working with **2D arrays**
- Multiplication tables
- Comparing elements in nested structures

---

 

