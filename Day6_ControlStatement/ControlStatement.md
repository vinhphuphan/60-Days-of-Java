

# 🔁 **Control Statements** trong Java gồm:

#### 1. **Conditional Statements** (Điều kiện)
- `if`, `if-else`, `if-else if-else`  
  ➤ Dùng để thực hiện logic theo điều kiện đúng/sai.  
  ```java
  if (a > b) { ... } else { ... }
  ```

- `switch`  
  ➤ Tốt cho việc so sánh giá trị rời rạc (int, String...).  
  ```java
  switch(day) {
      case "Mon": ...; break;
      default: ...;
  }
  ```

---

#### 2. **Looping Statements** (Lặp)
- `for`  
  ➤ Lặp với số lần xác định rõ.  
  ```java
  for (int i = 0; i < 10; i++) { ... }
  ```

- `while`  
  ➤ Lặp khi điều kiện còn đúng.  
  ```java
  while (x < 5) { ... }
  ```

- `do-while`  
  ➤ Lặp ít nhất 1 lần.  
  ```java
  do { ... } while (x < 5);
  ```

---

#### 3. **Jump Statements** (Nhảy luồng)
- `break`  
  ➤ Thoát khỏi vòng lặp/switch.  
- `continue`  
  ➤ Bỏ qua lần lặp hiện tại, tiếp tục vòng sau.  
- `return`  
  ➤ Thoát khỏi hàm/method, có thể trả về giá trị.

---

### 📌 Ghi nhớ:
- Ưu tiên `if-else` khi xử lý logic phức tạp.
- Dùng `switch` khi có nhiều lựa chọn rời rạc.
- Lặp vô hạn? → `while(true)` + `break`.
- Tối ưu logic bằng `continue` và `break` khi cần.

---

Nếu bạn muốn, mình có thể tạo sơ đồ tư duy (mindmap) đơn giản hoặc ví dụ minh họa thực tế cho từng loại nhé!