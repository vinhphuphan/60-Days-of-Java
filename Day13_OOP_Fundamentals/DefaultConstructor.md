Trong Java, **default constructor** (hàm tạo mặc định) là một khái niệm cơ bản trong lập trình hướng đối tượng (OOP). Dưới đây là tổng quan ngắn gọn và dễ hiểu:

---

### 🔹 Default Constructor là gì?

- **Là constructor không có tham số.**
- Nếu **bạn không tự định nghĩa bất kỳ constructor nào** trong class, **Java sẽ tự động tạo ra một default constructor** cho class đó.
- Nếu bạn đã định nghĩa **ít nhất một constructor có tham số**, thì **Java sẽ không tự tạo default constructor** nữa – lúc này bạn phải tự định nghĩa nó nếu cần.

---

### 🔹 Ví dụ 1: Java tự tạo default constructor

```java
public class Car {
    // Không định nghĩa constructor nào cả
    String brand;
}
```

Java sẽ ngầm hiểu có một constructor như sau:

```java
public Car() {
    super(); // gọi constructor của lớp cha (Object)
}
```

Bạn có thể dùng:

```java
Car myCar = new Car(); // OK
```

---

### 🔹 Ví dụ 2: Tự định nghĩa constructor có tham số

```java
public class Car {
    String brand;

    public Car(String brand) {
        this.brand = brand;
    }
}
```

Giờ đây, đoạn sau **sẽ báo lỗi** nếu không có constructor mặc định:

```java
Car myCar = new Car(); // ❌ Compile error
```

Muốn dùng `new Car()` thì phải tự định nghĩa constructor mặc định:

```java
public Car() {
    this.brand = "Unknown";
}
```

---

### 🔹 Tại sao default constructor quan trọng?

- **Serialization / Deserialization** (ví dụ dùng với JSON)
- **JavaBeans** yêu cầu có constructor không tham số
- Một số framework (Spring, Hibernate...) yêu cầu constructor mặc định để tạo đối tượng tự động
