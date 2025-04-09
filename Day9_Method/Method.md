Dưới đây là những điều **ngắn gọn – súc tích – quan trọng** về **method trong Java** mà bạn cần biết:

---

### ✅ 1. **Khái niệm**
- `Method` là tập hợp các câu lệnh để **thực hiện một nhiệm vụ cụ thể**.
- Giúp **tái sử dụng code**, **chia nhỏ chương trình**, và **dễ bảo trì**.

---

### ✅ 2. **Cấu trúc method**
```java
returnType methodName(parameterList) {
    // method body
}
```

Ví dụ:
```java
int add(int a, int b) {
    return a + b;
}
```

---

### ✅ 3. **Types of Methods**
- **Static**: Gọi trực tiếp qua class (không cần tạo object).
- **Instance**: Phải tạo object để gọi.

---

### ✅ 4. **Return Type**
- Method có thể **trả về giá trị** (`int`, `String`,...) hoặc **không trả về** (`void`).

---

### ✅ 5. **Parameters vs Arguments**
- **Parameter**: Biến được khai báo trong method.
- **Argument**: Giá trị thực được truyền khi gọi method.

---

### ✅ 6. **Overloading**
- Có thể định nghĩa **nhiều method cùng tên** nhưng khác **tham số**:
```java
void greet() {}
void greet(String name) {}
```

---

### ✅ 7. **Access Modifier**
- `public`, `private`, `protected` — xác định phạm vi truy cập method.

---

📌 **Ghi nhớ nhanh**:
> Method = tên + kiểu trả về + tham số + logic bên trong.  
> Giúp viết code **gọn**, **dễ đọc**, **dễ bảo trì**.

Bạn muốn ví dụ minh hoạ cụ thể hay bài tập luyện tập không?