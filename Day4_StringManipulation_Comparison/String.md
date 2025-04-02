### 🔹 **Tổng quan về `String` trong Java**  
`String` là một lớp trong Java (thuộc gói `java.lang`) dùng để lưu trữ và thao tác với chuỗi ký tự. Trong Java, `String` là **immutable** (bất biến), nghĩa là sau khi tạo, giá trị của nó không thể thay đổi.

---

## 🟢 **1. Khai báo & Khởi tạo String**
Có 2 cách tạo `String`:
```java
String s1 = "Hello";  // Tạo từ String Pool (ưu tiên dùng)
String s2 = new String("Hello");  // Tạo trong Heap Memory
```

---

## 🟢 **2. String Manipulation (Xử lý chuỗi)**  

### ✅ **Nối chuỗi (`concat`)**
```java
String a = "Hello";
String b = " World";
String c = a + b; // "Hello World"
String d = a.concat(b); // "Hello World"
```

### ✅ **Lấy độ dài (`length()`)**
```java
String s = "Java";
int len = s.length(); // 4
```

### ✅ **Lấy ký tự (`charAt()`)**
```java
char c = s.charAt(1); // 'a'
```

### ✅ **Cắt chuỗi (`substring()`)**
```java
String sub = s.substring(1, 3); // "av"
```

### ✅ **Tách chuỗi (`split()`)**
```java
String str = "Java,Python,C++";
String[] arr = str.split(","); // ["Java", "Python", "C++"]
```

### ✅ **Chuyển đổi chữ hoa/thường**
```java
String upper = s.toUpperCase(); // "JAVA"
String lower = s.toLowerCase(); // "java"
```

### ✅ **Loại bỏ khoảng trắng (`trim()`)**
```java
String s = "  Java  ";
String trimmed = s.trim(); // "Java"
```

### ✅ **Thay thế ký tự (`replace()`)**
```java
String s = "Java";
String newStr = s.replace('a', 'o'); // "Jovo"
```

---

## 🟢 **3. So sánh chuỗi (String Comparison)**  

### ✅ **Dùng `equals()` (so sánh giá trị)**
```java
String s1 = "hello";
String s2 = "hello";
System.out.println(s1.equals(s2)); // true
```

### ✅ **Dùng `equalsIgnoreCase()` (so sánh không phân biệt hoa thường)**
```java
System.out.println("Java".equalsIgnoreCase("java")); // true
```

### ✅ **Dùng `==` (so sánh tham chiếu)**
```java
String s1 = "hello";
String s2 = new String("hello");
System.out.println(s1 == s2); // false (vì khác vị trí trong bộ nhớ)
```

### ✅ **Dùng `compareTo()` (so sánh từ điển)**
```java
System.out.println("apple".compareTo("banana")); // < 0 (apple đứng trước)
System.out.println("java".compareTo("java")); // 0 (bằng nhau)
System.out.println("zebra".compareTo("apple")); // > 0 (zebra đứng sau)
```

---

## 🟢 **4. StringBuilder & StringBuffer (Mutable Strings)**
Do `String` là **immutable**, nếu cần thay đổi nhiều, ta dùng `StringBuilder` hoặc `StringBuffer` để tối ưu bộ nhớ.

### ✅ **StringBuilder (Không đồng bộ - nhanh hơn)**
```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
System.out.println(sb.toString()); // "Hello World"
```

### ✅ **StringBuffer (Đồng bộ - an toàn cho đa luồng)**
```java
StringBuffer sb = new StringBuffer("Hello");
sb.append(" World");
System.out.println(sb.toString()); // "Hello World"
```

---

### 🎯 **Tóm tắt nhanh**
| **Chủ đề**         | **Phương thức** |
|-------------------|------------------|
| Khai báo String  | `String s = "text";` |
| Độ dài chuỗi | `length()` |
| Nối chuỗi | `+`, `concat()` |
| Cắt chuỗi | `substring()` |
| So sánh chuỗi | `equals()`, `==`, `compareTo()` |
| Chuyển đổi chữ hoa/thường | `toUpperCase()`, `toLowerCase()` |
| Thay thế | `replace()` |
| Loại bỏ khoảng trắng | `trim()` |
| Tách chuỗi | `split()` |
| Dùng chuỗi mutable | `StringBuilder`, `StringBuffer` |

⚡ **Khi nào dùng `StringBuilder`?** Khi cần thay đổi nội dung chuỗi nhiều lần.  
⚡ **Khi nào dùng `StringBuffer`?** Khi làm việc với đa luồng (thread-safe).  

👉 **Hãy dùng `equals()` để so sánh giá trị, không dùng `==` trừ khi muốn kiểm tra tham chiếu!**  

Chúc bạn học tốt Java! 🚀