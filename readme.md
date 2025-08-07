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

### Exercise 3: delete() - Deleting Content

**Code to run:**
```
public class ExploringStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("This is a test sentence.");
        // Deletes " a test"
        sb.delete(8, 16); 
        System.out.println("After delete(8, 16): " + sb);

        // Deletes the character at index 4 (the ' ')
        sb.deleteCharAt(4);
        System.out.println("After deleteCharAt(4): " + sb);
    }
}
```
**Predicted Output:**
```
After delete(8, 16): This is entence.
After deleteCharAt(4): Thisis entence.
```

**Actual Output:**

<img src="https://github.com/ethan-josh/Exploring-Java-StringBuilder/blob/main/images/Ex3.png"/>

**Explanation:**

delete(int start, int end) removes the sequence of characters from the start index up to, but not including, the end index. Here, it removes the characters from index 8 ("a") to 15 ("t").

deleteCharAt(int index) removes the single character at the specified index. Here, it removes the space at index 4.

---

