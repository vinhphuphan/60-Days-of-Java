Dưới đây là những điều quan trọng và cần thiết về **Array trong Java**, ngắn gọn và dễ nhớ:

---

### ✅ 1. Khái niệm:
- **Array** là cấu trúc dữ liệu chứa **các phần tử cùng kiểu**, có **kích thước cố định**.
- Chỉ mục (index) bắt đầu từ **0**.

---

### ✅ 2. Khai báo và khởi tạo:
```java
int[] nums = new int[5]; // mảng 5 phần tử, mặc định 0
int[] arr = {1, 2, 3, 4}; // khởi tạo trực tiếp
```

---

### ✅ 3. Truy cập và gán giá trị:
```java
arr[0] = 10;
System.out.println(arr[0]);
```

---

### ✅ 4. Duyệt mảng:
```java
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}

for (int num : arr) {
    System.out.println(num); // for-each
}
```

---

### ✅ 5. Đặc điểm cần nhớ:
- Độ dài cố định sau khi khởi tạo.
- Có thể chứa số nguyên, chuỗi, đối tượng, v.v.
- Cẩn thận `ArrayIndexOutOfBoundsException` khi truy cập sai chỉ mục.

---

### ✅ 6. Các hàm tiện ích:
Sử dụng `Arrays` từ `java.util`:
```java
import java.util.Arrays;

Arrays.sort(arr);         // sắp xếp
Arrays.toString(arr);     // in mảng dạng chuỗi
Arrays.copyOf(arr, 3);    // sao chép mảng
```

---

Muốn linh hoạt hơn? → dùng **ArrayList** thay vì Array cố định.  
Cần giải thích thêm phần nào không bạn?