# Name: Ethan Joshua Camingao
## Exploring Java StringBuilder

---

### Exercise 1: append() - Appending Content

**Code to run:**
```
public class ExploringStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", Cadets!");
        System.out.println(sb);
    }
}
```
**Predicted Output:**
```
Hello, Cadets
```

**Actual Output:**

<img src="https://github.com/ethan-josh/Exploring-Java-StringBuilder/blob/main/images/Ex1.png"/>

**Explanation:**

The append() method adds the specified content to the end of the existing sequence. Notice that the original StringBuilder object sb is modified directly. You can append different data types like String, int, and char, which are automatically converted to their string representation.

**Additional:**

<img src="https://github.com/ethan-josh/Exploring-Java-StringBuilder/blob/main/images/Ex1-additional.png"/>

---

### Exercise 2: insert() - Inserting Content at a Position

**Code to run:**
```
public class ExploringStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java is great!");
        sb.insert(8, "really ");
        System.out.println(sb);
    }
}
```
**Predicted Output:**
```
Java is really great!
```

**Actual Output:**

<img src="https://github.com/ethan-josh/Exploring-Java-StringBuilder/blob/main/images/Ex2.png"/>

**Explanation:**

The insert(int offset, String str) method adds the string str at the index specified by offset. In this case, "really " is inserted starting at index 8. The original text "great!" is pushed to the right to make space.

---