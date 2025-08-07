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

### Exercise 4: replace() - Replacing a Section

**Code to run:**
```
public class ExploringStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("I like programming in Python.");
        sb.replace(24, 30, "Java");
        System.out.println(sb);
    }
}
```
**Predicted Output:**
```
I like programming in PyJava
```

**Actual Output:**

<img src="https://github.com/ethan-josh/Exploring-Java-StringBuilder/blob/main/images/Ex4.png"/>

**Explanation:**

The replace(int start, int end, String str) method removes the characters in the range from start to end-1 and then inserts str at the start position. Here, "thon." (from index 24 to 30(beyond length)) is replaced with "Java".

---

### Exercise 5: replace() - Replacing a Section

**Code to run:**
```
public class ExploringStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Start");
        sb.append("...").insert(0, "Ready, Set, ").delete(12, 15);
        System.out.println(sb);
    }
}
```
**Predicted Output:**
```
Ready, Set, rt...
```

**Actual Output:**

<img src="https://github.com/ethan-josh/Exploring-Java-StringBuilder/blob/main/images/Ex5.png"/>

**Explanation:**

sb starts as "Start".
sb.append("...") changes sb to "Start...".
sb.insert(0, "Ready, Set, ") changes sb to "Ready, Set, Start...".
sb.delete(12, 15) removes "Sta" from sb, resulting in "Ready, Set, rt...".