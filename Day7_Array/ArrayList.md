Dưới đây là phần **tóm tắt đầy đủ, ngắn gọn** những điều quan trọng cần biết về **`ArrayList` trong Java**:

---

### ✅ 1. Khái niệm:
- `ArrayList` là **mảng động** trong Java, nằm trong **`java.util`**.
- Kích thước có thể **tự động thay đổi** khi thêm hoặc xóa phần tử.
- Chỉ lưu được **kiểu đối tượng** (dùng wrapper nếu là kiểu nguyên thủy).

---

### ✅ 2. Khai báo và khởi tạo:
```java
import java.util.ArrayList;

ArrayList<String> list = new ArrayList<>();
ArrayList<Integer> nums = new ArrayList<>();
```

---

### ✅ 3. Thao tác cơ bản:
```java
list.add("Java");           // thêm phần tử
list.get(0);                // truy cập phần tử theo index
list.set(0, "Python");      // cập nhật phần tử
list.remove(0);             // xóa phần tử
list.size();                // lấy độ dài
list.contains("Java");      // kiểm tra tồn tại
list.clear();               // xóa hế
list.isEmpty();            // Kiem tra mang rong
```

---

### ✅ 4. Duyệt ArrayList:
```java
for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}

for (String item : list) {
    System.out.println(item);
}
```

---

### ✅ 5. Ưu điểm vs Array:
| ArrayList            | Array                     |
|----------------------|---------------------------|
| Kích thước động       | Kích thước cố định         |
| Nhiều phương thức hỗ trợ | Ít tiện ích hơn           |
| Dễ dùng với Collections | Không linh hoạt bằng     |

---

### ✅ 6. Ghi nhớ:
- Chỉ dùng được với **kiểu đối tượng** → ví dụ: `Integer` thay vì `int`.
- Có thể dùng với **Collections methods** như `Collections.sort(list)`.


### 🧠 Lưu ý:
- Cần import: `import java.util.ArrayList;`
- Không thể dùng với kiểu nguyên thủy, dùng `Integer`, `Double`,...
- **Tự động tăng kích thước** khi thêm phần tử mới.