Dưới đây là phần tóm tắt **ngắn gọn, concise và cần thiết** về **2D array** trong Java:

---

### ✅ 2D Array là gì?
- Là **mảng của mảng** (array of arrays).
- Thường dùng để biểu diễn ma trận (bảng 2 chiều).

---

### 🧱 Khai báo & khởi tạo:
```java
int[][] matrix = new int[3][4]; // 3 hàng, 4 cột
``` 

Hoặc khởi tạo trực tiếp:
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};
```

---

### 🔁 Duyệt 2D array (nested loop):
```java
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

---

### 📌 Lưu ý:
- `matrix.length` → số hàng (row)
- `matrix[i].length` → số cột của hàng thứ `i`
- Có thể tạo mảng **jagged** (mỗi hàng có số cột khác nhau)
