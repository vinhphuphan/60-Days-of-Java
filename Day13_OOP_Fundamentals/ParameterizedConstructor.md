Dưới đây là những điều **ngắn gọn và quan trọng nhất** về **parameterized constructor** trong Java:

---

### 🔹 Parameterized Constructor là gì?

Là **constructor có tham số**, dùng để **khởi tạo đối tượng với giá trị cụ thể** ngay khi tạo đối tượng.

---

### 🔹 Cú pháp

```java
public class Car {
    String brand;

    // Constructor có tham số
    public Car(String brand) {
        this.brand = brand;
    }
}
```

---

### 🔹 Sử dụng

```java
Car myCar = new Car("Toyota"); // brand = "Toyota"
```

---

### 🔹 Khi nào dùng?

- Khi bạn muốn khởi tạo đối tượng với **dữ liệu ngay từ đầu**
- Dùng để **gán giá trị cho thuộc tính (field)** trong quá trình tạo đối tượng

---

### 🔹 Lưu ý

- Khi đã định nghĩa constructor có tham số, **Java sẽ không tự tạo constructor mặc định nữa**
- Có thể dùng **constructor overloading** để tạo nhiều constructor với tham số khác nhau

```java
public Car() { this.brand = "Unknown"; }
public Car(String brand) { this.brand = brand; }
```

---

### 🔹 Ví dụ thực tế

```java
public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

```java
User u = new User("Phu", 28);
```
