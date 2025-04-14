Dưới đây là một tổng quan chi tiết về các kiến thức cơ bản (fundamentals) của Lập trình Hướng đối tượng (OOP) trong Java mà bạn có thể học trong hôm nay:

---

### 1. **Lớp (Class) và Đối tượng (Object)**
- **Lớp (Class):** Là khuôn mẫu (blueprint) dùng để định nghĩa cấu trúc (attributes) và hành vi (methods) của đối tượng. Ví dụ, một lớp `Car` có thể có các thuộc tính như màu sắc, model, và tốc độ, và các phương thức như chạy, dừng.
  
- **Đối tượng (Object):** Là instance (thể hiện) của một lớp. Khi bạn tạo ra một đối tượng từ lớp, bạn đang khởi tạo các thuộc tính và sử dụng các phương thức được định nghĩa trong lớp đó.

**Ví dụ:**
```java
// Định nghĩa lớp Car
public class Car {
    // Attributes
    String color;
    String model;
    int speed;

    // Constructor
    public Car(String color, String model, int speed) {
        this.color = color;
        this.model = model;
        this.speed = speed;
    }
    
    // Method
    public void run() {
        System.out.println("Car is running at speed: " + speed);
    }
}

// Sử dụng lớp Car
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Red", "Toyota", 120);
        myCar.run();
    }
}
```

---

### 2. **Tính Đóng Gói (Encapsulation)**
- **Định nghĩa:** Là việc đóng gói dữ liệu và các phương thức thao tác với dữ liệu đó lại trong một lớp, bảo vệ dữ liệu khỏi các truy cập trái phép từ bên ngoài. Thông thường, các thuộc tính sẽ được khai báo với phạm vi truy cập là `private`, và cung cấp các phương thức `getter` và `setter` để truy cập và cập nhật giá trị.

**Ví dụ:**
```java
public class Person {
    // Khai báo private attributes
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter cho name
    public String getName() {
        return name;
    }

    // Setter cho name
    public void setName(String name) {
        this.name = name;
    }

    // Getter cho age
    public int getAge() {
        return age;
    }

    // Setter cho age
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }
}
```

---

### 3. **Kế Thừa (Inheritance)**
- **Định nghĩa:** Cho phép một lớp (subclass, hay lớp con) kế thừa các thuộc tính và phương thức từ một lớp khác (superclass, hay lớp cha). Kế thừa giúp tái sử dụng code và tạo ra cấu trúc quan hệ theo dạng "is-a" (là một).

**Ví dụ:**
```java
// Lớp cha
public class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }
}

// Lớp con kế thừa Animal
public class Dog extends Animal {
    // Phương thức riêng của Dog
    public void bark() {
        System.out.println("Dog is barking.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();   // kế thừa từ Animal
        myDog.bark();  // phương thức của Dog
    }
}
```

---

### 4. **Đa Hình (Polymorphism)**
- **Định nghĩa:** Khả năng của đối tượng thể hiện hành vi khác nhau dựa trên kiểu dữ liệu tại thời điểm chạy, mặc dù chúng được xử lý dưới cùng một interface hoặc lớp cha. Có hai loại đa hình chính:
  - **Static Polymorphism (nạp chồng - method overloading):** Các phương thức cùng tên nhưng khác tham số bên trong cùng một lớp.
  - **Dynamic Polymorphism (ghi đè - method overriding):** Lớp con ghi đè lại phương thức của lớp cha để cung cấp triển khai cụ thể.

**Ví dụ về Method Overloading:**
```java
public class Calculator {
    // Tính tổng với 2 số
    public int add(int a, int b) {
        return a + b;
    }
    
    // Tính tổng với 3 số
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

**Ví dụ về Method Overriding:**
```java
// Lớp cha
public class Animal {
    public void sound() {
        System.out.println("Animal sound");
    }
}

// Lớp con
public class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Cat();  // Đa hình (polymorphism)
        myAnimal.sound(); // Output: Meow
    }
}
```

---

### 5. **Trừu Tượng (Abstraction)**
- **Định nghĩa:** Là việc ẩn đi các chi tiết cài đặt phức tạp và chỉ hiển thị những thông tin cần thiết cho người dùng. Trong Java, trừu tượng được thực hiện qua lớp trừu tượng (`abstract class`) và giao diện (`interface`).

**Ví dụ về Abstract Class:**
```java
public abstract class Shape {
    // Phương thức trừu tượng
    public abstract double getArea();
    
    public void display() {
        System.out.println("This is a shape.");
    }
}

public class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
```

**Ví dụ về Interface:**
```java
public interface Drawable {
    void draw(); // Mặc định là public abstract
}

public class Rectangle implements Drawable {
    private int width;
    private int height;
    
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}
