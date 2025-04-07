Dưới đây là những khác biệt **quan trọng – ngắn gọn – dễ nhớ** giữa `Array` và `ArrayList` trong Java:

---

### ✅ 1. **Kích thước**  
- **Array**: Kích thước **cố định**, không thay đổi sau khi tạo.  
- **ArrayList**: Kích thước **linh hoạt**, có thể thêm/xoá phần tử.

---

### ✅ 2. **Kiểu dữ liệu**  
- **Array**: Có thể chứa **kiểu nguyên thủy** (`int`, `double`,...) và **object**.  
- **ArrayList**: Chỉ chứa **object** → dùng wrapper class như `Integer`, `Double`.

---

### ✅ 3. **Hiệu năng**  
- **Array**: Truy xuất nhanh hơn, tối ưu về hiệu suất.  
- **ArrayList**: Có thêm tính năng tiện lợi nhưng chậm hơn đôi chút.

---

### ✅ 4. **Phương thức hỗ trợ**  
- **Array**: Không có sẵn nhiều phương thức xử lý phần tử.  
- **ArrayList**: Có sẵn nhiều method: `add()`, `remove()`, `contains()`, `size()`...

---

### ✅ 5. **Cú pháp khai báo**  
```java
int[] arr = new int[5]; // Array
ArrayList<Integer> list = new ArrayList<>(); // ArrayList
```

---

📌 **Tóm tắt**:  
- Dùng `Array` khi cần hiệu năng và kích thước cố định.  
- Dùng `ArrayList` khi cần linh hoạt, thao tác nhiều với phần tử.

Bạn muốn mình cho bảng so sánh hoặc ví dụ cụ thể hơn không?